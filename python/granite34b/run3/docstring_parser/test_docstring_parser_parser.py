import unittest
from docstring_parser.parser import parse
from docstring_parser.common import Docstring, ParseError
from docstring_parser.styles import STYLES, Style


class TestDocstringParser(unittest.TestCase):
    def test_parse_function(self):
        text = """
        This is a test function.

        :param x: an integer
        :param y: a string
        :return: a list of strings
        """
        expected = {
            'description': 'This is a test function.',
            'params': {
                'x': 'an integer',
                'y': 'a string',
            },
            'returns': 'a list of strings',
        }
        result = parse(text).__dict__()
        self.assertEqual(result, expected)

    def test_parse_class(self):
        text = """
        This is a test class.

        :param x: an integer
        :param y: a string
        """
        expected = {
            'description': 'This is a test class.',
            'params': {
                'x': 'an integer',
                'y': 'a string',
            },
        }
        result = parse(text).__dict__
        self.assertEqual(result, expected)

    def test_parse_magic_method(self):
        text = """
        This is a test magic method.

        :param x: an integer
        :param y: a string
        """
        expected = {
            'description': 'This is a test magic method.',
            'params': {
                'x': 'an integer',
                'y': 'a string',
            },
        }
        result = parse(text).__dict__
        self.assertEqual(result, expected)

    def test_parse_private_method(self):
        text = """
        This is a test private method.

        :param x: an integer
        :param y: a string
        """
        expected = {
            'description': 'This is a test private method.',
            'params': {
                'x': 'an integer',
                'y': 'a string',
            },
        }
        result = parse(text).__dict__()
        self.assertEqual(result, expected)

    def test_parse_protected_method(self):
        text = """
        This is a test protected method.

        :param x: an integer
        :param y: a string
        """
        expected = {
            'description': 'This is a test protected method.',
            'params': {
                'x': 'an integer',
                'y': 'a string',
            },
        }
        result = parse(text).__dict__()
        self.assertEqual(result, expected)

class TestParse(unittest.TestCase):
    def test_parse_with_valid_input(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_invalid_input(self):
        text = 123
        with self.assertRaises(ParseError):
            parse(text)

    def test_parse_with_auto_style(self):
        text = "This is a test docstring"
        result = parse(text, style=Style.auto)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_specific_style(self):
        text = "This is a test docstring"
        result = parse(text, style=Style.google)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_private_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result._Docstring__private_method(), "private")

    def test_parse_with_protected_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result._Docstring__protected_method(), "protected")

    def test_parse_with_magic_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result.__str__(), "Docstring")

if __name__ == '__main__':
    unittest.main()