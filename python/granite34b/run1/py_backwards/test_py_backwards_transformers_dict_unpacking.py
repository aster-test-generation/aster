import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer
from typed_ast import ast3 as ast


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_none(self):
        pairs = [(1, 2), (None, 3), (4, 5), (None, 6)]
        expected = [[(1, 2)], 3, [(4, 5)], 6]
        transformer = DictUnpackingTransformer(tree)
        result = transformer._split_by_none(pairs)
        self.assertEqual(result, expected)

    def test_prepare_splitted(self):
        splitted = [[(1, 2)], 3, [(4, 5)], 6]
        expected = [ast.Dict(keys=[ast.Num(1)], values=[ast.Num(2)]),
                    ast.Num(3),
                    ast.Dict(keys=[ast.Num(4)], values=[ast.Num(5)]),
                    ast.Num(6)]
        transformer = DictUnpackingTransformer(tree)
        result = list(transformer._prepare_splitted(splitted))
        self.assertEqual(result, expected)

    def test_merge_dicts(self):
        xs = [ast.Dict(keys=[ast.Num(1)], values=[ast.Num(2)]),
              ast.Dict(keys=[ast.Num(3)], values=[ast.Num(4)])]
        expected = ast.Call(
            func=ast.Name(id='_py_backwards_merge_dicts'),
            args=[ast.List(elts=xs)],
            keywords=[])
        transformer = DictUnpackingTransformer(tree=None)
        result = transformer._merge_dicts(xs)
        self.assertEqual(result, expected)

    def test_visit_module(self):
        module = ast.Module()
        expected = ast.Module()
        transformer = DictUnpackingTransformer(tree=None)
        result = transformer.visit_Module(module)
        self.assertEqual(result, expected)

    def test_visit_dict(self):
        node = ast.Dict(keys=[ast.Num(1)], values=[ast.Num(2)])
        expected = ast.Dict(keys=[ast.Num(1)], values=[ast.Num(2)])
        transformer = DictUnpackingTransformer(tree)
        result = transformer.visit_Dict(node)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()