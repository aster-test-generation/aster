import unittest
from thonny.roughparse import HyperParser, NUM_CONTEXT_LINES


class MockText:
    def __init__(self, content):
        self.content = content

    def index(self, index):
        return index

    def get(self, start, end):
        return self.content

class MockRoughParser:
    def __init__(self, indent_width, tabwidth):
        self.indent_width = indent_width
        self.tabwidth = tabwidth
        self.str = ""
        self.lo = 0

    def set_str(self, text):
        self.str = text

    def find_good_parse_start(self, func):
        return 0

    def set_lo(self, lo):
        self.lo = lo

    def get_last_stmt_bracketing(self):
        return [(0, 0), (1, 1), (2, 0)]

class TestHyperParser(unittest.TestCase):
    def setUp(self):
        self.text = MockText("def foo():\n    pass\n")
        self.index = "1.0"
        self.parser = HyperParser(self.text, self.index)

    def test_init(self):
        self.assertEqual(self.parser.text, self.text)
        self.assertEqual(self.parser.stopatindex, '1.end')
        self.assertEqual(self.parser.rawtext, 'def foo():\n    pass\n \n')
        self.assertEqual(self.parser.bracketing, [(0, 0), (1, 1), (2, 0)])
        self.assertEqual(self.parser.isopener, [False, True, False])

    def test_get_expression(self):
        self.parser.set_index("1.0")
        result = self.parser.get_expression()
        self.assertEqual(result, "def foo():\n    pass\n")

    def test_set_index(self):
        self.parser.set_index("1.0")
        self.assertEqual(self.parser.index, "1.0")

    def test_is_in_code(self):
        self.parser.set_index("1.0")
        result = self.parser.is_in_code()
        self.assertTrue(result)

    def test_eat_identifier(self):
        result = self.parser._eat_identifier("foo", 0, 3)
        self.assertEqual(result, 3)

    def test_whitespace_chars(self):
        self.assertEqual(self.parser._whitespace_chars, " \t\n")

if __name__ == '__main__':
    unittest.main()