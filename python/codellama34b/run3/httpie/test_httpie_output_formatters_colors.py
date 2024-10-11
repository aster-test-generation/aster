import unittest
from httpie.output.formatters.colors import *



class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = Environment()
        explicit_json = False
        color_scheme = DEFAULT_STYLE
        kwargs = {}
        instance = ColorFormatter(env, explicit_json, color_scheme, **kwargs)
        self.assertEqual(instance.explicit_json, explicit_json)
        self.assertEqual(instance.formatter, TerminalFormatter())
        self.assertEqual(instance.http_lexer, PygmentsHttpLexer())

    def test_format_headers(self):
        instance = ColorFormatter()
        headers = "headers"
        result = instance.format_headers(headers)
        self.assertEqual(result, "headers")

    def test_format_body(self):
        instance = ColorFormatter()
        body = "body"
        mime = "mime"
        result = instance.format_body(body, mime)
        self.assertEqual(result, "body")

    def test_get_lexer_for_body(self):
        instance = ColorFormatter()
        mime = "mime"
        explicit_json = False
        body = "body"
        result = instance.get_lexer_for_body(mime, body)
        self.assertEqual(result, None)

class TestGetLexer(unittest.TestCase):
    def test_get_lexer(self):
        mime = "mime"
        explicit_json = False
        body = "body"
        result = get_lexer(mime, explicit_json, body)
        self.assertEqual(result, None)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_init(self):
        instance = SimplifiedHTTPLexer()
        self.assertEqual(instance.name, "HTTP")
        self.assertEqual(instance.aliases, ["http"])
        self.assertEqual(instance.filenames, ["*.http"])
        self.assertEqual(instance.tokens, {'root': [('([A-Z]+)( +)([^ ]+)( +)(HTTP)(/)(\d+\\.\\d+)', pygments.lexer.bygroups(pygments.token.Name.Function, pygments.token.Text, pygments.token.Name.Namespace, pygments.token.Text, pygments.token.Keyword.Reserved, pygments.token.Operator, pygments.token.Number)), ('(HTTP)(/)(\\d+\\.\\d+)( +)(\\d{3})( +)(.+)', pygments.lexer.bygroups(pygments.token.Keyword.Reserved, pygments.token.Operator, pygments.token.Number, pygments.token.Text, pygments.token.Number, pygments.token.Text, pygments.token.Name.Exception))]})


if __name__ == '__main__':
    unittest.main()