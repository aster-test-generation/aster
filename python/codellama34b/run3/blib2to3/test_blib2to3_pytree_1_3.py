import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        instance = WildcardPattern()
        self.assertIsInstance(instance, WildcardPattern)

    def test_optimize(self):
        instance = WildcardPattern()
        result = instance.optimize()
        self.assertIsInstance(result, WildcardPattern)

    def test_match(self):
        instance = WildcardPattern()
        result = instance.match(None)
        self.assertIsInstance(result, bool)

    def test_match_seq(self):
        instance = WildcardPattern()
        result = instance.match_seq(None)
        self.assertIsInstance(result, bool)

    def test_generate_matches(self):
        instance = WildcardPattern()
        result = instance.generate_matches(None)
        self.assertIsInstance(result, Iterator)

    def test_recursive_matches(self):
        instance = WildcardPattern()
        result = instance.recursive_matches(None, 0)
        self.assertIsInstance(result, Iterator)

    def test_bare_name_matches(self):
        instance = WildcardPattern()
        result = instance.bare_name_matches(None)
        self.assertIsInstance(result, Tuple)

    def test_iterative_matches(self):
        instance = WildcardPattern()
        result = instance.iterative_matches(None)
        self.assertIsInstance(result, Iterator)


if __name__ == '__main__':
    unittest.main()