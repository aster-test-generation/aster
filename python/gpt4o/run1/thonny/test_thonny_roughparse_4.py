import unittest
from thonny.roughparse import HyperParser, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR
from keyword import iskeyword


class MockText:
    def __init__(self, text):
        self.text = text

    def index(self, index):
        return index

    def get(self, start, end):
        return self.text

class TestHyperParser(unittest.TestCase):
    def setUp(self):
        self.text = MockText("def foo():\n    pass\n")
        self.index = "1.0"
        self.parser = HyperParser(self.text, self.index)

    def test_init(self):
        self.assertEqual(self.parser.text, self.text)
        self.assertEqual(self.parser.stopatindex, '1.end')

    def test_set_index(self):
        self.parser.set_index("1.0")
        self.assertEqual(self.parser.indexinrawtext, 0)

    def test_set_index_raises_value_error(self):
        with self.assertRaises(ValueError):
            self.parser.set_index("2.0")

    def test_is_in_string(self):
        self.parser.set_index("1.0")
        self.assertFalse(self.parser.is_in_string())

    def test_is_in_code(self):
        self.parser.set_index("1.0")
        self.assertTrue(self.parser.is_in_code())

    def test_get_surrounding_brackets(self):
        self.parser.set_index("1.0")
        result = self.parser.get_surrounding_brackets()
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

    def test_eat_identifier_invalid(self):
        result = HyperParser._eat_identifier("1foo", 0, 4)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()