'''
Created on Nov 7, 2012

@author: hoekstra
'''
import argparse
from rdflib import ConjunctiveGraph, Namespace, Literal

if __name__ == '__main__':
	parser = argparse.ArgumentParser()
	parser.add_argument('filename')
	parser.add_argument('--literals', help='Include literals in graph output', action="store_true")
	args = parser.parse_args()    
	g = ConjunctiveGraph()
	g.parse(args.filename, format='n3')
	print "digraph test {"
	for a in g :
		sn = g.namespace_manager.normalizeUri(a)
		on = g.namespace_manager.normalizeUri(a)
		pn = g.namespace_manager.normalizeUri(a)
		if pn == 'prov:wasScheduledAfter':
			print "\"{}\" -> \"{}\" [ label = \"{}\" ];".format(sn,on,pn)   
	print "}"
	


    
