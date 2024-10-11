import unittest
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.tokenize.tokens import Token
from typesystem.base import Message, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_valid(self):
        token = Token(start=0, end=5, value="hello")
        field = Field()
        result = validate_with_positions(token=token, validator=field)
        self.assertEqual(result, "hello")

    def test_validate_with_positions_invalid(self):
        token = Token(start=0, end=5, value="hello")
        field = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_required_field(self):
        token = Token(start=0, end=5, value="")
        field = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_multiple_errors(self):
        token = Token(start=0, end=5, value="hello")
        field = Field(required=True)
        token2 = Token(start=5, end=10, value="")
        field2 = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)
            validate_with_positions(token=token2, validator=field2)

    def test_validate_with_positions_positional_message(self):
        token = Token(start=0, end=5, value="hello")
        field = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_positional_message_multiple(self):
        token = Token(start=0, end=5, value="hello")
        field = Field(required=True)
        token2 = Token(start=5, end=10, value="")
        field2 = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)
            validate_with_positions(token=token2, validator=field2)

if __name__ == '__main__':
    unittest.main()