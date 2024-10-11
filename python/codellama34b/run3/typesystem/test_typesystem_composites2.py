import unittest
from typesystem.composites import *

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