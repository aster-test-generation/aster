import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = 'Content-Type: application/json\nHost: example.com\n'
        expected = 'Content-Type: application/json\nHost: example.com\n'
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

    def test_format_headers_unsorted(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        headers = 'Content-Type: application/json\nHost: example.com\n'
        expected = 'Host: example.com\nContent-Type: application/json\n'
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()