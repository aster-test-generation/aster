import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer
from typed_ast import ast3 as ast


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        node = ast.Module(body=[])
        transformer = Python2FutureTransformer(tree=None)
        result = transformer.visit_Module(node)
        self.assertEqual(result.body, [
            ast.ImportFrom(module='future', names=[ast.alias(name='absolute_import', asname=None)], level=0),
            ast.ImportFrom(module='future', names=[ast.alias(name='division', asname=None)], level=0),
            ast.ImportFrom(module='future', names=[ast.alias(name='print_function', asname=None)], level=0),
            ast.ImportFrom(module='future', names=[ast.alias(name='unicode_literals', asname=None)], level=0),
        ])

if __name__ == '__main__':
    unittest.main()