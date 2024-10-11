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
        self.assertEqual(position1, position2)

        position3 = Position(1, 2, 4)
        self.assertNotEqual(position1, position3)

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])

        message = Message(text="test", code="test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "test")
        self.assertEqual(message.index, [])

        message = Message(text="test", code="test", key=1)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "test")
        self.assertEqual(message.index, [1])

        message = Message(text="test", code="test", key=1, index=[2, 3])
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "test")
        self.assertEqual(message.index, [1, 2, 3])

    def test_eq(self):
        message1 = Message(text="test")
        message2 = Message(text="test")
        self.assertEqual(message1, message2)

        message3 = Message(text="test", code="test")
        self.assertNotEqual(message1, message3)

        message4 = Message(text="test", key=1)
        self.assertNotEqual(message1, message4)

        message5 = Message(text="test", index=[1, 2])
        self.assertNotEqual(message1, message5)

class TestBaseError(unittest.TestCase):
    def test_init(self):
        error = BaseError(text="test")
        self.assertEqual(error.messages(), [Message(text="test")])

        error = BaseError(text="test", code="test")
        self.assertEqual(error.messages(), [Message(text="test", code="test")])

        error = BaseError(text="test", key=1)
        self.assertEqual(error.messages(), [Message(text="test", index=[1])])

        error = BaseError(text="test", index=[1, 2])
        self.assertEqual(error.messages(), [Message(text="test", index=[1, 2])])

        error = BaseError(messages=[Message(text="test")])
        self.assertEqual(error.messages(), [Message(text="test")])

    def test_eq(self):
        error1 = BaseError(text="test")
        error2 = BaseError(text="test")
        self.assertEqual(error1, error2)

        error3 = BaseError(text="test", code="test")
        self.assertNotEqual(error1, error3)

        error4 = BaseError(text="test", key=1)
        self.assertNotEqual(error1, error4)

        error5 = BaseError(text="test", index=[1, 2])
        self.assertNotEqual(error1, error5)


if __name__ == '__main__':
    unittest.main()