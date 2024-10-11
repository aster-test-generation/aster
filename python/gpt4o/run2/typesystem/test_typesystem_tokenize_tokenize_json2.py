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
from unittest.mock import Mock

class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(
            ('{}', 1), True, Mock(), {}, '{}'
        )
        self.assertEqual(result, {})

    def test_property_name_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(
                ('{key: "value"}', 1), True, Mock(), {}, '{key: "value"}'
            )

    def test_colon_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(
                ('{"key" "value"}', 1), True, Mock(), {}, '{"key" "value"}'
            )

    def test_value_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(
                ('{"key": }', 1), True, Mock(), {}, '{"key": }'
            )

    def test_comma_delimiter_error(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(
                ('{"key": "value" "key2": "value2"}', 1), True, Mock(), {}, '{"key": "value" "key2": "value2"}'
            )

class TestMakeScanner(unittest.TestCase):
    def test_scan_once_string(self):
        context = Mock()
        context.parse_string = Mock(return_value=("value", 7))
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('"value"', 0)
        self.assertEqual(token.value, "value")

    def test_scan_once_object(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.parse_float = Mock()
        context.parse_int = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('{"key": "value"}', 0)
        self.assertIsInstance(token, DictToken)

    def test_scan_once_array(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock(return_value=(["value"], 8))
        context.parse_float = Mock()
        context.parse_int = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('["value"]', 0)
        self.assertIsInstance(token, ListToken)

    def test_scan_once_null(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.parse_float = Mock()
        context.parse_int = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('null', 0)
        self.assertIsNone(token.value)

    def test_scan_once_true(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.parse_float = Mock()
        context.parse_int = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('true', 0)
        self.assertTrue(token.value)

    def test_scan_once_false(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.parse_float = Mock()
        context.parse_int = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        token, end = scanner('false', 0)
        self.assertFalse(token.value)

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
    def test_validate_json(self):
        validator = Mock()
        validator.return_value = True
        result = validate_json('{"key": "value"}', validator)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()