import unittest
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.tokens import ScalarToken, DictToken, ListToken
from typesystem.base import Position, ParseError
from json.decoder import JSONDecodeError

class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(('{}', 1), True, lambda s, e: (None, e), {}, '{}')
        self.assertEqual(result, {})

    def test_property_name_not_enclosed_in_quotes(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value"}', 1), True, lambda s, e: (None, e), {}, '{"key": "value"}')

    def test_missing_colon_delimiter(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key" "value"}', 1), True, lambda s, e: (None, e), {}, '{"key" "value"}')

    def test_missing_value(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": }', 1), True, lambda s, e: (None, e), {}, '{"key": }')

    def test_missing_comma_delimiter(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value" "key2": "value2"}', 1), True, lambda s, e: (None, e), {}, '{"key": "value" "key2": "value2"}')

class TestMakeScanner(unittest.TestCase):
    class MockContext:
        def __init__(self):
            self.parse_array = lambda s, f: ([], 0)
            self.parse_string = lambda s, e, strict: ("", e)
            self.strict = True
            self.parse_float = float
            self.parse_int = int
            self.memo = {}

    def test_scan_string(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('"string"', 0)
        self.assertIsInstance(result, ScalarToken)

    def test_scan_object(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('{"key": "value"}', 0)
        self.assertIsInstance(result, DictToken)

    def test_scan_array(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('[]', 0)
        self.assertIsInstance(result, ListToken)

    def test_scan_null(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('null', 0)
        self.assertIsInstance(result, ScalarToken)

    def test_scan_true(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('true', 0)
        self.assertIsInstance(result, ScalarToken)

    def test_scan_false(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('false', 0)
        self.assertIsInstance(result, ScalarToken)

    def test_scan_number(self):
        context = self.MockContext()
        scanner = _make_scanner(context, "")
        result, end = scanner('123', 0)
        self.assertIsInstance(result, ScalarToken)

class TestTokenizingDecoder(unittest.TestCase):
    def test_init(self):
        decoder = _TokenizingDecoder(content="")
        self.assertIsNotNone(decoder.scan_once)

class TestTokenizeJson(unittest.TestCase):
    def test_empty_content(self):
        with self.assertRaises(ParseError):
            tokenize_json("")

    def test_valid_json(self):
        result = tokenize_json('{"key": "value"}')
        self.assertIsInstance(result, DictToken)

    def test_invalid_json(self):
        with self.assertRaises(ParseError):
            tokenize_json('{"key": "value"')

class TestValidateJson(unittest.TestCase):
    class MockValidator:
        def __call__(self, value):
            return value

    def test_validate_json(self):
        result = validate_json('{"key": "value"}', self.MockValidator())
        self.assertIsInstance(result, DictToken)

if __name__ == '__main__':
    unittest.main()