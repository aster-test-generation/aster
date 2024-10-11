import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options=None)
        self.assertFalse(formatter.enabled)

    def test_format_headers(self):
        headers = """
        HTTP/1.1 200 OK
        Content-Type: text/html
        Content-Length: 123
        """
        expected_output = """
        HTTP/1.1 200 OK
        Content-Length: 123
        Content-Type: text/html
        """
        formatter = HeadersFormatter(format_options=None)
        output = formatter.format_headers(headers)
        self.assertEqual(output, expected_output)

class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        headers = """
        HTTP/1.1 200 OK
        Content-Type: text/html
        Content-Length: 123
        Connection: keep-alive
        Server: nginx

        <html>
        <body>Hello, world!</body>
        </html>
        """
        expected_output = """
        HTTP/1.1 200 OK
        Connection: keep-alive
        Content-Length: 123
        Content-Type: text/html
        Server: nginx

        <html>
        <body>Hello, world!</body>
        </html>
        """
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        output = formatter.format_headers(headers)
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()