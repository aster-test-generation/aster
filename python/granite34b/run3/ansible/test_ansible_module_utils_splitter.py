import unittest
from ansible.module_utils.splitter import _get_quote_state, _count_jinja2_blocks, split_args, is_quoted, unquote




class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        token = '"foo bar"'
        quote_char = None
        self.assertEqual(_get_quote_state(token, quote_char), "'")
        token = "'foo bar'"
        quote_char = None
        self.assertEqual(_get_quote_state(token, quote_char), '"')
        token = 'foo bar'
        quote_char = None
        self.assertEqual(_get_quote_state(token, quote_char), None)

    def test_count_jinja2_blocks(self):
        token = "{{ foo }}"
        cur_depth = 0
        open_token = "{{"
        close_token = "}}"
        self.assertEqual(_count_jinja2_blocks(token, cur_depth, open_token, close_token), 1)
        token = "{% foo %}"
        cur_depth = 0
        open_token = "{%"
        close_token = "%}"
        self.assertEqual(_count_jinja2_blocks(token, cur_depth, open_token, close_token), 1)
        token = "foo bar"
        cur_depth = 0
        open_token = "{{"
        close_token = "}}"
        self.assertEqual(_count_jinja2_blocks(token, cur_depth, open_token, close_token), 0)

    def test_split_args(self):
        args = 'a=b c="foo bar"'
        self.assertEqual(split_args(args), ['a=b', 'c="foo bar"'])

    def test_is_quoted(self):
        data = '"foo bar"'
        self.assertTrue(is_quoted(data))
        data = "'foo bar'"
        self.assertTrue(is_quoted(data))
        data = 'foo bar'
        self.assertFalse(is_quoted(data))

    def test_unquote(self):
        data = '"foo bar"'
        self.assertEqual(unquote(data), 'foo bar')
        data = "'foo bar'"
        self.assertEqual(unquote(data), 'foo bar')
        data = 'foo bar'
        self.assertEqual(unquote(data), 'foo bar')

if __name__ == '__main__':
    unittest.main()