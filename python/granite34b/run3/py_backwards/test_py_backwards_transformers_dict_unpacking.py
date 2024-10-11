import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_none(self):
        pairs = [(1, 2), (None, 3), (4, 5), (None, 6)]
        expected = [[(1, 2)], 3, [(4, 5)], 6]
        transformer = DictUnpackingTransformer()
        result = transformer._split_by_none(pairs)
        self.assertEqual(result, expected)

    def test_prepare_splitted(self):
        splitted = [[(1, 2)], 3, [(4, 5)], 6]
        expected = [ast.Dict(keys=[ast.Num(n=1)], values=[ast.Num(n=2)]),
                    ast.Num(n=3),
                    ast.Dict(keys=[ast.Num(n=4)], values=[ast.Num(n=5)]),
                    ast.Num(n=6)]
        transformer = DictUnpackingTransformer()
        result = transformer._prepare_splitted(splitted)
        self.assertEqual(list(result), expected)

    def test_merge_dicts(self):
        xs = [ast.Dict(keys=[ast.Num(n=1)], values=[ast.Num(n=2)]),
              ast.Dict(keys=[ast.Num(n=3)], values=[ast.Num(n=4)])]
        expected = ast.Call(
            func=ast.Name(id='_py_backwards_merge_dicts'),
            args=[ast.List(elts=xs)],
            keywords=[])
        transformer = DictUnpackingTransformer()
        result = transformer._merge_dicts(xs)
        self.assertEqual(result, expected)

    def test_visit_module(self):
        module = ast.parse('x = 1')
        expected = ast.parse('x = 1')
        transformer = DictUnpackingTransformer()
        result = transformer.visit(module)
        self.assertEqual(result, expected)

    def test_visit_dict(self):
        module = ast.parse('x = {1: 2}')
        expected = ast.parse('_py_backwards_merge_dicts([dict({1: 2})])')
        transformer = DictUnpackingTransformer()
        result = transformer.visit(module)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()