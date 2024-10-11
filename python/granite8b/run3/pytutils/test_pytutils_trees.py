import unittest
from pytutils.trees import Tree, RegistryTree


class TestTree(unittest.TestCase):
    def test_get_tree_node(self):
        tree = {'a': {'b': {'c': 1}}}
        self.assertEqual(get_tree_node(tree, 'a:b:c'), 3)
        self.assertEqual(get_tree_node(tree, 'a:b:d', default=2), 2)
        self.assertEqual(get_tree_node(tree, 'a:b:c', parent=True), {'c': 1})
        with self.assertRaises(KeyError):
            get_tree_node(tree, 'a:b:c:d')

    def test_set_tree_node(self):
        tree = {}
        set_tree_node(tree, 'a:b:c', 1)
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        set_tree_node(tree, 'a:b:d', 2)
        self.assertEqual(tree, {'a': {'b': {'c': 1, 'd': 2}}})

    def test_tree(self):
        tree = BinarySearchTree()
        self.assertEqual(tree, {})
        tree['a']['b']['c'] = 1
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})

    def test_tree_namespace(self):
        tree = Tree(namespace='a')
        tree['b']['c'] = 1
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        self.assertEqual(tree['b']['c'], 1)
        self.assertEqual(tree['a:b:c'], 1)
        with self.assertRaises(KeyError):
            tree['b']

    def test_registry_tree(self):
        tree = RegistryTree()
        tree.register('a:b:c', 1)
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        self.assertEqual(tree['a:b:c'], 1)
        self.assertEqual(tree['b']['c'], 1)
        with self.assertRaises(KeyError):
            tree['b']

if __name__ == '__main__':
    unittest.main()