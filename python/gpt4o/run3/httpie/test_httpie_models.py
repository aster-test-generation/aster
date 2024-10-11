import unittest
from unittest.mock import Mock
from httpie.models import HTTPMessage, HTTPResponse, HTTPRequest


class TestHTTPMessage(unittest.TestCase):
    def setUp(self):
        self.orig = Mock()
        self.message = HTTPMessage(self.orig)

    def test_iter_body(self):
        with self.assertRaises(NotImplementedError):
            list(self.message.iter_body(1024))

    def test_iter_lines(self):
        with self.assertRaises(NotImplementedError):
            list(self.message.iter_lines(1024))

    def test_headers(self):
        with self.assertRaises(NotImplementedError):
            _ = self.message.headers

    def test_encoding(self):
        with self.assertRaises(NotImplementedError):
            _ = self.message.encoding

    def test_body(self):
        with self.assertRaises(NotImplementedError):
            _ = self.message.body

    def test_content_type(self):
        self.orig.headers.get.return_value = 'text/html'
        self.assertEqual(self.message.content_type, 'text/html')

        self.orig.headers.get.return_value = b'text/html'
        self.assertEqual(self.message.content_type, 'text/html')

class TestHTTPResponse(unittest.TestCase):
    def setUp(self):
        self.orig = Mock()
        self.orig.raw._original_response.version = 11
        self.orig.raw._original_response.status = 200
        self.orig.raw._original_response.reason = 'OK'
        self.orig.raw._original_response.msg._headers = [('Content-Type', 'text/html')]
        self.orig.encoding = 'utf8'
        self.orig.content = b'content'
        self.response = HTTPResponse(self.orig)

    def test_iter_body(self):
        self.orig.iter_content.return_value = [b'chunk1', b'chunk2']
        result = list(self.response.iter_body(1024))
        self.assertEqual(result, [b'chunk1', b'chunk2'])

    def test_iter_lines(self):
        self.orig.iter_lines.return_value = [b'line1', b'line2']
        result = list(self.response.iter_lines(1024))
        self.assertEqual(result, [(b'line1', b'\n'), (b'line2', b'\n')])

    def test_headers(self):
        expected_headers = 'HTTP/1.1 200 OK\r\nContent-Type: text/html'
        self.assertEqual(self.response.headers, expected_headers)

    def test_encoding(self):
        self.assertEqual(self.response.encoding, 'utf8')

    def test_body(self):
        self.assertEqual(self.response.body, b'content')

class TestHTTPRequest(unittest.TestCase):
    def setUp(self):
        self.orig = Mock()
        self.orig.url = 'http://example.com/path?query=1'
        self.orig.method = 'GET'
        self.orig.headers = {'User-Agent': 'test-agent'}
        self.orig.body = 'body'
        self.request = HTTPRequest(self.orig)

    def test_iter_body(self):
        result = list(self.request.iter_body(1024))
        self.assertEqual(result, [b'body'])

    def test_iter_lines(self):
        result = list(self.request.iter_lines(1024))
        self.assertEqual(result, [(b'body', b'')])

    def test_headers(self):
        expected_headers = (
            'GET /path?query=1 HTTP/1.1\r\n'
            'User-Agent: test-agent\r\n'
            'Host: example.com'
        )
        self.assertEqual(self.request.headers, expected_headers)

    def test_encoding(self):
        self.assertEqual(self.request.encoding, 'utf8')

    def test_body(self):
        self.assertEqual(self.request.body, b'body')

if __name__ == '__main__':
    unittest.main()