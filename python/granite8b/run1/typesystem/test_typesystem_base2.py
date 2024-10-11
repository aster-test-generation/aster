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

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_init_with_key(self):
        message = Message(text="test", key=1)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_init_with_index(self):
        message = Message(text="test", index=[1, 2])
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1, 2])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_init_with_position(self):
        position = Position(1, 2, 3)
        message = Message(text="test", position=position)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertEqual(message.start_position, position)
        self.assertEqual(message.end_position, position)

    def test_eq(self):
        message1 = Message(text="test")
        message2 = Message(text="test")
        self.assertEqual(message1, message2)

class TestBaseError(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(error._messages, [message])
        self.assertEqual(error._message_dict, {"": "test"})

    def test_messages(self):
        message1 = Message(text="test1")
        message2 = Message(text="test2")
        error = BaseError(messages=[message1, message2])
        self.assertEqual(error.messages(), [message1, message2])
        self.assertEqual(error.messages(add_prefix=1), [Message(text="test1", index=[1]), Message(text="test2", index=[1])])

    def test_eq(self):
        message1 = Message(text="test1")
        message2 = Message(text="test2")
        error1 = BaseError(messages=[message1])
        error2 = BaseError(messages=[message2])
        self.assertNotEqual(error1, error2)
        self.assertEqual(error1, BaseError(messages=[message1]))

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError(text="test")
        self.assertEqual(error.text, "test")
        self.assertEqual(error.code, "parse")

class TestValidationError(unittest.TestCase):
    def test_init(self):
        error = ValidationError(text="test")
        self.assertEqual(error.text, "test")
        self.assertEqual(error.code, "validate")

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(value=1)
        self.assertEqual(result.value, 1)
        self.assertIsNone(result.error)

if __name__ == '__main__':
    unittest.main()