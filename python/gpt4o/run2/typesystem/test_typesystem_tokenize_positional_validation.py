import unittest
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.base import Message, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.tokens import Token
from unittest.mock import Mock
from typesystem.base import ValidationError, Message


class MockValidator(Field):
    def validate(self, value):
        if value == "invalid":
            raise ValidationError(messages=[Message(text="Invalid value", code="invalid", index=[])])
        return value

class MockToken(Token):
    def __init__(self, value, start, end):
        self._value = value
        self.start = start
        self.end = end

    def lookup(self, index):
        return self

class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions_valid(self):
        token = MockToken(value="valid", start=0, end=5)
        validator = MockValidator()
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, "valid")

    def test_validate_with_positions_invalid(self):
        token = MockToken(value="invalid", start=0, end=7)
        validator = MockValidator()
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=token, validator=validator)
        self.assertEqual(len(context.exception.messages), 1)
        self.assertEqual(context.exception.messages[0].text, "Invalid value")
        self.assertEqual(context.exception.messages[0].code, "invalid")
        self.assertEqual(context.exception.messages[0].start_position, 0)
        self.assertEqual(context.exception.messages[0].end_position, 7)

    def test_validate_with_positions_required_field(self):
        class RequiredFieldValidator(Field):
            def validate(self, value):
                raise ValidationError(messages=[Message(text="Field is required", code="required", index=["field"])])

        token = MockToken(value="value", start=0, end=5)
        validator = RequiredFieldValidator()
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=token, validator=validator)
        self.assertEqual(len(context.exception.messages), 1)
        self.assertEqual(context.exception.messages[0].text, "The field 'field' is required.")
        self.assertEqual(context.exception.messages[0].code, "required")
        self.assertEqual(context.exception.messages[0].start_position, 0)
        self.assertEqual(context.exception.messages[0].end_position, 5)

class TestValidateWithPositions(unittest.TestCase):
    def setUp(self):
        self.token = Mock(spec=Token)
        self.token.value = "test_value"
        self.token.start = Mock()
        self.token.end = Mock()
        self.token.lookup = Mock(return_value=self.token)

    def test_validate_with_positions_success(self):
        validator = Mock(spec=Field)
        validator.validate = Mock(return_value="validated_value")
        
        result = validate_with_positions(token=self.token, validator=validator)
        self.assertEqual(result, "validated_value")

    def test_validate_with_positions_validation_error(self):
        validator = Mock(spec=Field)
        error_message = Message(
            text="Field is required",
            code="required",
            index=[0],
            start_position=self.token.start,
            end_position=self.token.end
        )
        validation_error = ValidationError(messages=[error_message])
        validator.validate = Mock(side_effect=validation_error)
        
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=self.token, validator=validator)
        
        self.assertEqual(len(context.exception.messages), 1)
        self.assertEqual(context.exception.messages[0].text, "The field 0 is required.")
        self.assertEqual(context.exception.messages[0].code, "required")
        self.assertEqual(context.exception.messages[0].start_position, self.token.start)
        self.assertEqual(context.exception.messages[0].end_position, self.token.end)

    def test_validate_with_positions_non_required_error(self):
        validator = Mock(spec=Field)
        error_message = Message(
            text="Invalid value",
            code="invalid",
            index=[0],
            start_position=self.token.start,
            end_position=self.token.end
        )
        validation_error = ValidationError(messages=[error_message])
        validator.validate = Mock(side_effect=validation_error)
        
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=self.token, validator=validator)
        
        self.assertEqual(len(context.exception.messages), 1)
        self.assertEqual(context.exception.messages[0].text, "Invalid value")
        self.assertEqual(context.exception.messages[0].code, "invalid")
        self.assertEqual(context.exception.messages[0].start_position, self.token.start)
        self.assertEqual(context.exception.messages[0].end_position, self.token.end)

if __name__ == '__main__':
    unittest.main()