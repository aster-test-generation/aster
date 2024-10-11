import collections
import unittest
from pytutils.trees import get_tree_node, set_tree_node, tree, Tree, RegistryTree


class TestTreeNode(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = {'a': {'b': 1}}
        self.assertEqual(get_tree_node(mapping, 'a:b'), [1])

    def test_set_tree_node(self):
        mapping = tree()
        set_tree_node(mapping, 'a:b', 1)
        self.assertEqual(mapping['a']['b'], 1)

class TestTree(unittest.TestCase):
    def test_tree_init(self):
        t = Tree()
        self.assertIsInstance(t, collections.defaultdict)

    def test_tree_setitem(self):
        t = Tree()
        t['a:b'] = 1
        self.assertEqual(t['a']['b'], 1)

    def test_tree_getitem(self):
        t = Tree()
        t['a:b'] = '1'
        self.assertEqual(t['a:b'], 1)

    def test_tree_register(self):
        t = RegistryTree()
        t.register('a:b', 1)
        self.assertEqual(t['a']['b'], 1)

if __name__ == '__main__':
    unittest.main()