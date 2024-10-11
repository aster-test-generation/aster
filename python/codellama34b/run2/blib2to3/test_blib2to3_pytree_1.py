import unittest
from blib2to3.pytree import BasePattern


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        instance = NegatedPattern()
        self.assertIsInstance(instance, NegatedPattern)

    def test_match(self):
        instance = NegatedPattern()
        result = instance.match(None, None)
        self.assertEqual(result, False)

    def test_match_seq(self):
        instance = NegatedPattern()
        result = instance.match_seq(None, None)
        self.assertEqual(result, False)

    def test_generate_matches(self):
        instance = NegatedPattern()
        result = instance.generate_matches(None)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()