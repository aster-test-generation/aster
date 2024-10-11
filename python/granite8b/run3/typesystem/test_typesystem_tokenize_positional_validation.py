import unittest
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.tokenize.tokens import Token


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_field(self):
        token = Token(value=1, end=1)
        validator = Field(type="integer")
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, 1)

    def test_validate_with_positions_schema(self):
        token = Token(value=1, end=1)
        validator = Field(type="integer")
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, 1)

    def test_validate_with_positions_required_field(self):
        token = Token(value=None, end=0)
        validator = Field(type="integer", required=True)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages), 1)
        message = error.messages[0]
        self.assertEqual(message.code, "required")
        self.assertEqual(message.index, ["integer"])
        self.assertEqual(message.start_position.char_index, 0)
        self.assertEqual(message.end_position.char_index, 0)

    def test_validate_with_positions_required_schema(self):
        token = Token(value=None, end=0)
        validator = Field(type="integer", required=True)
        with self.assertRaises(ValidationError) as cm:
            validate_with_positions(token=token, validator=validator)
        error = cm.exception
        self.assertEqual(len(error.messages), 1)
        message = error.messages[0]
        self.assertEqual(message.code, "required")
        self.assertEqual(message.index, ["integer"])
        self.assertEqual(message.start_position.char_index, 0)
        self.assertEqual(message.end_position.char_index, 0)

if __name__ == '__main__':
    unittest.main()