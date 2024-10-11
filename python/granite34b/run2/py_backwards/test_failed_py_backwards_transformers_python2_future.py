import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer
from typed_ast import ast3 as ast

class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        node = ast.Module(body=[])
        transformer = Python2FutureTransformer(tree=None)
        result = transformer.visit_Module(node)
        self.assertEqual(len(result.body), 4)
        self.assertEqual(result.body[0].names[0].name, 'absolute_import')
        self.assertEqual(result.body[1].names[0].name, 'division')
        self.assertEqual(result.body[2].names[0].name, 'print_function')
        self.assertEqual(result.body[3].names[0].name, 'unicode_literals')

if __name__ == '__main__':
    unittest.main()