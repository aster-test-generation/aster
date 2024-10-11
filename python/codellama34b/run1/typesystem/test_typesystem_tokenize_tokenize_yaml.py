from typesystem.tokenize.tokenize_yaml import _get_position
import unittest
from typesystem.tokenize.tokenize_yaml import *


class TestTokenizeYaml(unittest.TestCase):
    def test_get_position(self):
        content = "content"
        index = 0
        result = _get_position(content, index)
        self.assertEqual(result.line_no, 1)
        self.assertEqual(result.column_no, 1)
        self.assertEqual(result.char_index, 0)

    def test_tokenize_yaml(self):
        content = "content"
        result = tokenize_yaml(content)
        self.assertEqual(result.start, 0)
        self.assertEqual(result.end, 7)
        self.assertEqual(result.content, "content")

    def test_validate_yaml(self):
        content = "content"
        validator = "validator"
        result = validate_yaml(content, validator)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()