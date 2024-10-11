import unittest
from httpie.models import HTTPMessage, HTTPResponse, HTTPRequest


class TestHTTPMessage(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            list(message.iter_body(1))

    def test_iter_lines(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            list(message.iter_lines(1))

    def test_headers(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            message.headers

    def test_encoding(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            message.encoding

    def test_body(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            message.body

    def test_content_type(self):
        message = HTTPMessage(None)
        with self.assertRaises(NotImplementedError):
            message.content_type

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        response = HTTPResponse(None)
        self.assertEqual(list(response.iter_body(1)), [b''])

    def test_iter_lines(self):
        response = HTTPResponse(None)
        self.assertEqual(list(response.iter_lines(1)), [(b'', b'\n')])

    def test_headers(self):
        response = HTTPResponse(None)
        self.assertEqual(response.headers, 'HTTP/1.1 200 OK\r\n\r\n')

    def test_encoding(self):
        response = HTTPResponse(None)
        self.assertEqual(response.encoding, 'utf8')

    def test_body(self):
        response = HTTPResponse(None)
        self.assertEqual(response.body, b'')

    def test_content_type(self):
        response = HTTPResponse(None)
        self.assertEqual(response.content_type, '')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        request = HTTPRequest(None)
        self.assertEqual(list(request.iter_body(1)), [b''])

    def test_iter_lines(self):
        request = HTTPRequest(None)
        self.assertEqual(list(request.iter_lines(1)), [(b'', b'')])

    def test_headers(self):
        request = HTTPRequest(None)
        self.assertEqual(request.headers, 'GET / HTTP/1.1\r\nHost: example.com\r\n\r\n')

    def test_encoding(self):
        request = HTTPRequest(None)
        self.assertEqual(request.encoding, 'utf8')

    def test_body(self):
        request = HTTPRequest(None)
        self.assertEqual(request.body, b'')

    def test_content_type(self):
        request = HTTPRequest(None)
        self.assertEqual(request.content_type, '')

if __name__ == '__main__':
    unittest.main()