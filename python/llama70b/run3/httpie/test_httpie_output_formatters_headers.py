import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = "HTTP/1.1 200 OK\r\nContent-Type: application/json\r\nX-Custom-Header: custom-value"
        result = formatter.format_headers(headers)
        expected = "HTTP/1.1 200 OK\r\nContent-Type: application/json\r\nX-Custom-Header: custom-value"
        self.assertEqual(result, expected)

    def test_private_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        result = formatter._HeadersFormatter__init__(**{'format_options': {'headers': {'sort': True}}})
        self.assertIsNone(result)

    def test_str_method(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        result = formatter.__str__()
        self.assertEqual(result, "HeadersFormatter")

    def test_repr_method(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        result = formatter.__repr__()
        self.assertEqual(result, "HeadersFormatter(format_options={'headers': {'sort': True}})")

if __name__ == '__main__':
    unittest.main()