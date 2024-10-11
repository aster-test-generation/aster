import unittest
from unittest.mock import Mock
from httpie.models import HTTPMessage, HTTPRequest, HTTPResponse


class TestHTTPMessage(unittest.TestCase):
    def test_headers(self):
        message = HTTPMessage(None)
        message._orig = Mock(headers={'Content-Type': 'text/plain'})
        self.assertEqual(message.headers, 'Content-Type: text/plain')

    def test_encoding(self):
        message = HTTPMessage(None)
        message._orig = Mock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPMessage(None)
        message._orig = Mock(content=b'hello')
        self.assertEqual(message.body, b'hello')

    def test_content_type(self):
        message = HTTPMessage(None)
        message._orig = Mock(headers={'Content-Type': 'text/plain'})
        self.assertEqual(message.content_type, 'text/plain')

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(iter_content=lambda x: [b'hello']))
        self.assertEqual(list(message.iter_body(1)), [b'hello'])

    def test_iter_lines(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(iter_lines=lambda x: [b'hello']))
        self.assertEqual(list(message.iter_lines(1)), [(b'hello', b'\n')])

    def test_headers(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(_original_response=Mock(
            version=11,
            status=200,
            reason='OK',
            msg=Mock(headers=[('Content-Type', 'text/plain')])
        )))
        self.assertEqual(message.headers, 'HTTP/1.1 200 OK\nContent-Type: text/plain')

    def test_encoding(self):
        message = HTTPResponse(None)
        message._orig = Mock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPResponse(None)
        message._orig = Mock(content=b'hello')
        self.assertEqual(message.body, b'hello')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPRequest(None)
        message._orig = Mock(body=b'hello')
        self.assertEqual(list(message.iter_body(1)), [b'hello'])

    def test_iter_lines(self):
        message = HTTPRequest(None)
        message._orig = Mock(body=b'hello')
        self.assertEqual(list(message.iter_lines(1)), [(b'hello', b'')])

    def test_headers(self):
        message = HTTPRequest(None)
        message._orig = Mock(url='http://example.com', method='GET', headers={'Content-Type': 'text/plain'})
        self.assertEqual(message.headers, 'GET http://example.com HTTP/1.1\nHost: example.com\nContent-Type: text/plain')

    def test_encoding(self):
        message = HTTPRequest(None)
        message._orig = Mock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPRequest(None)
        message._orig = Mock(body=b'hello')
        self.assertEqual(message.body, b'hello')

if __name__ == '__main__':
    unittest.main()