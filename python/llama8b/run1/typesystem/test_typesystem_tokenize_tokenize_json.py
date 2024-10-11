import unittest
from typesystem.tokenize import tokenize_jso
from typesystem.tokenize.positional_validation import Position, ParseError, ValidationError
from typesystem.tokenize.tokens import Token, DictToken, ListToken, ScalarToken


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_valid_json(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, DictToken)

    def test_tokenize_json_invalid_json(self):
        content = '{"a": 1, "b": 2'
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_tokenize_json_empty_string(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_tokenize_json_bytes(self):
        content = b'{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertIsInstance(token, DictToken)

    def test_tokenize_json_non_string_content(self):
        content = [1, 2, 3]
        with self.assertRaises(TypeError):
            tokenize_json(content)

    def test_tokenize_json_non_string_bytes_content(self):
        content = b'[1, 2, 3]'
        with self.assertRaises(TypeError):
            tokenize_json(content)

    def test_validate_json_valid_json(self):
        content = '{"a": 1, "b": 2}'
        validator = Field()
        result = validate_json(content, validator)
        self.assertIsNone(result)

    def test_validate_json_invalid_json(self):
        content = '{"a": 1, "b": 2'
        validator = Field()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

    def test_validate_json_empty_string(self):
        content = ''
        validator = Field()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

    def test_validate_json_bytes(self):
        content = b'{"a": 1, "b": 2}'
        validator = Field()
        result = validate_json(content, validator)
        self.assertIsNone(result)

    def test_validate_json_non_string_content(self):
        content = [1, 2, 3]
        validator = Field()
        with self.assertRaises(TypeError):
            validate_json(content, validator)

    def test_validate_json_non_string_bytes_content(self):
        content = b'[1, 2, 3]'
        validator = Field()
        with self.assertRaises(TypeError):
            validate_json(content, validator)

if __name__ == '__main__':
    unittest.main()