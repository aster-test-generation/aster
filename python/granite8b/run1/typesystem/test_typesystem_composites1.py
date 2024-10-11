import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse

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