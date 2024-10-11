import unittest
from blib2to3.pytree import BasePattern, WildcardPattern, Grammar, NodePattern, generate_matche


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        instance = WildcardPattern()
        self.assertIsNotNone(instance.content)
        self.assertEqual(instance.min, 0)
        self.assertEqual(instance.max, HUGE)
        self.assertIsNone(instance.name)

    def test_optimize(self):
        instance = WildcardPattern()
        result = instance.optimize()
        self.assertEqual(result, instance)

    def test_match(self):
        instance = WildcardPattern()
        node = NodePattern()
        result = instance.match(node)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = WildcardPattern()
        nodes = [NodePattern()]
        result = instance.match_seq(nodes)
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = WildcardPattern()
        nodes = [NodePattern()]
        result = list(instance.generate_matches(nodes))
        self.assertEqual(len(result), 0)

    def test__bare_name_matches(self):
        instance = WildcardPattern(content=[('bare_name',)])
        nodes = [NodePattern()]
        result = instance._bare_name_matches(nodes)
        self.assertEqual(result, (1, {'bare_name': nodes}))

    def test__iterative_matches(self):
        instance = WildcardPattern(content=[('alt1',), ('alt2',)])
        nodes = [NodePattern()]
        result = list(instance._iterative_matches(nodes))
        self.assertEqual(len(result), 2)

    def test__recursive_matches(self):
        instance = WildcardPattern(content=[('alt1',), ('alt2',)])
        nodes = [NodePattern()]
        result = list(instance._recursive_matches(nodes, 0))
        self.assertEqual(len(result), 2)

    def test_str(self):
        instance = WildcardPattern()
        result = str(instance)
        self.assertEqual(result, 'WildcardPattern')

    def test_repr(self):
        instance = WildcardPattern()
        result = repr(instance)
        self.assertEqual(result, 'WildcardPattern()')

class TestNodePattern(unittest.TestCase):
    def test_init(self):
        instance = NodePattern()
        self.assertIsNone(instance.name)

    def test_match(self):
        instance = NodePattern()
        node = NodePattern()
        result = instance.match(node)
        self.assertTrue(result)

class TestGenerateMatches(unittest.TestCase):
    def test_generate_matches(self):
        alt = ('alt1',)
        nodes = [NodePattern()]
        result = list(generate_matches(alt, nodes))
        self.assertEqual(len(result), 1)

if __name__ == '__main__':
    unittest.main()