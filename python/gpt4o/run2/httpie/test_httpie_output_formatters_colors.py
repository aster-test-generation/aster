import pygments
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
from httpie.output.formatters.colors import (
    ColorFormatter, get_lexer, SimplifiedHTTPLexer, Solarized256Style
)


class TestColorFormatter(unittest.TestCase):
    def setUp(self):
        self.env = Environment(colors=256)
        self.formatter = ColorFormatter(env=self.env)

    def test_init(self):
        self.assertTrue(self.formatter.enabled)
        self.assertIsInstance(self.formatter.http_lexer, SimplifiedHTTPLexer)
        self.assertIsInstance(self.formatter.formatter, Terminal256Formatter)

    def test_format_headers(self):
        headers = "GET / HTTP/1.1"
        result = self.formatter.format_headers(headers)
        self.assertIsInstance(result, str)

    def test_format_body(self):
        body = '{"key": "value"}'
        mime = "application/json"
        result = self.formatter.format_body(body, mime)
        self.assertIsInstance(result, str)

    def test_get_lexer_for_body(self):
        mime = "application/json"
        body = '{"key": "value"}'
        lexer = self.formatter.get_lexer_for_body(mime, body)
        self.assertIsNotNone(lexer)

    def test_get_style_class(self):
        style_class = ColorFormatter.get_style_class("default")
        self.assertTrue(issubclass(style_class, pygments.style.Style))

    def test_get_style_class_invalid(self):
        style_class = ColorFormatter.get_style_class("invalid_style")
        self.assertEqual(style_class, Solarized256Style)

class TestGetLexer(unittest.TestCase):
    def test_get_lexer_json(self):
        mime = "application/json"
        body = '{"key": "value"}'
        lexer = get_lexer(mime, body=body)
        self.assertIsNotNone(lexer)

    def test_get_lexer_text(self):
        mime = "text/plain"
        body = "plain text"
        lexer = get_lexer(mime, body=body)
        self.assertIsInstance(lexer, TextLexer)

    def test_get_lexer_invalid(self):
        mime = "invalid/mime"
        body = "invalid"
        lexer = get_lexer(mime, body=body)
        self.assertIsNone(lexer)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        tokens = list(lexer.get_tokens("GET / HTTP/1.1"))
        self.assertGreater(len(tokens), 0)

class TestSolarized256Style(unittest.TestCase):
    def test_styles(self):
        style = Solarized256Style()
        self.assertIn(pygments.token.Keyword, style.styles)
        self.assertIn(pygments.token.Name.Attribute, style.styles)

class TestColorFormatter(unittest.TestCase):
    def setUp(self):
        self.env = Environment(colors=256)
        self.formatter = ColorFormatter(env=self.env)

    def test_init(self):
        self.assertTrue(self.formatter.enabled)
        self.assertIsInstance(self.formatter.http_lexer, SimplifiedHTTPLexer)
        self.assertIsInstance(self.formatter.formatter, Terminal256Formatter)

    def test_format_headers(self):
        headers = "HTTP/1.1 200 OK"
        result = self.formatter.format_headers(headers)
        self.assertIn("HTTP", result)

    def test_format_body(self):
        body = '{"key": "value"}'
        mime = "application/json"
        result = self.formatter.format_body(body, mime)
        self.assertIn("key", result)

    def test_get_lexer_for_body(self):
        mime = "application/json"
        body = '{"key": "value"}'
        lexer = self.formatter.get_lexer_for_body(mime, body)
        self.assertIsNotNone(lexer)

    def test_get_style_class(self):
        style_class = ColorFormatter.get_style_class("default")
        self.assertIsNotNone(style_class)

    def test_get_style_class_invalid(self):
        style_class = ColorFormatter.get_style_class("invalid_style")
        self.assertEqual(style_class, Solarized256Style)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        tokens = lexer.get_tokens("GET / HTTP/1.1")
        self.assertIsNotNone(tokens)

class TestSolarized256Style(unittest.TestCase):
    def test_styles(self):
        style = Solarized256Style()
        self.assertIn(pygments.token.Keyword, style.styles)
        self.assertEqual(style.styles[pygments.token.Keyword], Solarized256Style.GREEN)

if __name__ == '__main__':
    unittest.main()