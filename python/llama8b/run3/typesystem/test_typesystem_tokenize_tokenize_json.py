import unittest
from typesystem.tokenize import tokenize_jso
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken, Token
from typesystem.base import Message, ParseError, Position, ValidationError


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_str(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, DictToken)

    def test_tokenize_json_bytes(self):
        content = b'{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, DictToken)

    def test_tokenize_json_empty_str(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_tokenize_json_invalid_json(self):
        content = '{"a": 1, "b": invalid'
        with self.assertRaises(JSONDecodeError):
            tokenize_json(content)

    def test_tokenize_json_nested_dict(self):
        content = '{"a": {"b": 1, "c": 2}, "d": 3}'
        token = tokenize_json(content)
        self.assertIsInstance(token, DictToken)

    def test_tokenize_json_list(self):
        content = '[1, 2, 3]'
        token = tokenize_json(content)
        self.assertIsInstance(token, ListToken)

class TestValidateJson(unittest.TestCase):
    def test_validate_json_valid(self):
        content = '{"a": 1, "b": 2}'
        validator = Field()
        result = validate_json(content, validator)
        self.assertEqual(result, Message())

    def test_validate_json_invalid_json(self):
        content = '{"a": 1, "b": invalid'
        validator = Field()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

    def test_validate_json_invalid_schema(self):
        content = '{"a": 1, "b": 2}'
        validator = object  # invalid schema
        with self.assertRaises(ValidationError):
            validate_json(content, validator)

    def test_validate_json_nested_dict(self):
        content = '{"a": {"b": 1, "c": 2}, "d": 3}'
        validator = Field()
        result = validate_json(content, validator)
        self.assertEqual(result, Message())

    def test_validate_json_list(self):
        content = '[1, 2, 3]'
        validator = Field()
        result = validate_json(content, validator)
        self.assertEqual(result, Message())

if __name__ == '__main__':
    unittest.main()