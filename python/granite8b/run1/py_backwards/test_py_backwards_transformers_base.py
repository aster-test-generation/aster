import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite


class TestBaseTransformer(unittest.TestCase):
    def test_base_transformer(self):
        instance = SubclassTransformer()
        self.assertIsNone(instance.target)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_base_node_transformer(self):
        instance = BaseNodeTransformer(ast.parse(''))
        self.assertIsInstance(instance, BaseTransformer)
        self.assertIsInstance(instance, ast.NodeTransformer)

class TestBaseImportRewrite(unittest.TestCase):
    def test_base_import_rewrite(self):
        instance = BaseImportRewrite(ast.parse(''))
        self.assertIsInstance(instance, BaseNodeTransformer)
        self.assertEqual(instance.rewrites, [])

if __name__ == '__main__':
    unittest.main()