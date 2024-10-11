import unittest
from thonny.roughparse import RoughParser, C_BRACKET


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 1
        parser._study1()
        self.assertEqual(parser.study_level, 2)
        self.assertEqual(parser.stmt_start, 0)
        self.assertEqual(parser.stmt_end, 10)

    def test_study2(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertEqual(parser.lastch, ':')
        self.assertEqual(parser.lastopenbracketpos, 4)
        self.assertEqual(parser.stmt_bracketing, [(0, 0), (4, 1), (10, 0)])

    def test_compute_bracket_indent(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser.continuation = C_BRACKET
        parser._study2()
        self.assertEqual(parser.compute_bracket_indent(), 8)

    def test_compute_backslash_indent(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser.continuation = C_BACKSLASH
        parser._study2()
        self.assertEqual(parser.compute_backslash_indent(), 5)

    def test_get_num_lines_in_stmt(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertEqual(parser.get_num_lines_in_stmt(), 1)

    def test_get_base_indent_string(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertEqual(parser.get_base_indent_string(), '    ')

    def test_is_block_opener(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertTrue(parser.is_block_opener())

    def test_is_block_closer(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertFalse(parser.is_block_closer())

    def test_get_last_open_bracket_pos(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 2
        parser._study2()
        self.assertEqual(parser.get_last_open_bracket_pos(), 4)

if __name__ == '__main__':
    unittest.main()