import unittest
from blib2to3.pytree import *


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        instance = BasePattern()
        self.assertIsInstance(instance, BasePattern)

    def test_new(self):
        instance = BasePattern()
        self.assertIsInstance(instance, BasePattern)

    def test_repr(self):
        instance = BasePattern()
        result = instance.__repr__()
        self.assertEqual(result, "BasePattern(None, None, None)")

    def test_submatch(self):
        instance = BasePattern()
        result = instance._submatch(None, None)
        self.assertEqual(result, NotImplemented)

    def test_optimize(self):
        instance = BasePattern()
        result = instance.optimize()
        self.assertIsInstance(result, BasePattern)

    def test_match(self):
        instance = BasePattern()
        result = instance.match(None, None)
        self.assertEqual(result, True)

    def test_match_seq(self):
        instance = BasePattern()
        result = instance.match_seq(None, None)
        self.assertEqual(result, False)

    def test_generate_matches(self):
        instance = BasePattern()
        result = instance.generate_matches(None)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()