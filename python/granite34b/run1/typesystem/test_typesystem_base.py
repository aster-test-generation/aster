import unittest
from typesystem.base import Position, Message, BaseError, ParseError, ValidationError, ValidationResult


class TestPosition(unittest.TestCase):
    def test_init(self):
        position = Position(1, 2, 3)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.column_no, 2)
        self.assertEqual(position.char_index, 3)

    def test_eq(self):
        position1 = Position(1, 2, 3)
        position2 = Position(1, 2, 3)
        position3 = Position(4, 5, 6)
        self.assertEqual(position1, position2)
        self.assertNotEqual(position1, position3)

    def test_repr(self):
        position = Position(1, 2, 3)
        self.assertEqual(repr(position), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        self.assertEqual(message.text, "Error message")
        self.assertEqual(message.code, "E001")
        self.assertEqual(message.index, [1, 2])
        self.assertEqual(message.start_position, Position(1, 2, 3))
        self.assertEqual(message.end_position, Position(1, 2, 3))

    def test_eq(self):
        message1 = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        message2 = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        message3 = Message("Other message", "E002", [3, 4], Position(4, 5, 6))
        self.assertEqual(message1, message2)
        self.assertNotEqual(message1, message3)

    def test_hash(self):
        message1 = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        message2 = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        message3 = Message("Other message", "E002", [3, 4], Position(4, 5, 6))
        self.assertEqual(hash(message1), hash(message2))
        self.assertNotEqual(hash(message1), hash(message3))

    def test_repr(self):
        message = Message("Error message", "E001", [1, 2], Position(1, 2, 3))
        self.assertEqual(repr(message), "Message(text='Error message', code='E001', index=[1, 2], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="Error message", code="E001", key=1, position=Position(1, 2, 3))
        self.assertEqual(len(error._messages), 1)
        self.assertEqual(error._messages[0].text, "Error message")
        self.assertEqual(error._messages[0].code, "E001")
        self.assertEqual(error._messages[0].index, [1])
        self.assertEqual(error._messages[0].start_position, Position(1, 2, 3))
        self.assertEqual(error._messages[0].end_position, Position(1, 2, 3))

class TestPosition(unittest.TestCase):
    def test_init(self):
        position = Position(1, 2, 3)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.column_no, 2)
        self.assertEqual(position.char_index, 3)

    def test_eq(self):
        position1 = Position(1, 2, 3)
        position2 = Position(1, 2, 3)
        self.assertEqual(position1, position2)

    def test_repr(self):
        position = Position(1, 2, 3)
        self.assertEqual(repr(position), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message("test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_eq(self):
        message1 = Message("test")
        message2 = Message("test")
        self.assertEqual(message1, message2)

    def test_hash(self):
        message = Message("test", code="test", index=["test"])
        self.assertEqual(hash(message), hash(("test", ("test",))))

    def test_repr(self):
        message = Message("test", code="test", index=["test"], start_position=Position(1, 2, 3), end_position=Position(4, 5, 6))
        self.assertEqual(repr(message), "Message(text='test', code='test', index=['test'], start_position=Position(line_no=1, column_no=2, char_index=3), end_position=Position(line_no=4, column_no=5, char_index=6))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="test")
        self.assertEqual(error._messages[0].text, "test")
        self.assertEqual(error._messages[0].code, "custom")
        self.assertEqual(error._messages[0].index, [])
        self.assertIsNone(error._messages[0].start_position)
        self.assertIsNone(error._messages[0].end_position)

    def test_messages(self):
        error = BaseError(text="test")
        self.assertEqual(error.messages(), error._messages)

    def test_iter(self):
        error = BaseError(text="test")
        self.assertEqual(list(error), list(error._message_dict))

    def test_len(self):
        error = BaseError(text="test")
        self.assertEqual(len(error), len(error._message_dict))

    def test_getitem(self):
        error = BaseError(text="test")
        self.assertEqual(error["test"], error._message_dict["test"])

    def test_eq(self):
        error1 = BaseError(text="test")
        error2 = BaseError(text="test")
        self.assertEqual(error1, error2)

    def test_hash(self):
        error = BaseError(text="test")
        self.assertEqual(hash(error), hash(tuple(hash(m) for m in error._messages)))

    def test_repr(self):
        error = BaseError(text="test")
        self.assertEqual(repr(error), "BaseError([Message(text='test', code='custom', index=[], start_position=None, end_position=None)])")

    def test_str(self):
        error = BaseError(text="test")
        self.assertEqual(str(error), str(dict(error)))

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError(text="test")
        self.assertEqual(error._messages[0].text, "test")
        self.assertEqual(error._messages[0].code, "custom")
        self.assertEqual(error._messages[0].index, [])
        self.assertIsNone(error._messages[0].start_position)
        self.assertIsNone(error._messages[0].end_position)

if __name__ == '__main__':
    unittest.main()