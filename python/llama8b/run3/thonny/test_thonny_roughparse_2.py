import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        self.assertEqual(parser.str, "hello\nworld")
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("def foo():\n    pass")
        pos = parser.find_good_parse_start()
        self.assertEqual(pos, 7)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        parser.set_lo(5)
        self.assertEqual(parser.str, "world")

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        parser._study1()
        self.assertEqual(parser.continuation, RoughParser.C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        parser._study1()
        self.assertEqual(parser.get_continuation_type(), RoughParser.C_NONE)

    def test_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        self.assertEqual(str(parser), "RoughParser")

    def test_repr(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("hello\nworld")
        self.assertEqual(repr(parser), "RoughParser(indent_width=4, tabwidth=8)")

    def test_eq(self):
        parser1 = RoughParser(indent_width=4, tabwidth=8)
        parser2 = RoughParser(indent_width=4, tabwidth=8)
        self.assertTrue(parser1 == parser2)

class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(4, 8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(4, 8)
        parser.set_str("Hello\nWorld")
        self.assertEqual(parser.str, "Hello\nWorld")
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(4, 8)
        parser.set_str("Hello:\nWorld")
        self.assertEqual(parser.find_good_parse_start(), 6)

    def test_set_lo(self):
        parser = RoughParser(4, 8)
        parser.set_lo(2)
        self.assertEqual(parser.str, "Hello\nWorld")

    def test_study1(self):
        parser = RoughParser(4, 8)
        parser.set_str("Hello:\nWorld")
        parser._study1()
        self.assertEqual(parser.continuation, C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(4, 8)
        parser.set_str("Hello:\nWorld")
        self.assertEqual(parser.get_continuation_type(), C_NONE)

    def test_str(self):
        parser = RoughParser(4, 8)
        self.assertEqual(str(parser), "RoughParser")

    def test_repr(self):
        parser = RoughParser(4, 8)
        self.assertEqual(repr(parser), "RoughParser(4, 8)")

    def test_eq(self):
        parser1 = RoughParser(4, 8)
        parser2 = RoughParser(4, 8)
        self.assertEqual(parser1, parser2)

    def test_ne(self):
        parser1 = RoughParser(4, 8)
        parser2 = RoughParser(4, 9)
        self.assertNotEqual(parser1, parser2)

class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str('Hello\nWorld')
        self.assertEqual(parser.str, 'Hello\nWorld')
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str('def foo():\n    pass\n')
        self.assertEqual(parser.find_good_parse_start(), 6)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str('Hello\nWorld')
        parser.set_lo(5)
        self.assertEqual(parser.str, 'World')

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str('def foo():\n    pass\n')
        parser._study1()
        self.assertEqual(parser.continuation, C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str('def foo():\n    pass\n')
        self.assertEqual(parser.get_continuation_type(), C_NONE)

    def test_private_method(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser._study1()
        self.assertEqual(parser._study1(), None)

    def test_magic_method_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(str(parser), 'RoughParser')

    def test_magic_method_repr(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(repr(parser), 'RoughParser(RoughParser(indent_width=4, tabwidth=8))')

    def test_magic_method_eq(self):
        parser1 = RoughParser(indent_width=4, tabwidth=8)
        parser2 = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()