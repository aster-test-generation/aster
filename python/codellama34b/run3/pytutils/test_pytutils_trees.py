import unittest
from pytutils.trees import *



class TestGetTreeNode(unittest.TestCase):
    def test_get_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, ['a', 'b', 'c'])
        self.assertEqual(result, 1)

    def test_get_tree_node_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c', parent=False)
        self.assertEqual(result, {'c': 1})

    def test_get_tree_node_default(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = get_tree_node(mapping, 'a:b:c:d', default=2)
        self.assertEqual(result, 2)

class TestSetTreeNode(unittest.TestCase):
    def test_set_tree_node(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = set_tree_node(mapping, 'a:b:c', 2)
        self.assertEqual(result, {'c': 2})

    def test_set_tree_node_parent(self):
        mapping = {'a': {'b': {'c': 1}}}
        result = set_tree_node(mapping, 'a:b:c', 2)
        self.assertEqual(result, {'c': 2})

class TestTree(unittest.TestCase):
    def test_tree(self):
        result = tree()
        self.assertEqual(result, collections.defaultdict(tree))

    def test_tree_initial(self):
        result = tree(initial={'a': {'b': {'c': 1}}})
        self.assertEqual(result, {'a': {'b': {'c': 1}}})

    def test_tree_namespace(self):
        result = tree(namespace='a')
        self.assertEqual(result, collections.defaultdict(tree))

    def test_tree_initial_is_ref(self):
        initial = {'a': {'b': {'c': 1}}}
        result = tree(initial=initial, initial_is_ref=True)
        self.assertEqual(result, initial)

    def test_tree_initial_is_ref_namespace(self):
        initial = {'a': {'b': {'c': 1}}}
        result = tree(initial=initial, initial_is_ref=True, namespace='a')
        self.assertEqual(result, initial)

    def test_tree_namespace_key(self):
        result = Tree(namespace='a')._namespace_key('b')
        self.assertEqual(result, 'a:b')

    def test_tree_namespace_key_namespace(self):
        result = Tree(namespace='a')._namespace_key('b', namespace='c')
        self.assertEqual(result, 'c:b')

    def test_tree_setitem(self):
        result = Tree()
        result['a:b:c'] = 1
        self.assertEqual(result, {'a': {'b': {'c': 1}}})

    def test_tree_setitem_namespace(self):
        result = Tree(namespace='a')
        result['b:c'] = 1
        self.assertEqual(result, {'a': {'b': {'c': 1}}})

    def test_tree_getitem(self):
        result = Tree({'a': {'b': {'c': 1}}})
        self.assertEqual(result['a:b:c'], 1)

    def test_tree_getitem_namespace(self):
        result = Tree({'a': {'b': {'c': 1}}}, namespace='a')
        self.assertEqual(result['b:c'], 1)

    def test_tree_getitem_default(self):
        result = Tree({'a': {'b': {'c': 1}}})
        self.assertEqual(result.get('a:b:c:d', 2), 2)

if __name__ == '__main__':
    unittest.main()