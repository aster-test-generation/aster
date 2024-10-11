import unittest
from typesystem.base import Position, Message, BaseError, ParseError, ValidationError, ValidationResult

class TestPosition(unittest.TestCase):
    def test_init(self):
        pos = Position(1, 2, 3)
        self.assertEqual(pos.line_no, 1)
        self.assertEqual(pos.column_no, 2)
        self.assertEqual(pos.char_index, 3)

    def test_eq(self):
        pos1 = Position(1, 2, 3)
        pos2 = Position(1, 2, 3)
        self.assertTrue(pos1 == pos2)

    def test_repr(self):
        pos = Position(1, 2, 3)
        self.assertEqual(repr(pos), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        msg = Message(text="Test", code="001")
        self.assertEqual(msg.text, "Test")
        self.assertEqual(msg.code, "001")

    def test_eq(self):
        msg1 = Message(text="Test", code="001")
        msg2 = Message(text="Test", code="001")
        self.assertTrue(msg1 == msg2)

    def test_hash(self):
        msg = Message(text="Test", code="001")
        self.assertEqual(hash(msg), hash(("001", ())))

    def test_repr(self):
        msg = Message(text="Test", code="001")
        self.assertEqual(repr(msg), "Message(text='Test', code='001')")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        msg = Message(text="Test", code="001")
        error = BaseError(messages=[msg])
        self.assertEqual(error._messages, [msg])

    def test_messages(self):
        msg = Message(text="Test", code="001")
        error = BaseError(messages=[msg])
        self.assertEqual(error.messages(), [msg])

    def test_iter(self):
        msg = Message(text="Test", code="001", key="key")
        error = BaseError(messages=[msg])
        self.assertEqual(list(iter(error)), ["key"])

    def test_len(self):
        msg = Message(text="Test", code="001", key="key")
        error = BaseError(messages=[msg])
        self.assertEqual(len(error), 1)

    def test_getitem(self):
        msg = Message(text="Test", code="001", key="key")
        error = BaseError(messages=[msg])
        self.assertEqual(error["key"], "Test")

    def test_eq(self):
        msg1 = Message(text="Test", code="001")
        msg2 = Message(text="Test", code="001")
        error1 = BaseError(messages=[msg1])
        error2 = BaseError(messages=[msg2])
        self.assertTrue(error1 == error2)

    def test_hash(self):
        msg = Message(text="Test", code="001")
        error = BaseError(messages=[msg])
        self.assertEqual(hash(error), hash((hash(msg),)))

    def test_repr(self):
        msg = Message(text="Test", code="001")
        error = BaseError(messages=[msg])
        self.assertEqual(repr(error), "BaseError([Message(text='Test', code='001')])")

    def test_str(self):
        msg = Message(text="Test", code="001")
        error = BaseError(messages=[msg])
        self.assertEqual(str(error), "Test")

class TestParseError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ParseError, BaseError))

class TestValidationError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ValidationError, BaseError))

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(value="value")
        self.assertEqual(result.value, "value")
        self.assertIsNone(result.error)

    def test_iter(self):
        result = ValidationResult(value="value", error="error")
        self.assertEqual(list(iter(result)), ["value", "error"])

    def test_bool(self):
        result = ValidationResult(value="value")
        self.assertTrue(result)
        result = ValidationResult(error="error")
        self.assertFalse(result)

    def test_repr(self):
        result = ValidationResult(value="value")
        self.assertEqual(repr(result), "ValidationResult(value='value')")
        result = ValidationResult(error="error")
        self.assertEqual(repr(result), "ValidationResult(error='error')")

if __name__ == '__main__':
    unittest.main()