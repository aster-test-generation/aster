import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.python2_future import Python2FutureTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = Python2FutureTransformer(tree)

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertTrue(self.transformer._tree_changed)
        self.assertGreater(len(result.body), 0)

    def test_imports_snippet(self):
        future_imports = [
            'from __future__ import absolute_import',
            'from __future__ import division',
            'from __future__ import print_function',
            'from __future__ import unicode_literals'
        ]
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        import_statements = [stmt for stmt in result.body if isinstance(stmt, ast.ImportFrom)]
        import_sources = [f"from {stmt.module} import {stmt.names[0].name}" for stmt in import_statements]
        self.assertEqual(import_sources, future_imports)

    def test_target_version(self):
        self.assertEqual(self.transformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()