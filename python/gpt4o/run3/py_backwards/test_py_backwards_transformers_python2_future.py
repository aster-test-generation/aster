import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.python2_future import Python2FutureTransformer, imports


class TestPython2FutureTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = Python2FutureTransformer(tree=None)

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertIsInstance(result, ast.Module)
        self.assertTrue(self.transformer._tree_changed)
        self.assertGreater(len(result.body), 0)

    def test_imports_snippet(self):
        future_imports = imports.get_body(future='__future__')
        self.assertIsInstance(future_imports, list)
        self.assertGreater(len(future_imports), 0)
        self.assertTrue(all(isinstance(stmt, ast.ImportFrom) for stmt in future_imports))

    def test_target_version(self):
        self.assertEqual(self.transformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()