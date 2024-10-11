import unittest
from thonny.roughparse import RoughParser, NUM_CONTEXT_LINES, C_NONE, C_BACKSLASH, C_STRING_FIRST_LINE, C_STRING_NEXT_LINES, C_BRACKET, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(4, 8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\n")
        self.assertEqual(parser.str, "hello\nworld\n")

    def test_find_good_parse_start(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld:\nfoo\nbar\n")
        pos = parser.find_good_parse_start()
        self.assertEqual(pos, 12)

    def test_set_lo(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\nfoo\nbar\n")
        parser.set_lo(5)
        self.assertEqual(parser.str, "world\nfoo\nbar\n")

    def test_study1(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\nfoo\nbar\n")
        parser._study1()
        self.assertEqual(parser.study_level, 1)

    def test_get_continuation_type(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\nfoo\nbar\n")
        parser._study1()
        continuation_type = parser.get_continuation_type()
        self.assertEqual(continuation_type, C_NONE)

    def test_private_method__study1(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\nfoo\nbar\n")
        parser._RoughParser__study1()
        self.assertEqual(parser.study_level, 1)

    def test_magic_method__init__(self):
        parser = RoughParser(4, 8)
        self.assertIsInstance(parser, RoughParser)

    def test_magic_method__str__(self):
        parser = RoughParser(4, 8)
        str_repr = str(parser)
        self.assertIsInstance(str_repr, str)

    def test_magic_method__repr__(self):
        parser = RoughParser(4, 8)
        repr_repr = repr(parser)
        self.assertIsInstance(repr_repr, str)

    def test_magic_method__eq__(self):
        parser1 = RoughParser(4, 8)
        parser2 = RoughParser(4, 8)
        self.assertTrue(parser1 == parser2)

class TestConstants(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        self.assertEqual(NUM_CONTEXT_LINES, (50, 500, 5000000))

    def test_C_NONE(self):
        self.assertEqual(C_NONE, 0)

    def test_C_BACKSLASH(self):
        self.assertEqual(C_BACKSLASH, 1)

    def test_C_STRING_FIRST_LINE(self):
        self.assertEqual(C_STRING_FIRST_LINE, 2)

    def test_C_STRING_NEXT_LINES(self):
        self.assertEqual(C_STRING_NEXT_LINES, 3)

    def test_C_BRACKET(self):
        self.assertEqual(C_BRACKET, 4)

    def test__ASCII_ID_CHARS(self):
        self.assertIsInstance(_ASCII_ID_CHARS, frozenset)

    def test__ASCII_ID_FIRST_CHARS(self):
        self.assertIsInstance(_ASCII_ID_FIRST_CHARS, frozenset)

    def test__IS_ASCII_ID_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_CHAR, list)

    def test__IS_ASCII_ID_FIRST_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_FIRST_CHAR, list)

class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(4, 8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\n")
        self.assertEqual(parser.str, "hello\nworld\n")
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld:\nfoo\nbar\n")
        pos = parser.find_good_parse_start()
        self.assertEqual(pos, 12)

    def test_set_lo(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld\nfoo\nbar\n")
        parser.set_lo(5)
        self.assertEqual(parser.str, "world\nfoo\nbar\n")

    def test_study1(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld:\nfoo\nbar\n")
        parser._study1()
        self.assertEqual(parser.study_level, 1)
        self.assertEqual(parser.continuation, C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld:\nfoo\nbar\n")
        continuation_type = parser.get_continuation_type()
        self.assertEqual(continuation_type, C_NONE)

    def test_private__study1(self):
        parser = RoughParser(4, 8)
        parser.set_str("hello\nworld:\nfoo\nbar\n")
        parser._RoughParser__study1()
        self.assertEqual(parser.study_level, 1)
        self.assertEqual(parser.continuation, C_NONE)

    def test_magic_str(self):
        parser = RoughParser(4, 8)
        str_repr = str(parser)
        self.assertEqual(str_repr, "")

    def test_magic_repr(self):
        parser = RoughParser(4, 8)
        repr_repr = repr(parser)
        self.assertEqual(repr_repr, "RoughParser(4, 8)")

class TestConstants(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        self.assertEqual(NUM_CONTEXT_LINES, (50, 500, 5000000))

    def test_C_NONE(self):
        self.assertEqual(C_NONE, 0)

    def test_C_BACKSLASH(self):
        self.assertEqual(C_BACKSLASH, 1)

    def test_C_STRING_FIRST_LINE(self):
        self.assertEqual(C_STRING_FIRST_LINE, 2)

    def test_C_STRING_NEXT_LINES(self):
        self.assertEqual(C_STRING_NEXT_LINES, 3)

    def test_C_BRACKET(self):
        self.assertEqual(C_BRACKET, 4)

    def test__synchre(self):
        self.assertIsNotNone(_synchre)

    def test__junkre(self):
        self.assertIsNotNone(_junkre)

    def test__match_stringre(self):
        self.assertIsNotNone(_match_stringre)

    def test__itemre(self):
        self.assertIsNotNone(_itemre)

    def test__closere(self):
        self.assertIsNotNone(_closere)

    def test__ASCII_ID_CHARS(self):
        self.assertIsNotNone(_ASCII_ID_CHARS)

    def test__ASCII_ID_FIRST_CHARS(self):
        self.assertIsNotNone(_ASCII_ID_FIRST_CHARS)

    def test__IS_ASCII_ID_CHAR(self):
        self.assertIsNotNone(_IS_ASCII_ID_CHAR)

    def test__IS_ASCII_ID_FIRST_CHAR(self):
        self.assertIsNotNone(_IS_ASCII_ID_FIRST_CHAR)

if __name__ == '__main__':
    unittest.main()