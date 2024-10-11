import unittest
from ansible.parsing.quoting import is_quoted, unquote


class TestQuotingFunctions(unittest.TestCase):
    def test_is_quoted_with_double_quotes(self):
        result = is_quoted('"hello"')
        self.assertTrue(result)

    def test_is_quoted_with_single_quotes(self):
        result = is_quoted("'hello'")
        self.assertTrue(result)

    def test_is_quoted_with_unmatched_quotes(self):
        result = is_quoted('"hello')
        self.assertFalse(result)

    def test_is_quoted_with_no_quotes(self):
        result = is_quoted('hello')
        self.assertFalse(result)

    def test_is_quoted_with_escaped_quote(self):
        result = is_quoted('"hello\\"')
        self.assertFalse(result)

    def test_unquote_with_double_quotes(self):
        result = unquote('"hello"')
        self.assertEqual(result, 'hello')

    def test_unquote_with_single_quotes(self):
        result = unquote("'hello'")
        self.assertEqual(result, 'hello')

    def test_unquote_with_unmatched_quotes(self):
        result = unquote('"hello')
        self.assertEqual(result, '"hello')

    def test_unquote_with_no_quotes(self):
        result = unquote('hello')
        self.assertEqual(result, 'hello')

    def test_unquote_with_escaped_quote(self):
        result = unquote('"hello\\"')
        self.assertEqual(result, '"hello\\"')

if __name__ == '__main__':
    unittest.main()