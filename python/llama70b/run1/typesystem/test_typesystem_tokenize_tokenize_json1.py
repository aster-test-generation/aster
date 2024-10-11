import unittest
from typesystem.tokenize.tokenize_json import (
    _TokenizingJSONObject,
    _make_scanner,
    _TokenizingDecoder,
    tokenize_json,
    validate_json,
    Token,
    ScalarToken,
    DictToken,
    ListToken,
    Position,
    ParseError,
)

class TestTokenizingJSONObject(unittest.TestCase):
    def test_TokenizingJSONObject(self):
        s_and_end = ("{}", 0)
        strict = True
        scan_once = lambda s, idx: ((Token("key"), Token("value")), idx + 1)
        memo = {}
        content = ""
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {})
        self.assertEqual(end, 2)

    def test_TokenizingJSONObject_with_pairs(self):
        s_and_end = ('{"key1":"value1","key2":"value2"}', 0)
        strict = True
        scan_once = lambda s, idx: ((Token("key1"), Token("value1")), idx + 5)
        memo = {}
        content = ""
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})
        self.assertEqual(end, 19)

class TestMakeScanner(unittest.TestCase):
    def test_make_scanner(self):
        context = object()
        content = ""
        scanner = _make_scanner(context, content)
        self.assertIsInstance(scanner, typing.Callable)

class TestTokenizingDecoder(unittest.TestCase):
    def test_TokenizingDecoder_init(self):
        decoder = _TokenizingDecoder(content="")
        self.assertIsInstance(decoder, JSONDecoder)

    def test_TokenizingDecoder_decode(self):
        decoder = _TokenizingDecoder(content='{"key": "value"}')
        result = decoder.decode('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

class TestTokenizeJson(unittest.TestCase):
    def test_tokenize_json(self):
        content = '{"key": "value"}'
        result = tokenize_json(content)
        self.assertIsInstance(result, DictToken)

    def test_tokenize_json_empty(self):
        content = ""
        with self.assertRaises(ParseError):
            tokenize_json(content)

class TestValidateJson(unittest.TestCase):
    def test_validate_json(self):
        content = '{"key": "value"}'
        validator = object()
        result = validate_json(content, validator)
        self.assertIsNone(result)

    def test_validate_json_invalid(self):
        content = '{"key": "value"'
        validator = object()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

class TestToken(unittest.TestCase):
    def test_Token_init(self):
        token = Token("value")
        self.assertEqual(token.value, "value")

class TestScalarToken(unittest.TestCase):
    def test_ScalarToken_init(self):
        token = ScalarToken("value", 0, 5, "")
        self.assertEqual(token.value, "value")
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 5)

class TestDictToken(unittest.TestCase):
    def test_DictToken_init(self):
        token = DictToken({"key": "value"}, 0, 10, "")
        self.assertEqual(token.value, {"key": "value"})
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 10)

class TestListToken(unittest.TestCase):
    def test_ListToken_init(self):
        token = ListToken(["value"], 0, 10, "")
        self.assertEqual(token.value, ["value"])
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, 10)

class TestPosition(unittest.TestCase):
    def test_Position_init(self):
        position = Position(column_no=1, line_no=1, char_index=0)
        self.assertEqual(position.column_no, 1)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.char_index, 0)


if __name__ == '__main__':
    unittest.main()