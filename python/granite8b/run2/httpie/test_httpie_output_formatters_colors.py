from httpie.output.formatters.colors import Pygments
import unittest
from httpie.output.formatters.colors import (
    ColorFormatter,
    Solarized256Style,
    get_lexer,
    SimplifiedHTTPLexer,
)


class TestColorFormatter(unittest.TestCase):
    def test_format_headers(self):
        formatter = ColorFormatter(env=None)
        headers = "Content-Type: application/json\n"
        result = formatter.format_headers(headers)
        self.assertEqual(result, headers)

    def test_format_body(self):
        formatter = ColorFormatter(env=None)
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, body)

    def test_get_lexer_for_body(self):
        lexer = get_lexer(mime='application/json', body='{}')
        self.assertEqual(lexer, pygments.lexers.JsonLexer)

class TestSolarized256Style(unittest.TestCase):
    def test_styles(self):
        style = Solarized256Style()
        self.assertEqual(style.styles, {
            pygments.token.Keyword: 'green',
            pygments.token.Keyword.Constant: 'orange',
            pygments.token.Keyword.Declaration: 'blue',
            pygments.token.Keyword.Namespace: 'orange',
            pygments.token.Keyword.Reserved: 'blue',
            pygments.token.Keyword.Type: 'red',
            pygments.token.Name.Attribute: 'base1',
            pygments.token.Name.Builtin: 'blue',
            pygments.token.Name.Builtin.Pseudo: 'blue',
            pygments.token.Name.Class: 'blue',
            pygments.token.Name.Constant: 'orange',
            pygments.token.Name.Decorator: 'blue',
            pygments.token.Name.Entity: 'orange',
            pygments.token.Name.Exception: 'yellow',
            pygments.token.Name.Function: 'blue',
            pygments.token.Name.Tag: 'blue',
            pygments.token.Name.Variable: 'blue',
            pygments.token.String: 'cyan',
            pygments.token.String.Backtick: 'base01',
            pygments.token.String.Char: 'cyan',
            pygments.token.String.Doc: 'cyan',
            pygments.token.String.Escape: 'red',
            pygments.token.String.Heredoc: 'cyan',
            pygments.token.String.Regex: 'red',
            pygments.token.Number: 'cyan',
            pygments.token.Operator: 'base1',
            pygments.token.Operator.Word: 'green',
            pygments.token.Comment: 'base01',
            pygments.token.Comment.Preproc: 'green',
            pygments.token.Comment.Special: 'green',
            pygments.token.Generic.Deleted: 'cyan',
            pygments.token.Generic.Emph: 'italic',
            pygments.token.Generic.Error: 'red',
            pygments.token.Generic.Heading: 'orange',
            pygments.token.Generic.Inserted: 'green',
            pygments.token.Generic.Strong: 'bold',
            pygments.token.Generic.Subheading: 'orange',
            pygments.token.Token: 'base1',
            pygments.token.Token.Other: 'orange',
        })

class TestGetLexer(unittest.TestCase):
    def test_get_lexer_for_body(self):
        lexer = get_lexer(mime='application/json', body='{}')
        self.assertEqual(lexer, pygments.lexers.JsonLexer)

class TestSimplifiedHTTPLexer(unittest.TestCase):
    def test_tokens(self):
        lexer = SimplifiedHTTPLexer()
        tokens = list(lexer.get_tokens('GET / HTTP/1.1'))
        self.assertEqual(tokens, [
            ('keyword', 'GET'),
            ('text', ' '),
            ('name.namespace', '/'),
            ('text', ' '),
            ('name.builtin', 'HTTP'),
            ('operator', '/'),
            ('number', '1.1'),
        ])

if __name__ == '__main__':
    unittest.main()