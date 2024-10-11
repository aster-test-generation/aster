import unittest
from httpie.plugins import FormatterPlugin
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter()
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter()
        headers = "Host: localhost\r\nUser-Agent: httpie\r\nAccept: */*\r\n\r\n"
        result = formatter.format_headers(headers)
        expected = "Host: localhost\r\nAccept: */*\r\nUser-Agent: httpie\r\n\r\n"
        self.assertEqual(result, expected)

    def test_format_headers_sort(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = "Host: localhost\r\nUser-Agent: httpie\r\nAccept: */*\r\n\r\n"
        result = formatter.format_headers(headers)
        expected = "Accept: */*\r\nHost: localhost\r\nUser-Agent: httpie\r\n\r\n"
        self.assertEqual(result, expected)

    def test_format_headers_no_sort(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        headers = "Host: localhost\r\nUser-Agent: httpie\r\nAccept: */*\r\n\r\n"
        result = formatter.format_headers(headers)
        expected = "Host: localhost\r\nUser-Agent: httpie\r\nAccept: */*\r\n\r\n"
        self.assertEqual(result, expected)

    def test_format_headers_empty(self):
        formatter = HeadersFormatter()
        headers = ""
        result = formatter.format_headers(headers)
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()