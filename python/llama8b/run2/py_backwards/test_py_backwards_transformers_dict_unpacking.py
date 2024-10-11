import unittest
from unittest.mock import patch
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer


class TestDictUnpackingTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = DictUnpackingTransformer()

    def test_split_by_None(self):
        pairs = [(1, 2), (None, 3), (4, 5)]
        result = self.transformer._split_by_None(pairs)
        expected = [[(1, 2), (4, 5)], 3]
        self.assertEqual(list(result), expected)

    def test_prepare_splitted(self):
        group = [(1, 2), (3, 4)]
        result = list(self.transformer._prepare_splitted([group]))
        expected = [ast.Dict(keys=[1, 3], values=[2, 4])]
        self.assertEqual(result, expected)

    def test_merge_dicts(self):
        xs = [ast.Dict(keys=[1, 2], values=[3, 4]), ast.Dict(keys=[5, 6], values=[7, 8])]
        result = self.transformer._merge_dicts(xs)
        expected = ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[ast.Dict(keys=[1, 2], values=[3, 4]), ast.Dict(keys=[5, 6], values=[7, 8])])], keywords=[])
        self.assertEqual(result, expected)

    def test_visit_Module(self):
        node = ast.Module(body=[ast.Expr(ast.Call(func=ast.Name(id='print'), args=[ast.Str(s='Hello, World!')], keywords=[]))])
        result = self.transformer.visit_Module(node)
        expected = ast.Module(body=[ast.Expr(ast.Call(func=ast.Name(id='print'), args=[ast.Str(s='Hello, World!')], keywords=[])), ast.Expr(ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[])], keywords=[]))])
        self.assertEqual(result, expected)

    def test_visit_Dict(self):
        node = ast.Dict(keys=[1, None, 3], values=[2, 4, 5])
        result = self.transformer.visit_Dict(node)
        expected = ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[ast.Dict(keys=[1, 3], values=[2, 5]), 4])], keywords=[])
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()