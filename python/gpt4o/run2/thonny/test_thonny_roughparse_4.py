import unittest
from thonny.roughparse import HyperParser, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR
from keyword import iskeyword


class MockText:
    def __init__(self, content):
        self.content = content
        self.indent_width = 4
        self.tabwidth = 4

    def index(self, index):
        return str(int(float(index)))

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
        self.parser.bracketing = [(0, 0), (1, 1), (2, 0)]
        self.parser.isopener = [False, True, False]

    def test_init(self):
        self.assertEqual(self.parser.text, self.text)
        self.assertEqual(self.parser.stopatindex, '1.end')

    def test_set_index(self):
        self.parser.set_index("1.0")
        self.assertEqual(self.parser.indexinrawtext, 0)

    def test_set_index_raises(self):
        with self.assertRaises(ValueError):
            self.parser.set_index("0.0")

    def test_is_in_string(self):
        self.parser.indexbracket = 1
        self.assertTrue(self.parser.is_in_string())

    def test_is_in_code(self):
        self.parser.indexbracket = 2
        self.assertTrue(self.parser.is_in_code())

    def test_get_surrounding_brackets(self):
        result = self.parser.get_surrounding_brackets()
        self.assertEqual(result, ('1.0', '1.end'))

    def test_get_surrounding_brackets_mustclose(self):
        result = self.parser.get_surrounding_brackets(mustclose=True)
        self.assertIsNone(result)

    def test_eat_identifier(self):
        result = HyperParser._eat_identifier("foo", 0, 3)
        self.assertEqual(result, 3)

    def test_eat_identifier_non_ascii(self):
        result = HyperParser._eat_identifier("föö", 0, 3)
        self.assertEqual(result, 3)

    def test_eat_identifier_keyword(self):
        result = HyperParser._eat_identifier("def", 0, 3)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()