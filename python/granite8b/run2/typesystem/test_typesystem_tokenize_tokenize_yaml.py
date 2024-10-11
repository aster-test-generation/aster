import unittest
from typesystem.tokenize.tokenize_yaml import tokenize_yaml, validate_yaml
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = "key: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "mapping")
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.value, {"key": "value"})

    def test_tokenize_yaml_with_comments(self):
        content = "# This is a comment\nkey: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "mapping")
        self.assertEqual(token.start, len("# This is a comment\n") - 1)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.value, {"key": "value"})

    def test_tokenize_yaml_with_invalid_content(self):
        with self.assertRaises(ParseError) as cm:
            tokenize_yaml("invalid content")
        self.assertEqual(cm.exception.code, "parse_error")
        self.assertEqual(cm.exception.position.line_no, 1)
        self.assertEqual(cm.exception.position.column_no, 1)
        self.assertEqual(cm.exception.position.char_index, 0)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_with_valid_content(self):
        content = "key: value"
        token = tokenize_yaml(content)
        result = validate_yaml(content, Field(type="mapping"))
        self.assertEqual(result, {"key": "value"})

class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = "key: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.value, {"key": "value"})
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_get_position(self):
        content = "line 1\nline 2"
        position = _get_position(content, index=len(content) - 1)
        self.assertEqual(position.line_no, 2)
        self.assertEqual(position.column_no, 1)
        self.assertEqual(position.char_index, len(content) - 1)


if __name__ == '__main__':
    unittest.main()