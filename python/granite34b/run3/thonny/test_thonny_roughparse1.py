import unittest
from thonny.roughparse import RoughParser

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