import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse


class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        field = NeverMatch()
        with self.assertRaises(ValueError):
            field.validate(None, strict=True)

    def test_never_match_strict(self):
        field = NeverMatch()
        with self.assertRaises(ValueError):
            field.validate(None, strict=False)

class TestOneOf(unittest.TestCase):
    def test_one_of_match(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        result = field.validate(None, strict=True)
        self.assertIsNone(result)

    def test_one_of_no_match(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValueError):
            field.validate("string", strict=True)

    def test_one_of_multiple_matches(self):
        field = OneOf([NeverMatch(), NeverMatch()])
        with self.assertRaises(ValueError):
            field.validate(None, strict=True)

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        field = AllOf([NeverMatch(), NeverMatch()])
        result = field.validate(None, strict=True)
        self.assertIsNone(result)

class TestNot(unittest.TestCase):
    def test_not_match(self):
        field = Not(NeverMatch())
        result = field.validate(None, strict=True)
        self.assertIsNone(result)

    def test_not_no_match(self):
        field = Not(NeverMatch())
        with self.assertRaises(ValueError):
            field.validate("string", strict=True)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else_match(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        result = field.validate(None, strict=True)
        self.assertIsNone(result)

    def test_if_then_else_no_match(self):
        field = IfThenElse(NeverMatch(), then_clause=NeverMatch())
        with self.assertRaises(ValueError):
            field.validate("string", strict=True)

if __name__ == '__main__':
    unittest.main()