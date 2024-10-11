import unittest
from ansible.module_utils.splitter import *


class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        quote_char = None
        prev_char = None
        token = "test"
        result = _get_quote_state(token, quote_char)
        self.assertEqual(result, None)

    def test_count_jinja2_blocks(self):
        token = "test"
        cur_depth = 0
        open_token = "test"
        close_token = "test"
        result = _count_jinja2_blocks(token, cur_depth, open_token, close_token)
        self.assertEqual(result, 0)

    def test_split_args(self):
        args = "test"
        result = split_args(args)
        self.assertEqual(result, ['test'])

    def test_is_quoted(self):
        data = "test"
        result = is_quoted(data)
        self.assertEqual(result, False)

    def test_unquote(self):
        data = "test"
        result = unquote(data)
        self.assertEqual(result, 'test')

class TestSplitter(unittest.TestCase):
    def test_split_args(self):
        result = split_args("a=b c=\"foo bar\"")
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

    def test_is_quoted(self):
        result = is_quoted('"foo"')
        self.assertEqual(result, True)

    def test_unquote(self):
        result = unquote('"foo"')
        self.assertEqual(result, 'foo')

if __name__ == '__main__':
    unittest.main()