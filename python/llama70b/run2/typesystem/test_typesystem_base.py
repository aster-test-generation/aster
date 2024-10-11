import typing
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
        self.assertTrue(position1 == position2)

    def test_repr(self):
        position = Position(1, 2, 3)
        self.assertEqual(repr(position), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(message.text, "hello")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, ["key"])
        self.assertEqual(message.start_position, Position(1, 2, 3))
        self.assertEqual(message.end_position, Position(1, 2, 3))

    def test_eq(self):
        message1 = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        message2 = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertTrue(message1 == message2)

    def test_hash(self):
        message = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(hash(message), int)

    def test_repr(self):
        message = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(repr(message), "Message(text='hello', code='custom', index=['key'], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(len(base_error._messages), 1)

    def test_messages(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        messages = base_error.messages()
        self.assertEqual(len(messages), 1)

    def test_iter(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(iter(base_error), typing.Iterator)

    def test_len(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(len(base_error), 1)

    def test_getitem(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(base_error["key"], "hello")

    def test_eq(self):
        base_error1 = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        base_error2 = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertTrue(base_error1 == base_error2)

    def test_hash(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(hash(base_error), int)

    def test_repr(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(repr(base_error), "BaseError([Message(text='hello', code='custom', index=['key'], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        base_error = BaseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(str(base_error), "hello")

class TestParseError(unittest.TestCase):
    def test_init(self):
        parse_error = ParseError(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(len(parse_error._messages), 1)

if __name__ == '__main__':
    unittest.main()