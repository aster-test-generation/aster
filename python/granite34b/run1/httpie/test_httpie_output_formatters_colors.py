import unittest
from httpie.output.formatters.colors import (
    ColorFormatter,
    SimplifiedHTTPLexer,
    Solarized256Style,
    get_lexer,
)
from pygments.lexer import Lexer
from pygments.styles import Style
from httpie.context import Environment
from httpie.plugins import FormatterPlugin


class TestColorFormatter(unittest.TestCase):
    def test_format_headers(self):
        formatter = ColorFormatter(Environment())
        headers = "GET / HTTP/1.1\nHost: example.com\nContent-Type: text/plain"
        formatted_headers = formatter.format_headers(headers)
        self.assertIn("GET", formatted_headers)
        self.assertIn("HTTP/1.1", formatted_headers)
        self.assertIn("Host", formatted_headers)
        self.assertIn("example.com", formatted_headers)
        self.assertIn("Content-Type", formatted_headers)
        self.assertIn("text/plain", formatted_headers)

    def test_format_body(self):
        formatter = ColorFormatter(Environment())
        body = "This is a test body"
        mime = "text/plain"
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, body)

    def test_get_lexer_for_body(self):
        formatter = ColorFormatter(Environment())
        body = "This is a test body"
        mime = "text/plain"
        lexer = formatter.get_lexer_for_body(mime, body)
        self.assertIsInstance(lexer, Lexer)

    def test_get_style_class(self):
        formatter = ColorFormatter(Environment())
        color_scheme = " solarized"
        style_class = formatter.get_style_class(color_scheme)
        self.assertIsInstance(style_class, Style)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        tokens = lexer.get_tokens("GET / HTTP/1.1")
        self.assertEqual(len(tokens), 7)
        self.assertEqual(tokens[0][1], "GET")
        self.assertEqual(tokens[1][1], " ")
        self.assertEqual(tokens[2][1], "/")
        self.assertEqual(tokens[3][1], " ")
        self.assertEqual(tokens[4][1], "HTTP")
        self.assertEqual(tokens[5][1], "/")
        self.assertEqual(tokens[6][1], "1.1")

class TestSolarized256Style(unittest.TestCase):
    def test_styles(self):
        style = Solarized256Style()
        self.assertEqual(style.background_color, "BASE03")
        self.assertEqual(style.styles[pygments.token.Keyword], "GREEN")
        self.assertEqual(style.styles[pygments.token.Name.Attribute], "BASE1")
        self.assertEqual(style.styles[pygments.token.String], "CYAN")
        self.assertEqual(style.styles[pygments.token.Number], "CYAN")
        self.assertEqual(style.styles[pygments.token.Operator], "BASE1")
        self.assertEqual(style.styles[pygments.token.Comment], "BASE01")
        self.assertEqual(style.styles[pygments.token.Generic.Deleted], "CYAN")
        self.assertEqual(style.styles[pygments.token.Generic.Emph], "italic")
        self.assertEqual(style.styles[pygments.token.Generic.Error], "RED")
        self.assertEqual(style.styles[pygments.token.Generic.Heading], "ORANGE")
        self.assertEqual(style.styles[pygments.token.Generic.Inserted], "GREEN")
        self.assertEqual(style.styles[pygments.token.Generic.Strong], "bold")
        self.assertEqual(style.styles[pygments.token.Generic.Subheading], "ORANGE")
        self.assertEqual(style.styles[pygments.token.Token], "BASE1")
        self.assertEqual(style.styles[pygments.token.Token.Other], "ORANGE")


if __name__ == '__main__':
    unittest.main()