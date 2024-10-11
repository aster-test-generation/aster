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
        instance = OneOf(one_of=[Any()])
        with self.assertRaises(ValueError):
            instance.validate("1")

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
        instance = Not(negated=Any())
        result = instance.validate(2)
        self.assertEqual(result, 1)

class TestIfThenElse(unittest.TestCase):
    def test_if_then_else(self):
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

    def test_never_match_strict(self):
        instance = NeverMatch()
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_never_match_strict_error(self):
        instance = NeverMatch()
        result = instance.validate(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error(self):
        instance = NeverMatch()
        result = instance.validate_or_error(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_error(self):
        instance = NeverMatch()
        result = instance.validate_or_error(1)
        self.assertEqual(result, 1)

    def test_never_match_or_none(self):
        instance = NeverMatch()
        result = instance.validate_or_none(1)
        self.assertEqual(result, 1)

    def test_never_match_or_none_error(self):
        instance = NeverMatch()
        result = instance.validate_or_none(1)
        self.assertEqual(result, 1)

    def test_never_match_or_empty(self):
        instance = NeverMatch()
        result = instance.validate_or_empty(1)
        self.assertEqual(result, 1)

    def test_never_match_or_empty_error(self):
        instance = NeverMatch()
        result = instance.validate_or_empty(1)
        self.assertEqual(result, 1)

    def test_never_match_or_empty_list(self):
        instance = NeverMatch()
        result = instance.validate_or_empty_list(1)
        self.assertEqual(result, 1)

    def test_never_match_or_empty_list_error(self):
        instance = NeverMatch()
        result = instance.validate_or_empty_list(1)
        self.assertEqual(result, 1)

    def test_never_match_or_default(self):
        instance = NeverMatch()
        result = instance.validate_or_default(1)
        self.assertEqual(result, 1)

    def test_never_match_or_default_error(self):
        instance = NeverMatch()
        result = instance.validate_or_default(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_detail(self):
        instance = NeverMatch()
        result = instance.validate_or_error_detail(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_detail_error(self):
        instance = NeverMatch()
        result = instance.validate_or_error_detail(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_detail_many(self):
        instance = NeverMatch()
        result = instance.validate_or_error_detail_many(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_detail_many_error(self):
        instance = NeverMatch()
        result = instance.validate_or_error_detail_many(1)
        self.assertEqual(result, 1)

    def test_never_match_or_error_detail_many_many(self):
        instance = NeverMatch()
        result = instance.validate_or_error_detail_many_many(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()