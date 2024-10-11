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
        self.assertIsInstance(hash(msg), int)

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(repr(msg), "Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init_with_text(self):
        pos = Position(1, 2, 3)
        err = BaseError(text="Error", code="E001", key=1, position=pos)
        self.assertEqual(len(err._messages), 1)
        self.assertEqual(err._messages[0].text, "Error")

    def test_init_with_messages(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(len(err._messages), 1)
        self.assertEqual(err._messages[0].text, "Error")

    def test_messages(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(err.messages(), [msg])

    def test_iter(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(list(iter(err)), [""])

    def test_len(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(len(err), 1)

    def test_getitem(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(err[""], "Error")

    def test_eq(self):
        pos = Position(1, 2, 3)
        msg1 = Message(text="Error", code="E001", key=1, position=pos)
        err1 = BaseError(messages=[msg1])
        err2 = BaseError(messages=[msg1])
        self.assertTrue(err1 == err2)

    def test_hash(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertIsInstance(hash(err), int)

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(repr(err), "BaseError([Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(str(err), "Error")

class TestParseError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ParseError, BaseError))

class TestValidationError(unittest.TestCase):
    def test_inheritance(self):
        self.assertTrue(issubclass(ValidationError, BaseError))

class TestValidationResult(unittest.TestCase):
    def test_init_with_value(self):
        result = ValidationResult(value="valid")
        self.assertEqual(result.value, "valid")
        self.assertIsNone(result.error)

    def test_init_with_error(self):
        err = ValidationError(text="Error")
        result = ValidationResult(error=err)
        self.assertIsNone(result.value)
        self.assertEqual(result.error, err)

    def test_iter(self):
        result = ValidationResult(value="valid")
        self.assertEqual(list(iter(result)), ["valid", None])

    def test_bool(self):
        result = ValidationResult(value="valid")
        self.assertTrue(result)
        err = ValidationError(text="Error")
        result = ValidationResult(error=err)
        self.assertFalse(result)

    def test_repr(self):
        result = ValidationResult(value="valid")
        self.assertEqual(repr(result), "ValidationResult(value='valid')")
        err = ValidationError(text="Error")
        result = ValidationResult(error=err)
        self.assertEqual(repr(result), "ValidationResult(error=ValidationError(text='Error', code='custom'))")

if __name__ == '__main__':
    unittest.main()