import unittest
from pytutils.trees import get_tree_node, set_tree_node, tree, Tree, RegistryTree


class TestGetTreeNode(unittest.TestCase):
    def test_get_tree_node_existing_key(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c'.split(':'))
        self.assertEqual(result, 1)

    def test_get_tree_node_non_existing_key_with_default(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:d'.split(':'), default=2)
        self.assertEqual(result, 2)

    def test_get_tree_node_non_existing_key_without_default(self):
        mapping = {'a': {'b': {'c': 1}}}
        with self.assertRaises(KeyError):
            get_tree_node(mapping, ['a', 'b', 'd'])

    def test_get_tree_node_with_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c'.split(':'), parent=True)
        self.assertEqual(result, {'c': 1})

class TestSetTreeNode(unittest.TestCase):
    def test_set_tree_node(self):
        mapping = {'a': {'b': {}}}
        result = set_tree_node(mapping, 'a:b:c', 1)
        self.assertEqual(result, {'c': 1})
        self.assertEqual(mapping['a']['b']['c'], 1)

class TestTree(unittest.TestCase):
    def test_tree(self):
        t = tree()
        t['a']['b']['c'] = 1
        self.assertEqual(t['a']['b']['c'], 1)

class TestTreeClass(unittest.TestCase):
    def test_init_with_initial(self):
        initial = {'a': 1}
        t = Tree(initial)
        self.assertEqual(t['a'], 1)

    def test_init_with_initial_is_ref(self):
        initial = {'a': 1}
        t = Tree(initial, initial_is_ref=True)
        self.assertEqual(t.data, True)

    def test_namespace_key(self):
        t = Tree(namespace='ns')
        result = t._namespace_key('key')
        self.assertEqual(result, 'ns:key')

    def test_setitem(self):
        t = Tree()
        t['a'] = 1
        self.assertEqual(t['a'], 1)

    def test_getitem_existing_key(self):
        t = Tree({'a': 1})
        self.assertEqual(t['a'], 1)

    def test_getitem_non_existing_key_with_default(self):
        t = Tree()
        self.assertEqual(t['a', 2], 2)

    def test_getitem_non_existing_key_without_default(self):
        t = Tree()
        with self.assertRaises(KeyError):
            t['a']

class TestRegistryTree(unittest.TestCase):
    def test_register(self):
        rt = RegistryTree()
        rt.register('a', 1)
        self.assertEqual(rt['a'], 1)

if __name__ == '__main__':
    unittest.main()