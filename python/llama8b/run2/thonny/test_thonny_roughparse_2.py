import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 8)

    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("Hello\nWorld")
        self.assertEqual(parser.str, "Hello\nWorld")
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("def foo():\n    pass\n")
        self.assertEqual(parser.find_good_parse_start(), 0)
        parser.set_str("def foo():\n    pass\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)
        parser.set_str("def foo():\n    pass\n    pass\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)
        parser.set_str("def foo():\n    pass\n    pass\n    pass\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("Hello\nWorld")
        parser.set_lo(5)
        self.assertEqual(parser.str, "World")

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("Hello\nWorld")
        parser._study1()
        self.assertEqual(parser.continuation, RoughParser.C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("Hello\nWorld")
        parser._study1()
        self.assertEqual(parser.get_continuation_type(), RoughParser.C_NONE)

    def test_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("Hello\nWorld")
        self.assertEqual(str(parser), "RoughParser")

    def test_repr(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        self.assertEqual(repr(parser), "RoughParser(indent_width=4, tabwidth=8)")

    def test_eq(self):
        parser1 = RoughParser(indent_width=4, tabwidth=8)
        parser2 = RoughParser(indent_width=4, tabwidth=8)
        self.assertTrue(parser1 == parser2)
        parser1.set_str("Hello\nWorld")
        self.assertFalse(parser1 == parser2)

class TestRoughParser(unittest.TestCase):
    def test_init(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        self.assertEqual(parser.indent_width, 4)
        self.assertEqual(parser.tabwidth, 4)

    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser.set_str("Hello\nWorld")
        self.assertEqual(parser.str, "Hello\nWorld")
        self.assertEqual(parser.study_level, 0)

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser.set_str("def foo():\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)
        parser.set_str("def foo():\n    pass\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)
        parser.set_str("def foo():\n    pass\n    pass\n    pass")
        self.assertEqual(parser.find_good_parse_start(), 0)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser.set_str("Hello\nWorld")
        parser.set_lo(5)
        self.assertEqual(parser.str, "World")

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser.set_str("Hello\nWorld")
        parser._study1()
        self.assertEqual(parser.continuation, RoughParser.C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser.set_str("Hello\nWorld")
        self.assertEqual(parser.get_continuation_type(), RoughParser.C_NONE)

    def test_private_method(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        parser._study1()
        self.assertEqual(parser.continuation, RoughParser.C_NONE)

    def test_magic_method_init(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        self.assertEqual(parser.__init__(4, 4), None)

    def test_magic_method_str(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        self.assertEqual(str(parser), "RoughParser")

    def test_magic_method_repr(self):
        parser = RoughParser(indent_width=4, tabwidth=4)
        self.assertEqual(repr(parser), "RoughParser(indent_width=4, tabwidth=4)")

    def test_magic_method_eq(self):
        parser1 = RoughParser(indent_width=4, tabwidth=4)
        parser2 = RoughParser(indent_width=4, tabwidth=4)
        self.assertEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()