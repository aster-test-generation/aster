import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def setUp(self):
        self.formatter = HeadersFormatter(headers={'format_options': {'sort': True}})

    def test_init(self):
        self.assertTrue(self.formatter.enabled)

    def test_format_headers(self):
        headers = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 1234"
        expected = "HTTP/1.1 200 OK\r\nContent-Length: 1234\r\nContent-Type: text/html"
        result = self.formatter.format_headers(headers)
        self.assertEqual(result, expected)

    def test_format_headers_unsorted(self):
        self.formatter.enabled = False
        headers = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 1234"
        result = self.formatter.format_headers(headers)
        self.assertEqual(result, headers)

if __name__ == '__main__':
    unittest.main()