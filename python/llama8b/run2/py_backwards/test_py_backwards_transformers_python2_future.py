import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.python2_future import Python2FutureTransformer
        self.assertIn("from future import absolute_import", result.body[0].s)

    def test_imports(self):
        self.assertIn("from future import absolute_import", imports)
        self.assertIn("from future import division", imports)
        self.assertIn("from future import print_function", imports)
        self.assertIn("from future import unicode_literals", imports)

    def test_get_body(self):
        self.assertIn("from future import absolute_import", body)
        self.assertIn("from future import division", body)
        self.assertIn("from future import print_function", body)
        self.assertIn("from future import unicode_literals", body)

    def test_init(self):


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = Python2FutureTransformer()
        node = ast.parse("import sys")
        result = transformer.visit_Module(node)
        self.assertTrue(result.body)
        imports = Python2FutureTransformer.imports("future")
        body = Python2FutureTransformer.get_body("future")
        transformer = Python2FutureTransformer()
        self.assertEqual(transformer.target, (2, 7))

    def test_str(self):
        transformer = Python2FutureTransformer()
        result = str(transformer)
        self.assertEqual(result, "Python2FutureTransformer")

    def test_repr(self):
        transformer = Python2FutureTransformer()
        result = repr(transformer)
        self.assertEqual(result, "Python2FutureTransformer((2, 7))")

if __name__ == '__main__':
    unittest.main()