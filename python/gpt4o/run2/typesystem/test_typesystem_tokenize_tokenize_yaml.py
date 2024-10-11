import unittest
from typesystem.tokenize.tokenize_yaml import _get_position, tokenize_yaml, validate_yaml
from typesystem.base import ParseError, Position
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken, Token
from typesystem.tokenize.tokenize_yaml import yaml


class TestTokenizeYaml(unittest.TestCase):
    def test_get_position(self):
        content = "line1\nline2\nline3"
        index = 7
        position = _get_position(content, index)
        self.assertEqual(position.line_no, 2)
        self.assertEqual(position.column_no, 2)
        self.assertEqual(position.char_index, 7)

    def test_tokenize_yaml_empty_content(self):
        content = ""
        with self.assertRaises(ParseError) as context:
            tokenize_yaml(content)
        self.assertEqual(context.exception.text, "No content.")
        self.assertEqual(context.exception.code, "no_content")
        self.assertEqual(context.exception.position, Position(column_no=1, line_no=1, char_index=0))

    def test_tokenize_yaml_invalid_yaml(self):
        content = "invalid: [yaml"
        with self.assertRaises(ParseError) as context:
            tokenize_yaml(content)
        self.assertEqual(context.exception.code, "parse_error")

    def test_tokenize_yaml_valid_yaml(self):
        content = "key: value"
        token = tokenize_yaml(content)
        self.assertIsInstance(token, DictToken)
        self.assertEqual(token.value, {"key": "value"})

    def test_tokenize_yaml_bytes_content(self):
        content = b"key: value"
        token = tokenize_yaml(content)
        self.assertIsInstance(token, DictToken)
        self.assertEqual(token.value, {"key": "value"})

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml(self):
        content = "key: value"
        validator = Field()
        result = validate_yaml(content, validator)
        self.assertIsNotNone(result)

    def test_validate_yaml_with_schema(self):
        class ExampleSchema(Schema):
            key = Field()

        content = "key: value"
        result = validate_yaml(content, ExampleSchema)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()