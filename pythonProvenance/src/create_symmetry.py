'''
Created on Jul 6, 2012

@author: hoekstra
'''
from SPARQLWrapper import SPARQLWrapper, JSON
from rdflib import Namespace, ConjunctiveGraph, URIRef

# Eculture
FULL_SPARQL_ENDPOINT = "http://eculture2.cs.vu.nl:5020/sparql/"
# Local
LOCAL_SPARQL_ENDPOINT = "http://localhost:8000/sparql/"

# Local
AERS_SPARQL_ENDPOINT = FULL_SPARQL_ENDPOINT
#"http://localhost:8080/openrdf-sesame/repositories/hubble"


prefixes = """
some long prefixes
"""


AERS = Namespace("http://aers.data2semantics.org/resource/")
DBPEDIA = Namespace("http://dbpedia.org/resource/")
SIDER = Namespace("http://www4.wiwiss.fu-berlin.de/sider/resource/sider/")
OWL = Namespace("http://www.w3.org/2002/07/owl#")
SKOS = Namespace("http://www.w3.org/2004/02/skos/core#")

if __name__ == '__main__':
	wrapper = SPARQLWrapper(AERS_SPARQL_ENDPOINT)
	wrapper.setReturnFormat(JSON)
	wrapper.addCustomParameter('soft-limit','-1')
    
	q = "SELECT ?x ?y WHERE { ?x skos:exactMatch ?y . } "
    
	cg = ConjunctiveGraph()
    
	print "Querying for "+ q
	wrapper.setQuery(prefixes+q)
	results = wrapper.query().convert()
    
	for res in results["results"]["bindings"] :
		x = res["x"]["value"]
		y = res["y"]["value"]
		print x, y
		cg.add(URIRef(y),SKOS["exactMatch"],URIRef(x))
        
        
	out = open("symmetry_links.nt","w")
	print "Serializing to symmetry_links.nt"
	cg.serialize(out,format="nt")
	print "Done..."
    
    
    