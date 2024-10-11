import unittest
from typesystem.tokenize.tokenize_json import tokenize_json


class TestTokenizeJSON(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"key": "value"}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "Dict")
        self.assertEqual(token.value, {"key": "value"})

if __name__ == '__main__':
    unittest.main()