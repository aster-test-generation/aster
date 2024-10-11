import unittest
from typesystem.tokenize.positional_validation import validate_with_positions, Token, Field, Schema, ValidationError


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions(self):
        token = Token(value=1, end=1)
        validator = Field(type=int)
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, 1)

    def test_validate_with_positions_error(self):
        token = Token(value=None, end=1)
        validator = Field(type=int, required=True)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages), 1)
        message = error.messages[0]
        self.assertEqual(message.code, "required")
        self.assertEqual(message.index, ["value"])
        self.assertEqual(message.start_position.char_index, 0)
        self.assertEqual(message.end_position.char_index, 1)

if __name__ == '__main__':
    unittest.main()