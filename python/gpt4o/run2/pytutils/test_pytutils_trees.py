import unittest
from pytutils.trees import *


class TestTreeFunctions(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, ['a', 'b', 'c'])
        self.assertEqual(result, 1)

    def test_get_tree_node_with_default(self):
        mapping = {'a': {'b': {}}}
        result = get_tree_node(mapping, 'a:b:c'.split(':'), default=2)
        self.assertEqual(result, 2)

    def test_get_tree_node_with_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c'.split(':'), parent=True)
        self.assertEqual(result, {'c': 1})

    def test_set_tree_node(self):
        mapping = {'a': {'b': {}}}
        result = set_tree_node(mapping, 'a:b', 1)
        self.assertEqual(result, {'c': 1})

    def test_tree(self):
        result = tree()
        self.assertIsInstance(result, collections.defaultdict)

class TestTreeClass(unittest.TestCase):
    def test_tree_init(self):
        t = Tree()
        self.assertIsInstance(t, Tree)

    def test_tree_init_with_initial(self):
        t = Tree(initial={'a': 1})
        self.assertEqual(t['a'], 1)

    def test_tree_init_with_namespace(self):
        t = Tree(namespace='ns')
        self.assertEqual(t.namespace, 'ns')

    def test_tree_namespace_key(self):
        t = Tree(namespace='ns')
        result = t._namespace_key('key')
        self.assertEqual(result, 'ns:key')

    def test_tree_setitem(self):
        t = Tree()
        t['a'] = 1
        self.assertEqual(t['a'], 1)

    def test_tree_getitem(self):
        t = Tree()
        t['a'] = 1
        result = t['a']
        self.assertEqual(result, 1)

    def test_tree_get(self):
        t = Tree()
        t['a'] = 1
        result = t.get('a')
        self.assertEqual(result, 1)

class TestRegistryTreeClass(unittest.TestCase):
    def test_registry_tree_init(self):
        rt = RegistryTree()
        self.assertIsInstance(rt, RegistryTree)

    def test_registry_tree_register(self):
        rt = RegistryTree()
        rt.register('a', 1)
        self.assertEqual(rt['a'], 1)

if __name__ == '__main__':
    unittest.main()