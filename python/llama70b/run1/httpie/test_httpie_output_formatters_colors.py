import unittest
from httpie.output.formatters.colors import *


class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = Environment()
        formatter = ColorFormatter(env)
        self.assertIsInstance(formatter, ColorFormatter)

    def test_format_headers(self):
        env = Environment()
        formatter = ColorFormatter(env)
        headers = "GET / HTTP/1.1\r\nHost: example.com\r\n\r\n"
        result = formatter.format_headers(headers)
        self.assertIsInstance(result, str)

    def test_format_body(self):
        env = Environment()
        formatter = ColorFormatter(env)
        body = "Hello, World!"
        mime = "text/plain"
        result = formatter.format_body(body, mime)
        self.assertIsInstance(result, str)

    def test_get_lexer_for_body(self):
        env = Environment()
        formatter = ColorFormatter(env)
        mime = "application/json"
        body = '{"key": "value"}'
        result = formatter.get_lexer_for_body(mime, body)
        self.assertIsInstance(result, type)

    def test_get_style_class(self):
        result = ColorFormatter.get_style_class("solarized")
        self.assertIsInstance(result, type)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_init(self):
        lexer = SimplifiedHTTPLexer()
        self.assertIsInstance(lexer, pygments.lexer.RegexLexer)

    def test_get_tokens_unprocessed(self):
        lexer = SimplifiedHTTPLexer()
        result = lexer.get_tokens_unprocessed("GET / HTTP/1.1\r\nHost: example.com\r\n\r\n")
        self.assertIsInstance(result, list)

class TestSolarized256Style(unittest.TestCase):
    def test_init(self):
        style = Solarized256Style()
        self.assertIsInstance(style, pygments.style.Style)

    def test_style(self):
        style = Solarized256Style()
        result = style.style_for_token(pygments.token.Keyword)
        self.assertEqual(result, "GREEN")

class TestGetLexer(unittest.TestCase):
    def test_get_lexer(self):
        mime = "application/json"
        body = '{"key": "value"}'
        result = get_lexer(mime, explicit_json=True, body=body)
        self.assertIsInstance(result, type)

if __name__ == '__main__':
    unittest.main()