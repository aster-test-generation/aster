import unittest
from ansible.module_utils import splitter


class TestSplitter(unittest.TestCase):
    def test_get_quote_state(self):
        result = splitter._get_quote_state('hello "world"', '"')
        self.assertIsNone(result)

    def test_get_quote_state_unterminated(self):
        result = splitter._get_quote_state('hello "world', '"')
        self.assertEqual(result, '"')

    def test_count_jinja2_blocks(self):
        result = splitter._count_jinja2_blocks('{{ foo }}', 0, '{{', '}}')
        self.assertEqual(result, 1)

    def test_count_jinja2_blocks_unbalanced(self):
        result = splitter._count_jinja2_blocks('{{ foo ', 0, '{{', '}}')
        self.assertEqual(result, 1)

    def test_split_args(self):
        result = splitter.split_args('a=b c="foo bar"')
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

    def test_split_args_jinja2_block(self):
        result = splitter.split_args('a=b {{ foo }} c="bar baz"')
        self.assertEqual(result, ['a=b', '{{ foo }}', 'c="bar baz"'])

    def test_split_args_unbalanced_jinja2_block(self):
        with self.assertRaises(Exception):
            splitter.split_args('a=b {{ foo ')

    def test_is_quoted(self):
        self.assertTrue(splitter.is_quoted('"hello world"'))
        self.assertTrue(splitter.is_quoted("'hello world'"))
        self.assertFalse(splitter.is_quoted('hello world'))

    def test_unquote(self):
        self.assertEqual(splitter.unquote('"hello world"'), 'hello world')
        self.assertEqual(splitter.unquote("'hello world'"), 'hello world')
        self.assertEqual(splitter.unquote('hello world'), 'hello world')

if __name__ == '__main__':
    unittest.main()