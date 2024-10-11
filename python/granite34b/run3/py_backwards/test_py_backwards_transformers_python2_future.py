import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = Python2FutureTransformer(tree=None)
        module = ast.parse("print('Hello, world!')")
        transformed_module = transformer.visit_Module(module)
        self.assertEqual(transformed_module.body[0].value.s, "Hello, world!")

if __name__ == '__main__':
    unittest.main()