import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter()
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter()
        headers = "Host: example.com\r\nUser-Agent: httpie\r\n"
        result = formatter.format_headers(headers)
        self.assertEqual(result, "Host: example.com\r\nUser-Agent: httpie\r\n")

    def test_format_headers_sorted(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = "Host: example.com\r\nUser-Agent: httpie\r\nAccept: text/html\r\n"
        result = formatter.format_headers(headers)
        self.assertEqual(result, "Accept: text/html\r\nHost: example.com\r\nUser-Agent: httpie\r\n")

    def test_format_headers_unsorted(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        headers = "Host: example.com\r\nUser-Agent: httpie\r\nAccept: text/html\r\n"
        result = formatter.format_headers(headers)
        self.assertEqual(result, "Host: example.com\r\nUser-Agent: httpie\r\nAccept: text/html\r\n")

    def test_str_method(self):
        formatter = HeadersFormatter()
        result = str(formatter)
        self.assertEqual(result, "HeadersFormatter")

    def test_repr_method(self):
        formatter = HeadersFormatter()
        result = repr(formatter)
        self.assertEqual(result, "HeadersFormatter()")

    def test_eq_method(self):
        formatter1 = HeadersFormatter()
        formatter2 = HeadersFormatter()
        self.assertEqual(formatter1, formatter2)

if __name__ == '__main__':
    unittest.main()