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
        self.assertEqual(position.__repr__(), "Position(line_no=1, column_no=2, char_index=3)")

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
        self.assertEqual(message.__repr__(), "Message(text='text', code='code', index=[1], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        base_error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(base_error._messages, [Message("text", code="code", key=1, position=Position(1, 2, 3))])

    def test_messages(self):
        base_error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        messages = base_error.messages()
        self.assertEqual(len(messages), 1)
        self.assertEqual(messages[0].text, "text")
        self.assertEqual(messages[0].code, "code")
        self.assertEqual(messages[0].index, [1])

    def test_eq(self):
        base_error1 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        base_error2 = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertTrue(base_error1 == base_error2)

    def test_hash(self):
        base_error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(hash(base_error), hash(tuple(hash(m) for m in base_error._messages)))

    def test_repr(self):
        base_error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(base_error.__repr__(), "BaseError([Message(text='text', code='code', index=[1], position=Position(line_no=1, column_no=2, char_index=3))])")

    def test_str(self):
        base_error = BaseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(str(base_error), "text")

class TestParseError(unittest.TestCase):
    def test_init(self):
        parse_error = ParseError(text="text", code="code", key=1, position=Position(1, 2, 3))
        self.assertEqual(parse_error._messages, [Message("text", code="code", key=1, position=Position(1, 2, 3))])

if __name__ == '__main__':
    unittest.main()