import unittest
from docstring_parser.parser import parse


class TestDocstringParser(unittest.TestCase):
    def test_parse_function(self):
        text = """
        This is a test function.

        Args:
            x (int): The first integer.
            y (int): The second integer.

        Returns:
            int: The sum of the two integers.
        """
        expected = {
            'description': 'This is a test function.',
            'params': {
                'x': 'The first integer.',
                'y': 'The second integer.'
            },
            'returns': 'The sum of the two integers.'
        }
        result = parse(text).__dict__
        self.assertEqual(result, expected)

    def test_parse_class(self):
        text = """
        This is a test class.

        Attributes:
            x (int): The first integer.
            y (int): The second integer.

        Methods:
            add(self, z: int) -> int: Returns the sum of the three integers.
        """
        expected = {
            'description': 'This is a test class.',
            'attributes': {
                'x': 'The first integer.',
                'y': 'The second integer.'
            },
            'methods': {
                'add': {
                    'description': 'Returns the sum of the three integers.',
                    'params': {
                        'self': '',
                        'z': 'The third integer.'
                    },
                    'returns': 'The sum of the three integers.'
                }
            }
        }
        result = parse(text).__dict__()
        self.assertEqual(result, expected)

    def test_parse_magic_method(self):
        text = """
        This is a test class.

        Attributes:
            x (int): The first integer.
            y (int): The second integer.

        Methods:
            __init__(self, x: int, y: int): Initializes the class.
        """
        expected = {
            'description': 'This is a test class.',
            'attributes': {
                'x': 'The first integer.',
                'y': 'The second integer.'
            },
            'methods': {
                '__init__': {
                    'description': 'Initializes the class.',
                    'params': {
                        'self': '',
                        'x': 'The first integer.',
                        'y': 'The second integer.'
                    },
                    'returns': ''
                }
            }
        }
        result = parse(text).__dict__()
        self.assertEqual(result, expected)

    def test_parse_private_method(self):
        text = """
        This is a test class.

        Attributes:
            x (int): The first integer.
            y (int): The second integer.

        Methods:
            _private_method(self, z: int) -> int: Returns the sum of the three integers.
        """
        expected = {
            'description': 'This is a test class.',
            'attributes': {
                'x': 'The first integer.',
                'y': 'The second integer.'
            },
            'methods': {
                '_private_method': {
                    'description': 'Returns the sum of the three integers.',
                    'params': {
                        'self': '',
                        'z': 'The third integer.'
                    },
                    'returns': 'The sum of the three integers.'
                }
            }
        }
        result = parse(text).__dict__
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()