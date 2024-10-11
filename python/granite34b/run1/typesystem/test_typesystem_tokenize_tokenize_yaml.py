import unittest
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_with_str(self):
        content = "key: value"
        self.token = tokenize_yaml(content)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_bytes(self):
        content = b"key: value"
        self.token = tokenize_yaml(content)
        self.assertEqual(token.content, content.decode("utf-8"))

    def test_tokenize_yaml_with_empty_content(self):
        with self.assertRaises(ParseError):
            tokenize_yaml("")
        self.assertEqual(context.exception.code, "no_content")

    def test_tokenize_yaml_with_invalid_yaml(self):
        with self.assertRaises(ParseError):
            tokenize_yaml("invalid yaml")
        self.assertEqual(context.exception.code, "parse_error")

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_with_field(self):
        content = "key: value"
        field = Field(type="string")
        result = validate_yaml(content, field)
        self.assertEqual(result, {"key": "value"})

class TestTokenizeYAML(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = """
        key1: value1
        key2: value2
        """
        token = tokenize_yaml(content)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 42)
        self.assertEqual(token.content, content)
        self.assertEqual(token.value, {"key1": "value1", "key2": "value2"})

    def test_tokenize_yaml_bytes(self):
        content = b"""
        key1: value1
        key2: value2
        """
        token = tokenize_yaml(content)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 42)
        self.assertEqual(token.content, content.decode("utf-8"))
        self.assertEqual(token.value, {"key1": "value1", "key2": "value2"})

    def test_tokenize_yaml_empty(self):
        with self.assertRaises(ParseError) as cm:
            tokenize_yaml("")
        self.assertEqual(cm.exception.text, "No content.")
        self.assertEqual(cm.exception.code, "no_content")
        self.assertEqual(cm.exception.position.line_no, 1)
        self.assertEqual(cm.exception.position.column_no, 1)
        self.assertEqual(cm.exception.position.char_index, 0)

    def test_tokenize_yaml_invalid(self):
        with self.assertRaises(ParseError) as cm:
            tokenize_yaml("invalid: yaml")
        self.assertEqual(cm.exception.text, "while parsing a block mapping")
        self.assertEqual(cm.exception.code, "parse_error")
        self.assertEqual(cm.exception.position.line_no, 1)
        self.assertEqual(cm.exception.position.column_no, 9)
        self.assertEqual(cm.exception.position.char_index, 8)

class TestValidateYAML(unittest.TestCase):
    def test_validate_yaml_dict(self):
        content = """
        key1: value1
        key2: value2
        """
        validator = {
            "key1": "string",
            "key2": "string",
        }
        result = validate_yaml(content, validator)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

    def test_validate_yaml_schema(self):
        content = """
        key1: value1
        key2: value2
        """
        class TestSchema(Schema):
            key1 = "string"
            key2 = "string"
        result = validate_yaml(content, TestSchema)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

if __name__ == '__main__':
    unittest.main()