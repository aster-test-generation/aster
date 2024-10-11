import unittest
from unittest.mock import Mock
from typesystem.tokenize.positional_validation import validate_with_positions
from typesystem.base import Message, ValidationError
from typesystem.fields import Field
from typesystem.schemas import Schema
from typesystem.tokenize.tokens import Token


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
        error_message = Message(text="Error", code="required", index=[0], start_position=0, end_position=1)
        validation_error = ValidationError(messages=[error_message])
        validator.validate = Mock(side_effect=validation_error)
        
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=self.token, validator=validator)
        
        self.assertEqual(len(context.exception.messages()), 1)
        self.assertEqual(context.exception.messages[0].text, "The field 0 is required.")
        self.assertEqual(context.exception.messages[0].code, "required")
        self.assertEqual(context.exception.messages[0].index, [0])
        self.assertEqual(context.exception.messages[0].start_position, self.token.start)
        self.assertEqual(context.exception.messages[0].end_position, self.token.end)

    def test_validate_with_positions_non_required_error(self):
        validator = Mock(spec=Field)
        error_message = Message(text="Non-required error", code="invalid", index=[0], start_position=0, end_position=1)
        validation_error = ValidationError(messages=[error_message])
        validator.validate = Mock(side_effect=validation_error)
        
        with self.assertRaises(ValidationError) as context:
            validate_with_positions(token=self.token, validator=validator)
        
        self.assertEqual(len(context.exception.messages()), 1)
        self.assertEqual(context.exception.messages[0].text, "Non-required error")
        self.assertEqual(context.exception.messages[0].code, "invalid")
        self.assertEqual(context.exception.messages[0].index, [0])
        self.assertEqual(context.exception.messages[0].start_position, self.token.start)
        self.assertEqual(context.exception.messages[0].end_position, self.token.end)

if __name__ == '__main__':
    unittest.main()