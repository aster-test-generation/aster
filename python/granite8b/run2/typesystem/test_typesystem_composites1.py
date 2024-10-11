import unittest
from typesystem.composites import NeverMatch, OneOf, AllOf, Not, IfThenElse

class TestNeverMatch(unittest.TestCase):
    def test_validate(self):
        never_match = NeverMatch()
        with self.assertRaises(ValueError) as cm:
            never_match.validate(1)
        self.assertEqual(str(cm.exception), "This never validates.")

    def test_validate_or_error(self):
        never_match = NeverMatch()
        value, error = never_match.validate_or_error(1)
        self.assertIsNone(value)
        self.assertEqual(error, "This never validates.")

class TestOneOf(unittest.TestCase):
    def test_validate(self):
        one_of = OneOf([NeverMatch(), AllOf([Any(allow_none=True)])])
        self.assertEqual(one_of.validate(1), 1)
        self.assertEqual(one_of.validate(None), None)

    def test_validate_or_error(self):
        one_of = OneOf([NeverMatch(), AllOf([Any(allow_none=True)])])
        value, error = one_of.validate_or_error(1)
        self.assertEqual(value, 1)
        self.assertIsNone(error)
        value, error = one_of.validate_or_error(None)
        self.assertEqual(value, None)
        self.assertIsNone(error)

class TestAllOf(unittest.TestCase):
    def test_validate(self):
        all_of = AllOf([NeverMatch(), AllOf([Any(allow_none=True)])])
        self.assertEqual(all_of.validate(1), 1)
        self.assertEqual(all_of.validate(None), None)

    def test_validate_or_error(self):
        all_of = AllOf([NeverMatch(), AllOf([Any(allow_none=True)])])
        value, error = all_of.validate_or_error(1)
        self.assertEqual(value, 1)
        self.assertIsNone(error)
        value, error = all_of.validate_or_error(None)
        self.assertEqual(value, None)
        self.assertIsNone(error)

class TestNot(unittest.TestCase):
    def test_validate(self):
        not_ = Not(NeverMatch())
        with self.assertRaises(ValueError) as cm:
            not_.validate(1)
        self.assertEqual(str(cm.exception), "Must not match.")

    def test_validate_or_error(self):
        not_ = Not(NeverMatch())
        value, error = not_.validate_or_error(1)
        self.assertIsNone(value)
        self.assertEqual(error, "Must not match.")

class TestIfThenElse(unittest.TestCase):
    def test_validate(self):
        if_then_else = IfThenElse(NeverMatch(), AllOf([Any(allow_none=True)]))
        self.assertEqual(if_then_else.validate(1), 1)
        self.assertEqual(if_then_else.validate(None), None)

    def test_validate_or_error(self):
        if_then_else = IfThenElse(NeverMatch(), AllOf([Any(allow_none=True)]))
        value, error = if_then_else.validate_or_error(1)
        self.assertEqual(value, 1)
        self.assertIsNone(error)
        value, error = if_then_else.validate_or_error(None)
        self.assertEqual(value, None)
        self.assertIsNone(error)

if __name__ == '__main__':
    unittest.main()