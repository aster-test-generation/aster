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
        pos3 = Position(4, 5, 6)
        self.assertTrue(pos1 == pos2)
        self.assertFalse(pos1 == pos3)

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
        msg3 = Message(text="Error", code="E002", key=1, position=pos)
        self.assertTrue(msg1 == msg2)
        self.assertFalse(msg1 == msg3)

    def test_hash(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertIsInstance(hash(msg), int)

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(repr(msg), "Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(error._messages, [msg])

    def test_messages(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(error.messages(), [msg])

    def test_iter(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(list(iter(error)), [''])

    def test_len(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(len(error), 1)

    def test_getitem(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(error[''], "Error")

    def test_eq(self):
        pos = Position(1, 2, 3)
        msg1 = Message(text="Error", code="E001", key=1, position=pos)
        msg2 = Message(text="Error", code="E001", key=1, position=pos)
        error1 = BaseError(messages=[msg1])
        error2 = BaseError(messages=[msg2])
        self.assertTrue(error1 == error2)

    def test_hash(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertIsInstance(hash(error), int)

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(repr(error), "BaseError([Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        error = BaseError(messages=[msg])
        self.assertEqual(str(error), "Error")

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError(text="Parse error")
        self.assertEqual(str(error), "Parse error")

class TestValidationError(unittest.TestCase):
    def test_init(self):
        error = ValidationError(text="Validation error")
        self.assertEqual(str(error), "Validation error")

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(value="Valid")
        self.assertEqual(result.value, "Valid")
        self.assertIsNone(result.error)

    def test_iter(self):
        result = ValidationResult(value="Valid")
        self.assertEqual(list(iter(result)), ["Valid", None])

    def test_bool(self):
        result = ValidationResult(value="Valid")
        self.assertTrue(result)
        result = ValidationResult(error=ValidationError(text="Error"))
        self.assertFalse(result)

    def test_repr(self):
        result = ValidationResult(value="Valid")
        self.assertEqual(repr(result), "ValidationResult(value='Valid')")
        error = ValidationError(text="Error")
        result = ValidationResult(error=error)
        self.assertEqual(repr(result), f"ValidationResult(error={repr(error)})")

if __name__ == '__main__':
    unittest.main()