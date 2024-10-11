import unittest
from httpie.models import HTTPMessage, HTTPRequest, HTTPResponse

class TestHTTPMessage(unittest.TestCase):
    def test_headers(self):
        message = HTTPMessage(None)
        message.headers = 'foo: bar\nbaz: qux'
        self.assertEqual(message.headers, 'foo: bar\nbaz: qux')

    def test_encoding(self):
        message = HTTPMessage(None)
        message.encoding = 'utf-8'
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPMessage(None)
        message.body = b'foo'
        self.assertEqual(message.body, b'foo')

    def test_content_type(self):
        message = HTTPMessage(None)
        message.headers = 'Content-Type: application/json'
        self.assertEqual(message.content_type, 'application/json')

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        response = HTTPResponse(None)
        self.assertEqual(list(response.iter_body()), [])

    def test_iter_lines(self):
        response = HTTPResponse(None)
        self.assertEqual(list(response.iter_lines()), [])

    def test_headers(self):
        response = HTTPResponse(None)
        response.headers = 'foo: bar\nbaz: qux'
        self.assertEqual(response.headers, 'foo: bar\nbaz: qux')

    def test_encoding(self):
        response = HTTPResponse(None)
        response.encoding = 'utf-8'
        self.assertEqual(response.encoding, 'utf-8')

    def test_body(self):
        response = HTTPResponse(None)
        response.body = b'foo'
        self.assertEqual(response.body, b'foo')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        request = HTTPRequest(None)
        self.assertEqual(list(request.iter_body()), [b''])

    def test_iter_lines(self):
        request = HTTPRequest(None)
        self.assertEqual(list(request.iter_lines()), [b'', b''])

    def test_headers(self):
        request = HTTPRequest(None)
        request.headers = 'foo: bar\nbaz: qux'
        self.assertEqual(request.headers, 'foo: bar\nbaz: qux')

    def test_encoding(self):
        request = HTTPRequest(None)
        request.encoding = 'utf-8'
        self.assertEqual(request.encoding, 'utf-8')

    def test_body(self):
        request = HTTPRequest(None)
        request.body = b'foo'
        self.assertEqual(request.body, b'foo')

if __name__ == '__main__':
    unittest.main()