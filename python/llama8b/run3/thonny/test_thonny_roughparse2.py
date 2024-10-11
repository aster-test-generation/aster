import unittest
from thonny.roughparse import RoughParser

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