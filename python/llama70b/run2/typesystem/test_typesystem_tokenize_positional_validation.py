import unittest
from typesystem.tokenize.positional_validation import validate_with_positions, ValidationError, Message


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_success(self):
        token = Token(value="test")
        validator = Field()
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, "test")

    def test_validate_with_positions_failure(self):
        token = Token(value="")
        validator = Field(required=True)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages()), 1)
        message = error.messages()[0]
        self.assertEqual(message.text, "The field '' is required.")
        self.assertEqual(message.code, "required")
        self.assertEqual(message.start_position.char_index, 0)
        self.assertEqual(message.end_position.char_index, 0)

    def test_validate_with_positions_multiple_errors(self):
        token = Token(value="")
        validator = Field(required=True, min_length=5)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages()), 2)
        messages = error.messages()
        self.assertEqual(messages[0].text, "The field '' is required.")
        self.assertEqual(messages[0].code, "required")
        self.assertEqual(messages[0].start_position.char_index, 0)
        self.assertEqual(messages[0].end_position.char_index, 0)
        self.assertEqual(messages[1].text, "String is too short.")
        self.assertEqual(messages[1].code, "min_length")
        self.assertEqual(messages[1].start_position.char_index, 0)
        self.assertEqual(messages[1].end_position.char_index, 0)

class TestValidationError(unittest.TestCase):
    def test_init(self):
        messages = [Message(text="Error 1"), Message(text="Error 2")]
        error = ValidationError(messages=messages)
        self.assertEqual(error.messages(), messages)

    def test_str(self):
        messages = [Message(text="Error 1"), Message(text="Error 2")]
        error = ValidationError(messages=messages)
        self.assertEqual(str(error), "Error 1, Error 2")

    def test_repr(self):
        messages = [Message(text="Error 1"), Message(text="Error 2")]
        error = ValidationError(messages=messages)
        self.assertEqual(repr(error), "ValidationError([Message(text='Error 1'), Message(text='Error 2')])")

class TestMessage(unittest.TestCase):
    def test_init(self):
        message = Message(text="Error", code="error_code", index=["field"], start_position=0, end_position=1)
        self.assertEqual(message.text, "Error")
        self.assertEqual(message.code, "error_code")
        self.assertEqual(message.index, ["field"])
        self.assertEqual(message.start_position, 0)
        self.assertEqual(message.end_position, 1)

    def test_str(self):
        message = Message(text="Error", code="error_code", index=["field"], start_position=0, end_position=1)
        self.assertEqual(str(message), "Error (field)")

    def test_repr(self):
        message = Message(text="Error", code="error_code", index=["field"], start_position=0, end_position=1)
        self.assertEqual(repr(message), "Message(text='Error', code='error_code', index=['field'], start_position=0, end_position=1)")

if __name__ == '__main__':
    unittest.main()