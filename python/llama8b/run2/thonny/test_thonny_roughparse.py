import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        parser = HyperParser("test text", 10)
        self.assertEqual(parser.text, "test text")
        self.assertEqual(parser.index, 10)

    def test_get_expression(self):
        parser = HyperParser("test text", 10)
        result = parser.get_expression()
        self.assertEqual(result, "")

    def test_is_in_code(self):
        parser = HyperParser("test text", 10)
        self.assertFalse(parser.is_in_code())

    def test_eat_identifier(self):
        parser = HyperParser("test text", 10)
        result = parser._eat_identifier("test text", 0, 5)
        self.assertEqual(result, 5)

    def test_build_char_in_string_func(self):
        parser = HyperParser("test text", 10)
        result = parser._build_char_in_string_func("10")
        self.assertEqual(result, "10")

    def test_set_index(self):
        parser = HyperParser("test text", 10)
        parser.set_index(20)
        self.assertEqual(parser.index, 20)

    def test_str(self):
        parser = HyperParser("test text", 10)
        result = str(parser)
        self.assertEqual(result, "HyperParser")

    def test_repr(self):
        parser = HyperParser("test text", 10)
        result = repr(parser)
        self.assertEqual(result, "HyperParser(10)")

    def test_eq(self):
        parser1 = HyperParser("test text", 10)
        parser2 = HyperParser("test text", 10)
        self.assertEqual(parser1, parser2)

    def test_ne(self):
        parser1 = HyperParser("test text", 10)
        parser2 = HyperParser("test text", 20)
        self.assertNotEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()