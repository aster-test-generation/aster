import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        field = NeverMatch()
        self.assertEqual(field.errors, {"never": "This never validates."})

    def test_validate(self):
        field = NeverMatch()
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_init(self):
        field = OneOf([NeverMatch()])
        self.assertEqual(field.errors, {
            "no_match": "Did not match any valid type.",
            "multiple_matches": "Matched more than one type."
        })

    def test_validate_no_match(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "Did not match any valid type.")

    def test_validate_multiple_matches(self):
        field = OneOf([NeverMatch(), NeverMatch(allow_null=True)], allow_null=True)
        with self.assertRaises(ValidationError) as context:
            field.validate(None)
        self.assertEqual(str(context.exception), "Matched more than one type.")

    def test_validate_success(self):
        field = OneOf([NeverMatch(allow_null=True), NeverMatch(allow_null=True)])
        self.assertEqual(field.validate(None), None)

class TestAllOf(unittest.TestCase):
    def test_init(self):
        field = AllOf([NeverMatch()])
        self.assertEqual(field.errors, {})

    def test_validate(self):
        field = AllOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

class TestNot(unittest.TestCase):
    def test_init(self):
        field = Not(NeverMatch())
        self.assertEqual(field.errors, {"negated": "Must not match."})

    def test_validate_negated(self):
        field = Not(NeverMatch())
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "Must not match.")

    def test_validate_success(self):
        field = Not(NeverMatch())
        self.assertEqual(field.validate(None), None)

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        field = IfThenElse(NeverMatch())
        self.assertEqual(field.errors, {})

    def test_validate_if_clause_matches(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        self.assertEqual(field.validate(1), 1)

    def test_validate_if_clause_no_match(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch(), else_clause=NeverMatch())
        self.assertEqual(field.validate(1), None)

    def test_validate_if_clause_no_match_else_clause_no_match(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch(), else_clause=NeverMatch())
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

if __name__ == '__main__':
    unittest.main()