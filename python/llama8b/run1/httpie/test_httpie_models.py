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

    def test_content_type(self):
        orig = object()
        message = HTTPMessage(orig)
        self.assertIsNone(message.content_type)

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(list(response.iter_body(1)), list(orig.iter_content(1)))

    def test_iter_lines(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(list(response.iter_lines(1)), list((line, b'\n') for line in orig.iter_lines(1)))

    def test_headers(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.headers, '\r\n'.join([f'HTTP/1.1 {orig.status} {orig.reason}'] + [f'{header}: {value}' for header, value in orig.msg._headers]) + '\r\n')

    def test_encoding(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.encoding, orig.encoding or 'utf8')

    def test_body(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.body, orig.content)

    def test_content_type(self):
        orig = object()
        response = HTTPResponse(orig)
        self.assertEqual(response.content_type, orig.headers.get('Content-Type', ''))

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(list(request.iter_body(1)), [orig.body])

    def test_iter_lines(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(list(request.iter_lines(1)), [(orig.body, b'')])

    def test_headers(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.headers, '\r\n'.join([f'{orig.method} {orig.url.path}{orig.url.query} HTTP/1.1'] + [f'{header}: {value}' for header, value in orig.headers.items()]) + '\r\n')

    def test_encoding(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.encoding, 'utf8')

    def test_body(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertEqual(request.body, orig.body)

    def test_content_type(self):
        orig = object()
        request = HTTPRequest(orig)
        self.assertIsNone(request.content_type)

if __name__ == '__main__':
    unittest.main()