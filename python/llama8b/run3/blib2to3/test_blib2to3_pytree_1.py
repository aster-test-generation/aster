import unittest
from blib2to3.pytree import Grammar, NegatedPattern
from io import StringIO


class TestGrammar(unittest.TestCase):
    def test_init(self):
        grammar = Grammar()
        self.assertEqual(grammar.__class__, Grammar)

    def test_match(self):
        grammar = Grammar()
        pattern = NegatedPattern()
        result = pattern.match(None, None)
        self.assertFalse(result)

    def test_match_seq(self):
        grammar = Grammar()
        pattern = NegatedPattern()
        result = pattern.match_seq([], None)
        self.assertFalse(result)

    def test_generate_matches(self):
        grammar = Grammar()
        pattern = NegatedPattern()
        result = list(pattern.generate_matches([]))
        self.assertEqual(len(result), 1)

    def test_str(self):
        grammar = Grammar()
        result = str(grammar)
        self.assertEqual(result, "Grammar")

    def test_repr(self):
        grammar = Grammar()
        result = repr(grammar)
        self.assertEqual(result, "Grammar()")

    def test_eq(self):
        grammar1 = Grammar()
        grammar2 = Grammar()
        self.assertTrue(grammar1 == grammar2)

class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        pattern = NegatedPattern()
        self.assertEqual(pattern.content, None)

    def test_match(self):
        pattern = NegatedPattern()
        result = pattern.match(None, None)
        self.assertFalse(result)

    def test_match_seq(self):
        pattern = NegatedPattern()
        result = pattern.match_seq([], None)
        self.assertFalse(result)

    def test_generate_matches(self):
        pattern = NegatedPattern()
        result = list(pattern.generate_matches([]))
        self.assertEqual(len(result), 1)

    def test_str(self):
        pattern = NegatedPattern()
        result = str(pattern)
        self.assertEqual(result, "NegatedPattern")

    def test_repr(self):
        pattern = NegatedPattern()
        result = repr(pattern)
        self.assertEqual(result, "NegatedPattern()")

    def test_eq(self):
        pattern1 = NegatedPattern()
        pattern2 = NegatedPattern()
        self.assertTrue(pattern1 == pattern2)

if __name__ == '__main__':
    unittest.main()