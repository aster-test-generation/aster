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
        message = Message(text="test message")
        self.assertEqual(message.text, "test message")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_init_with_code_and_index(self):
        message = Message(text="test message", code="test", index=[1, 2])
        self.assertEqual(message.text, "test message")
        self.assertEqual(message.code, "test")
        self.assertEqual(message.index, [1, 2])
        self.assertIsNone(message.start_position)
        self.assertIsNone(message.end_position)

    def test_eq(self):
        message1 = Message(text="test message")
        message2 = Message(text="test message")
        message3 = Message(text="test message", code="test")
        message4 = Message(text="test message", index=[1, 2])
        message5 = Message(text="test message", position=Position(1, 2, 3))
        self.assertEqual(message1, message2)
        self.assertNotEqual(message1, message3)
        self.assertNotEqual(message1, message4)
        self.assertNotEqual(message1, message5)

    def test_hash(self):
        message1 = Message(text="test message")
        message2 = Message(text="test message")
        message3 = Message(text="test message", code="test")
        message4 = Message(text="test message", index=[1, 2])
        message5 = Message(text="test message", position=Position(1, 2, 3))
        self.assertEqual(hash(message1), hash(message2))
        self.assertNotEqual(hash(message1), hash(message3))
        self.assertNotEqual(hash(message1), hash(message4))
        self.assertNotEqual(hash(message1), hash(message5))

    def test_repr(self):
        message = Message(text="test message")
        self.assertEqual(repr(message), "Message(text='test message', code='custom', index=[], start_position=None, end_position=None)")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        message = Message(text="test message")
        error = BaseError(messages=[message])
        self.assertEqual(error.messages(), [message])

    def test_eq(self):
        message1 = Message(text="test message")
        message2 = Message(text="test message")
        error1 = BaseError(messages=[message1])
        error2 = BaseError(messages=[message2])
        error3 = BaseError(messages=[message1], code="test")
        error4 = BaseError(messages=[message1], index=[1, 2])
        error5 = BaseError(messages=[message1], position=Position(1, 2, 3))
        self.assertEqual(error1, error2)
        self.assertNotEqual(error1, error3)
        self.assertNotEqual(error1, error4)
        self.assertNotEqual(error1, error5)

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
        message = Message(text="test")
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [])
        self.assertEqual(message.start_position, None)
        self.assertEqual(message.end_position, None)

    def test_init_with_key(self):
        message = Message(text="test", key=1)
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1])
        self.assertEqual(message.start_position, None)
        self.assertEqual(message.end_position, None)

    def test_init_with_index(self):
        message = Message(text="test", index=[1, 2])
        self.assertEqual(message.text, "test")
        self.assertEqual(message.code, "custom")
        self.assertEqual(message.index, [1, 2])
        self.assertEqual(message.start_position, None)
        self.assertEqual(message.end_position, None)

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

    def test_hash(self):
        message1 = Message(text="test", code="custom")
        message2 = Message(text="test", code="custom")
        self.assertEqual(hash(message1), hash(message2))

    def test_repr(self):
        message = Message(text="test")
        self.assertEqual(repr(message), "Message(text='test', code='custom', index=[], start_position=None, end_position=None)")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(error._messages, [message])
        self.assertEqual(error._message_dict, {"test": message.text})

    def test_messages(self):
        message1 = Message(text="test1")
        message2 = Message(text="test2", add_prefix=1)
        error = BaseError(messages=[message1, message2])
        self.assertEqual(error.messages(), [message1, message2])

    def test_iter(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(list(error), [error._message_dict])

    def test_len(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(len(error), 1)

    def test_getitem(self):
        message = Message(text="test")
        error = BaseError(messages=[message])
        self.assertEqual(error["test"], message.text)

if __name__ == '__main__':
    unittest.main()