from BaseHTTPServer import BaseHTTPRequestHandler
import httplib
import urlparse
import xml.parsers.expat
import re

class GetHandler(BaseHTTPRequestHandler):
	RE_XML_ILLEGAL = u'([\u0000-\u0008\u000b-\u000c\u000e-\u001f\ufffe-\uffff])'
    
	def do_GET(self):
		print "Request received"
		conn = httplib.HTTPConnection("eculture2.cs.vu.nl:5020")
		conn.request("GET", self.path)
		r1 = conn.getresponse()

		headers = r1.getheaders()
		headers.append(('Access-Control-Allow-Origin','*'))

		self.send_response(r1.status)
		for a in headers :
                self.send_header(a)
		self.end_headers()
        
		result = self.encode_characters(r1.read())
		self.wfile.write(result)
		print "Response sent"
		return


	def encode_characters(self, result):
		if result.startswith('<?xml') :
			print "xml!"
			p = xml.parsers.expat.ParserCreate()
			try :
				p.Parse(result)
				return result
			except :
				return re.sub(self.RE_XML_ILLEGAL, "?", result)
		else :
			return result


if __name__ == '__main__':
	from BaseHTTPServer import HTTPServer
	server = HTTPServer(('', 5021), GetHandler)
	print 'Starting server, use <Ctrl-C> to stop'
	z = server.server_address
	print 'Server address: {0}:{1}'.format(z)
	server.serve_forever()

