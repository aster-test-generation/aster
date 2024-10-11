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
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(msg.text, "Error")
        self.assertEqual(msg.code, "E001")
        self.assertEqual(msg.index, [1])
        self.assertEqual(msg.start_position, pos)
        self.assertEqual(msg.end_position, pos)

    def test_eq(self):
        pos = Position(1, 2, 3)
        msg1 = Message(text="Error", code="E001", key=1, position=pos)
        msg2 = Message(text="Error", code="E001", key=1, position=pos)
        self.assertTrue(msg1 == msg2)

    def test_hash(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(hash(msg), hash(("E001", (1,))))

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(repr(msg), "Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        msg = Message(text="Error", code="E001")
        err = BaseError(messages=[msg])
        self.assertEqual(err._messages, [msg])

    def test_messages(self):
        msg = Message(text="Error", code="E001")
        err = BaseError(messages=[msg])
        self.assertEqual(err.messages(), [msg])

    def test_iter(self):
        msg = Message(text="Error", code="E001", key=1)
        err = BaseError(messages=[msg])
        self.assertEqual(list(iter(err)), [1])

    def test_len(self):
        msg = Message(text="Error", code="E001", key=1)
        err = BaseError(messages=[msg])
        self.assertEqual(len(err), 1)

    def test_getitem(self):
        msg = Message(text="Error", code="E001", key=1)
        err = BaseError(messages=[msg])
        self.assertEqual(err[1], "Error")

    def test_eq(self):
        msg1 = Message(text="Error", code="E001")
        msg2 = Message(text="Error", code="E001")
        err1 = ValidationError(messages=[msg1])
        err2 = ValidationError(messages=[msg2])
        self.assertTrue(err1 == err2)

    def test_hash(self):
        msg = Message(text="Error", code="E001")
        err = BaseError(messages=[msg])
        self.assertEqual(hash(err), hash((hash(msg),)))

    def test_repr(self):
        msg = Message(text="Error", code="E001")
        err = BaseError(messages=[msg])
        self.assertEqual(repr(err), "BaseError(text='Error', code='E001')")

    def test_str(self):
        msg = Message(text="Error", code="E001")
        err = BaseError(messages=[msg])
        self.assertEqual(str(err), "Error")

class TestParseError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ParseError, BaseError))

class TestValidationError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ValidationError, BaseError))

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(value="valid")
        self.assertEqual(result.value, "valid")
        self.assertIsNone(result.error)

    def test_iter(self):
        result = ValidationResult(value="valid")
        self.assertEqual(list(iter(result)), ["valid", None])

    def test_bool(self):
        result = ValidationResult(value="valid")
        self.assertTrue(result)
        result = ValidationResult(error=ValidationError(messages=[Message(text="Error")]))
        self.assertFalse(result)

    def test_repr(self):
        result = ValidationResult(value="valid")
        self.assertEqual(repr(result), "ValidationResult(value='valid')")
        error = ValidationError(messages=[Message(text="Error")])
        result = ValidationResult(error=error)
        self.assertEqual(repr(result), f"ValidationResult(error={repr(error)})")

if __name__ == '__main__':
    unittest.main()