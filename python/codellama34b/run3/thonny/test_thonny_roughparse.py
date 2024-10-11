import unittest
from thonny.roughparse import *


class TestRoughParser(unittest.TestCase):
    def test_compute_backslash_indent(self):
        instance = RoughParser(1, 1)
        result = instance.compute_backslash_indent()
        self.assertEqual(result, 1)

    def test_compute_bracket_indent(self):
        instance = RoughParser(1, 1)
        result = instance.compute_bracket_indent()
        self.assertEqual(result, 1)

    def test_get_base_indent_string(self):
        instance = RoughParser(1, 1)
        result = instance.get_base_indent_string()
        self.assertEqual(result, "")

    def test_get_last_open_bracket_pos(self):
        instance = RoughParser(1, 1)
        result = instance.get_last_open_bracket_pos()
        self.assertEqual(result, 1)

    def test_get_last_stmt_bracketing(self):
        instance = RoughParser(1, 1)
        result = instance.get_last_stmt_bracketing()
        self.assertEqual(result, (1, 1))

    def test_get_num_lines_in_stmt(self):
        instance = RoughParser(1, 1)
        result = instance.get_num_lines_in_stmt()
        self.assertEqual(result, 1)

    def test_is_block_closer(self):
        instance = RoughParser(1, 1)
        result = instance.is_block_closer()
        self.assertEqual(result, False)

    def test_is_block_opener(self):
        instance = RoughParser(1, 1)
        result = instance.is_block_opener()
        self.assertEqual(result, False)

    def test_study2(self):
        instance = RoughParser(1, 1)
        result = instance._study2()
        self.assertEqual(result, None)

    def test_study1(self):
        instance = RoughParser(1, 1)
        result = instance._study1()
        self.assertEqual(result, None)

    def test_init(self):
        instance = RoughParser(1, 1)
        self.assertEqual(instance.indent_width, 1)
        self.assertEqual(instance.tabwidth, 1)


if __name__ == '__main__':
    unittest.main()