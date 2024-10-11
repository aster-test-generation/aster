import unittest
from httpie.models import HTTPMessage, HTTPResponse, HTTPRequest


class TestHTTPMessage(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.iter_body, 1)

    def test_iter_lines(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.iter_lines, 1)

    def test_headers(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.headers)

    def test_encoding(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.encoding)

    def test_body(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.body)

    def test_content_type(self):
        message = HTTPMessage(None)
        self.assertRaises(NotImplementedError, message.content_type)

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        response = HTTPResponse(None)
        self.assertRaises(NotImplementedError, response.iter_body, 1)

    def test_iter_lines(self):
        response = HTTPResponse(None)
        self.assertRaises(NotImplementedError, response.iter_lines, 1)

    def test_headers(self):
        response = HTTPResponse(None)
        self.assertRaises(NotImplementedError, response.headers)

    def test_encoding(self):
        response = HTTPResponse(None)
        self.assertRaises(NotImplementedError, response.encoding)

    def test_body(self):
        response = HTTPResponse(None)
        self.assertRaises(NotImplementedError, response.body)

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        request = HTTPRequest(None)
        self.assertRaises(NotImplementedError, request.iter_body, 1)

    def test_iter_lines(self):
        request = HTTPRequest(None)
        self.assertRaises(NotImplementedError, request.iter_lines, 1)

    def test_headers(self):
        request = HTTPRequest(None)
        self.assertRaises(NotImplementedError, request.headers)

    def test_encoding(self):
        request = HTTPRequest(None)
        self.assertRaises(NotImplementedError, request.encoding)

    def test_body(self):
        request = HTTPRequest(None)
        self.assertRaises(NotImplementedError, request.body)

if __name__ == '__main__':
    unittest.main()