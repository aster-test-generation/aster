import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        self.assertEqual(parser.study_level, 1)
        self.assertEqual(parser.stmt_start, 0)
        self.assertEqual(parser.stmt_end, 10)
        self.assertEqual(parser.continuation, C_NONE)
        self.assertEqual(parser.lastch, '')
        self.assertEqual(parser.lastopenbracketpos, -1)
        self.assertEqual(parser.stmt_bracketing, [(0, 0), (10, 0)])

    def test_study2(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        parser._study2()
        self.assertEqual(parser.study_level, 2)
        self.assertEqual(parser.stmt_start, 0)
        self.assertEqual(parser.stmt_end, 10)
        self.assertEqual(parser.continuation, C_NONE)
        self.assertEqual(parser.lastch, '')
        self.assertEqual(parser.lastopenbracketpos, -1)
        self.assertEqual(parser.stmt_bracketing, [(0, 0), (10, 0)])

    def test_compute_bracket_indent(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        parser._study2()
        parser.continuation = C_BRACKET
        parser.lastopenbracketpos = 5
        indent = parser.compute_bracket_indent()
        self.assertEqual(indent, 8)

    def test_compute_backslash_indent(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        parser._study2()
        parser.continuation = C_BACKSLASH
        indent = parser.compute_backslash_indent()
        self.assertEqual(indent, 5)

    def test_get_num_lines_in_stmt(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        num_lines = parser.get_num_lines_in_stmt()
        self.assertEqual(num_lines, 1)

    def test_get_base_indent_string(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        parser._study2()
        indent_string = parser.get_base_indent_string()
        self.assertEqual(indent_string, '')

    def test_is_block_opener(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.str = "def test():\n    pass\n"
        parser.goodlines = [0, 10]
        parser.study_level = 0
        parser._study2()
        parser._study2()
        is_opener = parser.is_block_opener()
        self.assertTrue(is_opener)

class TestRoughParser(unittest.TestCase):
    def test_study1(self):
        rp = RoughParser(indent_width=4, tabwidth=4)
        rp.str = "def f():\n    return 1\n"
        rp.goodlines = [0, 1, 2]
        rp.study_level = 0
        rp._study1()
        self.assertEqual(rp.stmt_start, 0)
        self.assertEqual(rp.stmt_end, 13)
        self.assertEqual(rp.continuation, C_NONE)
        self.assertEqual(rp.lastch, '\n')
        self.assertEqual(rp.lastopenbracketpos, -1)
        self.assertEqual(rp.stmt_bracketing, [(0, 0), (4, 0), (13, 0)])

    def test_study2(self):
        rp = RoughParser(indent_width=4, tabwidth=4)
        rp.str = "def f():\n    return 1\n"
        rp.goodlines = [0, 1, 2]
        rp.study_level = 0
        rp._study2()
        self.assertEqual(rp.stmt_start, 0)
        self.assertEqual(rp.stmt_end, 13)
        self.assertEqual(rp.continuation, C_NONE)
        self.assertEqual(rp.lastch, '\n')
        self.assertEqual(rp.lastopenbracketpos, -1)
        self.assertEqual(rp.stmt_bracketing, [(0, 0), (4, 0), (13, 0)])

    def test_compute_bracket_indent(self):
        rp = RoughParser(indent_width=4, tabwidth=4)
        rp.str = "def f():\n    return 1\n"
        rp.goodlines = [0, 1, 2]
        rp.study_level = 0
        rp.continuation = C_BRACKET
        rp.lastopenbracketpos = 4
        rp.compute_bracket_indent()
        self.assertEqual(rp.stmt_start, 0)
        self.assertEqual(rp.stmt_end, 13)
        self.assertEqual(rp.continuation, C_NONE)
        self.assertEqual(rp.lastch, '\n')
        self.assertEqual(rp.lastopenbracketpos, -1)
        self.assertEqual(rp.stmt_bracketing, [(0, 0), (4, 0), (13, 0)])

    def test_compute_backslash_indent(self):
        rp = RoughParser(indent_width=4, tabwidth=4)
        rp.str = "def f():\n    return 1\n"
        rp.goodlines = [0, 1, 2]
        rp.study_level = 0
        rp.continuation = C_BACKSLASH
        rp.stmt_start = 4
        rp.compute_backslash_indent()
        self.assertEqual(rp.stmt_start, 0)
        self.assertEqual(rp.stmt_end, 13)
        self.assertEqual(rp.continuation, C_NONE)
        self.assertEqual(rp.lastch, '\n')
        self.assertEqual(rp.lastopenbracketpos, -1)
        self.assertEqual(rp.stmt_bracketing, [(0, 0), (4, 0), (13, 0)])

    def test_get_base_indent_string(self):
        rp = RoughParser(indent_width=4, tabwidth=4)
        rp.str = "def f():\n    return 1\n"
        rp.goodlines = [0, 1, 2]
        rp.study_level = 0
        rp.stmt_start = 0
        rp.stmt_end = 13
        rp.get_base_indent_string()
        self.assertEqual(rp.stmt_start, 0)
        self.assertEqual(rp.stmt_end, 13)
        self.assertEqual(rp.continuation, C_NONE)
        self.assertEqual(rp.lastch, '\n')
        self.assertEqual(rp.lastopenbracketpos, -1)
        self.assertEqual(rp.stmt_bracketing, [(0, 0), (4, 0), (13, 0)])

if __name__ == '__main__':
    unittest.main()