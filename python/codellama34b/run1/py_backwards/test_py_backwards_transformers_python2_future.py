import unittest
from py_backwards.transformers.python2_future import *


class TestPython2FutureTransformer(unittest.TestCase):
    def test_visit_Module(self):
        instance = Python2FutureTransformer(tree)
        node = ast.Module()
        result = instance.visit_Module(node)
        self.assertIsInstance(result, ast.Module)

    def test_target(self):
        instance = Python2FutureTransformer(tree)
        result = instance.target
        self.assertEqual(result, (2, 7))

if __name__ == '__main__':
    unittest.main()