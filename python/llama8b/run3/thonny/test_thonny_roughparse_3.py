import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(4, 8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_study2(self):
        parser = RoughParser(4, 8)
        parser._study2()
        self.assertEqual(parser.stmt_start, 0)
        self.assertEqual(parser.stmt_end, 0)
        self.assertEqual(parser.lastch, '')
        self.assertEqual(parser.lastopenbracketpos, 0)
        self.assertEqual(parser.stmt_bracketing, ())

    def test_compute_bracket_indent(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.continuation = RoughParser.C_BRACKET
        self.assertEqual(parser.compute_bracket_indent(), 0)

    def test_get_num_lines_in_stmt(self):
        parser = RoughParser(4, 8)
        parser._study1()
        parser.goodlines = [1, 2, 3]
        self.assertEqual(parser.get_num_lines_in_stmt(), 2)

    def test_compute_backslash_indent(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.continuation = RoughParser.C_BACKSLASH
        self.assertEqual(parser.compute_backslash_indent(), 0)

    def test_get_base_indent_string(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.stmt_start = 0
        parser.stmt_end = 10
        self.assertEqual(parser.get_base_indent_string(), '    ')

    def test_is_block_opener(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.lastch = ':'
        self.assertTrue(parser.is_block_opener())

    def test_is_block_closer(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.stmt_start = 0
        parser.stmt_end = 10
        self.assertFalse(parser.is_block_closer())

    def test_get_last_open_bracket_pos(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.lastopenbracketpos = 5
        self.assertEqual(parser.get_last_open_bracket_pos(), 5)

    def test_get_last_stmt_bracketing(self):
        parser = RoughParser(4, 8)
        parser._study2()
        parser.stmt_bracketing = [(1, 2), (3, 4)]
        self.assertEqual(parser.get_last_stmt_bracketing(), [(1, 2), (3, 4)])

if __name__ == '__main__':
    unittest.main()