import unittest
from blib2to3.pytree import BasePattern


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        pattern = BasePattern()
        self.assertIsNone(pattern.type)
        self.assertIsNone(pattern.content)
        self.assertIsNone(pattern.name)

    def test_repr(self):
        pattern = BasePattern()
        self.assertEqual(repr(pattern), 'BasePattern(None, None, None)')

    def test_submatch(self):
        pattern = BasePattern()
        self.assertFalse(pattern._submatch(None))

    def test_optimize(self):
        pattern = BasePattern()
        self.assertIs(pattern.optimize(), pattern)

    def test_match(self):
        pattern = BasePattern()
        self.assertFalse(pattern.match(None))

    def test_match_seq(self):
        pattern = BasePattern()
        self.assertFalse(pattern.match_seq([]))

    def test_generate_matches(self):
        pattern = BasePattern()
        self.assertEqual(list(pattern.generate_matches([])), [])

if __name__ == '__main__':
    unittest.main()