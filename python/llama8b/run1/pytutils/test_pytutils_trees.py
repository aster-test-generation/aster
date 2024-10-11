import unittest
from pytutils.trees import Tree, RegistryTree, tree


class TestTree(unittest.TestCase):
    def test_tree_init(self):
        tree_instance = Tree()
        self.assertEqual(tree_instance.namespace, '')

    def test_tree_update(self):
        tree_instance = Tree()
        tree_instance.update({'a': 1, 'b': 2})
        self.assertEqual(tree_instance['a'], 1)
        self.assertEqual(tree_instance['b'], 2)

    def test_tree_setitem(self):
        tree_instance = Tree()
        tree_instance['a'], = (1,
        self.assertEqual(tree_instance['a'], 1)

    def test_tree_getitem(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(tree_instance[0]['a'], 1
        self.assertEqual(tree_instance['b'], 2)

    def test_tree_getitem_default(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(tree_instance.get('c', 'default'), 'c'

    def test_tree_namespace_key(self):
        tree_instance = Tree()
        self.assertEqual(tree_instance._namespace_key('a'), 'a')
        self.assertEqual(tree_instance._namespace_key('a', namespace='namespace'), 'namespace:a')

    def test_tree_str(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(str(tree_instance), 'Tree')

    def test_tree_repr(self):
        tree_instance = Tree({'a': 1, 'b': 2})
        self.assertEqual(repr(tree_instance), "Tree({'a': 1, 'b': 2})"

class TestRegistryTree(unittest.TestCase):
    def test_registry_tree_init(self):
        registry_tree_instance = RegistryTree()
        self.assertEqual(registry_tree_instance.namespace, '')

    def test_registry_tree_setitem(self):
        registry_tree_instance = RegistryTree()
        registry_tree_instance['a'] = 1
        self.assertEqual(registry_tree_instance['a'], 1)

    def test_registry_tree_getitem(self):
        registry_tree_instance = RegistryTree({'a': 1, 'b': 2})
        self.assertEqual(registry_tree_instance['a'], 1)
        self.assertEqual(registry_tree_instance['b'], 2)

    def test_registry_tree_getitem_default(self):
        registry_tree_instance = RegistryTree({'a': 1, 'b': 2})
        self.assertEqual(registry_tree_instance.get('c', 'default'), 'default')

if __name__ == '__main__':
    unittest.main()