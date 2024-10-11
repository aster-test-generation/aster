import unittest
from typesystem.tokenize.tokenize_yaml import tokenize_yaml, validate_yaml
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.base import Message, ParseError, Position, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken, Token


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_str(self):
        content = 'a: 1\nb: 2'
        token = tokenize_yaml(content)
        self.assertIsInstance(token, Token)

    def test_tokenize_yaml_bytes(self):
        content = b'a: 1\nb: 2'
        token = tokenize_yaml(content)
        self.assertIsInstance(token, Token)

    def test_tokenize_yaml_empty_str(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_yaml(content)

    def test_tokenize_yaml_invalid_yaml(self):
        content = 'a: 1\nb: 2\n'
        with self.assertRaises(ParseError):
            tokenize_yaml(content)

    def test_tokenize_yaml_valid_yaml(self):
        content = 'a: 1\nb: 2'
        token = tokenize_yaml(content)
        self.assertIsInstance(token, Token)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_valid(self):
        content = 'a: 1\nb: 2'
        validator = Field()
        result = validate_yaml(content, validator)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_validate_yaml_invalid(self):
        content = 'a: 1\nb: 2'
        validator = Field()
        with self.assertRaises(ValidationError):
            validate_yaml(content, validator)

    def test_validate_yaml_empty_str(self):
        content = ''
        validator = Field()
        with self.assertRaises(ParseError):
            validate_yaml(content, validator)

    def test_validate_yaml_invalid_yaml(self):
        content = 'a: 1\nb: 2\n'
        validator = Field()
        with self.assertRaises(ParseError):
            validate_yaml(content, validator)

if __name__ == '__main__':
    unittest.main()