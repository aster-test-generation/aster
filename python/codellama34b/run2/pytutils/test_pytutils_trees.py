import unittest
from pytutils.trees import *



class TestGetTreeNode(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c'.split(':'))
        self.assertEqual(result, 1)

    def test_get_tree_node_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c', parent=False)
        self.assertEqual(result, {'c': 1})

    def test_get_tree_node_default(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:d', default=2)
        self.assertEqual(result, 2)

    def test_get_tree_node_default_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:d', default=2, parent=True)
        self.assertEqual(result, {'c': 1})

class TestSetTreeNode(unittest.TestCase):
    def test_set_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = set_tree_node(mapping, 'a:b:c', 2)
        self.assertEqual(result, {'c': 2})

    def test_set_tree_node_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = set_tree_node(mapping, 'a:b:c', 2, parent=True)
        self.assertEqual(result, {'b': {'c': 2}})

class TestTree(unittest.TestCase):
    def test_tree(self):
        result = tree()
        self.assertIsInstance(result, collections.defaultdict)

    def test_tree_init(self):
        result = Tree()
        self.assertIsInstance(result, collections.defaultdict)

    def test_tree_init_initial(self):
        initial = {'a': {'b': {'c': 1}}}
        result = Tree(initial)
        self.assertIsInstance(result, collections.defaultdict)
        self.assertEqual(result['a']['b']['c'], 1)

    def test_tree_init_initial_is_ref(self):
        initial = {'a': {'b': {'c': 1}}}
        result = Tree(initial, initial_is_ref=True)
        self.assertIsInstance(result, collections.defaultdict)
        self.assertEqual(result['a']['b']['c'], 1)

    def test_tree_init_namespace(self):
        result = Tree(namespace='a')
        self.assertIsInstance(result, collections.defaultdict)
        self.assertEqual(result.namespace, 'a')

    def test_tree_setitem(self):
        result = Tree()
        result['a:b:c'] = 1
        self.assertEqual(result['a']['b']['c'], 1)

    def test_tree_setitem_namespace(self):
        result = Tree(namespace='a')
        result['b:c'] = 1
        self.assertEqual(result['a']['b']['c'], 1)

    def test_tree_getitem(self):
        result = Tree()
        result['a:b:c'] = 1
        self.assertEqual(result['a:b:c'], 1)

    def test_tree_getitem_namespace(self):
        result = Tree(namespace='a')
        result['b:c'] = 1
        self.assertEqual(result['b:c'], 1)

    def test_tree_getitem_default(self):
        result = Tree()
        result['a:b:c'] = 1
        self.assertEqual(result['a:b:d', 2], 2)

if __name__ == '__main__':
    unittest.main()