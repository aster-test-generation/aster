import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite


class TestBaseTransformer(unittest.TestCase):
    def test_base_transformer(self):
        instance = SubclassTransformer()
        self.assertIsNone(instance.target)

    def test_base_node_transformer(self):
        instance = BaseNodeTransformer(ast.parse(''))
        self.assertEqual(instance.dependencies, [])
        self.assertIsInstance(instance._tree, ast.AST)
        self.assertFalse(instance._tree_changed)

    def test_base_import_rewrite(self):
        instance = BaseImportRewrite(ast.parse(''))
        self.assertEqual(instance.rewrites, [])
        self.assertIsInstance(instance._tree, ast.AST)
        self.assertFalse(instance._tree_changed)

if __name__ == '__main__':
    unittest.main()