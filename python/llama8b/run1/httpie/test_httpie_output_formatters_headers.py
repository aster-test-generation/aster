import unittest
from httpie.plugins import FormatterPlugin
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter()
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        headers = "Host: example.com\r\n" \
                  "Content-Type: application/json\r\n" \
                  "Accept: */*\r\n"
        formatter = HeadersFormatter()
        result = formatter.format_headers(headers)
        expected = "Host: example.com\r\n" \
                   "Accept: */*\r\n" \
                   "Content-Type: application/json\r\n"
        self.assertEqual(result, expected)

    def test_format_headers_sort(self):
        headers = "Host: example.com\r\n" \
                  "Content-Type: application/json\r\n" \
                  "Accept: */*\r\n"
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        result = formatter.format_headers(headers)
        expected = "Accept: */*\r\n" \
                   "Content-Type: application/json\r\n" \
                   "Host: example.com\r\n"
        self.assertEqual(result, expected)

    def test_format_headers_no_sort(self):
        headers = "Host: example.com\r\n" \
                  "Content-Type: application/json\r\n" \
                  "Accept: */*\r\n"
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        result = formatter.format_headers(headers)
        self.assertEqual(result, headers)

    def test_format_headers_empty(self):
        headers = ""
        formatter = HeadersFormatter()
        result = formatter.format_headers(headers)
        self.assertEqual(result, "")

    def test_format_headers_single_line(self):
        headers = "Host: example.com"
        formatter = HeadersFormatter()
        result = formatter.format_headers(headers)
        self.assertEqual(result, headers)

    def test_format_headers_multiple_lines(self):
        headers = "Host: example.com\r\n" \
                  "Content-Type: application/json\r\n" \
                  "Accept: */*\r\n" \
                  "User-Agent: httpie/2.3.0\r\n"
        formatter = HeadersFormatter()
        result = formatter.format_headers(headers)
        expected = "Host: example.com\r\n" \
                   "Accept: */*\r\n" \
                   "Content-Type: application/json\r\n" \
                   "User-Agent: httpie/2.3.0\r\n"
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()