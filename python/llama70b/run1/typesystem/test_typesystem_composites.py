import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse, Field


class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        instance = NeverMatch()
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = NeverMatch()
        with self.assertRaisesRegex(ValueError, "never"):
            instance.validate("any value")

    def test_errors(self):
        instance = NeverMatch()
        self.assertEqual(instance.errors, {"never": "This never validates."})

    def test_private_init(self):
        instance = NeverMatch()
        self.assertEqual(instance._NeverMatch__init_called, True)

class TestOneOf(unittest.TestCase):
    def test_init(self):
        instance = OneOf([Field()])
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = OneOf([Field()])
        with self.assertRaisesRegex(ValueError, "no_match"):
            instance.validate("any value")

    def test_errors(self):
        instance = OneOf([Field()])
        self.assertEqual(instance.errors, {
            "no_match": "Did not match any valid type.",
            "multiple_matches": "Matched more than one type.",
        })

    def test_private_init(self):
        instance = OneOf([Field()])
        self.assertEqual(instance._OneOf__init_called, True)

class TestAllOf(unittest.TestCase):
    def test_init(self):
        instance = AllOf([Field()])
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = AllOf([Field()])
        instance.validate("any value")  # should not raise an error

    def test_private_init(self):
        instance = AllOf([Field()])
        self.assertEqual(instance._AllOf__init_called, True)

class TestNot(unittest.TestCase):
    def test_init(self):
        instance = Not(Field())
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = Not(Field())
        with self.assertRaisesRegex(ValueError, "negated"):
            instance.validate("any value")

    def test_errors(self):
        instance = Not(Field())
        self.assertEqual(instance.errors, {"negated": "Must not match."})

    def test_private_init(self):
        instance = Not(Field())
        self.assertEqual(instance._Not__init_called, True)

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        instance = IfThenElse(Field())
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = IfThenElse(Field())
        instance.validate("any value")  # should not raise an error

    def test_private_init(self):
        instance = IfThenElse(Field())
        self.assertEqual(instance._IfThenElse__init_called, True)

if __name__ == '__main__':
    unittest.main()