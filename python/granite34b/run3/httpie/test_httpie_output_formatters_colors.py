import unittest
from httpie.output.formatters.colors import ColorFormatter, SimplifiedHTTPLexer, Solarized256Style


class TestColorFormatter(unittest.TestCase):
    def test_format_headers(self):
        headers = "GET / HTTP/1.1\nHost: example.com\nContent-Type: text/html"
        expected_output = "\x1b[1mGET\x1b[0m \x1b[1m/\x1b[0m \x1b[1;36mHTTP/1.1\x1b[0m\n\x1b[1mHost\x1b[0m: example.com\n\x1b[1mContent-Type\x1b[0m: text/html"
        color_formatter = ColorFormatter(Environment())
        output = color_formatter.format_headers(headers)
        self.assertEqual(output, expected_output)

    def test_format_body(self):
        body = "<html><body><h1>Hello, World!</h1></body></html>"
        mime = "text/html"
        expected_output = "\x1b[0m\x1b[1;32m<html>\x1b[0m\x1b[0m\x1b[1;32m<body>\x1b[0m\x1b[0m\x1b[1;32m<h1>\x1b[0m\x1b[0m\x1b[1;33mHello, World!\x1b[0m\x1b[0m\x1b[1;32m</h1>\x1b[0m\x1b[0m\x1b[1;32m</body>\x1b[0m\x1b[0m\x1b[1;32m</html>\x1b[0m"
        color_formatter = ColorFormatter(Environment())
        output = color_formatter.format_body(body, mime)
        self.assertEqual(output, expected_output)

    def test_get_lexer_for_body(self):
        body = '{"key": "value"}'
        mime = "application/json"
        expected_output = pygments.lexers.get_lexer_by_name('json')
        color_formatter = ColorFormatter(Environment())
        output = color_formatter.get_lexer_for_body(mime, body)
        self.assertEqual(output, expected_output)

    def test_get_style_class(self):
        color_scheme = " solarized"
        expected_output = Solarized256Style
        color_formatter = ColorFormatter(Environment())
        output = color_formatter.get_style_class(color_scheme)
        self.assertEqual(output, expected_output)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        http_lexer = SimplifiedHTTPLexer()
        code = "GET / HTTP/1.1\nHost: example.com\nContent-Type: text/html"
        expected_output = [
            (pygments.token.Name.Function, 'GET'),
            (pygments.token.Text, ' '),
            (pygments.token.Name.Namespace, '/'),
            (pygments.token.Text, ' '),
            (pygments.token.Keyword.Reserved, 'HTTP'),
            (pygments.token.Operator, '/'),
            (pygments.token.Number, '1.1'),
            (pygments.token.Text, '\n'),
            (pygments.token.Name.Attribute, 'Host'),
            (pygments.token.Text, ': '),
            (pygments.token.String, 'example.com'),
            (pygments.token.Text, '\n'),
            (pygments.token.Name.Attribute, 'Content-Type'),
            (pygments.token.Text, ': '),
            (pygments.token.String, 'text/html')
        ]
        output = list(http_lexer.get_tokens(code))
        self.assertEqual(output, expected_output)


if __name__ == '__main__':
    unittest.main()