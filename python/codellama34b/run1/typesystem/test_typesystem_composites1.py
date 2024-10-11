
import unittest
from typesystem.composites import *

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