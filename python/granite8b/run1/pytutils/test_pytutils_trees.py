import unittest
from pytutils.trees import Tree, RegistryTree


class TestTree(unittest.TestCase):
    def test_get_tree_node(self):
        tree = {'a': {'b': 1, 'c': 2}, 'd': 3}
        self.assertEqual(get_tree_node(tree, 'a:b'), 2)
        self.assertEqual(get_tree_node(tree, 'a:c'), 2)
        self.assertEqual(get_tree_node(tree, 'a:d'), 3)
        self.assertEqual(get_tree_node(tree, 'a:e', default=4), 4)
        self.assertEqual(get_tree_node(tree, 'a:b:c'), 1)
        self.assertEqual(get_tree_node(tree, 'a:b:c', parent=True), {'b': 1, 'c': 2})

    def test_set_tree_node(self):
        tree = {'a': {'b': 1, 'c': 2}, 'd': 3}
        set_tree_node(tree, 'a:b', 10)
        self.assertEqual(tree['a']['b'], 10)
        set_tree_node(tree, 'a:e', 4)
        self.assertEqual(tree['a']['e'], 4)
        set_tree_node(tree, 'a:b:c', 100)
        self.assertEqual(tree['a']['b']['c'], 100)

    def test_tree(self):
        tree = BinarySearchTree()
        self.assertIsInstance(tree, collections.defaultdict)
        self.assertEqual(tree['a'], tree)
        self.assertEqual(tree['a']['b'], tree['a']['b'])

    def test_tree_namespace(self):
        tree = Tree(namespace='a')
        self.assertEqual(tree['b'], tree['a:b'])
        self.assertEqual(tree['b']['c'], tree['a:b:c'])

    def test_tree_initial_is_ref(self):
        tree = Tree(initial={'a': 1, 'b': 2}, initial_is_ref=True)
        self.assertEqual(tree.get('a'), 1)
        self.assertEqual(tree['b'], 2)
        tree['a'] = 10
        self.assertEqual(tree['a'], 10)
        self.assertEqual(tree.data['a'], 10)

    def test_registry_tree(self):
        tree = RegistryTree()
        self.assertIsInstance(tree, Tree)
        self.assertEqual(tree.register, tree.__setitem__)

if __name__ == '__main__':
    unittest.main()