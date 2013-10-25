from whoosh.index import create_in
from whoosh.fields import *
from whoosh.qparser import QueryParser
from whoosh.highlight import PinpointFragmenter

if __name__ == '__main__':
	schema = Schema(title=TEXT(stored=True), path=ID(stored=True), content=TEXT(stored=True, chars=True))
	ix = create_in("../indexdir", schema)
	writer = ix.writer()
	writer.add_document(title=u"Guideline", path=u"/a", content=u"""content""")
	writer.commit()
	
	with ix.searcher() as searcher:
		query = QueryParser("content", ix.schema).parse(u"neutropenia")
		matcher = query.matcher(searcher)
		while matcher.is_active():
			print "Docnum:", matcher.id()
			print "Score:", matcher.score()
			print "List of occurances:"
			for span in matcher.spans():
				print "  Start word #", span.start, "End word #", span.end
				# This prints "None" unless you used chars=True in the field
				print "  Start char #", span.startchar, "End char #", span.endchar
			# Move to the next match
			matcher.next()
