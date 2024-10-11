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
        node = NodePattern(name='test')
        result = instance.match(node)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = WildcardPattern()
        nodes = [NodePattern(name='test')]
        result = instance.match_seq(nodes)
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = WildcardPattern()
        nodes = [NodePattern(name='test')]
        result = list(instance.generate_matches(nodes))
        self.assertEqual(len(result), 0)

    def test__iterative_matches(self):
        instance = WildcardPattern()
        nodes = [NodePattern(name='test')]
        result = list(instance._iterative_matches(nodes))
        self.assertEqual(len(result), 0)

    def test__bare_name_matches(self):
        instance = WildcardPattern(content=[('bare_name',)])
        nodes = [NodePattern(name='test')]
        result = instance._bare_name_matches(nodes)
        self.assertEqual(result, (1, {'bare_name': [nodes[0]]}))

    def test__recursive_matches(self):
        instance = WildcardPattern(content=[('test',)])
        nodes = [NodePattern(name='test')]
        result = list(instance._recursive_matches(nodes, 0))
        self.assertEqual(len(result), 0)

    def test_str(self):
        instance = WildcardPattern()
        result = str(instance)
        self.assertEqual(result, 'WildcardPattern')

    def test_repr(self):
        instance = WildcardPattern()
        result = repr(instance)
        self.assertEqual(result, 'WildcardPattern()')

class TestGenerateMatches(unittest.TestCase):
    def test_generate_matches(self):
        alt = [('test',)]
        nodes = [NodePattern(name='test')]
        result = list(generate_matches(alt, nodes))
        self.assertEqual(len(result), 1)

if __name__ == '__main__':
    unittest.main()