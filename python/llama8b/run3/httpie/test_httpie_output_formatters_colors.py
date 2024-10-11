import unittest
from httpie.output.formatters.colors import ColorFormatter, SimplifiedHTTPLexer, Solarized256Style
from httpie.output.formatters.colors import get_lexer


class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = object()
        formatter = ColorFormatter(env, explicit_json=False, color_scheme='solarized')
        self.assertEqual(formatter.explicit_json, False)
        self.assertEqual(formatter.color_scheme, 'solarized')

    def test_format_headers(self):
        formatter = ColorFormatter(object(), explicit_json=False, color_scheme='solarized')
        headers = 'Content-Type: application/json\r\n'
        result = formatter.format_headers(headers)
        self.assertIsInstance(result, str)

    def test_format_body(self):
        formatter = ColorFormatter(object(), explicit_json=False, color_scheme='solarized')
        body = 'Hello, World!'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertIsInstance(result, str)

    def test_get_lexer_for_body(self):
        lexer = get_lexer('application/json', explicit_json=True, body='{"key": "value"}')
        self.assertIsInstance(lexer, pygments.lexer.RegexLexer)

    def test_get_style_class(self):
        style = ColorFormatter.get_style_class('solarized')
        self.assertIsInstance(style, pygments.style.Style)

    def test_get_style_class_not_found(self):
        style = ColorFormatter.get_style_class('not_found')
        self.assertIsInstance(style, Solarized256Style)

    def test_get_lexer_for_body_not_found(self):
        lexer = get_lexer('not_found', explicit_json=True, body='{"key": "value"}')
        self.assertIsNone(lexer)

    def test_get_lexer_for_body_explicit_json(self):
        lexer = get_lexer('application/json', explicit_json=True, body='{"key": "value"}')
        self.assertIsInstance(lexer, pygments.lexers.get_lexer_by_name('json'))

    def test_get_lexer_for_body_not_explicit_json(self):
        lexer = get_lexer('application/json', explicit_json=False, body='{"key": "value"}')
        self.assertIsInstance(lexer, pygments.lexers.get_lexer_by_name('http'))

    def test_get_lexer_for_body_not_explicit_json_and_not_json(self):
        lexer = get_lexer('text/plain', explicit_json=False, body='Hello, World!')
        self.assertIsInstance(lexer, pygments.lexers.get_lexer_by_name('text'))

if __name__ == '__main__':
    unittest.main()