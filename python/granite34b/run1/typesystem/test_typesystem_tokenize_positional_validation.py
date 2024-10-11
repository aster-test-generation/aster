import unittest
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.tokenize.tokens import Token
from typesystem.base import Message, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema


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
        token = Token(value="abc", start_pos=1, end_pos=4)
        field = Field(int)
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=token, validator=field)
        self.assertEqual(len(context.exception.messages), 1)
        message = context.exception.messages[0]
        self.assertEqual(message.text, "Value must be an integer.")
        self.assertEqual(message.code, "type")
        self.assertEqual(message.index, [])
        self.assertEqual(message.start_position.char_index, 1)
        self.assertEqual(message.end_position.char_index, 4)

if __name__ == '__main__':
    unittest.main()