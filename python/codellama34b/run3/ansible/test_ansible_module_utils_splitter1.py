import unittest
from ansible.module_utils.splitter import *

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