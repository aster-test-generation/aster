import unittest
from ansible.module_utils.splitter import split_args, is_quoted, unquote


class TestSplitter(unittest.TestCase):
    def test_split_args(self):
        args = "a=b c=\"foo bar\""
        result = split_args(args)
        self.assertEqual(result, ["a=b", "c=\"foo bar\""])

    def test_split_args_with_jinja2_blocks(self):
        args = "a=b {{ foo }} c=\"foo bar\""
        result = split_args(args)
        self.assertEqual(result, ["a=b", " {{ foo }}", "c=\"foo bar\""])

    def test_split_args_with_comments(self):
        args = "a=b {# comment } c=\"foo bar\""
        result = split_args(args)
        self.assertEqual(result, ["a=b", " {# comment }", "c=\"foo bar\""])

    def test_split_args_with_line_continuation(self):
        args = "a=b\nc=\"foo bar\""
        result = split_args(args)
        self.assertEqual(result, ["a=b", "c=\"foo bar\""])

    def test_is_quoted(self):
        self.assertTrue(is_quoted('"hello"'))
        self.assertTrue(is_quoted("'hello'"))
        self.assertFalse(is_quoted('hello'))

    def test_unquote(self):
        self.assertEqual(unquote('"hello"'), 'hello')
        self.assertEqual(unquote("'hello'"), 'hello')
        self.assertEqual(unquote('hello'), 'hello')

    def test_split_args_with_empty_string(self):
        args = ""
        result = split_args(args)
        self.assertEqual(result, [])

    def test_split_args_with_single_token(self):
        args = "a=b"
        result = split_args(args)
        self.assertEqual(result, ["a=b"])

    def test_split_args_with_multiple_tokens(self):
        args = "a=b c=\"foo bar\" d=\"hello world\""
        result = split_args(args)
        self.assertEqual(result, ["a=b", "c=\"foo bar\"", "d=\"hello world\""])

if __name__ == '__main__':
    unittest.main()