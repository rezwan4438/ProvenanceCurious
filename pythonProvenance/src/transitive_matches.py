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
some long prefixes here
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
    
	q = "SELECT DISTINCT ?x1 ?x2 WHERE { ?x1 skos:exactMatch ?y . ?x2 skos:exactMatch ?y .} "
    
	cg = ConjunctiveGraph()
    
	print "Querying for "+ q
	wrapper.setQuery(prefixes+q)
	raw = wrapper.query()
	print "Results are in! Now converting from JSON..."
	results = raw.convert()
	print "Done converting ..."

	resultsno = len(results["results"]["bindings"])
	print "Query returned {0} results.".format(resultsno)
	for res in results["results"]["bindings"] :
		x1 = res["x1"]["value"]
		x2 = res["x2"]["value"]
		if x1 == x2 :
			print "{} and {} are the same, skipping...".format(x1, x2)
			continue
        
		print x1, x2
		cg.add(URIRef(x1),SKOS["relatedMatch"],URIRef(x2))
		cg.add(URIRef(x2),SKOS["relatedMatch"],URIRef(x1))
        
        
	out = open("transitivity_links.nt","w")
	print "Serializing to transitivity_links.nt"
	cg.serialize(out,format="nt")
	print "Done..."
