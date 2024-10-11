import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        headers = """\
        Content-Type: application/json
        Accept: application/json
        """
        expected = """\
        Accept: application/json
        Content-Type: application/json
        """
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

    def test_format_headers_disabled(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': False}})
        headers = """\
        Content-Type: application/json
        Accept: application/json
        """
        expected = headers
        result = formatter.format_headers(headers)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()