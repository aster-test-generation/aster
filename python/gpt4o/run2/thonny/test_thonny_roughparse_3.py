import unittest
from thonny.roughparse import RoughParser, _chew_ordinaryre, _itemre, _closere, _match_stringre, _junkre, C_BRACKET, C_BACKSLASH


class TestRoughParser(unittest.TestCase):
    def setUp(self):
        self.parser = RoughParser(indent_width=4, tabwidth=4)
        self.parser.str = "def foo():\n    pass\n"
        self.parser.goodlines = [0, 1, 2]
        self.parser.study_level = 0
        self.parser.continuation = C_BRACKET
        self.parser.lastopenbracketpos = 0

    def test_init(self):
        self.assertEqual(self.parser.indent_width, 4)
        self.assertEqual(self.parser.tabwidth, 4)

    def test_study2(self):
        self.parser._study2()
        self.assertEqual(self.parser.study_level, 2)

    def test_compute_bracket_indent(self):
        self.parser._study2()
        self.parser.continuation = C_BRACKET
        self.parser.lastopenbracketpos = 10
        self.parser.str = "def foo():\n    (bar\n"
        result = self.parser.compute_bracket_indent()
        self.assertEqual(result, 8)

    def test_get_num_lines_in_stmt(self):
        self.parser._study1 = lambda: None
        self.parser.goodlines = [0, 1, 2]
        result = self.parser.get_num_lines_in_stmt()
        self.assertEqual(result, 1)

    def test_compute_backslash_indent(self):
        self.parser._study2()
        self.parser.continuation = C_BACKSLASH
        self.parser.str = "def foo():\n    bar = \\\n    baz\n"
        self.parser.stmt_start = 10
        result = self.parser.compute_backslash_indent()
        self.assertEqual(result, 5)

    def test_get_base_indent_string(self):
        self.parser._study2()
        self.parser.str = "    def foo():\n    pass\n"
        self.parser.stmt_start = 0
        self.parser.stmt_end = 4
        result = self.parser.get_base_indent_string()
        self.assertEqual(result, "    ")

    def test_is_block_opener(self):
        self.parser._study2()
        self.parser.lastch = ':'
        result = self.parser.is_block_opener()
        self.assertTrue(result)

    def test_is_block_closer(self):
        self.parser._study2()
        self.parser.str = "def foo():\n    return\n"
        self.parser.stmt_start = 10
        result = self.parser.is_block_closer()
        self.assertTrue(result)

    def test_get_last_open_bracket_pos(self):
        self.parser._study2()
        self.parser.lastopenbracketpos = 5
        result = self.parser.get_last_open_bracket_pos()
        self.assertEqual(result, 5)

    def test_get_last_stmt_bracketing(self):
        self.parser._study2()
        self.parser.stmt_bracketing = ((0, 0), (1, 1))
        result = self.parser.get_last_stmt_bracketing()
        self.assertEqual(result, ((0, 0), (1, 1)))

if __name__ == '__main__':
    unittest.main()