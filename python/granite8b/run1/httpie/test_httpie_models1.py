import unittest
from httpie.models import HTTPRequest, HTTPResponse

class TestHTTPMessage(unittest.TestCase):
    def test_headers(self):
        request = HTTPRequest(None)
        self.assertEqual(request.headers, 'GET / HTTP/1.1\r\nHost: \r\n')

        response = HTTPResponse(None)
        self.assertEqual(response.headers, 'HTTP/0.9 0 \r\n')

class TestHTTPRequest(unittest.TestCase):
    def test_body(self):
        request = HTTPRequest(None)
        self.assertEqual(request.body, b'')

        request = HTTPRequest(None, body=b'hello')
        self.assertEqual(request.body, b'hello')

class TestHTTPResponse(unittest.TestCase):
    def test_body(self):
        response = HTTPResponse(None)
        self.assertEqual(response.body, b'')

        response = HTTPResponse(None, body=b'hello')
        self.assertEqual(response.body, b'hello')

if __name__ == '__main__':
    unittest.main()