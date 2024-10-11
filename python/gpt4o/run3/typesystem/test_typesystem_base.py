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
        self.assertEqual(list(iter(err)), [1])

    def test_len(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(len(err), 1)

    def test_getitem(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(err["key"], "Error")

    def test_eq(self):
        pos = Position(1, 2, 3)
        msg1 = Message(text="Error", code="E001", key=1, position=pos)
        msg2 = Message(text="Error", code="E001", key=1, position=pos)
        err1 = BaseError(messages=[msg1])
        err2 = BaseError(messages=[msg2])
        self.assertTrue(err1 == err2, True)

    def test_hash(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(hash(err), hash((hash(msg),)))

    def test_repr(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(repr(err), "BaseError([Message(text='Error', code='E001', index=[1], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        pos = Position(1, 2, 3)
        msg = Message(text="Error", code="E001", key=1, position=pos)
        err = BaseError(messages=[msg])
        self.assertEqual(err[1], "Error")

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
        err = ValidationError(text="Error")
        result = ValidationResult(value="valid", error=None)
        self.assertEqual(list(result), ["valid", err])

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