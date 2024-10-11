import unittest
from httpie.output.formatters.colors import ColorFormatter
from httpie.context import Environment
from httpie.plugins import FormatterPlugin
from pygments.formatters.terminal import TerminalFormatter
from pygments.formatters.terminal256 import Terminal256Formatter
from pygments.lexer import Lexer
from pygments.lexers.special import TextLexer
from pygments.lexers.text import HttpLexer as PygmentsHttpLexer
from pygments.util import ClassNotFound
from httpie.compat import is_windows
from pygments.lexer import RegexLexer
from pygments.style import Style
from pygments.token import Token


class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = Environment()
        color_scheme = 'auto'
        explicit_json = False
        kwargs = {}
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        self.assertFalse(color_formatter.enabled)
        self.assertEqual(color_formatter.formatter, TerminalFormatter())
        self.assertEqual(color_formatter.http_lexer, PygmentsHttpLexer())
        color_scheme = 'fruity'
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        self.assertEqual(color_formatter.formatter, Terminal256Formatter(style=color_formatter.get_style_class(color_scheme)))
        color_scheme = 'solarized'
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        self.assertEqual(color_formatter.formatter, Terminal256Formatter(style=color_formatter.get_style_class(color_scheme)))

    def test_format_headers(self):
        env = Environment()
        color_scheme = 'auto'
        explicit_json = False
        kwargs = {}
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        headers = 'GET / HTTP/1.1'
        formatted_headers = color_formatter.format_headers(headers)
        self.assertEqual(formatted_headers, pygments.highlight(code=headers, lexer=color_formatter.http_lexer, formatter=color_formatter.formatter).strip())

    def test_format_body(self):
        env = Environment()
        color_scheme = 'auto'
        explicit_json = False
        kwargs = {}
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        body = '{"key": "value"}'
        mime = 'application/json'
        formatted_body = color_formatter.format_body(body, mime)
        self.assertEqual(formatted_body, pygments.highlight(code=body, lexer=color_formatter.get_lexer_for_body(mime, body), formatter=color_formatter.formatter))

    def test_get_lexer_for_body(self):
        env = Environment()
        color_scheme = 'auto'
        explicit_json = False
        kwargs = {}
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        body = '{"key": "value"}'
        mime = 'application/json'
        lexer = color_formatter.get_lexer_for_body(mime, body)
        self.assertEqual(lexer, pygments.lexers.get_lexer_by_name('json'))

    def test_get_style_class(self):
        env = Environment()
        color_scheme = 'auto'
        explicit_json = False
        kwargs = {}
        color_formatter = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        color_scheme = 'fruity'
        style_class = color_formatter.get_style_class(color_scheme)
        self.assertEqual(style_class, pygments.styles.get_style_by_name(color_scheme))
        color_scheme = 'solarized'
        style_class = color_formatter.get_style_class(color_scheme)
        self.assertEqual(style_class, Solarized256Style)


if __name__ == '__main__':
    unittest.main()