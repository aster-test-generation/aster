import unittest
from typesystem.tokenize.tokenize_yaml import *

class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = "content"
        result = tokenize_yaml(content)
        self.assertEqual(result, None)

    def test_validate_yaml(self):
        content = "content"
        validator = None
        result = validate_yaml(content, validator)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()