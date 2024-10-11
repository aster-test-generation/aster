import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertEqual(pattern.content, None)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, 1)
        self.assertEqual(pattern.name, None)

    def test_optimize(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern.content, None)
        self.assertEqual(optimized_pattern.min, 0)
        self.assertEqual(optimized_pattern.max, 1)
        self.assertEqual(optimized_pattern.name, None)

    def test_match(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern.match(None))

    def test_match_seq(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern.match_seq(None))

    def test_generate_matches(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern.generate_matches(None))

    def test__bare_name_matches(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern._bare_name_matches(None))

    def test__recursive_matches(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern._recursive_matches(None, 0))

    def test__iterative_matches(self):
        pattern = WildcardPattern(content=None, min=0, max=1, name=None)
        self.assertFalse(pattern._iterative_matches(None))

if __name__ == '__main__':
    unittest.main()