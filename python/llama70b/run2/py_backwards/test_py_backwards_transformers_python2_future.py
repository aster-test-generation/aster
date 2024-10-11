import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer, imports


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[])
        result = transformer.visit_Module(node)
        self.assertIsInstance(result, ast.Module)

    def test_generic_visit(self):
        transformer = Python2FutureTransformer()
        node = ast.Module(body=[])
        result = transformer.generic_visit(node)
        self.assertIsInstance(result, ast.Module)

    def test_tree_changed(self):
        transformer = Python2FutureTransformer()
        self.assertFalse(transformer._tree_changed)
        transformer.visit_Module(ast.Module(body=[]))
        self.assertTrue(transformer._tree_changed)

    def test_target(self):
        self.assertEqual(Python2FutureTransformer.target, (2, 7))

    def test___init__(self):
        transformer = Python2FutureTransformer()
        self.assertIsInstance(transformer, Python2FutureTransformer)

    def test___str__(self):
        transformer = Python2FutureTransformer()
        result = transformer.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        transformer = Python2FutureTransformer()
        result = transformer.__repr__()
        self.assertIsInstance(result, str)

class TestImports(unittest.TestCase):
    def test_get_body(self):
        result = imports.get_body(future='__future__')
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()