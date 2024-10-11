import unittest
from httpie.output.formatters.colors import ColorFormatter


class TestColorFormatter(unittest.TestCase):
    def test_get_lexer_for_body(self):
        formatter = ColorFormatter(env=None)
        lexer = formatter.get_lexer_for_body(mime='text/html', body='<html></html>')
        self.assertEqual(lexer.__class__.__name__, 'HtmlLexer')
        lexer = formatter.get_lexer_for_body(mime='text/html', body='{"key": "value"}')
        self.assertEqual(lexer.__class__.__name__, 'JsonLexer')
        lexer = formatter.get_lexer_for_body(mime='application/json', body='{"key": "value"}')
        self.assertEqual(lexer.__class__.__name__, 'JsonLexer')
        lexer = formatter.get_lexer_for_body(mime='application/json', body='<html></html>')
        self.assertEqual(lexer, None)

if __name__ == '__main__':
    unittest.main()