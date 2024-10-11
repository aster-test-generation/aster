import unittest
from httpie.output.formatters.colors import (
    ColorFormatter, get_lexer, SimplifiedHTTPLexer, Solarized256Style
)
from httpie.context import Environment
from pygments.lexers.special import TextLexer
from pygments.lexers.text import HttpLexer as PygmentsHttpLexer
from pygments.formatters.terminal import TerminalFormatter
from pygments.formatters.terminal256 import Terminal256Formatter
from pygments.util import ClassNotFound

# import pygments

class TestColorFormatter(unittest.TestCase):
    def setUp(self):
        self.env = Environment(colors=256)
        self.formatter = ColorFormatter(env=self.env, explicit_json=True, color_scheme='default')

    def test_format_headers(self):
        headers = "Content-Type: application/json"
        result = self.formatter.format_headers(headers)
        self.assertTrue(result.startswith('\x1b['))  # Check if it starts with ANSI escape code

    def test_format_body(self):
        body = '{"key": "value"}'
        mime = "application/json"
        result = self.formatter.format_body(body, mime)
        self.assertTrue(result.startswith('\x1b['))  # Check if it starts with ANSI escape code

    def test_get_lexer_for_body(self):
        mime = "application/json"
        body = '{"key": "value"}'
        lexer = self.formatter.get_lexer_for_body(mime, body)
        self.assertIsInstance(lexer, TextLexer)

    def test_get_style_class(self):
        style_class = ColorFormatter.get_style_class('default')
        self.assertTrue(issubclass(style_class, pygments.style.Style))

    def test_get_style_class_invalid(self):
        style_class = ColorFormatter.get_style_class('invalid_style')
        self.assertEqual(style_class, Solarized256Style)

class TestGetLexer(unittest.TestCase):
    def test_get_lexer_valid_mime(self):
        lexer = get_lexer(mime="application/json")
        self.assertIsInstance(lexer, TextLexer)

    def test_get_lexer_invalid_mime(self):
        lexer = get_lexer(mime="invalid/mime")
        self.assertIsNone(lexer)

    def test_get_lexer_explicit_json(self):
        lexer = get_lexer(mime="text/plain", explicit_json=True, body='{"key": "value"}')
        self.assertIsInstance(lexer, TextLexer)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        tokens = list(lexer.get_tokens('GET / HTTP/1.1'))
        self.assertGreater(len(tokens), 0)

class TestSolarized256Style(unittest.TestCase):
    def test_styles(self):
        style = Solarized256Style()
        self.assertIn(pygments.token.Keyword, style.styles)
        self.assertIn(pygments.token.Name.Attribute, style.styles)

if __name__ == '__main__':
    unittest.main()