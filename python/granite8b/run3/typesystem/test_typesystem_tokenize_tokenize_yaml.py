import unittest
from typesystem.tokenize.tokenize_yaml import tokenize_yaml
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_dict(self):
        content = "{'a': 1, 'b': 2}"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "dict")
        self.assertEqual(token.value, {"a": 1, "b": 2})
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_list(self):
        content = "[1, 2, 3]"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "list")
        self.assertEqual(token.value, [1, 2, 3])
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_scalar(self):
        content = "123"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "scalar")
        self.assertEqual(token.value, "123")
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_int(self):
        content = "123"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "int")
        self.assertEqual(token.value, 123)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_float(self):
        content = "123.456"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "float")
        self.assertEqual(token.value, 123.456)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_bool(self):
        content = "true"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "bool")
        self.assertEqual(token.value, True)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_tokenize_yaml_null(self):
        content = "null"
        token = tokenize_yaml(content)
        self.assertEqual(token.type, "null")
        self.assertEqual(token.value, None)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = "key: value"
        token = tokenize_yaml(content)
        self.assertEqual(token.value, {"key": "value"})
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)

    def test_get_position(self):
        content = "line 1\nline 2"
        position = _get_position(content, index=len(content) - 1)
        self.assertEqual(position.line_no, 2)
        self.assertEqual(position.column_no, 1)
        self.assertEqual(position.char_index, len(content) - 1)


if __name__ == '__main__':
    unittest.main()