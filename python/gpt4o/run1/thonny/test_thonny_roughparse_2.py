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

    def test_set_str_assertion(self):
        with self.assertRaises(AssertionError):
            self.parser.set_str("test")

    def test_find_good_parse_start(self):
        self.parser.set_str("def foo():\n    pass\n")
        result = self.parser.find_good_parse_start(is_char_in_string=lambda x: False)
        self.assertIsNone(result)

    def test_find_good_parse_start_with_synchre(self):
        self.parser.set_str("def foo():\n    pass\n")
        result = self.parser.find_good_parse_start(is_char_in_string=lambda x: False, _synchre=_synchre)
        self.assertIsNone(result)

    def test_set_lo(self):
        self.parser.set_str("test\n")
        self.parser.set_lo(0)
        self.assertEqual(self.parser.str, "test\n")

    def test_set_lo_assertion(self):
        self.parser.set_str("test\n")
        with self.assertRaises(AssertionError):
            self.parser.set_lo(1)

    def test_study1(self):
        self.parser.set_str("test\n")
        self.parser._study1()
        self.assertEqual(self.parser.study_level, 1)

    def test_get_continuation_type(self):
        self.parser.set_str("test\n")
        result = self.parser.get_continuation_type()
        self.assertEqual(result, C_NONE)

    def test_study1_with_continuation(self):
        self.parser.set_str("test\\\n")
        self.parser._study1()
        self.assertEqual(self.parser.continuation, C_BACKSLASH)

    def test_study1_with_string(self):
        self.parser.set_str('"""test"""\n')
        self.parser._study1()
        self.assertEqual(self.parser.continuation, C_NONE)

    def test_study1_with_bracket(self):
        self.parser.set_str("(\n")
        self.parser._study1()
        self.assertEqual(self.parser.continuation, C_BRACKET)

if __name__ == '__main__':
    unittest.main()