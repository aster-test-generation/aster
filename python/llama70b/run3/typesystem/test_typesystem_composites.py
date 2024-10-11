import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse, Field
from typesystem.fields import Any


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

class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        instance = NeverMatch()
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = NeverMatch()
        with self.assertRaisesRegex(Exception, "never"):
            instance.validate("value")

    def test_errors(self):
        instance = NeverMatch()
        self.assertEqual(instance.errors, {"never": "This never validates."})

    def test_private_init(self):
        instance = NeverMatch()
        self.assertIsNotNone(instance._NeverMatch__init_called)

class TestOneOf(unittest.TestCase):
    def test_init(self):
        instance = OneOf([Any()])
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = OneOf([Any()])
        with self.assertRaisesRegex(Exception, "no_match"):
            instance.validate("value")

    def test_errors(self):
        instance = OneOf([Any()])
        self.assertEqual(instance.errors, {
            "no_match": "Did not match any valid type.",
            "multiple_matches": "Matched more than one type.",
        })

    def test_private_init(self):
        instance = OneOf([Any()])
        self.assertIsNotNone(instance._OneOf__init_called)

class TestAllOf(unittest.TestCase):
    def test_init(self):
        instance = AllOf([Any()])
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = AllOf([Any()])
        self.assertIsNone(instance.validate("value"))

    def test_private_init(self):
        instance = AllOf([Any()])
        self.assertIsNotNone(instance._AllOf__init_called)

class TestNot(unittest.TestCase):
    def test_init(self):
        instance = Not(Any())
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = Not(Any())
        with self.assertRaisesRegex(Exception, "negated"):
            instance.validate("value")

    def test_errors(self):
        instance = Not(Any())
        self.assertEqual(instance.errors, {"negated": "Must not match."})

    def test_private_init(self):
        instance = Not(Any())
        self.assertIsNotNone(instance._Not__init_called)

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        instance = IfThenElse(Any())
        self.assertIsInstance(instance, Field)

    def test_validate(self):
        instance = IfThenElse(Any())
        self.assertIsNone(instance.validate("value"))

    def test_private_init(self):
        instance = IfThenElse(Any())
        self.assertIsNotNone(instance._IfThenElse__init_called)

if __name__ == '__main__':
    unittest.main()