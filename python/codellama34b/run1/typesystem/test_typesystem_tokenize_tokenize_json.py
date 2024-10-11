import unittest
from typesystem.tokenize.tokenize_json import *


class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = "Test content"
        result = tokenize_json(content)
        self.assertIsNotNone(result)

    def test_validate_json(self):
        content = "Test content"
        validator = "Test validator"
        result = validate_json(content, validator)
        self.assertIsNotNone(result)

    def test_make_scanner(self):
        context = "Test context"
        content = "Test content"
        result = _make_scanner(context, content)
        self.assertIsNotNone(result)

    def test_tokenizing_json_object(self):
        s_and_end = ("Test s_and_end", 0)
        strict = True
        scan_once = "Test scan_once"
        memo = {}
        content = "Test content"
        result = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertIsNotNone(result)

    def test_tokenizing_decoder(self):
        content = "Test content"
        result = TokenizingDecoder(content=content)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()