import unittest
from thonny.roughparse import *



class TestRoughParser(unittest.TestCase):
    def test_rough_parse(self):
        result = rough_parse("")
        self.assertEqual(result, "")

    def test_rough_parse_with_context(self):
        result = rough_parse("", context=50)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines(self):
        result = rough_parse("", context=50, max_lines=500)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent_and_tab_size(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True, tab_size=4)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent_and_tab_size_and_dedent_tabs(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True, tab_size=4, dedent_tabs=True)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent_and_tab_size_and_dedent_tabs_and_preserve_indents(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True, tab_size=4, dedent_tabs=True, preserve_indents=True)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent_and_tab_size_and_dedent_tabs_and_preserve_indents_and_preserve_indents_shared_prefix(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True, tab_size=4, dedent_tabs=True, preserve_indents=True, preserve_indents_shared_prefix=True)
        self.assertEqual(result, "")

    def test_rough_parse_with_context_and_max_lines_and_max_chars_and_dedent_and_tab_size_and_dedent_tabs_and_preserve_indents_and_preserve_indents_shared_prefix_and_preserve_indents_first_line(self):
        result = rough_parse("", context=50, max_lines=500, max_chars=5000000, dedent=True, tab_size=4, dedent_tabs=True, preserve_indents=True, preserve_indents_shared_prefix=True, preserve_indents_first_line=True)
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()