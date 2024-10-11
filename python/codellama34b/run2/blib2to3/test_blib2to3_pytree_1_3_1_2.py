import unittest
from blib2to3.pytree import *


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        instance = BasePattern()
        self.assertIsInstance(instance, BasePattern)

    def test_new(self):
        instance = BasePattern()
        self.assertIsInstance(instance, BasePattern)

    def test_repr(self):
        instance = BasePattern()
        result = instance.__repr__()
        self.assertEqual(result, 'BasePattern(None, None, None)')

    def test_submatch(self):
        instance = BasePattern()
        node = Node(1, 'test')
        result = instance._submatch(node)
        self.assertEqual(result, False)

    def test_optimize(self):
        instance = BasePattern()
        result = instance.optimize()
        self.assertIsInstance(result, BasePattern)

    def test_match(self):
        instance = BasePattern()
        node = Node(1, 'test')
        result = instance.match(node)
        self.assertEqual(result, False)

    def test_match_seq(self):
        instance = BasePattern()
        node = Node(1, 'test')
        result = instance.match_seq([node])
        self.assertEqual(result, False)

    def test_generate_matches(self):
        instance = BasePattern()
        node = Node(1, 'test')
        result = instance.generate_matches([node])
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()