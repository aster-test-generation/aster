import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        instance = HeadersFormatter(headers={'format_options': {'sort': True}})
        self.assertTrue(instance.enabled)

    def test_format_headers(self):
        instance = HeadersFormatter(headers={'format_options': {'sort': True}})
        headers = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 1234"
        result = instance.format_headers(headers)
        expected = "HTTP/1.1 200 OK\r\nContent-Length: 1234\r\nContent-Type: text/html"
        self.assertEqual(result, expected)

    def test_format_headers_unsorted(self):
        instance = HeadersFormatter(headers={'sort': False, 'format_options': {}})
        headers = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 1234"
        result = instance.format_headers(headers)
        expected = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 1234"
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()