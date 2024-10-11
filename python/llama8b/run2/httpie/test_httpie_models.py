import unittest
from httpie.models import HTTPMessage, HTTPResponse, HTTPRequest


class TestHTTPMessage(unittest.TestCase):
    def test_iter_body(self):
        orig = object()
        message = HTTPMessage(orig)
        with self.assertRaises(NotImplementedError):
            list(message.iter_body(1))

    def test_iter_lines(self):
        orig = object()
        message = HTTPMessage(orig)
        with self.assertRaises(NotImplementedError):
            list(message.iter_lines(1))

    def test_headers(self):
        orig = object()
        message = HTTPMessage(orig)
        with self.assertRaises(NotImplementedError):
            message.headers

    def test_encoding(self):
        orig = object()
        message = HTTPMessage(orig)
        with self.assertRaises(NotImplementedError):
            message.encoding

    def test_body(self):
        orig = object()
        message = HTTPMessage(orig)
        with self.assertRaises(NotImplementedError):
            message.body

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        orig = object()
        response = HTTPResponse(orig)
        with self.assertRaises(NotImplementedError):
            list(response.iter_body(1))

    def test_iter_lines(self):
        orig = object()
        response = HTTPResponse(orig)
        with self.assertRaises(NotImplementedError):
            list(response.iter_lines(1))

    def test_headers(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.headers, '')

    def test_encoding(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.encoding, 'utf8')

    def test_body(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.body, b'')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(list(request.iter_body(1)), [b''])

    def test_iter_lines(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(list(request.iter_lines(1)), [(b'', b'\n')])

    def test_headers(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.headers, '')

    def test_encoding(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.encoding, 'utf8')

    def test_body(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.body, b'')

if __name__ == '__main__':
    unittest.main()