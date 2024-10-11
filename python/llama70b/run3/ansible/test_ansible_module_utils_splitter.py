import unittest
from ansible.module_utils import splitter


class TestSplitter(unittest.TestCase):
    def test_split_args(self):
        result = splitter.split_args("a=b c=\"foo bar\"")
        self.assertEqual(result, ['a=b', 'c="foo bar"'])

    def test_split_args_with_jinja2_blocks(self):
        result = splitter.split_args("a=b {{ foo }} c=\"bar baz\"")
        self.assertEqual(result, ['a=b {{ foo }}', 'c="bar baz"'])

    def test_split_args_with_quotes(self):
        result = splitter.split_args("a=b c='foo bar'")
        self.assertEqual(result, ['a=b', "c='foo bar'"])

    def test_split_args_with_line_continuation(self):
        result = splitter.split_args("a=b \\ c='foo bar'")
        self.assertEqual(result, ['a=b c=\'foo bar\''])

    def test_split_args_with_unbalanced_jinja2_blocks(self):
        with self.assertRaises(Exception):
            splitter.split_args("a=b {{ foo ")

    def test_split_args_with_unbalanced_quotes(self):
        with self.assertRaises(Exception):
            splitter.split_args("a=b c=\"foo")

    def test_is_quoted(self):
        self.assertTrue(splitter.is_quoted('"foo"'))
        self.assertTrue(splitter.is_quoted("'bar'"))
        self.assertFalse(splitter.is_quoted("foo"))

    def test_unquote(self):
        self.assertEqual(splitter.unquote('"foo"'), 'foo')
        self.assertEqual(splitter.unquote("'bar'"), 'bar')
        self.assertEqual(splitter.unquote("foo"), 'foo')

    def test__get_quote_state(self):
        self.assertIsNone(splitter._get_quote_state("foo", None))
        self.assertEqual(splitter._get_quote_state('"foo"', None), '"')
        self.assertEqual(splitter._get_quote_state("'bar'", None), "'")

    def test__count_jinja2_blocks(self):
        self.assertEqual(splitter._count_jinja2_blocks("{{ foo }}", 0, "{{", "}}"), 1)
        self.assertEqual(splitter._count_jinja2_blocks("{% bar %}", 0, "{%", "%}"), 1)

if __name__ == '__main__':
    unittest.main()