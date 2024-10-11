import unittest
from typesystem.tokenize.positional_validation import validate_with_positions


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_valid(self):
        from your_module import Toke
        field = Field()
        result = validate_with_positions(token=token, validator=field)
        self.assertEqual(result, "hello")

    def test_validate_with_positions_required_field(self):
        from your_module import Toke
        field = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_invalid_field(self):
        from your_module import Toke
        field = Field(min_length=6)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field)

    def test_validate_with_positions_multiple_required_fields(self):
        from your_module import Toke
        field1 = Field(required=True)
        field2 = Field(required=True)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field1)

    def test_validate_with_positions_multiple_invalid_fields(self):
        from your_module import Toke
        field1 = Field(min_length=6)
        field2 = Field(min_length=8)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field1)

    def test_validate_with_positions_multiple_required_and_invalid_fields(self):
        from your_module import Toke
        field1 = Field(required=True, min_length=6)
        field2 = Field(required=True, min_length=8)
        with self.assertRaises(ValidationError):
            validate_with_positions(token=token, validator=field1)

if __name__ == '__main__':
    unittest.main()