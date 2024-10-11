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
        position3 = Position(1, 2, 4)
        self.assertEqual(position1, position2)
        self.assertNotEqual(position1, position3)

    def test_repr(self):
        position = Position(1, 2, 3)
        self.assertEqual(repr(position), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

        message = Message(text="test", code="custom", key=1)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

        message = Message(text="test", code="custom", index=[1])
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

        position = Position(1, 2, 3)
        message = Message(text="test", code="custom", position=position)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertEqual(message.start_position, position)
        self.assertEqual(message.end_position, position)

        message = Message(text="test", code="custom", start_position=position, end_position=position)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertEqual(message.start_position, position)
        self.assertEqual(message.end_position, position)

    def test_eq(self):
        position = Position(1, 2, 3)
        message1 = Message(text="test", code="custom", position=position)
        message2 = Message(text="test", code="custom", position=position)
        message3 = Message(text="test", code="custom", position=position, index=[1])
        self.assertEqual(message1, message2)
        self.assertNotEqual(message1, message3)

    def test_hash(self):
        position = Position(1, 2, 3)
        message1 = Message(text="test", code="custom", position=position)
        message2 = Message(text="test", code="custom", position=position)
        message3 = Message(text="test", code="custom", position=position, index=[1])
        self.assertEqual(hash(message1), hash(message2))
        self.assertNotEqual(hash(message1), hash(message3))

    def test_repr(self):
        position = Position(1, 2, 3)
        message = Message(text="test", code="custom", position=position)
        self.assertEqual(repr(message), "Message(text='test', code='custom', position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(error.messages(), [message])

if __name__ == '__main__':
    unittest.main()