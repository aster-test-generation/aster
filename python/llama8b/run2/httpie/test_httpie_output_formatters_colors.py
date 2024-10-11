import unittest
from httpie.output.formatters.colors import ColorFormatter, get_lexer, SimplifiedHTTPLexer, Solarized256Style
from httpie.output.formatters.colors import AUTO_STYLE, DEFAULT_STYLE, SOLARIZED_STYLE
from httpie.output.formatters.colors import Environment
from httpie.plugins import FormatterPlugin
from httpie.output.formatters.colors import pygments


class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = Environment()
        formatter = ColorFormatter(env, explicit_json=False, color_scheme=DEFAULT_STYLE)
        self.assertEqual(formatter.explicit_json, False)
        self.assertEqual(formatter.color_scheme, DEFAULT_STYLE)

    def test_format_headers(self):
        headers = 'Content-Type: application/json\r\n'
        formatter = ColorFormatter(Environment(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        result = formatter.format_headers(headers)
        self.assertIsNotNone(result)

    def test_format_body(self):
        body = 'Hello, World!'
        mime = 'text/plain'
        formatter = ColorFormatter(Environment(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        result = formatter.format_body(body, mime)
        self.assertIsNotNone(result)

    def test_get_lexer_for_body(self):
        mime = 'application/json'
        body = '{"key": "value"}'
        result = get_lexer(mime, explicit_json=True, body=body)
        self.assertIsNotNone(result)

    def test_get_style_class(self):
        color_scheme = SOLARIZED_STYLE
        result = ColorFormatter.get_style_class(color_scheme)
        self.assertIsNotNone(result)

    def test_get_lexer(self):
        mime = 'application/json'
        result = get_lexer(mime, explicit_json=True, body='')
        self.assertIsNotNone(result)

    def test_SimplifiedHTTPLexer(self):
        lexer = SimplifiedHTTPLexer()
        self.assertIsNotNone(lexer)

    def test_Solarized256Style(self):
        style = Solarized256Style()
        self.assertIsNotNone(style)

if __name__ == '__main__':
    unittest.main()