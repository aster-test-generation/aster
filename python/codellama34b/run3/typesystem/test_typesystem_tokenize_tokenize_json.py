import unittest
from typesystem.tokenize.tokenize_json import *


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = "test_content"
        result = tokenize_json(content)
        self.assertEqual(result, "test_content")

    def test_validate_json(self):
        content = "test_content"
        validator = "test_validator"
        result = validate_json(content, validator)
        self.assertEqual(result, "test_content")

if __name__ == '__main__':
    unittest.main()