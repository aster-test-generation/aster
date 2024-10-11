import unittest
from typesystem.composites import *


class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        instance = NeverMatch()
        with self.assertRaises(ValidationError):
            instance.validate(1)

class TestOneOf(unittest.TestCase):
    def test_one_of(self):
        instance = OneOf(one_of=[Any()])
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_no_match(self):
        instance = OneOf(one_of=[NeverMatch()])
        with self.assertRaises(ValidationError):
            instance.validate(1)

    def test_multiple_matches(self):
        instance = OneOf(one_of=[Any(), Any()])
        with self.assertRaises(ValidationError):
            instance.validate(1)

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        instance = AllOf(all_of=[Any()])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNot(unittest.TestCase):
    def test_not(self):
        instance = Not(negated=NeverMatch())
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_negated(self):
        instance = Not(negated=Any())
        with self.assertRaises(ValidationError):
            instance.validate(1)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else(self):
        instance = IfThenElse(if_clause=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_if_then_else_then_clause(self):
        instance = IfThenElse(if_clause=Any(), then_clause=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_if_then_else_else_clause(self):
        instance = IfThenElse(if_clause=Any(), else_clause=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_if_then_else_then_else_clause(self):
        instance = IfThenElse(if_clause=Any(), then_clause=Any(), else_clause=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        instance = NeverMatch()
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_never_match_error(self):
        instance = NeverMatch()
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestOneOf(unittest.TestCase):
    def test_one_of(self):
        instance = OneOf(one_of=[])
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_one_of_error(self):
        instance = OneOf(one_of=[])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        instance = AllOf(all_of=[])
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_all_of_error(self):
        instance = AllOf(all_of=[])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNot(unittest.TestCase):
    def test_not(self):
        instance = Not(negated=None)
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_not_error(self):
        instance = Not(negated=None)
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else(self):
        instance = IfThenElse(if_clause=None, then_clause=None, else_clause=None)
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_if_then_else_error(self):
        instance = IfThenElse(if_clause=None, then_clause=None, else_clause=None)
        result = instance.validate(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()