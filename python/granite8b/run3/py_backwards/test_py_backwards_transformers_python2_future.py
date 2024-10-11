import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def test_imports(self):
        transformer = Python2FutureTransformer(tree)
        node = ast.parse('def test(): pass')
        node = transformer.visit(node)
        self.assertEqual(len(node.body), 4)
        self.assertEqual(node.body[0].__class__.__name__, 'ImportFrom')
        self.assertEqual(node.body[1].__class__.__name__, 'ImportFrom')
        self.assertEqual(node.body[2].__class__.__name__, 'ImportFrom')
        self.assertEqual(node.body[3].__class__.__name__, 'ImportFrom')

if __name__ == '__main__':
    unittest.main()