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
from unittest.mock import Mock
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken, Token
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)


class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(('{}', 1), True, Mock(), {}, '{}')
        self.assertEqual(result, {})

    def test_object_with_key_value(self):
        scan_once = Mock(return_value=(ScalarToken("value", 9, 14, '{"key": "value"}'), 15))
        result, end = _TokenizingJSONObject(('{"key": "value"}', 1), True, scan_once, {}, '{"key": "value"}')
        self.assertEqual(result, {ScalarToken("key", 1, 5, '{"key": "value"}'): ScalarToken("value", 9, 14, '{"key": "value"}')})

    def test_missing_colon(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key" "value"}', 1), True, Mock(), {}, '{"key" "value"}')

    def test_missing_comma(self):
        scan_once = Mock(return_value=(ScalarToken("value", 9, 14, '{"key": "value"}'), 15))
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value" "key2": "value2"}', 1), True, scan_once, {}, '{"key": "value" "key2": "value2"}')

class TestMakeScanner(unittest.TestCase):
    def test_scan_string(self):
        context = Mock()
        context.parse_string = Mock(return_value=("string", 8))
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        result, end = scanner('"string"', 0)
        self.assertEqual(result, ScalarToken("string", 0, 7, 'content'))

    def test_scan_object(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        result, end = scanner('{"key": "value"}', 0).return_value
        self.assertIsInstance(result, DictToken)

    def test_scan_array(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock(return_value=(["value"], 9))
        context.strict = True
        context.memo = {}
        scanner = _make_scanner(context, 'content')
        result, end = scanner('["value"]', 0)
        self.assertIsInstance(result, ListToken)

    def test_scan_number(self):
        context = Mock()
        context.parse_string = Mock()
        context.parse_array = Mock()
        context.strict = True
        context.memo = {}
        context.parse_float = float
        context.parse_int = int
        scanner = _make_scanner(context, 'content')
        result, end = scanner('123', 0)
        self.assertEqual(result, ScalarToken(123, 0, 2, 'content'))

class TestTokenizingDecoder(unittest.TestCase):
    def test_init(self):
        decoder = _TokenizingDecoder(content='content')
        self.assertIsNotNone(decoder.scan_once)

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_empty_content(self):
        with self.assertRaises(ParseError):
            tokenize_json('')

    def test_tokenize_json_valid_content(self):
        content = '{"key": "value"}'
        result = tokenize_json(content)
        self.assertIsInstance(result, DictToken)

    def test_tokenize_json_invalid_content(self):
        content = '{"key": "value"'
        with self.assertRaises(ParseError):
            tokenize_json(content)

class TestValidateJson(unittest.TestCase):
    def test_validate_json(self):
        content = '{"key": "value"}'
        validator = Mock()
        result = validate_json(content, validator)
        self.assertIsNotNone(result)

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