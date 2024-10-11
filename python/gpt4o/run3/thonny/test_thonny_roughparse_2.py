from thonny.roughparse import C_NONE
import unittest
from thonny.roughparse import RoughParser, _synchre


class TestRoughParser(unittest.TestCase):
    def setUp(self):
        self.parser = RoughParser(indent_width=4, tabwidth=4)

    def test_init(self):
        self.assertEqual(self.parser.indent_width, 4)
        self.assertEqual(self.parser.tabwidth, 4)

    def test_set_str(self):
        self.parser.set_str("test\n")
        self.assertEqual(self.parser.str, "test\n")
        self.assertEqual(self.parser.study_level, 0)

    def test_find_good_parse_start(self):
        self.parser.set_str("def test():\n    pass\n")
        result = self.parser.find_good_parse_start(is_char_in_string=lambda x: False)
        self.assertIsNone(result)

    def test_set_lo(self):
        self.parser.set_str("test\n")
        self.parser.set_lo(0)
        self.assertEqual(self.parser.str, "test\n")

    def test_study1(self):
        self.parser.set_str("test\n")
        self.parser._study1()
        self.assertEqual(self.parser.study_level, 1)
        self.assertEqual(self.parser.goodlines, [0, 1])

    def test_get_continuation_type(self):
        self.parser.set_str("test\n")
        result = self.parser.get_continuation_type()
        self.assertEqual(result, C_NONE)

    def test_private_methods(self):
        self.parser.set_str("test\n")
        self.parser._study1()
        self.assertEqual(self.parser.study_level, 1)

if __name__ == '__main__':
    unittest.main()