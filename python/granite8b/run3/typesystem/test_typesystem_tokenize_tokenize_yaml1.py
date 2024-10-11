import unittest
from typesystem.tokenize.tokenize_yaml import (
    _get_position,
    tokenize_yaml,
    validate_yaml,
)

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