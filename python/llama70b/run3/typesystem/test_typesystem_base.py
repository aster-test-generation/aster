import typing
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
        msg = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(msg.text, "hello")
        self.assertEqual(msg.code, "custom")
        self.assertEqual(msg.index, ["key"])
        self.assertEqual(msg.start_position, Position(1, 2, 3))
        self.assertEqual(msg.end_position, Position(1, 2, 3))

    def test_eq(self):
        msg1 = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        msg2 = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertTrue(msg1 == msg2)

    def test_hash(self):
        msg = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(hash(msg), int)

    def test_repr(self):
        msg = Message(text="hello", code="custom", key="key", position=Position(1, 2, 3))
        self.assertEqual(repr(msg), "Message(text='hello', code='custom', index=['key'], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(err._messages, [Message(text="error", code="code", key="key", position=Position(1, 2, 3))])

    def test_messages(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(err.messages(), [Message(text="error", code="code", key="key", position=Position(1, 2, 3))])

    def test_iter(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(iter(err), typing.Iterator)

    def test_len(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(len(err), 1)

    def test_getitem(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(err["key"], "error")

    def test_eq(self):
        err1 = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        err2 = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertTrue(err1 == err2)

    def test_hash(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertIsInstance(hash(err), int)

    def test_repr(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(repr(err), "BaseError([Message(text='error', code='code', index=['key'], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        err = BaseError(text="error", code="code", key="key", position=Position(1, 2, 3))
        self.assertEqual(str(err), "error")


if __name__ == '__main__':
    unittest.main()