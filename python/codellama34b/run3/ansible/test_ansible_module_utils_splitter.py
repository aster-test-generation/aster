import unittest
from ansible.module_utils.splitter import *


class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        result = _get_quote_state("test", "test")
        self.assertEqual(result, "test")

    def test_count_jinja2_blocks(self):
        result = _count_jinja2_blocks("test", 0, "test", "test")
        self.assertEqual(result, 0)

    def test_split_args(self):
        result = split_args("test")
        self.assertEqual(result, "test")

    def test_is_quoted(self):
        result = is_quoted("test")
        self.assertEqual(result, False)

    def test_unquote(self):
        result = unquote("test")
        self.assertEqual(result, "test")

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