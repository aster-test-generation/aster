import unittest
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.tokenize.tokens import Token
from typesystem.fields import Field
from typesystem.schemas import Schema


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_success(self):
        token = Token("hello", 0, 5)
        field = Field("name", required=True)
        schema = Schema()
        result = validate_with_positions(token=token, validator=field)
        self.assertEqual(result, "hello")

    def test_validate_with_positions_required_field(self):
        token = Token("hello", 0, 5)
        field = Field("name", required=True)
        schema = Schema()
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_non_required_field(self):
        token = Token("hello", 0, 5)
        field = Field("name", required=False)
        schema = Schema()
        result = validate_with_positions(token=token, validator=field)
        self.assertEqual(result, "hello")

    def test_validate_with_positions_invalid_token(self):
        token = Token("hello", 10, 15)
        field = Field("name", required=True)
        schema = Schema()
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_invalid_validator(self):
        token = Token("hello", 0, 5)
        class InvalidValidator:
            def validate(self, value):
                raise Exception("Invalid validator")
        with self.assertRaises(Exception):
            validate_with_positions(token=token, validator=InvalidValidator())

if __name__ == '__main__':
    unittest.main()