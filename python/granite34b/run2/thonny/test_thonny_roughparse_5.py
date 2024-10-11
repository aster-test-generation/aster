import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_get_expression(self):
        text = "print('Hello, World!')"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser.get_expression()
        self.assertEqual(expression, "print")

    def test_get_expression_with_dot(self):
        text = "print('Hello, World!').lower()"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser.get_expression()
        self.assertEqual(expression, "print")

    def test_get_expression_with_brackets(self):
        text = "print('Hello, World!')"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser.get_expression()
        self.assertEqual(expression, "print")

    def test_get_expression_with_private_method(self):
        text = "print('Hello, World!')"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser._HyperParser__get_expression()
        self.assertEqual(expression, "print")

    def test_get_expression_with_protected_method(self):
        text = "print('Hello, World!')"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser._HyperParser__get_expression()
        self.assertEqual(expression, "print")

    def test_get_expression_with_magic_method(self):
        text = "print('Hello, World!')"
        index = "1.0"
        parser = HyperParser(text, index)
        expression = parser.__str__()
        self.assertEqual(expression, "print")

if __name__ == '__main__':
    unittest.main()