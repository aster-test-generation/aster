import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = 'Content-Type: text/plain\nHost: example.com\nContent-Length: 10'
        expected = 'Content-Length: 10\nContent-Type: text/plain\nHost: example.com'
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

    def test_format_headers_disabled(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        headers = 'Content-Type: text/plain\nHost: example.com\nContent-Length: 10'
        expected = headers
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()