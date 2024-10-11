
import unittest
from httpie.output.formatters.colors import *

class TestColorFormatter(unittest.TestCase):
    def test_init(self):
        env = Environment()
        explicit_json = False
        color_scheme = DEFAULT_STYLE
        formatter = ColorFormatter(env, explicit_json, color_scheme)
        self.assertEqual(formatter.explicit_json, explicit_json)
        self.assertEqual(formatter.formatter, TerminalFormatter())
        self.assertEqual(formatter.http_lexer, PygmentsHttpLexer())

    def test_format_headers(self):
        env = Environment()
        explicit_json = False
        color_scheme = DEFAULT_STYLE
        formatter = ColorFormatter(env, explicit_json, color_scheme)
        headers = "headers"
        result = formatter.format_headers(headers)
        self.assertEqual(result, "headers")

    def test_format_body(self):
        env = Environment()
        explicit_json = False
        color_scheme = DEFAULT_STYLE
        formatter = ColorFormatter(env, explicit_json, color_scheme)
        body = "body"
        mime = "mime"
        result = formatter.format_body(body, mime)
        self.assertEqual(result, "body")

    def test_get_lexer_for_body(self):
        env = Environment()
        explicit_json = False
        color_scheme = DEFAULT_STYLE
        formatter = ColorFormatter(env, explicit_json, color_scheme)
        mime = "mime"
        body = "body"
        result = formatter.get_lexer_for_body(mime, body)
        self.assertEqual(result, None)

    def test_get_style_class(self):
        color_scheme = DEFAULT_STYLE
        result = ColorFormatter.get_style_class(color_scheme)
        self.assertEqual(result, TerminalFormatter())

class TestGetLexer(unittest.TestCase):
    def test_get_lexer(self):
        mime = "mime"
        explicit_json = False
        body = "body"
        result = get_lexer(mime, explicit_json, body)
        self.assertEqual(result, None)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_SimplifiedHTTPLexer(self):
        result = SimplifiedHTTPLexer()
        self.assertEqual(result.name, "HTTP")
        self.assertEqual(result.aliases, ["http"])
        self.assertEqual(result.filenames, ["*.http"])
        self.assertEqual(result.tokens, {
            'root': [
                (r'([A-Z]+)( +)([^ ]+)( +)(HTTP)(/)(\d+\.\d+)',
                 pygments.lexer.bygroups(
                     pygments.token.Name.Function,
                     pygments.token.Text,
                     pygments.token.Name.Namespace,
                     pygments.token.Text,
                     pygments.token.Keyword.Reserved,
                     pygments.token.Operator,
                     pygments.token.Number
                 )),
                (r'(HTTP)(/)(\d+\.\d+)( +)(\d{3})( +)(.+)',
                 pygments.lexer.bygroups(
                     pygments.token.Keyword.Reserved,  
                     pygments.token.Operator,  
                     pygments.token.Number,  
                     pygments.token.Text,
                     pygments.token.Number,  
                     pygments.token.Text,
                     pygments.token.Name.Exception,  
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