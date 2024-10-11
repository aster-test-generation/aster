from typesystem.tokenize.tokenize_yaml import _get_position
import unittest
from typesystem.tokenize.tokenize_yaml import *


class TestTokenizeYaml(unittest.TestCase):
    def test_get_position(self):
        content = "test"
        index = 1
        result = _get_position(content, index)
        self.assertEqual(result.line_no, 1)
        self.assertEqual(result.column_no, 1)
        self.assertEqual(result.char_index, 1)

    def test_construct_mapping(self):
        pass

    def test_construct_sequence(self):
        pass

    def test_construct_scalar(self):
        pass

    def test_construct_int(self):
        pass

    def test_construct_float(self):
        pass

    def test_construct_bool(self):
        pass

    def test_construct_null(self):
        pass

    def test_tokenize_yaml(self):
        pass

    def test_validate_yaml(self):
        pass

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