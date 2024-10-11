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
import typing
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.tokens import ScalarToken, DictToken, ListToken
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.positional_validation import validate_with_positions


class TestTokenizingJSONObject(unittest.TestCase):
    def test_tokenizing_json_object(self):
        s_and_end = ('{"key": "value"}', 1)
        strict = True
        memo = {}
        content = '{"key": "value"}'
        def scan_once(s, end):
            return ScalarToken("value", 8, 14, content), 15
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {'key': ScalarToken("value", 8, 14, content)})

    def test_tokenizing_json_object_empty(self):
        s_and_end = ('{}', 1)
        strict = True
        memo = {}
        content = '{}'
        def scan_once(s, end):
            return ScalarToken("value", 8, 14, content), 15
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {})

    def test_tokenizing_json_object_error(self):
        s_and_end = ('{"key": value}', 1)
        strict = True
        memo = {}
        content = '{"key": value}'
        def scan_once(s, end):
            raise StopIteration(8)
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)

class TestMakeScanner(unittest.TestCase):
    def test_make_scanner(self):
        class Context:
            def parse_array(self, s_and_end, scan_once):
                return [], s_and_end[1]
            def parse_string(self, s, end, strict):
                return "string", end + 6
            strict = True
            parse_float = float
            parse_int = int
            memo = {}

        content = '{"key": "value"}'
        context = Context()
        scanner = _make_scanner(context, content)
        result, end = scanner(content, 1)
        self.assertIsInstance(result, ScalarToken)

class TestTokenizingDecoder(unittest.TestCase):
    def test_tokenizing_decoder_init(self):
        content = '{"key": "value"}'
        decoder = _TokenizingDecoder(content=content)
        self.assertIsInstance(decoder.scan_once, typing.Callable)

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"key": "value"}'
        result = tokenize_json(content)
        self.assertIsInstance(result, DictToken)

    def test_tokenize_json_empty(self):
        content = ''
        with self.assertRaises(ParseError):
            tokenize_json(content)

    def test_tokenize_json_invalid(self):
        content = '{"key": value}'
        with self.assertRaises(ParseError):
            tokenize_json(content)

class TestValidateJson(unittest.TestCase):
    def test_validate_json(self):
        content = '{"key": "value"}'
        class DummyValidator(Schema):
            pass
        result = validate_json(content, DummyValidator)
        self.assertIsNotNone(result)

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