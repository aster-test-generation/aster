import unittest
from typesystem.tokenize.positional_validation import validate_with_positions, ValidationError, Message


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_success(self):
        token = Token(value="test")
        validator = Field()
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, "test")

    def test_validate_with_positions_failure_required(self):
        token = Token(value=None)
        validator = Field(required=True)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages()), 1)
        message = error.messages()[0]
        self.assertEqual(message.text, "The field 'test' is required.")
        self.assertEqual(message.code, "required")
        self.assertEqual(message.start_position.char_index, 0)

    def test_validate_with_positions_failure_other_error(self):
        token = Token(value="test")
        validator = Field(pattern="^abc$")
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages()), 1)
        message = error.messages()[0]
        self.assertEqual(message.text, "Invalid input")
        self.assertEqual(message.code, "invalid")
        self.assertEqual(message.start_position.char_index, 0)

class TestValidationError(unittest.TestCase):
    def test_init(self):
        messages = [Message(text="error", code="code", index=("index",))]
        error = ValidationError(messages=messages)
        self.assertEqual(error.messages(), messages)

    def test_str(self):
        messages = [Message(text="error", code="code", index=("index",))]
        error = ValidationError(messages=messages)
        self.assertEqual(str(error), "ValidationError: error")

    def test_repr(self):
        messages = [Message(text="error", code="code", index=("index",))]
        error = ValidationError(messages=messages)
        self.assertEqual(repr(error), "ValidationError(messages=[Message(text='error', code='code', index=('index',))])")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="error", code="code", index=("index",), start_position=0, end_position=1)
        self.assertEqual(message.text, "error")
        self.assertEqual(message.code, "code")
        self.assertEqual(message.index, ("index",))
        self.assertEqual(message.start_position, 0)
        self.assertEqual(message.end_position, 1)

    def test_str(self):
        message = Message(text="error", code="code", index=("index",), start_position=0, end_position=1)
        self.assertEqual(str(message), "error")

    def test_repr(self):
        message = Message(text="error", code="code", index=("index",), start_position=0, end_position=1)
        self.assertEqual(repr(message), "Message(text='error', code='code', index=('index',), start_position=0, end_position=1)")

if __name__ == '__main__':
    unittest.main()