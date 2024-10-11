import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer
from typed_ast import ast3 as ast
from ...utils.snippet import snippet
from .base import BaseNodeTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def test_imports(self):
        future = 'absolute_import'
        node = ast.parse('import future')
        transformer = Python2FutureTransformer(future=future)
        transformed_node = transformer.visit(node)
        self.assertEqual(len(transformed_node.body), 2)
        self.assertIsInstance(transformed_node.body[0], ast.ImportFrom)
        self.assertEqual(transformed_node.body[0].module, 'future')
        self.assertEqual(transformed_node.body[0].names[0].name, future)
        self.assertIsInstance(transformed_node.body[1], ast.Import)
        self.assertEqual(transformed_node.body[1].names[0].name, 'future')

    def test_visit_Module(self):
        future = 'absolute_import'
        node = ast.parse('pass')
        transformer = Python2FutureTransformer(future=future)
        transformed_node = transformer.visit_Module(node)
        self.assertEqual(len(transformed_node.body), 2)
        self.assertIsInstance(transformed_node.body[0], ast.ImportFrom)
        self.assertEqual(transformed_node.body[0].module, 'future')
        self.assertEqual(transformed_node.body[0].names[0].name, future)
        self.assertIsInstance(transformed_node.body[1], ast.Pass)

if __name__ == '__main__':
    unittest.main()