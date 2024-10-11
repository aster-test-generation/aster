import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer
    def test_replace_import_from_module(self):
        transformer = BaseNodeTransformer(None)
        result = transformer._replace_import_from_module(node, 'a.b', 'x.y')
        self.assertEqual(result.body[0].body[0].module, 'x.y.c')
    def test_get_replaced_import_from_part(self):
        transformer = BaseNodeTransformer(None)
        result = transformer._get_replaced_import_from_part(node, node.names[0], names_to_replace)
        self.assertEqual(result.module, 'x.y.c')


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        import ast
        result = BaseTransformer.transform(tree)
        self.assertEqual(result.transformed_tree, tree)
        self.assertFalse(result.transformed)
        self.assertEqual(result.dependencies, [])

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        import ast
        result = BaseNodeTransformer.transform(tree)
        self.assertEqual(result.transformed_tree, tree)
        self.assertFalse(result.transformed)
        self.assertEqual(result.dependencies, [])

    def test_init(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        self.assertEqual(transformer._tree, tree)
        self.assertFalse(transformer._tree_changed)

    def test_get_matched_rewrite(self):
        transformer = BaseNodeTransformer(None)
        self.assertIsNone(transformer._get_matched_node(None))
        self.assertIsNone(transformer._get_matched_rewrite(''))
        self.assertIsNone(transformer._get_matched_rewrite('a'))
        self.assertIsNone(transformer._get_matched_rewrite('a.b'))
        self.assertIsNone(transformer._get_matched_rewrite('a.b.c'))
        self.assertIsNone(transformer._get_matched_rewrite('a.b.c.d'))
        self.assertIsNone(transformer._get_matched_rewrite('a.b.c.d.e'))

    def test_replace_import(self):
        transformer = BaseNodeTransformer(None)
        node = ast.Import(names=[ast.alias(name='a.b.c', asname=None)])
        result = transformer._replace_import(node, 'a.b', 'x.y')
        self.assertEqual(result.body[0].body[0].names[0].name, 'x.y.c')
        self.assertEqual(result.body[0].body[0].names[0].asname, 'c')

        node = ast.ImportFrom(module='a.b.c', names=[], level=0)

    def test_get_names_to_replace(self):
        transformer = BaseNodeTransformer(None)
        node = ast.ImportFrom(module='a.b.c', names=[ast.alias(name='d', asname=None)], level=0)
        result = transformer._get_names_to_replace(node)
        self.assertEqual(list(result), [('a.b.c.d', ('a.b', 'x.y'))])

        node = ast.ImportFrom(module='a.b.c', names=[ast.alias(name='d', asname=None)], level=0)
        names_to_replace = {'a.b.c.d': ('a.b', 'x.y')}
        self.assertEqual(result.names[0].name, 'd')
        self.assertEqual(result.names[0].asname, 'd')

if __name__ == '__main__':
    unittest.main()