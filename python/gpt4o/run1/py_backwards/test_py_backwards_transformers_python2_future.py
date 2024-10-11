import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.python2_future import Python2FutureTransformer, imports


class TestPython2FutureTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = Python2FutureTransformer(tree=None)

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertTrue(self.transformer._tree_changed)
        self.assertTrue(any(isinstance(stmt, ast.ImportFrom) for stmt in result.body))

    def test_imports_snippet(self):
        snippet_body = imports.get_body(future='__future__')
        self.assertTrue(any(isinstance(stmt, ast.ImportFrom) for stmt in snippet_body))

    def test_target_version(self):
        self.assertEqual(self.transformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()