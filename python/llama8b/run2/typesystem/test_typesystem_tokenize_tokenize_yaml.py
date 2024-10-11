from typesystem.tokenize.tokenize_yaml import Token
import unittest
from typesystem.tokenize.tokenize_yaml import tokenize_yaml, validate_yaml
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.base import Message, ParseError, Position, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_valid(self):
        content = 'a: 1\nb: 2'
        token = tokenize_yaml(content)
        self.assertIsInstance(token, Token)

    def test_tokenize_yaml_invalid(self):
        content = 'a: 1\nb'
        with self.assertRaises(ParseError):
            tokenize_yaml(content)

    def test_tokenize_yaml_empty(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_yaml(content)

    def test_tokenize_yaml_bytes(self):
        content = b'a: 1\nb: 2'
        token = tokenize_yaml(content)
        self.assertIsInstance(token, Token)

    def test_tokenize_yaml_non_string(self):
        content = 123
        with self.assertRaises(TypeError):
            tokenize_yaml(content)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_valid(self):
        content = 'a: 1\nb: 2'
        validator = Field()
        result = validate_yaml(content, validator)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_validate_yaml_invalid(self):
        content = 'a: 1\nb'
        validator = Field()
        with self.assertRaises(ValidationError):
            validate_yaml(content, validator)

    def test_validate_yaml_empty(self):
        content = ''
        validator = Field()
        with self.assertRaises(ParseError):
            validate_yaml(content, validator)

    def test_validate_yaml_bytes(self):
        content = b'a: 1\nb: 2'
        validator = Field()
        result = validate_yaml(content, validator)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_validate_yaml_non_string(self):
        content = 123
        validator = Field()
        with self.assertRaises(TypeError):
            validate_yaml(content, validator)

if __name__ == '__main__':
    unittest.main()