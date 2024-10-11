import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer


class TestYieldFromTransformer(unittest.TestCase):
    def test_yield_from_transformer(self):
        tree = ast.parse('def f():\n    yield from [1, 2, 3]')
        node = ast.parse("def func(): yield from [1, 2, 3]")
        result = transformer.visit(node)
        expected = ast.parse("def func():\n    iterable = iter([1, 2, 3])\n    while True:\n        try:\n            yield next(iterable)\n        except StopIteration:\n            break")
        self.assertEqual(str(result), str(expected))

if __name__ == '__main__':
    unittest.main()