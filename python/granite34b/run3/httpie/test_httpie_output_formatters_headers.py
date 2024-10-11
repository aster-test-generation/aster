import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        self.assertTrue(formatter.enabled)

    def test_format_headers(self):
        headers = """
        HTTP/1.1 200 OK
        Content-Type: text/plain
        Content-Length: 12
        Server: nginx

        foo
        bar
        """
        expected_output = """
        HTTP/1.1 200 OK
        Content-Length: 12
        Content-Type: text/plain
        Server: nginx

        bar
        foo
        """
        formatter = HeadersFormatter(format_options={'headers': {'sort': True}})
        output = formatter.format_headers(headers)
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()