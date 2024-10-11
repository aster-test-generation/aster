import unittest
from blib2to3.pytree import BasePattern, WildcardPattern, NodePattern, generate_matche


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        instance = WildcardPattern()
        self.assertIsNotNone(instance)

    def test_optimize(self):
        instance = WildcardPattern()
        result = instance.optimize()
        self.assertEqual(result, instance)

    def test_match(self):
        instance = WildcardPattern()
        result = instance.match(None)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = WildcardPattern()
        result = instance.match_seq([])
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = WildcardPattern()
        result = list(instance.generate_matches([]))
        self.assertEqual(result, [])

    def test_iterative_matches(self):
        instance = WildcardPattern()
        result = list(instance._iterative_matches([]))
        self.assertEqual(result, [(0, {})])

    def test_bare_name_matches(self):
        instance = WildcardPattern()
        result = instance._bare_name_matches([])
        self.assertEqual(result, (0, {}))

    def test_recursive_matches(self):
        instance = WildcardPattern()
        result = list(instance._recursive_matches([], 0))
        self.assertEqual(result, [(0, {})])

    def test_private_init(self):
        instance = WildcardPattern()
        result = instance._WildcardPattern__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = WildcardPattern()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = WildcardPattern()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = WildcardPattern()
        instance2 = WildcardPattern()
        result = instance1 == instance2
        self.assertTrue(result)

class TestNodePattern(unittest.TestCase):
    def test_init(self):
        instance = NodePattern()
        self.assertIsNotNone(instance)

    def test_optimize(self):
        instance = NodePattern()
        result = instance.optimize()
        self.assertEqual(result, instance)

    def test_match(self):
        instance = NodePattern()
        result = instance.match(None)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = NodePattern()
        result = instance.match_seq([])
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = NodePattern()
        result = list(instance.generate_matches([]))
        self.assertEqual(result, [])

    def test_private_init(self):
        instance = NodePattern()
        result = instance._NodePattern__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = NodePattern()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NodePattern()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NodePattern()
        instance2 = NodePattern()
        result = instance1 == instance2
        self.assertTrue(result)

class TestGenerateMatches(unittest.TestCase):
    def test_generate_matches(self):
        result = list(generate_matches([], []))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()