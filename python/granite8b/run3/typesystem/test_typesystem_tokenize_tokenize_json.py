import unittest
from typesystem.tokenize.tokenize_json import tokenize_json, validate_json


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertEqual(token.type, 'dict')
        self.assertEqual(token.value, {'a': 1, 'b': 2})

    def test_validate_json(self):
        content = '{"a": 1, "b": 2}'
        validator = {'a': int, 'b': int}
        result = validate_json(content, validator)
        self.assertEqual(result, {'a': 1, 'b': 2})

if __name__ == '__main__':
    unittest.main()