import unittest
from typesystem.composites import *
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_validate(self):
        field = NeverMatch()
        with self.assertRaises(ValidationError) as cm:
            field.validate(1)
        self.assertEqual(cm.exception.code, "never")

    def test_validate_or_error(self):
        field = NeverMatch()
        result, error = field.validate_or_error(1)
        self.assertIsNone(result)
        self.assertEqual(error.code, "invalid")

class TestOneOf(unittest.TestCase):
    def test_validate(self):
        field = OneOf([Any(allow_none=True), Any(allow_null=True)])
        self.assertIsNone(field.validate(None))
        self.assertEqual(field.validate(1), 1)

    def test_validate_or_error(self):
        field = OneOf([Any(allow_none=True), Any(allow_null=True)])
        result, error = field.validate_or_error(None)
        self.assertIsNone(result)
        self.assertIsNone(error)
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestAllOf(unittest.TestCase):
    def test_validate(self):
        field = AllOf([Any(allow_none=True), Any(allow_null=True)])
        self.assertIsNone(field.validate(None))
        self.assertEqual(field.validate(1), 1)

    def test_validate_or_error(self):
        field = AllOf([Any(allow_none=True), Any(allow_null=True)])
        result, error = field.validate_or_error(None)
        self.assertIsNone(result)
        self.assertIsNone(error)
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestNot(unittest.TestCase):
    def test_validate(self):
        field = Not(Any())
        with self.assertRaises(ValidationError) as cm:
            field.validate(None)
        self.assertEqual(cm.exception.code, "negated")
        self.assertEqual(field.validate(1), 1)

    def test_validate_or_error(self):
        field = Not(Any())
        result, error = field.validate_or_error(None)
        self.assertIsNone(result)
        self.assertIsInstance(error, ValidationError)
        self.assertEqual(error.code, "negated")
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestIfThenElse(unittest.TestCase):
    def test_validate(self):
        field = IfThenElse(Any(allow_none=True), Any(allow_null=True))
        self.assertIsNone(field.validate(None))
        self.assertEqual(field.validate(1), 1)

    def test_validate_or_error(self):
        field = IfThenElse(Any(allow_none=True), Any(allow_null=True))
        result, error = field.validate_or_error(None)
        self.assertIsNone(result)
        self.assertIsNone(error)
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestNeverMatch(unittest.TestCase):
    def test_validate(self):
        field = NeverMatch()
        with self.assertRaises(Exception) as cm:
            field.validate(1)
        self.assertEqual(str(cm.exception), "This never validates.")

    def test_validate_or_error(self):
        field = NeverMatch()
        result, error = field.validate_or_error(1)
        self.assertIsNone(result)
        self.assertEqual(error, "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_validate(self):
        field = OneOf([NeverMatch(), AllOf([Any()])])
        result = field.validate(1)
        self.assertEqual(result, 1)

    def test_validate_or_error(self):
        field = OneOf([NeverMatch(), AllOf([Any()])])
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestAllOf(unittest.TestCase):
    def test_validate(self):
        field = AllOf([NeverMatch(), AllOf([Any()])])
        result = field.validate(1)
        self.assertEqual(result, 1)

    def test_validate_or_error(self):
        field = AllOf([NeverMatch(), AllOf([Any()])])
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestNot(unittest.TestCase):
    def test_validate(self):
        field = Not(NeverMatch())
        result = field.validate(1)
        self.assertEqual(result, 1)

    def test_validate_or_error(self):
        field = Not(NeverMatch())
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

class TestIfThenElse(unittest.TestCase):
    def test_validate(self):
        field = IfThenElse(NeverMatch(), AllOf([Any()]))
        result = field.validate(1)
        self.assertEqual(result, 1)

    def test_validate_or_error(self):
        field = IfThenElse(NeverMatch(), AllOf([Any()]))
        result, error = field.validate_or_error(1)
        self.assertEqual(result, 1)
        self.assertIsNone(error)

if __name__ == '__main__':
    unittest.main()