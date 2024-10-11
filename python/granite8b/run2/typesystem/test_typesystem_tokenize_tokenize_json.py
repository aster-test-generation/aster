from typesystem.tokenize.tokenize_json import ParseError
import unittest
from typesystem.tokenize.tokenize_json import tokenize_json


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"name": "John", "age": 30, "city": "New York"}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "DictToken")
        self.assertEqual(token.value, {"name": "John", "age": 30, "city": "New York"})

    def test_tokenize_json_with_invalid_content(self):
        content = '{"name": "John", "age": 30, "city": "New York}'
        with self.assertRaises(ParseError):
            tokenize_json(content)

if __name__ == '__main__':
    unittest.main()