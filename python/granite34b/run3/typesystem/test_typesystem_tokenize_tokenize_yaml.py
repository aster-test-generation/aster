import unittest
from typesystem.tokenize.tokenize_yaml import _get_position, tokenize_yaml, validate_yaml


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_with_str_content(self):
        content = "key: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_bytes_content(self):
        content = b"key: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.content, content.decode("utf-8"))

    def test_tokenize_yaml_with_empty_content(self):
        with self.assertRaises(ParseError) as context:
            tokenize_yaml("")
        self.assertEqual(context.exception.code, "no_content")

    def test_tokenize_yaml_with_invalid_yaml_content(self):
        with self.assertRaises(ParseError) as context:
            tokenize_yaml("invalid: yaml")
        self.assertEqual(context.exception.code, "parse_error")

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_with_field(self):
        field = Field(type="string")
        content = "value"
        result = validate_yaml(content, field)
        self.assertEqual(result, content)

    def test_validate_yaml_with_schema(self):
        class ExampleSchema(Schema):
            field = Field(type="string")
        schema = ExampleSchema()
        content = "value"
        result = validate_yaml(content, schema)
        self.assertEqual(result, content)

class TestGetPosition(unittest.TestCase):
    def test_get_position_with_empty_content(self):
        position = _get_position("", 0)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.column_no, 1)
        self.assertEqual(position.char_index, 0)

if __name__ == '__main__':
    unittest.main()