import unittest
from httpie.models import *

class TestHTTPMessage(unittest.TestCase):
    def test_iter_body(self):
        instance = HTTPMessage(None)
        result = instance.iter_body(1)
        self.assertEqual(result, NotImplementedError())
    def test_iter_lines(self):
        instance = HTTPMessage(None)
        result = instance.iter_lines(1)
        self.assertEqual(result, NotImplementedError())
    def test_headers(self):
        instance = HTTPMessage(None)
        result = instance.headers
        self.assertEqual(result, NotImplementedError())
    def test_encoding(self):
        instance = HTTPMessage(None)
        result = instance.encoding
        self.assertEqual(result, NotImplementedError())
    def test_body(self):
        instance = HTTPMessage(None)
        result = instance.body
        self.assertEqual(result, NotImplementedError())
    def test_content_type(self):
        instance = HTTPMessage(None)
        result = instance.content_type
        self.assertEqual(result, '')

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        instance = HTTPResponse(None)
        result = instance.iter_body(1)
        self.assertEqual(result, NotImplementedError())
    def test_iter_lines(self):
        instance = HTTPResponse(None)
        result = instance.iter_lines(1)
        self.assertEqual(result, NotImplementedError())
    def test_headers(self):
        instance = HTTPResponse(None)
        result = instance.headers
        self.assertEqual(result, NotImplementedError())
    def test_encoding(self):
        instance = HTTPResponse(None)
        result = instance.encoding
        self.assertEqual(result, NotImplementedError())
    def test_body(self):
        instance = HTTPResponse(None)
        result = instance.body
        self.assertEqual(result, NotImplementedError())
    def test_content_type(self):
        instance = HTTPResponse(None)
        result = instance.content_type
        self.assertEqual(result, '')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        instance = HTTPRequest(None)
        result = instance.iter_body(1)
        self.assertEqual(result, NotImplementedError())
    def test_iter_lines(self):
        instance = HTTPRequest(None)
        result = instance.iter_lines(1)
        self.assertEqual(result, NotImplementedError())
    def test_headers(self):
        instance = HTTPRequest(None)
        result = instance.headers
        self.assertEqual(result, NotImplementedError())
    def test_encoding(self):
        instance = HTTPRequest(None)
        result = instance.encoding
        self.assertEqual(result, NotImplementedError())
    def test_body(self):
        instance = HTTPRequest(None)
        result = instance.body
        self.assertEqual(result, NotImplementedError())
    def test_content_type(self):
        instance = HTTPRequest(None)
        result = instance.content_type
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()