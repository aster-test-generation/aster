import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer
from py_backwards.transformers.python2_future import imports
from typed_ast import ast3 as ast


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        instance = Python2FutureTransformer(tree)
        node = ast.Module()
        result = instance.visit_Module(node)
        self.assertIsInstance(result, ast.Module)

    def test_imports(self):
        result = imports.get_body(future='__future__')
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()