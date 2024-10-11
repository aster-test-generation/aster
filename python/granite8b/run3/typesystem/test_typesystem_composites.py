from typesystem.composites import Any
import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_validate(self):
        field = NeverMatch()
        self.assertRaises(ValidationError, field.validate, 1)

    def test_validate_or_error(self):
        field = NeverMatch()
        result, error = field.validate_or_error(1)
        self.assertIsNone(result)
        self.assertEqual(error.text, "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_validate(self):
        field = OneOf([NeverMatch(), AllOf([Any(), Any()])])
        self.assertRaises(ValueError, field.validate, '1')

    def test_validate_or_error(self):
        field = OneOf([NeverMatch(), AllOf([Any(), Any()])])
        result, error = field.validate_or_error(1)
        self.assertIsNotNone(result)
        self.assertEqual(error, "Did not match any valid type.")

class TestAllOf(unittest.TestCase):
    def test_validate(self):
        field = AllOf([NeverMatch(), AllOf([Any(), Any()])])
        self.assertRaises(ValueError, field.validate, "1")

    def test_validate_or_error(self):
        field = AllOf([NeverMatch(), AllOf([Any(), Any()])])
        result, error = field.validate_or_error(1)
        self.assertIsNone(result)
        self.assertEqual(error.text, "This never validates.")

class TestNot(unittest.TestCase):
    def test_validate(self):
        field = Not(NeverMatch())
        self.assertRaises(ValueError, field.validate, 'a')

    def test_validate_or_error(self):
        field = Not(NeverMatch())
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertEqual(error, "Must not match.")

class TestIfThenElse(unittest.TestCase):
    def test_validate(self):
        field = IfThenElse(NeverMatch(), AllOf([Any(), Any()]))
        self.assertRaises(ValueError, field.validate, 'abc')

    def test_validate_or_error(self):
        field = IfThenElse(NeverMatch(), AllOf([Any(), Any()]))
        result, error = field.validate_or_error(1)
        self.assertIsNotNone(result)
        self.assertEqual(error, "Must not match.")

if __name__ == '__main__':
    unittest.main()