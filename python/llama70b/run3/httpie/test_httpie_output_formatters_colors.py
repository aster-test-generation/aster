import unittest
from httpie.output.formatters.colors import *


class TestColorFormatter(unittest.TestCase):
    def test___init__(self):
        env = Environment()
        formatter = ColorFormatter(env)
        self.assertIsNotNone(formatter)

    def test_format_headers(self):
        env = Environment()
        formatter = ColorFormatter(env)
        headers = "GET / HTTP/1.1\r\nHost: example.com\r\n"
        result = formatter.format_headers(headers)
        self.assertIsNotNone(result)

    def test_format_body(self):
        env = Environment()
        formatter = ColorFormatter(env)
        body = "Hello, World!"
        mime = "text/plain"
        result = formatter.format_body(body, mime)
        self.assertIsNotNone(result)

    def test_get_lexer_for_body(self):
        env = Environment()
        formatter = ColorFormatter(env)
        mime = "application/json"
        body = '{"key": "value"}'
        result = formatter.get_lexer_for_body(mime, body)
        self.assertIsNotNone(result)

    def test_get_style_class(self):
        result = ColorFormatter.get_style_class("solarized")
        self.assertIsNotNone(result)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test___init__(self):
        lexer = SimplifiedHTTPLexer()
        self.assertIsNotNone(lexer)

    def test_get_tokens_unprocessed(self):
        lexer = SimplifiedHTTPLexer()
        result = lexer.get_tokens_unprocessed("GET / HTTP/1.1\r\nHost: example.com\r\n")
        self.assertIsNotNone(result)

class TestSolarized256Style(unittest.TestCase):
    def test___init__(self):
        style = Solarized256Style()
        self.assertIsNotNone(style)

    def test_style(self):
        style = Solarized256Style()
        result = style.style_for_token(pygments.token.Keyword)
        self.assertIsNotNone(result)

class TestGetLexer(unittest.TestCase):
    def test_get_lexer(self):
        mime = "application/json"
        explicit_json = True
        body = '{"key": "value"}'
        result = get_lexer(mime, explicit_json, body)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()