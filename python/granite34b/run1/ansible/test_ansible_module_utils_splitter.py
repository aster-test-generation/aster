import unittest
from ansible.module_utils.splitter import _get_quote_state, _count_jinja2_blocks, split_args, is_quoted, unquote




class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        token = 'a"b"c'
        quote_char = None
        result = _get_quote_state(token, quote_char)
        self.assertEqual(result, None)

        token = 'a"b"c'
        quote_char = '"'
        result = _get_quote_state(token, quote_char)
        self.assertEqual(result, None)

        token = 'a"b"c'
        quote_char = "'"
        result = _get_quote_state(token, quote_char)
        self.assertEqual(result, '"')

    def test_count_jinja2_blocks(self):
        token = '{{ foo }}'
        cur_depth = 0
        open_token = '{{'
        close_token = '}}'
        result = _count_jinja2_blocks(token, cur_depth, open_token, close_token)
        self.assertEqual(result, 1)

        token = '{% for item in list %}'
        cur_depth = 0
        open_token = '{%'
        close_token = '%}'
        result = _count_jinja2_blocks(token, cur_depth, open_token, close_token)
        self.assertEqual(result, 1)

        token = '{% if foo %}'
        cur_depth = 1
        open_token = '{%'
        close_token = '%}'
        result = _count_jinja2_blocks(token, cur_depth, open_token, close_token)
        self.assertEqual(result, 0)

    def test_split_args(self):
        args = 'a=b c="foo bar"'
        result = split_args(args)
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

        args = 'a=b c="foo bar" d="baz"'
        result = split_args(args)
        self.assertEqual(result, ['a=b', 'c="foo bar"', 'd="baz"'])

        args = 'a=b c="foo bar" d="baz" e="qux"'
        result = split_args(args)
        self.assertEqual(result, ['a=b', 'c="foo bar"', 'd="baz"', 'e="qux"'])

    def test_is_quoted(self):
        data = '"foo"'
        result = is_quoted(data)
        self.assertTrue(result)

        data = "'foo'"
        result = is_quoted(data)
        self.assertTrue(result)

        data = 'foo'
        result = is_quoted(data)
        self.assertFalse(result)

    def test_unquote(self):
        data = '"foo"'
        result = unquote(data)
        self.assertEqual(result, 'foo')

        data = "'foo'"
        result = unquote(data)
        self.assertEqual(result, 'foo')

        data = 'foo'
        result = unquote(data)
        self.assertEqual(result, 'foo')

if __name__ == '__main__':
    unittest.main()