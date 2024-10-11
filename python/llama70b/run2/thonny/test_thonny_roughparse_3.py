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
        instance.goodlines = [0, 1, 2]
        instance.study_level = 1
        instance._study2()
        self.assertEqual(instance.stmt_start, 0)
        self.assertEqual(instance.stmt_end, 2)
        self.assertEqual(instance.lastch, "")

    def test_compute_bracket_indent(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        instance.continuation = C_BRACKET
        instance.lastopenbracketpos = 1
        result = instance.compute_bracket_indent()
        self.assertEqual(result, 4)

    def test_get_num_lines_in_stmt(self):
        instance = RoughParser(4, 8)
        instance.goodlines = [0, 1, 2]
        result = instance.get_num_lines_in_stmt()
        self.assertEqual(result, 1)

    def test_compute_backslash_indent(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        instance.continuation = C_BACKSLASH
        instance.stmt_start = 1
        result = instance.compute_backslash_indent()
        self.assertEqual(result, 5)

    def test_get_base_indent_string(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        instance.stmt_start = 1
        instance.stmt_end = 2
        result = instance.get_base_indent_string()
        self.assertEqual(result, "some ")

    def test_is_block_opener(self):
        instance = RoughParser(4, 8)
        instance.str = "some string:"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        result = instance.is_block_opener()
        self.assertTrue(result)

    def test_is_block_closer(self):
        instance = RoughParser(4, 8)
        instance.str = "some string:return"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        result = instance.is_block_closer()
        self.assertTrue(result)

    def test_get_last_open_bracket_pos(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        instance.lastopenbracketpos = 1
        result = instance.get_last_open_bracket_pos()
        self.assertEqual(result, 1)

    def test_get_last_stmt_bracketing(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 2
        instance.stmt_bracketing = ((1, 0), (2, 1))
        result = instance.get_last_stmt_bracketing()
        self.assertEqual(result, ((1, 0), (2, 1)))

    def test_private_method(self):
        instance = RoughParser(4, 8)
        instance.str = "some string"
        instance.goodlines = [0, 1, 2]
        instance.study_level = 1
        instance._RoughParser__study1()
        self.assertEqual(instance.study_level, 1)

    def test_str_method(self):
        instance = RoughParser(4, 8)
        result = instance.__str__()
        self.assertEqual(result, "RoughParser object")

    def test_repr_method(self):
        instance = RoughParser(4, 8)
        result = instance.__repr__()
        self.assertEqual(result, "RoughParser(4, 8)")


if __name__ == '__main__':
    unittest.main()