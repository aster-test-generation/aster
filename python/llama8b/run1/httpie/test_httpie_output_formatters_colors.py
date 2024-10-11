import unittest
from httpie.output.formatters.colors import ColorFormatter, get_lexer, SimplifiedHTTPLexer, Solarized256Style
from httpie.output.formatters.colors import AUTO_STYLE, DEFAULT_STYLE, SOLARIZED_STYLE


class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = object()
        instance = ColorFormatter(env, explicit_json=False, color_scheme=DEFAULT_STYLE)
        self.assertEqual(instance.explicit_json, False)
        self.assertEqual(instance.color_scheme, DEFAULT_STYLE)
        self.assertEqual(instance.formatter, TerminalFormatter())
        self.assertEqual(instance.http_lexer, PygmentsHttpLexer())

    def test_format_headers(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        headers = 'Content-Type: application/json\n'
        result = instance.format_headers(headers)
        self.assertEqual(result, pygments.highlight(headers, PygmentsHttpLexer(), TerminalFormatter()).strip())

    def test_format_body(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        body = 'Hello, World!'
        mime = 'text/plain'
        result = instance.format_body(body, mime)
        self.assertEqual(result, body)

    def test_get_lexer_for_body(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        mime = 'application/json'
        body = '{"key": "value"}'
        lexer = instance.get_lexer_for_body(mime, body)
        self.assertEqual(lexer, pygments.lexers.get_lexer_by_name('json'))

    def test_get_style_class(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme=DEFAULT_STYLE)
        color_scheme = SOLARIZED_STYLE
        style_class = instance.get_style_class(color_scheme)
        self.assertEqual(style_class, Solarized256Style)

    def test_get_style_class_auto(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme=AUTO_STYLE)
        style_class = instance.get_style_class(AUTO_STYLE)
        self.assertEqual(style_class, Solarized256Style)

    def test_get_style_class_invalid(self):
        instance = ColorFormatter(object(), explicit_json=False, color_scheme='invalid')
        style_class = instance.get_style_class('invalid')
        self.assertEqual(style_class, Solarized256Style)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        self.assertEqual(lexer.name, 'HTTP')
        self.assertEqual(lexer.aliases, ['http'])
        self.assertEqual(lexer.filenames, ['*.http'])
        self.assertEqual(lexer.tokens, {
            'root': [
                (r'([A-Z]+)( +)([^ ]+)( +)(HTTP)(/)(\d+\.\d+)', pygments.lexer.bygroups(
                    pygments.token.Name.Function,
                    pygments.token.Text,
                    pygments.token.Name.Namespace,
                    pygments.token.Text,
                    pygments.token.Keyword.Reserved,
                    pygments.token.Operator,
                    pygments.token.Number
                )),
                (r'(HTTP)(/)(\d+\.\d+)( +)(\d{3})( +)(.+)', pygments.lexer.bygroups(
                    pygments.token.Keyword.Reserved,
                    pygments.token.Operator,
                    pygments.token.Number,
                    pygments.token.Text,
                    pygments.token.Number,
                    pygments.token.Text,
                    pygments.token.Name.Exception
                )),
                (r'(.*?)( *)(:)( *)(.+)', pygments.lexer.bygroups(
                    pygments.token.Name.Attribute,
                    pygments.token.Text,
                    pygments.token.Operator,
                    pygments.token.Text,
                    pygments.token.String
                ))
            ]
        })


if __name__ == '__main__':
    unittest.main()