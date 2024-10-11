import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse
from typesystem.fields import Field, Any


class MockField(Field):
    def __init__(self, should_validate=True, **kwargs):
        super().__init__(**kwargs)
        self.should_validate = should_validate

    def validate(self, value, strict=False):
        if self.should_validate:
            return value
        raise self.validation_error("mock_error")

    def validate_or_error(self, value, strict=False):
        if self.should_validate:
            return value, None
        return None, self.validation_error("mock_error")

class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        instance = NeverMatch()
        self.assertIsInstance(instance, NeverMatch)

    def test_validate(self):
        instance = NeverMatch()
        with self.assertRaises(instance.validation_error):
            instance.validate("any_value")

class TestOneOf(unittest.TestCase):
    def test_init(self):
        instance = OneOf([MockField()])
        self.assertIsInstance(instance, OneOf)

    def test_validate_single_match(self):
        instance = OneOf([MockField()])
        result = instance.validate("valid_value")
        self.assertEqual(result, "valid_value")

    def test_validate_no_match(self):
        instance = OneOf([MockField(should_validate=False)])
        with self.assertRaises(instance.validation_error):
            instance.validate("invalid_value")

    def test_validate_multiple_matches(self):
        instance = OneOf([MockField(), MockField()])
        with self.assertRaises(instance.validation_error):
            instance.validate("valid_value")

class TestAllOf(unittest.TestCase):
    def test_init(self):
        instance = AllOf([MockField()])
        self.assertIsInstance(instance, AllOf)

    def test_validate_all_match(self):
        instance = AllOf([MockField(), MockField()])
        result = instance.validate("valid_value")
        self.assertEqual(result, "valid_value")

    def test_validate_no_match(self):
        instance = AllOf([MockField(), MockField(should_validate=False)])
        with self.assertRaises(instance.validation_error):
            instance.validate("invalid_value")

class TestNot(unittest.TestCase):
    def test_init(self):
        instance = Not(MockField())
        self.assertIsInstance(instance, Not)

    def test_validate_negated(self):
        instance = Not(MockField())
        result = instance.validate("invalid_value")
        self.assertEqual(result, "invalid_value")

    def test_validate_not_negated(self):
        instance = Not(MockField(should_validate=True))
        with self.assertRaises(instance.validation_error):
            instance.validate("valid_value")

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        instance = IfThenElse(MockField())
        self.assertIsInstance(instance, IfThenElse)

    def test_validate_if_then(self):
        instance = IfThenElse(MockField(), then_clause=MockField())
        result = instance.validate("valid_value")
        self.assertEqual(result, "valid_value")

    def test_validate_if_else(self):
        instance = IfThenElse(MockField(should_validate=False), else_clause=MockField())
        result = instance.validate("valid_value")
        self.assertEqual(result, "valid_value")

    def test_validate_if_then_else(self):
        instance = IfThenElse(MockField(), then_clause=MockField(), else_clause=MockField(should_validate=False))
        result = instance.validate("valid_value")
        self.assertEqual(result, "valid_value")

if __name__ == '__main__':
    unittest.main()