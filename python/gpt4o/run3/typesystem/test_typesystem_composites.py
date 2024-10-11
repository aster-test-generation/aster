import unittest
from typesystem.fields import Any, Field
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        instance = NeverMatch()
        self.assertIsInstance(instance, NeverMatch)

    def test_validate(self):
        instance = NeverMatch()
        with self.assertRaises(Field.validation_error) as context:
            instance.validate("any_value")
        self.assertEqual(context.exception.detail, "This never validates.")

class TestOneOf(unittest.TestCase):
    def setUp(self):
        self.field1 = Field()
        self.field2 = Field()
        self.instance = OneOf(one_of=[self.field1, self.field2])

    def test_init(self):
        self.assertIsInstance(self.instance, OneOf)
        self.assertEqual(self.instance.one_of, [self.field1, self.field2])

    def test_validate_no_match(self):
        with self.assertRaises(Field.validation_error) as context:
            self.instance.validate("any_value")
        self.assertEqual(context.exception.detail, "Did not match any valid type.")

    def test_validate_multiple_matches(self):
        self.field1.validate_or_error = lambda value, strict: (value, None)
        self.field2.validate_or_error = lambda value, strict: (value, None)
        with self.assertRaises(Field.validation_error) as context:
            self.instance.validate("any_value")
        self.assertEqual(context.exception.detail, "Matched more than one type.")

    def test_validate_single_match(self):
        self.field1.validate_or_error = lambda value, strict: (value, None)
        self.field2.validate_or_error = lambda value, strict: (None, "error")
        result = self.instance.validate("any_value")
        self.assertEqual(result, "any_value")

class TestAllOf(unittest.TestCase):
    def setUp(self):
        self.field1 = Field()
        self.field2 = Field()
        self.instance = AllOf(all_of=[self.field1, self.field2])

    def test_init(self):
        self.assertIsInstance(self.instance, AllOf)
        self.assertEqual(self.instance.all_of, [self.field1, self.field2])

    def test_validate(self):
        self.field1.validate = lambda value, strict: value
        self.field2.validate = lambda value, strict: value
        result = self.instance.validate("any_value")
        self.assertEqual(result, "any_value")

class TestNot(unittest.TestCase):
    def setUp(self):
        self.negated = Field()
        self.instance = Not(negated=self.negated)

    def test_init(self):
        self.assertIsInstance(self.instance, Not)
        self.assertEqual(self.instance.negated, self.negated)

    def test_validate_negated(self):
        self.negated.validate_or_error = lambda value, strict: (value, None)
        with self.assertRaises(Field.validation_error) as context:
            self.instance.validate("any_value")
        self.assertEqual(context.exception.detail, "Must not match.")

    def test_validate_not_negated(self):
        self.negated.validate_or_error = lambda value, strict: (None, "error")
        result = self.instance.validate("any_value")
        self.assertEqual(result, "any_value")

class TestIfThenElse(unittest.TestCase):
    def setUp(self):
        self.if_clause = Field()
        self.then_clause = Field()
        self.else_clause = Field()
        self.instance = IfThenElse(if_clause=self.if_clause, then_clause=self.then_clause, else_clause=self.else_clause)

    def test_init(self):
        self.assertIsInstance(self.instance, IfThenElse)
        self.assertEqual(self.instance.if_clause, self.if_clause)
        self.assertEqual(self.instance.then_clause, self.then_clause)
        self.assertEqual(self.instance.else_clause, self.else_clause)

    def test_validate_if_then(self):
        self.if_clause.validate_or_error = lambda value, strict: (value, None)
        self.then_clause.validate = lambda value, strict: "then_value"
        result = self.instance.validate("any_value")
        self.assertEqual(result, "then_value")

    def test_validate_if_else(self):
        self.if_clause.validate_or_error = lambda value, strict: (None, "error")
        self.else_clause.validate = lambda value, strict: "else_value"
        result = self.instance.validate("any_value")
        self.assertEqual(result, "else_value")

if __name__ == '__main__':
    unittest.main()