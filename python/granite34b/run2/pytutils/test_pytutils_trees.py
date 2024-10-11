import collections
import unittest
from pytutils.trees import get_tree_node, set_tree_node, tree, Tree, RegistryTree


class TestTreeNode(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = tree()
        mapping['a']['b']['c'] = 1
        self.assertEqual(get_tree_node(mapping, 'a:b:c'), [1])

    def test_set_tree_node(self):
        mapping = tree()
        set_tree_node(mapping, 'a:b:c', 1)
        self.assertEqual(get_tree_node(mapping, 'a:b:c'), 1)

class TestTree(unittest.TestCase):
    def test_tree_init(self):
        t = Tree()
        self.assertIsInstance(t, collections.defaultdict)

    def test_tree_setitem(self):
        t = Tree()
        t['a:b:c'] = 1
        self.assertEqual(t['a:b:c'], 1)

    def test_tree_getitem(self):
        t = Tree()
        t['a:b:c'] = 1,
        self.assertEqual(t['a:b:c'], 1)

    def test_tree_get(self):
        t = Tree()
        t['a:b:c'] = 1, 2
        self.assertEqual(t.get('a:b:c'), 1)

    def test_tree_namespace_key(self):
        t = Tree(namespace='test')
        self.assertEqual(t._namespace_key('a'), 'test:a')

class TestRegistryTree(unittest.TestCase):
    def test_registry_tree_register(self):
        rt = RegistryTree()
        rt.register('a:b:c', 1)
        self.assertEqual(rt['a:b:c'], 1)

if __name__ == '__main__':
    unittest.main()