import unittest
from typesystem.tokenize.positional_validation import validate_with_positions, Token, Field, Schema, Message, ValidationError


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_field(self):
        token = Token(value=1, start_pos=1, end_pos=2)
        field = Field(int)
        result = validate_with_positions(token=token, validator=field)
        self.assertEqual(result, 1)

    def test_validate_with_positions_schema(self):
        token = Token(value=1, start_pos=1, end_pos=2)
        schema = Schema(int)
        result = validate_with_positions(token=token, validator=schema)
        self.assertEqual(result, 1)

    def test_validate_with_positions_field_error(self):
        token = Token(value="abc", start=1, end=4, line=1)
        field = Field(int)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=field)
        error = cm.exception
        self.assertEqual(len(error.messages), 1)
        message = error.messages[0]
        self.assertEqual(message.text, "Value must be an integer.")
        self.assertEqual(message.code, "invalid_type")
        self.assertEqual(message.start_position.char_index, 1)
        self.assertEqual(message.end_position.char_index, 4)

if __name__ == '__main__':
    unittest.main()