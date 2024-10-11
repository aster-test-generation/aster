import unittest
from ansible.module_utils.splitter import *


class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        result = _get_quote_state('token', 'quote_char')
        self.assertEqual(result, 'quote_char')

    def test_count_jinja2_blocks(self):
        result = _count_jinja2_blocks('token', 0, 'open_token', 'close_token')
        self.assertEqual(result, 0)

    def test_split_args(self):
        result = split_args('args')
        self.assertEqual(result, ['args'])

    def test_is_quoted(self):
        result = is_quoted('data')
        self.assertEqual(result, False)

    def test_unquote(self):
        result = unquote('data')
        self.assertEqual(result, 'data')

class TestSplitter(unittest.TestCase):
    def test_split_args(self):
        result = split_args("a=b c=\"foo bar\"")
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

    def test_is_quoted(self):
        result = is_quoted("\"foo bar\"")
        self.assertEqual(result, True)

    def test_unquote(self):
        result = unquote("\"foo bar\"")
        self.assertEqual(result, "foo bar")

if __name__ == '__main__':
    unittest.main()