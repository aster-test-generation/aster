import unittest
from typesystem.tokenize.tokenize_json import tokenize_json


class TestTokenizeJSON(unittest.TestCase):
    def test_tokenize_json_with_string(self):
        content = '{"key": "value"}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": "value"})

    def test_tokenize_json_with_integer(self):
        content = '{"key": 123}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": 123})

    def test_tokenize_json_with_float(self):
        content = '{"key": 123.45}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": 123.45})

    def test_tokenize_json_with_boolean(self):
        content = '{"key": true}'
        token = tokenize_json(content)
        self.assertEqual(token.type_, "dict")
        self.assertEqual(token.value, {"key": True})

    def test_tokenize_json_with_null(self):
        content = '{"key": null}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": None})

    def test_tokenize_json_with_list(self):
        content = '{"key": ["value1", "value2"]}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": ["value1", "value2"]})

    def test_tokenize_json_with_nested_dict(self):
        content = '{"key": {"nested_key": "nested_value"}}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": {"nested_key": "nested_value"}})

if __name__ == '__main__':
    unittest.main()