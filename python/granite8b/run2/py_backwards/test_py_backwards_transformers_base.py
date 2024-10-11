import ast
import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer, BaseImportRewrite


class TestBaseTransformer(unittest.TestCase):
    def test_base_transformer(self):
        class CustomTransformer(BaseTransformer):
            @classmethod
            def transform(cls, tree):
                pass
        instance = CustomTransformer()
        self.assertIsInstance(instance, BaseTransformer)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_base_node_transformer(self):
        class CustomNodeTransformer(BaseNodeTransformer):
            @classmethod
            def transform(cls, tree):
                pass
        instance = CustomNodeTransformer(ast.AST())
        self.assertIsInstance(instance, BaseNodeTransformer)
        self.assertIsInstance(instance, ast.NodeTransformer)

class TestBaseImportRewrite(unittest.TestCase):
    def test_base_import_rewrite(self):
        class CustomImportRewrite(BaseImportRewrite):
            rewrites = []
        instance = CustomImportRewrite(ast.AST())
        self.assertIsInstance(instance, BaseImportRewrite)
        self.assertIsInstance(instance, BaseNodeTransformer)

if __name__ == '__main__':
    unittest.main()