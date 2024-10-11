import unittest
from typesystem.composites import *


class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        instance = NeverMatch()
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestOneOf(unittest.TestCase):
    def test_one_of(self):
        instance = OneOf(one_of=[1, 2, 3])
        result = instance.validate_or_error(1)
        self.assertEqual(result, 1)

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        instance = AllOf(all_of=[1, 2, 3])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNot(unittest.TestCase):
    def test_not(self):
        instance = Not(negated=1)
        result = instance.validate_or_error(1)
        self.assertEqual(result, 1)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else(self):
        instance = IfThenElse(if_clause=1, then_clause=2, else_clause=3)
        result = instance.validate_or_error(1)
        self.assertEqual(result, 1)

class TestOneOf(unittest.TestCase):
    def test_one_of(self):
        instance = OneOf(one_of=[Any()])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        instance = AllOf(all_of=[Any()])
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNot(unittest.TestCase):
    def test_not(self):
        instance = Not(negated=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else(self):
        instance = IfThenElse(if_clause=Any(), then_clause=Any(), else_clause=Any())
        result = instance.validate(1)
        self.assertEqual(result, 1)

class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        instance = NeverMatch()
        result = instance.validate("")
        self.assertEqual(result, "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_one_of(self):
        instance = OneOf(one_of=[])
        result = instance.validate("")
        self.assertEqual(result, "Did not match any valid type.")

    def test_multiple_matches(self):
        instance = OneOf(one_of=[])
        result = instance.validate("")
        self.assertEqual(result, "Matched more than one type.")

class TestAllOf(unittest.TestCase):
    def test_all_of(self):
        instance = AllOf(all_of=[])
        result = instance.validate("")
        self.assertEqual(result, "")

class TestNot(unittest.TestCase):
    def test_negated(self):
        instance = Not(negated=Any())
        result = instance.validate("")
        self.assertEqual(result, "Must not match.")

class TestIfThenElse(unittest.TestCase):
    def test_if_clause(self):
        instance = IfThenElse(if_clause=Any())
        result = instance.validate("")
        self.assertEqual(result, "")

    def test_then_clause(self):
        instance = IfThenElse(if_clause=Any(), then_clause=Any())
        result = instance.validate("")
        self.assertEqual(result, "")

    def test_else_clause(self):
        instance = IfThenElse(if_clause=Any(), else_clause=Any())
        result = instance.validate("")
        self.assertEqual(result, "")

if __name__ == '__main__':
    unittest.main()