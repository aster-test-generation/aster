import unittest
from pytutils.trees import Tree, RegistryTree, tree


class TestTree(unittest.TestCase):
    def test_init(self):
        tree_instance = Tree()
        self.assertEqual(tree_instance.namespace, '')
        self.assertIsNone(tree_instance.get_data()

    def test_update(self):
        tree_instance = Tree()
        tree_instance.update({'a': 1, 'b': 2})
        self.assertEqual(tree_instance['a'], 1)
        self.assertEqual(tree_instance['b'], 2)

    def test_setitem(self):
        tree_instance = Tree()
        tree_instance['a'] = 1
        self.assertEqual(tree_instance['a'], 1)

    def test_getitem(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(tree_instance[0]['a'], 1
        self.assertEqual(tree_instance['b'], 2)

    def test_getitem_default(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(tree_instance.get('c', 'default'), 'c'

    def test_namespace_key(self):
        tree_instance = Tree()
        self.assertEqual(tree_instance._namespace_key('a'), 'a')
        self.assertEqual(tree_instance._namespace_key('a', namespace='namespace'), 'namespace:a')

    def test_str(self):
        tree_instance = Tree()
        self.assertEqual(str(tree_instance), 'Tree')

    def test_repr(self):
        tree_instance = Tree()
        self.assertEqual(repr(tree_instance), "Tree(<class 'pytutils.trees.Tree'>, {})"

    def test_eq(self):
        tree_instance1 = Tree({'a': 1, 'b': 2})
        tree_instance2 = Tree({'a': 1, 'b': 2})
        self.assertEqual(tree_instance1, tree_instance2)

class TestRegistryTree(unittest.TestCase):
    def test_register(self):
        registry_tree = RegistryTree()
        registry_tree['a'] = 1
        self.assertEqual(registry_tree['a'], 1)

    def test_register_namespace(self):
        registry_tree = RegistryTree()
        registry_tree['namespace:a'] = 1
        self.assertEqual(registry_tree['namespace:a'], 1)

    def test_get(self):
        registry_tree = RegistryTree({'a': 1, 'b': 2})
        self.assertEqual(registry_tree.get('a'), 1)
        self.assertEqual(registry_tree.get('c', 'default'), 'default')

if __name__ == '__main__':
    unittest.main()