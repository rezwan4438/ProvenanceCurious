# ---------------------------------------------------------------------------
# * NAME: appendProcessOrigGW_xx.py
#
# * WRITTEN BY: mr
#
# * USAGE: {see user input section further down}
#
# * DESCRIPTION:
#
#
# * NEW:
# - deals with Odyssey and STS files
# - reads pipe properties from xls table
#   > functions with any order of xls sheets
#   > functions with any order of columns
#   > if no xls sheet is found matching the current day, pipe and logger properties of the previous worksheet is taken
# - can deal with changing pipe properties and loggerNr at each site
# - incorporates manual waterlevel measurements for correction (diddOrig diff Calib is kept constant over whole time series till next manual measurement is available)
#   > if no xls sheet is found matching the current day, diffOrig and diffCalib are expected to be zero
# - calculates barometric pressure and air temperature at each site based on elevation difference to the meteo station
# - number of lines which shall be skipped at the beginning of each logger time series can be user defined (skipFirstFewLines)
# - generates an extended meta file having a similar file name like the assambled data
#
# * NEW Version >21: deals with missing barometric values if storage interval is smaller than 5 min (q_sts in summer running on a minute basis)
#
# * REQUIREMENTS:
# see folder structure and test data in: C:\daten\h2k\gebiete\alptal\02_data\messdaten\h2k_data\test
# --------------------------------------------------------------------------------------------------------------------------------------
# 
# --------------------------------------------------------------------------------------------------------------------------------------

#GENERAT SETTINGS
#*****************

#Import system modules
#*********************
from __future__ import division
from decimal import *

import re
import sys
import os, os.path
import xlrd
import math
import numpy
from datetime import datetime
##from datetime import time



#User input
#**********
startDir = "C:\\daten\\h2k\\gebiete\\alptal\\02_data\\messdaten\\h2k_data"
loggerFileDirList = ["ody","sts"]
siteListPath = "C:\\daten\\h2k\\gebiete\\alptal\\02_data\\messdaten\\h2k_data"
siteListFile = "selList_ezg-12-4-0.txt" #a text file consisting of 2 lines of header (omitted in the Py-script) and then a loggerNr in each row which are then assembled to a loggerNrList
baroPath = "C:\\daten\\h2k\\gebiete\\alptal\\02_data\\messdaten\\h2k_data\\baro" # path to baro directory
baroFile = "h2k-barometer_2011-04-21--2011-11-10_v01.txt" # file containing atmospheric pressure and airtemperature and elevation of measuring site (Keller logger at climate station
#baroFile = "h2k-barometer_clip_test2.txt"
versionsNr = "v06" #Version number of newly created time series
delim = ","
#delim = "\t"
gwAttrFile = "gw_6_all_items_v10.xls" #pipe properties
logPath = "C:\\daten\\h2k\\gebiete\\alptal\\02_data\\messdaten\\h2k_data\\log" # path to the logger protocol file containing manual measurements of water level
logProtFile = "loggerprotokoll_v027.xls" # file name of the logger protocol file containing manual measurements of water level

skipFirstFewLines = 2 # here user can define how many time steps are expected to be affected ("measuring in the air") and shall be skipped (0: no one, 1: first time step, etc.)

#Constants needed for barometric pressure calucation at site
#***********************************************************
mValue = 0.0289644 #Molar mass of Earth's air [kg/mol]
gValue = 9.80665 #Graviatitonal acceleration  [m/s2]
kValue = 8.31432 #Universal gas constant for air: [N·m/(mol·K)]

# patterns for seaching colum names
loggerColumnCrit = re.compile("logger_nr")
siteColumnCrit = re.compile("site")
kColumnCrit = re.compile("k")
dColumnCrit = re.compile("d")
cableColumnCrit = re.compile("cable_cm")
pipeAboveColumnCrit = re.compile("pipeAbS_cm")
housingColumnCrit = re.compile("housing")
elevColumnCrit = re.compile("Z")
typeColumnCrit = re.compile("type")
waterLColumnCrit = re.compile("waterlevel")

#Splitting patterns definition for entire script
sting = "[%s\n\t_:]"%(delim) # patterns for splitting lines into columns inclouding newline (\n)
splitPattern = re.compile("%s"%(sting))

#Splitting pattern used to omit header line with characters ("\d": only numeric values at the beginningof a line are allowed)
p = re.compile('\d')

#DEFINING CLASSES
#****************
class DateTime:
	def __init__(dateTime, date, hour, minute):
		dateTime.date = date
		dateTime.hour = hour
		dateTime.minute = minute


def numDateOdyToDateTime(numDateOdy):	
	datetimeObject = datetime.fromordinal(int(numDateOdy+693960-366))
	dateStr = "%s" %(datetimeObject.day) + "." + "%s" %(datetimeObject.month) + "." + "%s" %(datetimeObject.year)
	hours = int((numDateOdy  - int(numDateOdy))*24)
	minutes = int(round((((numDateOdy  - int(numDateOdy))*24)-hours)*60))
	if minutes == 60:
		minutes = 0
		hours = hours + 1
	dateTime = DateTime(dateStr, hours, minutes)
	return dateTime

def dateTimeToNumDate(dateTime):
	numDayPy = datetime.strptime(dateTime.date, "%d.%m.%Y").toordinal() #convert it ito a numeric date defined as in Python
	timeNum =((dateTime.hour/24)+(dateTime.minute/(24*60)))
	numDatePy = numDayPy + timeNum
	numDateMat = numDayPy + 366 + timeNum
	numDateOdy = numDayPy - 693960 + 366 + timeNum
	return numDatePy, numDateMat, numDateOdy



