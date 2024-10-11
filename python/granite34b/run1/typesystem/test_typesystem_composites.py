import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_init(self):
        field = NeverMatch()
        self.assertEqual(field.errors, {"never": "This never validates."})

    def test_validate(self):
        field = NeverMatch()
        with self.assertRaises(ValidationError) as cm:
            field.validate(1)
        self.assertEqual(str(cm.exception), "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_init(self):
        field = OneOf([Int, String])
        self.assertEqual(field.errors, {
            "no_match": "Did not match any valid type.",
            "multiple_matches": "Matched more than one type."
        })

    def test_validate_no_match(self):
        field = OneOf([Integer(), String()])
        with self.assertRaises(ValidationError) as cm:
            field.validate(True)
        self.assertEqual(str(cm.exception), "Did not match any valid type.")

    def test_validate_multiple_matches(self):
        field = OneOf([Integer(), String()])
        with self.assertRaises(ValidationError) as cm:
            field.validate(1.0)
        self.assertEqual(str(cm.exception), "Matched more than one type.")

    def test_validate_success(self):
        field = OneOf([Integer(), String()])
        self.assertEqual(field.validate(1), 1)
        self.assertEqual(field.validate("a"), "a")

class TestAllOf(unittest.TestCase):
    def test_init(self):
        field = AllOf([Int(), Min(1)])
        self.assertEqual(field.all_of, [Int(), Min(1)])

    def test_validate(self):
        field = AllOf([Int(), Min(1)])
        self.assertEqual(field.validate(1), 1)
        with self.assertRaises(ValidationError) as cm:
            field.validate(0)
        self.assertEqual(str(cm.exception), "Value must be greater than or equal to 1.")

class TestNot(unittest.TestCase):
    def test_init(self):
        field = Not(Int)
        self.assertEqual(field.errors, {"negated": "Must not match."})

    def test_validate_success(self):
        field = Not(Integer())
        self.assertEqual(field.validate("a"), "a")

    def test_validate_failure(self):
        field = Not(Int)
        with self.assertRaises(ValidationError) as cm:
            field.validate(1)
        self.assertEqual(str(cm.exception), "Must not match.")

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        field = IfThenElse(Int(), String(), Bool())
        self.assertEqual(field.if_clause, Int())
        self.assertEqual(field.then_clause, String())
        self.assertEqual(field.else_clause, Bool())

    def test_validate_if_success(self):
        field = IfThenElse(Int(), String(), Bool())
        self.assertEqual(field.validate(1), "1")

    def test_validate_if_failure(self):
        field = IfThenElse(Int(), String(), Bool())
        self.assertEqual(field.validate(True), True)

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
            "multiple_matches": "Matched more than one type.",
        })

    def test_validate_no_match(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "Did not match any valid type.")

    def test_validate_multiple_matches(self):
        field = OneOf([NeverMatch(), NeverMatch(allow_null=True)])
        with self.assertRaises(ValidationError) as context:
            field.validate(None)
        self.assertEqual(str(context.exception), "Matched more than one type.")

class TestAllOf(unittest.TestCase):
    def test_init(self):
        field = AllOf([NeverMatch()])
        self.assertEqual(field.all_of, [NeverMatch()])

    def test_validate(self):
        field = AllOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

class TestNot(unittest.TestCase):
    def test_init(self):
        field = Not(NeverMatch())
        self.assertEqual(field.errors, {"negated": "Must not match."})

    def test_validate(self):
        field = Not(NeverMatch())
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "Must not match.")

class TestIfThenElse(unittest.TestCase):
    def test_init(self):
        field = IfThenElse(NeverMatch())
        self.assertEqual(field.if_clause, NeverMatch())
        self.assertEqual(field.then_clause, Any())
        self.assertEqual(field.else_clause, Any())

    def test_validate_if_clause_matches(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

    def test_validate_if_clause_no_match(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch(), else_clause=NeverMatch())
        with self.assertRaises(ValidationError) as context:
            field.validate(1)
        self.assertEqual(str(context.exception), "This never validates.")

if __name__ == '__main__':
    unittest.main()