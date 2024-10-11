import unittest
from thonny.roughparse import HyperParser


class MockText:
    def __init__(self, text):
        self.text = text
        self.indent_width = 4
        self.tabwidth = 4

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

    def test_get_expression(self):
        self.parser.set_index("1.0")
        result = self.parser.get_expression()
        self.assertEqual(result, "def foo():\n    pass\n")

    def test_set_index(self):
        self.parser.set_index("1.0")
        self.assertEqual(self.parser.index, 0)

    def test_is_in_code(self):
        self.parser.set_index("1.0")
        result = self.parser.is_in_code()
        self.assertTrue(result)

    def test_eat_identifier(self):
        result = self.parser._eat_identifier("foo", 0, 3)
        self.assertEqual(result, 3)

    def test_private_methods(self):
        result = self.parser._HyperParser__private_method()
        self.assertEqual(result, expected_value)

if __name__ == '__main__':
    unittest.main()