import unittest
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = """
        key1: value1
        key2: value2
        """
        self.token = tokenize_yaml(content)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 37)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_bytes(self):
        content = b"key1: value1\nkey2: value2"
        self.token = tokenize_yaml(content)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 37)
        self.assertEqual(token.content, "key1: value1\nkey2: value2")

    def test_tokenize_yaml_with_no_content(self):
        with self.assertRaises(ParseError) as cm:
            tokenize_yaml("")
        self.assertEqual(cm.exception.text, "No content.")
        self.assertEqual(cm.exception.code, "no_content")
        self.assertEqual(cm.exception.position.line_no, 1)
        self.assertEqual(cm.exception.position.column_no, 1)
        self.assertEqual(cm.exception.position.char_index, 0)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml(self):
        content = """
        key1: value1
        key2: value2
        """
        from cerberus import Schema, Field
        result = validate_yaml(content, validator)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

    def test_validate_yaml_with_bytes(self):
        content = b"key1: value1\nkey2: value2"
        from cerberus import Schema, Field
        result = validate_yaml(content, validator)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

if __name__ == '__main__':
    unittest.main()