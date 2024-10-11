import unittest
from blib2to3.pytree import BasePattern


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        instance = NegatedPattern()
        self.assertIsInstance(instance, NegatedPattern)

    def test_match(self):
        instance = NegatedPattern()
        result = instance.match(None, None)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = NegatedPattern()
        result = instance.match_seq(None, None)
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = NegatedPattern()
        result = instance.generate_matches(None)
        self.assertIsInstance(result, Iterator)

if __name__ == '__main__':
    unittest.main()