import unittest
from ansible.module_utils.splitter import _get_quote_state, _count_jinja2_blocks, split_args, is_quoted, unquote


class TestSplitterModule(unittest.TestCase):
    def test_get_quote_state_no_quotes(self):
        result = _get_quote_state("no quotes here", None)
        self.assertIsNone(result)

    def test_get_quote_state_single_quote(self):
        result = _get_quote_state("it's a test", None)
        self.assertEqual(result, "'")

    def test_get_quote_state_double_quote(self):
        result = _get_quote_state('he said "hello"', None)
        self.assertEqual(result, None)

    def test_get_quote_state_escaped_quote(self):
        result = _get_quote_state('he said \\"hello\\"', None)
        self.assertIsNone(result)

    def test_count_jinja2_blocks_no_blocks(self):
        result = _count_jinja2_blocks("no blocks here", 0, "{{", "}}")
        self.assertEqual(result, 0)

    def test_count_jinja2_blocks_open_block(self):
        result = _count_jinja2_blocks("{{ open block", 0, "{{", "}}")
        self.assertEqual(result, 1)

    def test_count_jinja2_blocks_close_block(self):
        result = _count_jinja2_blocks("close block }}", 1, "{{", "}}")
        self.assertEqual(result, 0)

    def test_count_jinja2_blocks_unbalanced_blocks(self):
        result = _count_jinja2_blocks("{{ open }} close }}", 0, "{{", "}}")
        self.assertEqual(result, 0)

    def test_split_args_simple(self):
        result = split_args(b'a=b c=d')
        self.assertEqual(result, ['a=b', 'c=d'])

    def test_split_args_with_quotes(self):
        result = split_args(b'a=b c="foo bar"')
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

    def test_split_args_with_jinja2(self):
        result = split_args(b'a={{ 1 + 1 }} b=c')
        self.assertEqual(result, ['a={{ 1 + 1 }}', 'b=c'])

    def test_split_args_unbalanced_quotes(self):
        with self.assertRaises(Exception):
            split_args('a="unterminated quote')

    def test_split_args_unbalanced_jinja2(self):
        with self.assertRaises(Exception):
            split_args('a={{ 1 + 1 b=c')

    def test_is_quoted_single_quotes(self):
        result = is_quoted("'quoted'")
        self.assertTrue(result)

    def test_is_quoted_double_quotes(self):
        result = is_quoted('"quoted"')
        self.assertTrue(result)

    def test_is_quoted_no_quotes(self):
        result = is_quoted('not quoted')
        self.assertFalse(result)

    def test_unquote_single_quotes(self):
        result = unquote("'quoted'")
        self.assertEqual(result, 'quoted')

    def test_unquote_double_quotes(self):
        result = unquote('"quoted"')
        self.assertEqual(result, 'quoted')

    def test_unquote_no_quotes(self):
        result = unquote('not quoted')
        self.assertEqual(result, 'not quoted')

if __name__ == '__main__':
    unittest.main()