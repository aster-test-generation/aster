import unittest
from httpie.models import HTTPMessage, HTTPRequest, HTTPResponse
from httpie.models import HTTPRequest, HTTPResponse


class TestHTTPMessage(unittest.TestCase):
    def test_headers(self):
        message = HTTPMessage(None)
        message._orig = MagicMock(headers={'Content-Type': 'application/json'})
        self.assertEqual(message.headers, 'Content-Type: application/json')

    def test_encoding(self):
        message = HTTPMessage(None)
        message._orig = MagicMock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPMessage(None)
        message._orig = MagicMock(content=b'body')
        self.assertEqual(message.body, b'body')

    def test_content_type(self):
        message = HTTPMessage(None)
        message._orig = MagicMock(headers={'Content-Type': 'application/json'})
        self.assertEqual(message.content_type, 'application/json')

class TestHTTPResponse(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(iter_content=lambda chunk_size: iter([b'body'])))
        self.assertEqual(list(message.iter_body(1)), [b'body'])

    def test_iter_lines(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(iter_lines=lambda chunk_size: [b'line']))
        self.assertEqual(list(message.iter_lines(1)), [(b'line', b'\n')])

    def test_headers(self):
        message = HTTPResponse(None)
        message._orig = Mock(raw=Mock(_original_response=Mock(version=11, status=200, reason='OK', msg=Mock(_headers=[('Content-Type', 'application/json')]))))
        self.assertEqual(message.headers, 'HTTP/1.1 200 OK\nContent-Type: application/json')

    def test_encoding(self):
        message = HTTPResponse(None)
        message._orig = MagicMock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPResponse(None)
        message._orig = MagicMock(content=b'body')
        self.assertEqual(message.body, b'body')

class TestHTTPRequest(unittest.TestCase):
    def test_iter_body(self):
        message = HTTPRequest(None)
        message._orig = MagicMock(body=b'body')
        self.assertEqual(list(message.iter_body(1)), [b'body'])

    def test_iter_lines(self):
        message = HTTPRequest(None)
        message._orig = MagicMock(body=b'body')
        self.assertEqual(list(message.iter_lines(1)), [(b'body', b'')])

    def test_headers(self):
        message = HTTPRequest(None)
        message._orig = MagicMock(url='http://example.com', method='GET', headers={'Content-Type': 'application/json'})
        self.assertEqual(message.headers, 'GET http://example.com HTTP/1.1\nHost: example.com\nContent-Type: application/json')

    def test_encoding(self):
        message = HTTPRequest(None)
        message._orig = MagicMock(encoding='utf-8')
        self.assertEqual(message.encoding, 'utf-8')

    def test_body(self):
        message = HTTPRequest(None)
        message._orig = MagicMock(body=b'body')
        self.assertEqual(message.body, b'body')

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