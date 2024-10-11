import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        field = NeverMatch()
        with self.assertRaisesRegex(ValueError, "never"):
            field.validate(1, strict=True)

    def test_never_match_allow_null(self):
        with self.assertRaisesRegex(TypeError, "allow_null"):
            NeverMatch(allow_null=True)

class TestOneOf(unittest.TestCase):
    def test_one_of_match(self):
        field = OneOf([NeverMatch()])
        result = field.validate(1, strict=True)
        self.assertIsNone(result)

    def test_one_of_no_match(self):
        field = OneOf([NeverMatch()])
        with self.assertRaisesRegex(ValueError, "no_match"):
            field.validate(2, strict=True)

    def test_one_of_multiple_matches(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        with self.assertRaisesRegex(ValueError, "multiple_matches"):
            field.validate(1, strict=True)

class TestAllOf(unittest.TestCase):
    def test_all_of_pass(self):
        field = AllOf([NeverMatch()])
        field.validate(1, strict=True)

    def test_all_of_fail(self):
        field = AllOf([NeverMatch()])
        with self.assertRaisesRegex(ValueError, "never"):
            field.validate(2, strict=True)

class TestNot(unittest.TestCase):
    def test_not_pass(self):
        field = Not(NeverMatch())
        field.validate(1, strict=True)

    def test_not_fail(self):
        field = Not(NeverMatch())
        with self.assertRaisesRegex(ValueError, "never"):
            field.validate(2, strict=True)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else_pass(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        field.validate(1, strict=True)

    def test_if_then_else_fail(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        with self.assertRaisesRegex(ValueError, "never"):
            field.validate(2, strict=True)

if __name__ == '__main__':
    unittest.main()