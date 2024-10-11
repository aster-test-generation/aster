import unittest
from blib2to3.pytree import BasePattern


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        pattern = NegatedPattern()
        self.assertIsNone(pattern.content)

    def test_match(self):
        pattern = NegatedPattern()
        self.assertFalse(pattern.match(''))

    def test_match_seq(self):
        pattern = NegatedPattern()
        self.assertFalse(pattern.match_seq([]))

    def test_generate_matches(self):
        pattern = NegatedPattern()
        self.assertEqual(list(pattern.generate_matches([])), [])

if __name__ == '__main__':
    unittest.main()