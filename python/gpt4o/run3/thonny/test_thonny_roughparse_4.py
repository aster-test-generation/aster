import unittest
from thonny.roughparse import HyperParser, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR
from unittest.mock import Mock


class TestHyperParser(unittest.TestCase):
    def setUp(self):
        self.text = Mock()
        self.text.indent_width = 4
        self.text.tabwidth = 4
        self.text.index = Mock(return_value="1.0")
        self.text.get = Mock(return_value="def foo():\n    pass\n")
        self.index = "1.0"
        self.parser = HyperParser(self.text, self.index)

    def test_init(self):
        self.assertEqual(self.parser.text, self.text)
        self.assertEqual(self.parser.stopatindex, '1.end')
        self.assertIsInstance(self.parser.bracketing, list)
        self.assertIsInstance(self.parser.isopener, list)

    def test_set_index(self):
        self.parser.set_index("1.0")
        self.assertEqual(self.parser.indexinrawtext, 0)
        self.assertEqual(self.parser.indexbracket, 0)

    def test_set_index_raises_value_error(self):
        with self.assertRaises(ValueError):
            self.parser.set_index("0.0")

    def test_is_in_string(self):
        self.parser.isopener = [True]
        self.parser.rawtext = '"'
        self.parser.bracketing = [(0, 0)]
        self.assertTrue(self.parser.is_in_string())

    def test_is_in_code(self):
        self.parser.isopener = [False]
        self.parser.rawtext = ' '
        self.parser.bracketing = [(0, 0)]
        self.assertTrue(self.parser.is_in_code())

    def test_get_surrounding_brackets(self):
        self.parser.isopener = [True, False]
        self.parser.rawtext = '({})'
        self.parser.bracketing = [(0, 1), (1, 2), (2, 1), (3, 0)]
        self.parser.indexbracket = 2
        self.text.index = Mock(side_effect=lambda x: x)
        result = self.parser.get_surrounding_brackets()
        self.assertEqual(result, ('1.end-3c', '1.end-1c'))

    def test_get_surrounding_brackets_none(self):
        self.parser.isopener = [False]
        self.parser.rawtext = ' '
        self.parser.bracketing = [(0, 0)]
        self.parser.indexbracket = 0
        result = self.parser.get_surrounding_brackets()
        self.assertIsNone(result)

    def test_eat_identifier(self):
        result = HyperParser._eat_identifier("identifier", 0, 10)
        self.assertEqual(result, 10)

    def test_eat_identifier_non_ascii(self):
        result = HyperParser._eat_identifier("identifiér", 0, 10)
        self.assertEqual(result, 10)

    def test_eat_identifier_invalid(self):
        result = HyperParser._eat_identifier("123identifier", 0, 13)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()