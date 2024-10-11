import unittest
from blib2to3.pytree import Node, Leaf, Pattern, NegatedPattern, BasePatter


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        instance = NegatedPattern()
        self.assertIsNone(instance.content)

    def test_init_with_content(self):
        content = BasePattern()
        instance = NegatedPattern(content)
        self.assertEqual(instance.content, content)

    def test_match(self):
        instance = NegatedPattern()
        node = object()
        results = {}
        self.assertFalse(instance.match(node, results))

    def test_match_seq(self):
        instance = NegatedPattern()
        nodes = []
        results = {}
        self.assertTrue(instance.match_seq(nodes, results))

    def test_generate_matches(self):
        instance = NegatedPattern()
        nodes = []
        matches = list(instance.generate_matches(nodes))
        self.assertEqual(len(matches), 1)
        self.assertEqual(matches[0], (0, {}))

    def test_generate_matches_with_content(self):
        content = BasePattern()
        instance = NegatedPattern(content)
        nodes = []
        matches = list(instance.generate_matches(nodes))
        self.assertEqual(len(matches), 0)

    def test_private_method__init__(self):
        instance = NegatedPattern()
        self.assertRaises(AttributeError, getattr, instance, '__init__')

    def test_str_method(self):
        instance = NegatedPattern()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NegatedPattern()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NegatedPattern()
        instance2 = NegatedPattern()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()