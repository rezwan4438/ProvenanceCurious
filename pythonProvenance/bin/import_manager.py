'''
Created on Jul 13, 2012

@author: hoekstra
'''

from SPARQLWrapper import SPARQLWrapper, JSON
from subprocess import check_output
import argparse
import re


SPARQL_BASE = "http://eculture2.cs.vu.nl:5020"

if __name__ == '__main__':
	parser = argparse.ArgumentParser()
	parser.add_argument("--list", help="Skip interactive mode, just list the commands", action="store_true")
	args = parser.parse_args()
	
	sw = SPARQLWrapper('{}/sparql/'.format(SPARQL_BASE))
	query = """PREFIX rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
	"""
    
	sw.setQuery(query)
	sw.setReturnFormat(JSON)
    
	results = sw.query().convert()

	for res in results["results"]["bindings"] :
		g = res["g"]["value"]
		f = res["f"]["value"]
        
		fileName = re.search(".*/(.*?)\.nt", f).group(1) + ".nt"
		if args.list :
			print "4s-import aers -v --model {} {}".format(g,fileName)
		else :
			print "Graph: <{}>\nFile: {}".format(g, fileName)
			yn = raw_input("Upload this graph? (y/n/q): ")
			if yn == "y" :
				command = ["4s-import", "aers","-v", "--model", g, fileName]
				print "Importing into graph <{}>".format(g)
				out = check_output(command)
				print out
				print "Done"
			elif yn == "q":
				quit()
			else :
				print "Skipping..."
	print "Finished!"
