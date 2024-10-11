from typesystem.tokenize.tokenize_json import Position
import unittest
from typesystem.tokenize.tokenize_json import tokenize_json
from typesystem.tokenize.tokenize_json import (
    _TokenizingDecoder,
    _TokenizingJSONObject,
    _make_scanner,
    tokenize_json,
    validate_json,
)


class TestTokenizeJSON(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertEqual(token.type, 'dict')
        self.assertEqual(token.value, {'a': 1, 'b': 2})
        self.assertEqual(token.start_position, Position(1, 1, 0))
        self.assertEqual(token.end_position, Position(1, 15, 14))

class TestTokenizeJSON(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_json(content)
        self.assertEqual(token.type, "dict")
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content))
        self.assertEqual(token.value, {"a": 1, "b": 2})

    def test_validate_json(self):
        content = '{"a": 1, "b": 2}'
        validator = {"type": "dict", "properties": {"a": {"type": "integer"}, "b": {"type": "integer"}}}
        result = validate_json(content, validator)
        self.assertEqual(result, {"a": 1, "b": 2})

class TestPrivateMethods(unittest.TestCase):
    def test_make_scanner(self):
        context = {"strict": True, "memo": {}, "parse_float": float, "parse_int": int}
        scanner = _make_scanner(context, "content")
        self.assertIsInstance(scanner, callable)

    def test_tokenizing_object(self):
        s_and_end = ("{}", 2)
        strict = True
        scan_once = lambda s, end: (None, end)
        memo = {}
        content = "content"
        pairs, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(pairs, {})
        self.assertEqual(end, 2)

class TestValidateJSON(unittest.TestCase):
    def test_validate_json_with_field(self):
        content = '{"a": 1, "b": 2}'
        validator = Field(type="dict", properties={"a": Field(type="integer"), "b": Field(type="integer")})
        result = validate_json(content, validator)
        self.assertEqual(result, {"a": 1, "b": 2})

if __name__ == '__main__':
    unittest.main()