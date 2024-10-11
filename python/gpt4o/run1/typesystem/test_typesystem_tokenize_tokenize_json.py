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
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
)
from typesystem.tokenize.tokens import DictToken, ListToken, ScalarToken
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.positional_validation import validate_with_positions


class TestTokenizingJSONObject(unittest.TestCase):
    def test_empty_object(self):
        result, end = _TokenizingJSONObject(('{}', 1), True, lambda s, e: (None, e), {}, '{}')
        self.assertEqual(result, {})

    def test_object_with_key_value(self):
        result, end = _TokenizingJSONObject(('{"key": "value"}', 1), True, lambda s, e: (ScalarToken("value", e, e+5, s), e+7), {}, '{"key": "value"}')
        self.assertEqual(result, {ScalarToken("key", 1, 5, '{"key": "value"}'): ScalarToken("value", 8, 13, '{"key": "value"}')})

    def test_object_with_whitespace(self):
        result, end = _TokenizingJSONObject(('{"key" : "value"}', 1), True, lambda s, e: (ScalarToken("value", e, e+5, s), e+7), {}, '{"key" : "value"}')
        self.assertEqual(result, {ScalarToken("key", 1, 5, '{"key" : "value"}'): ScalarToken("value", 9, 14, '{"key" : "value"}')})

    def test_object_missing_colon(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key" "value"}', 1), True, lambda s, e: (ScalarToken("value", e, e+5, s), e+7), {}, '{"key" "value"}')

    def test_object_missing_comma(self):
        with self.assertRaises(JSONDecodeError):
            _TokenizingJSONObject(('{"key": "value" "key2": "value2"}', 1), True, lambda s, e: (ScalarToken("value", e, e+5, s), e+7), {}, '{"key": "value" "key2": "value2"}')

class TestMakeScanner(unittest.TestCase):
    class MockContext:
        def __init__(self):
            self.parse_array = lambda s, f: ([], s[1])
            self.parse_string = lambda s, e, strict: ("string", e+6)
            self.strict = True
            self.parse_float = float
            self.parse_int = int
            self.memo = {}

    def test_scan_string(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('"string"', 0)
        self.assertEqual(result, ScalarToken("string", 0, 7, 'content'))

    def test_scan_object(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('{"key": "value"}', 0)
        self.assertIsInstance(result, DictToken)

    def test_scan_array(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('[]', 0)
        self.assertIsInstance(result, ListToken)

    def test_scan_null(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('null', 0)
        self.assertEqual(result, ScalarToken(None, 0, 3, 'content'))

    def test_scan_true(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('true', 0)
        self.assertEqual(result, ScalarToken(True, 0, 3, 'content'))

    def test_scan_false(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('false', 0)
        self.assertEqual(result, ScalarToken(False, 0, 4, 'content'))

    def test_scan_number(self):
        context = self.MockContext()
        scanner = _make_scanner(context, 'content')
        result, end = scanner('123', 0)
        self.assertEqual(result, ScalarToken(123, 0, 2, 'content'))

class TestTokenizingDecoder(unittest.TestCase):
    def test_init(self):
        decoder = _TokenizingDecoder(content='content')
        self.assertIsNotNone(decoder.scan_once)

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json_empty(self):
        with self.assertRaises(ParseError):
            tokenize_json('')

    def test_tokenize_json_valid(self):
        result = tokenize_json('{"key": "value"}')
        self.assertIsInstance(result, DictToken)

    def test_tokenize_json_invalid(self):
        with self.assertRaises(ParseError):
            tokenize_json('{"key": "value"')

class TestValidateJson(unittest.TestCase):
    class MockValidator:
        def __call__(self, value):
            return value

    def test_validate_json(self):
        result = validate_json('{"key": "value"}', self.MockValidator)
        self.assertIsInstance(result, DictToken)

class TestTokenizingJSONObject(unittest.TestCase):
    def test_tokenizing_json_object(self):
        s_and_end = ('{"key": "value"}', 1)
        strict = True
        memo = {}
        content = '{"key": "value"}'
        def scan_once(s, end):
            return ScalarToken("value", 8, 13, content), 14
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {"key": ScalarToken("value", 8, 13, content)})

    def test_tokenizing_json_object_empty(self):
        s_and_end = ('{}', 1)
        strict = True
        memo = {}
        content = '{}'
        def scan_once(s, end):
            return ScalarToken("value", 8, 13, content), 14
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
        self.assertIsInstance(result, DictToken)

class TestTokenizingDecoder(unittest.TestCase):
    def test_tokenizing_decoder_init(self):
        decoder = _TokenizingDecoder(content='{"key": "value"}')
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

if __name__ == '__main__':
    unittest.main()