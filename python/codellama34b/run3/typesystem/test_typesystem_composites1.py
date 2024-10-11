import unittest
from typesystem.composites import *

class TestNeverMatch(unittest.TestCase):
    def test_never_match(self):
        instance = NeverMatch()
        result = instance.validate(1)
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

if __name__ == '__main__':
    unittest.main()