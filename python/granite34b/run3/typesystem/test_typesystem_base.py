import unittest
from typesystem.base import Position, Message, BaseError, ParseError, ValidationError, ValidationResult


class TestPosition(unittest.TestCase):
    def test_init(self):
        position = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(position.line_no, 1)
        self.assertEqual(position.column_no, 2)
        self.assertEqual(position.char_index, 3)

    def test_eq(self):
        position1 = Position(line_no=1, column_no=2, char_index=3)
        position2 = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(position1, position2)

    def test_repr(self):
        position = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(repr(position), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="Test message", code="TEST", key=1, index=(2, 3), position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(message.text, "Test message")
        self.assertEqual(message.code, "TEST")
        self.assertEqual(message.index, [2, 3])
        self.assertEqual(message.start_position, Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(message.end_position, Position(line_no=1, column_no=2, char_index=3))

    def test_eq(self):
        message1 = Message(text="Test message", code="TEST", key=1, index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))
        message2 = Message(text="Test message", code="TEST", key=1, index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(message1, message2)

    def test_hash(self):
        message1 = Message(text="Test message", code="TEST", key=1, index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))
        message2 = Message(text="Test message", code="TEST", key=1, index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(hash(message1), hash(message2))

    def test_repr(self):
        message = Message(text="Test message", code="TEST", key=1, index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(repr(message), "Message(text='Test message', code='TEST', index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="Test error", code="TEST", key=1, position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(error.messages(), [Message(text="Test error", code="TEST", key=1, position=Position(line_no=1, column_no=2, char_index=3))])

    def test_iter(self):
        error = BaseError(text="Test error", code="TEST", key=1, position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(list(error), [{1: 'Test error'}])

    def test_len(self):
        error = BaseError(text="Test error", code="TEST", key=1, position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(len(error), len(error._message_dict))

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
        message = Message("text", code="code", key=1, index=[2, 3], position=Position(1, 2, 3))
        self.assertEqual(message.text, "text")
        self.assertEqual(message.code, "code")
        self.assertEqual(message.index, [2, 3])
        self.assertEqual(message.start_position, Position(1, 2, 3))
        self.assertEqual(message.end_position, Position(1, 2, 3))

    def test_eq(self):
        message1 = Message("text", code="code", key=1, index=[2, 3], position=Position(1, 2, 3))
        message2 = Message("text", code="code", key=1, index=[2, 3], position=Position(1, 2, 3))
        self.assertEqual(message1, message2)

    def test_hash(self):
        message = Message("text", code="code", key=1, index=[2, 3], position=Position(1, 2, 3))
        self.assertEqual(hash(message), hash((message.code, tuple(message.index))))

    def test_repr(self):
        message = Message("text", code="code", key=1, index=[2, 3], position=Position(1, 2, 3))
        self.assertEqual(repr(message), "Message(text='text', code='code', index=[2, 3], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error.messages(), [Message(text="text", code="code", key=1, position=Position(1, 2, 3))])

    def test_messages(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error.messages(add_prefix="prefix"), [Message(text="text", code="code", index=["prefix", 1], position=Position(1, 2, 3))])

    def test_iter(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(list(error), [error._message_dict])

    def test_len(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(len(error), len(error._message_dict))

    def test_getitem(self):
        error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error[1], error._message_dict[1])

    def test_eq(self):
        error1 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        error2 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(error1, error2)

if __name__ == '__main__':
    unittest.main()