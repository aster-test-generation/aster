import unittest
from pytutils.trees import Tree, RegistryTree


class TestTree(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        self.assertEqual(get_tree_node(mapping, 'a:b:c'), 3)
        self.assertEqual(get_tree_node(mapping, 'a:b:c', default=42), 1)
        self.assertEqual(get_tree_node(mapping, 'a:b:d', default=42), 42)
        self.assertEqual(get_tree_node(mapping, 'a:b:d', default=42, parent=True), {'c': 1})
        with self.assertRaises(KeyError):
            get_tree_node(mapping, 'a:b:d', default=42, parent=True, raise_key_error=True)

    def test_set_tree_node(self):
        mapping = {}
        set_tree_node(mapping, 'a:b:c', 1)
        self.assertEqual(mapping, {'a': {'b': {'c': 1}}})
        set_tree_node(mapping, 'a:b:d', 2)
        self.assertEqual(mapping, {'a': {'b': {'c': 1, 'd': 2}}})

    def test_tree(self):
        tree = BinarySearchTree()
        tree['a:b:c'] = 1
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        self.assertEqual(tree['a:b:c'], 1)
        self.assertEqual(tree['a:b:d'], {})
        tree['a:b:d'] = 2
        self.assertEqual(tree, {'a': {'b': {'c': 1, 'd': 2}}})

    def test_tree_namespace(self):
        tree = Tree(namespace='a')
        tree['b:c'] = 1
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        self.assertEqual(tree['b:c'], 1)
        self.assertEqual(tree['b:d'], {})
        tree['b:d'] = 2
        self.assertEqual(tree, {'a': {'b': {'c': 1, 'd': 2}}})

    def test_tree_initial_is_ref(self):
        tree = Tree(initial={'a': {'b': {'c': 1}}}, initial_is_ref=True)
        tree['a:b:d'] = 2
        self.assertEqual(tree, {'a': {'b': {'c': 1, 'd': 2}}})
        self.assertEqual(tree['a:b:c'], 1)
        self.assertEqual(tree['a:b:d'], 2)

    def test_registry_tree(self):
        tree = RegistryTree()
        tree.register('a:b:c', 1)
        self.assertEqual(tree, {'a': {'b': {'c': 1}}})
        self.assertEqual(tree['a:b:c'], 1)
        self.assertEqual(tree['a:b:d'], {})
        tree.register('a:b:d', 2)
        self.assertEqual(tree, {'a': {'b': {'c': 1, 'd': 2}}})

if __name__ == '__main__':
    unittest.main()