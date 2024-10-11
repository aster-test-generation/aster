import unittest
from py_backwards.transformers.python2_future import Python2FutureTransformer


class TestPython2FutureTransformer(unittest.TestCase):
    def test_imports(self):
        future = '__future__'
        result = Python2FutureTransformer().visit_Module(ast.parse('', ''))
        expected = [
            ast.Import(
                names=[
                    ast.alias(name='absolute_import', asname=None),
                    ast.alias(name='division', asname=None),
                    ast.alias(name='print_function', asname=None),
                    ast.alias(name='unicode_literals', asname=None)
                ]
            )
        ]
        self.assertEqual(result.body, expected)

if __name__ == '__main__':
    unittest.main()