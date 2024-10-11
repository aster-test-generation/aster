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
        message = Message("text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(message.text, "text")
        self.assertEqual(message.code, "code")
        self.assertEqual(message.index, [1])
        self.assertEqual(message.start_position, Position(1, 2, 3))
        self.assertEqual(message.end_position, Position(1, 2, 3))

    def test_eq(self):
        message1 = Message("text", code="code", key=1, position=Position(1, 2, 3))
        message2 = Message("text", code="code", key=1, position=Position(1, 2, 3))
        self.assertTrue(message1 == message2)

    def test_hash(self):
        message = Message("text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(hash(message), hash((message.code, tuple([1]))))

    def test_repr(self):
        message = Message("text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(repr(message), "Message(text='text', code='code', index=[1], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error._messages, [Message("text", code="code", key=1, position=Position(1, 2, 3))])

    def test_messages(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error.messages(), [Message("text", code="code", key=1, position=Position(1, 2, 3))])

    def test_eq(self):
        error1 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        error2 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertTrue(error1 == error2)

    def test_hash(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(hash(error), hash(tuple(hash(m) for m in error._messages)))

    def test_repr(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(repr(error), "BaseError([Message(text='text', code='code', index=[1], position=Position(line_no=1, column_no=2, char_index=3))])")

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error._messages, [Message("text", code="code", key=1, position=Position(1, 2, 3))])

    def test_messages(self):
        error = ParseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error.messages(), [Message("text", code="code", key=1, position=Position(1, 2, 3))])

if __name__ == '__main__':
    unittest.main()