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
    def test_tokenizing_json_object(self):
        s_and_end = ("{}", 0)
        strict = True
        scan_once = lambda s, idx: ((Token("key"), Token("value")), idx + 1)
        memo = {}
        content = ""
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {})
        self.assertEqual(end, 2)

    def test_tokenizing_json_object_with_pairs(self):
        s_and_end = ('{"key1": "value1", "key2": "value2"}', 0)
        strict = True
        scan_once = lambda s, idx: ((Token("key1"), Token("value1")), idx + 1)
        memo = {}
        content = ""
        result, end = _TokenizingJSONObject(s_and_end, strict, scan_once, memo, content)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})
        self.assertEqual(end, 24)

class TestMakeScanner(unittest.TestCase):
    def test_make_scanner(self):
        context = object()
        content = ""
        scanner = _make_scanner(context, content)
        self.assertIsInstance(scanner, typing.Callable)

class TestTokenizingDecoder(unittest.TestCase):
    def test_tokenizing_decoder_init(self):
        decoder = _TokenizingDecoder(content="")
        self.assertIsInstance(decoder, JSONDecoder)

    def test_tokenizing_decoder_decode(self):
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
        self.assertIsInstance(result, typing.Any)

    def test_validate_json_invalid(self):
        content = "invalid json"
        validator = object()
        with self.assertRaises(ParseError):
            validate_json(content, validator)

class TestToken(unittest.TestCase):
    def test_token_init(self):
        token = Token("value")
        self.assertEqual(token.value, "value")

class TestScalarToken(unittest.TestCase):
    def test_scalar_token_init(self):
        token = ScalarToken("value", 0, 1, "")
        self.assertEqual(token.value, "value")

class TestDictToken(unittest.TestCase):
    def test_dict_token_init(self):
        token = DictToken({"key": "value"}, 0, 1, "")
        self.assertEqual(token.value, {"key": "value"})

class TestListToken(unittest.TestCase):
    def test_list_token_init(self):
        token = ListToken(["value"], 0, 1, "")
        self.assertEqual(token.value, ["value"])

class TestPosition(unittest.TestCase):
    def test_position_init(self):
        position = Position(column_no=1, line_no=1, char_index=0)
        self.assertEqual(position.column_no, 1)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.char_index, 0)


if __name__ == '__main__':
    unittest.main()