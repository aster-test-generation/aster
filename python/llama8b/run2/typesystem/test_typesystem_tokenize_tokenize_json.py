import unittest
from typesystem.tokenize import tokenize_jso
from typesystem.tokenize.positional_validation import Position
from typesystem.tokenize.tokens import Token
from typesystem.base import Message, ParseError
from typesystem.schemas import Schema
from typesystem.fields import Field


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_str(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, Token)
        self.assertEqual(token.__class__.__name__, 'DictToken')

    def test_tokenize_json_bytes(self):
        content = b'{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, Token)
        self.assertEqual(token.__class__.__name__, 'DictToken')

    def test_tokenize_json_invalid(self):
        content = 'invalid json'
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_tokenize_json_empty(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_validate_json_str(self):
        content = '{"a": 1, "b": 2}'
        validator = Schema()
        result = validate_json(content, validator)
        self.assertEqual(result, Message())

    def test_validate_json_bytes(self):
        content = b'{"a": 1, "b": 2}'
        validator = Schema()
        result = validate_json(content, validator)
        self.assertEqual(result, Message())

    def test_validate_json_invalid(self):
        content = 'invalid json'
        validator = Schema()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

    def test_validate_json_empty(self):
        content = ''
        validator = Schema()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

    def test_tokenize_json_positional_validation(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        position = Position(column_no=1, line_no=1, char_index=0)
        self.assertEqual(token.position, position)

if __name__ == '__main__':
    unittest.main()