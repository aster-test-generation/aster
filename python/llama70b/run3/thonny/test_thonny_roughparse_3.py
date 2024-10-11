import unittest
from thonny.roughparse import RoughParser, NUM_CONTEXT_LINES, C_NONE, C_BACKSLASH, C_STRING_FIRST_LINE, C_STRING_NEXT_LINES, C_BRACKET, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        instance = RoughParser(4, 8)
        self.assertEqual(instance.indent_width, 4)
        self.assertEqual(instance.tabwidth, 8)

    def test_study2(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 1
        instance._study2()
        self.assertEqual(instance.stmt_start, 10)
        self.assertEqual(instance.stmt_end, 20)

    def test_compute_bracket_indent(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.continuation = C_BRACKET
        instance.lastopenbracketpos = 15
        result = instance.compute_bracket_indent()
        self.assertEqual(result, 12)

    def test_get_num_lines_in_stmt(self):
        instance = RoughParser(4, 8)
        instance.goodlines = [0, 10, 20]
        result = instance.get_num_lines_in_stmt()
        self.assertEqual(result, 10)

    def test_compute_backslash_indent(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.continuation = C_BACKSLASH
        instance.stmt_start = 10
        result = instance.compute_backslash_indent()
        self.assertEqual(result, 12)

    def test_get_base_indent_string(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.stmt_start = 10
        instance.stmt_end = 20
        result = instance.get_base_indent_string()
        self.assertEqual(result, "    ")

    def test_is_block_opener(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.lastch = ":"
        result = instance.is_block_opener()
        self.assertTrue(result)

    def test_is_block_closer(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.stmt_start = 10
        result = instance.is_block_closer()
        self.assertTrue(result)

    def test_get_last_open_bracket_pos(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.lastopenbracketpos = 15
        result = instance.get_last_open_bracket_pos()
        self.assertEqual(result, 15)

    def test_get_last_stmt_bracketing(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance.study_level = 2
        instance.stmt_bracketing = ((10, 0), (20, 1))
        result = instance.get_last_stmt_bracketing()
        self.assertEqual(result, ((10, 0), (20, 1)))

    def test_private_method__study1(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 10, 20]
        instance._RoughParser__study1()
        self.assertEqual(instance.study_level, 1)

    def test_magic_method__init__(self):
        instance = RoughParser(4, 8)
        self.assertEqual(instance.indent_width, 4)
        self.assertEqual(instance.tabwidth, 8)

    def test_magic_method__str__(self):
        instance = RoughParser(4, 8)
        result = str(instance)
        self.assertEqual(result, "RoughParser object")

if __name__ == '__main__':
    unittest.main()