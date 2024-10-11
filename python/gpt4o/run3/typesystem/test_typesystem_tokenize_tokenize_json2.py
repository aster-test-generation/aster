import unittest
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from json.decoder import JSONDecodeError
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken
from typesystem.base import Position, ParseError
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.positional_validation import validate_with_positions

class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(('{}', 1), True, lambda s, e: (None, e), {}, '{}')
        self.assertEqual(result, {})

    def test_property_name_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value"', 1), True, lambda s, e: (None, e), {}, '{"key": "value"')

    def test_colon_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key" "value"}', 1), True, lambda s, e: (None, e), {}, '{"key" "value"}')

    def test_value_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": }', 1), True, lambda s, e: (None, e), {}, '{"key": }')

    def test_comma_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value" "key2": "value2"}', 1), True, lambda s, e: (None, e), {}, '{"key": "value" "key2": "value2"}')

class TestMakeScanner(unittest.TestCase):
    class MockContext:
        def __init__(self):
            self.parse_array = lambda s, f: ([], s[1])
            self.parse_string = lambda s, e, strict: ("string", e + 6)
            self.strict = True
            self.parse_float = float
            self.parse_int = int
            self.memo = {}

    def test_scan_string(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('"string"', 0)
        self.assertIsInstance(token, ScalarToken)
        self.assertEqual(token.value, "string")

    def test_scan_object(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('{"key": "value"}', 0)
        self.assertIsInstance(token, DictToken)
        self.assertEqual(token.value, {'key': ScalarToken("value", 8, 13, 'content')})

    def test_scan_array(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('[]', 0)
        self.assertIsInstance(token, ListToken)
        self.assertEqual(token.value, [])

    def test_scan_null(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('null', 0)
        self.assertIsInstance(token, ScalarToken)
        self.assertIsNone(token.value)

    def test_scan_true(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('true', 0)
        self.assertIsInstance(token, ScalarToken)
        self.assertTrue(token.value)

    def test_scan_false(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('false', 0)
        self.assertIsInstance(token, ScalarToken)
        self.assertFalse(token.value)

    def test_scan_number(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        token, end = scanner('123', 0)
        self.assertIsInstance(token, ScalarToken)
        self.assertEqual(token.value, 123)

class TestTokenizingDecoder(unittest.TestCase):
    def test_init(self):
        decoder = _TokenizingDecoder(content='content')
        self.assertIsNotNone(decoder.scan_once)

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_empty_content(self):
        with self.assertRaises(ParseError):
            tokenize_json('')

    def test_tokenize_json_invalid_content(self):
        with self.assertRaises(ParseError):
            tokenize_json('{invalid json}')

    def test_tokenize_json_valid_content(self):
        result = tokenize_json('{"key": "value"}')
        self.assertIsInstance(result, DictToken)

class TestValidateJson(unittest.TestCase):
    class MockValidator(Field):
        def validate(self, value, *, context=None):
            return value

    def test_validate_json(self):
        validator = self.MockValidator()
        result = validate_json('{"key": "value"}', validator)
        self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()