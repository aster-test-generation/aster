import unittest
from typesystem.tokenize.tokenize_json import *



class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = "test"
        result = tokenize_json(content)
        self.assertEqual(result, "test")

    def test_validate_json(self):
        content = "test"
        validator = "test"
        result = validate_json(content, validator)
        self.assertEqual(result, "test")

    def test__TokenizingJSONObject(self):
        s_and_end = ("test", 0)
        strict = True
        scan_once = "test"
        memo = "test"
        content = "test"
        result = json.decoder._TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, "test")

    def test__make_scanner(self):
        context = "test"
        content = "test"
        result = _make_scanner(context, content)
        self.assertEqual(result, "test")

if __name__ == '__main__':
    unittest.main()