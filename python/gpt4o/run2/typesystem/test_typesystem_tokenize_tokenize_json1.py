import unittest
from json.decoder import JSONDecodeError
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken, Token
from typesystem.base import Position, ParseError
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.positional_validation import validate_with_positions

class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(('{}', 1), True, lambda s, e: (None, e), {}, '')
        self.assertEqual(result, {})

    def test_property_name_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value"', 1), True, lambda s, e: (None, e), {}, '')

    def test_colon_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key" "value"}', 1), True, lambda s, e: (None, e), {}, '')

    def test_value_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": }', 1), True, lambda s, e: (None, e), {}, '')

    def test_comma_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value" "key2": "value2"}', 1), True, lambda s, e: (None, e), {}, '')

class TestMakeScanner(unittest.TestCase):
    def test_scan_string(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('"string"', 0)
        self.assertIsInstance(result, ScalarToken)
        self.assertEqual(result.value, 'string')

    def test_scan_object(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('{"key": "value"}', 0)
        self.assertIsInstance(result, DictToken)
        self.assertEqual(result.value['key'].value, 'value')

    def test_scan_array(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('["value"]', 0)
        self.assertIsInstance(result, ListToken)
        self.assertEqual(result.value[0].value, 'value')

    def test_scan_null(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('null', 0)
        self.assertIsInstance(result, ScalarToken)
        self.assertIsNone(result.value)

    def test_scan_true(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('true', 0)
        self.assertIsInstance(result, ScalarToken)
        self.assertTrue(result.value)

    def test_scan_false(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('false', 0)
        self.assertIsInstance(result, ScalarToken)
        self.assertFalse(result.value)

    def test_scan_number(self):
        context = _TokenizingDecoder(content='')
        scanner = _make_scanner(context, '')
        result, end = scanner('123', 0)
        self.assertIsInstance(result, ScalarToken)
        self.assertEqual(result.value, 123)

class TestTokenizingDecoder(unittest.TestCase):
    def test_init(self):
        decoder = _TokenizingDecoder(content='')
        self.assertIsNotNone(decoder.scan_once)

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_empty(self):
        with self.assertRaises(ParseError):
            tokenize_json('')

    def test_tokenize_json_invalid(self):
        with self.assertRaises(ParseError):
            tokenize_json('invalid')

    def test_tokenize_json_valid(self):
        result = tokenize_json('{"key": "value"}')
        self.assertIsInstance(result, DictToken)
        self.assertEqual(result.value['key'].value, 'value')

class TestValidateJson(unittest.TestCase):
    def test_validate_json(self):
        class DummyValidator(Schema):
            pass

        result = validate_json('{"key": "value"}', DummyValidator)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()