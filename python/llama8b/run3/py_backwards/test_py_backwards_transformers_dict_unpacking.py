import unittest
from unittest.mock import patch
from py_backwards.transformers.dict_unpacking import DictUnpackingTransforme


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_None(self):
        transformer = DictUnpackingTransformer()
        pairs = [(1, 2), (3, 4), (None, 5), (6, 7)]
        result = transformer._split_by_None(pairs)
        self.assertEqual(result, [[(1, 2), (3, 4)], [6, 7], [5]])

    def test_prepare_splitted(self):
        transformer = DictUnpackingTransformer()
        group1 = [(1, 2), (3, 4)]
        group2 = [(5, 6)]
        group3 = []
        result = transformer._prepare_splitted([group1, group2, group3])
        self.assertEqual(result, [ast.Dict(keys=[1, 3], values=[2, 4]), ast.Dict(keys=[5], values=[6]), ast.Call(func=ast.Name(id='dict'), args=[[]], keywords=[])])

    def test_merge_dicts(self):
        transformer = DictUnpackingTransformer()
        xs = [ast.Dict(keys=[1, 2], values=[3, 4]), ast.Dict(keys=[5, 6], values=[7, 8])]
        result = transformer._merge_dicts(xs)
        self.assertEqual(result, ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[ast.Dict(keys=[1, 2], values=[3, 4]), ast.Dict(keys=[5, 6], values=[7, 8])])], keywords=[]))

    def test_visit_Module(self):
        transformer = DictUnpackingTransformer()
        node = ast.Module(body=[ast.Expr(ast.Call(func=ast.Name(id='print'), args=[ast.Str(s='Hello, World!')], keywords=[]))])
        result = transformer.visit_Module(node)
        self.assertEqual(result.body, [ast.Expr(ast.Call(func=ast.Name(id='print'), args=[ast.Str(s='Hello, World!')], keywords=[])), ast.Expr(ast.Call(func=ast.Name(id='merge_dicts'), args=[], keywords=[]))])

    def test_visit_Dict(self):
        transformer = DictUnpackingTransformer()
        node = ast.Dict(keys=[1, 2, 3], values=[4, 5, 6])
        result = transformer.visit_Dict(node)
        self.assertEqual(result, ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[ast.Dict(keys=[1, 2], values=[4, 5]), ast.Dict(keys=[3], values=[6])])], keywords=[]))

    @patch('py_backwards.transformers.dict_unpacking._split_by_None')
    @patch('py_backwards.transformers.dict_unpacking._prepare_splitted')
    @patch('py_backwards.transformers.dict_unpacking._merge_dicts')
    def test_visit_Dict_with_None(self, mock_merge_dicts, mock_prepare_splitted, mock_split_by_None):
        transformer = DictUnpackingTransformer()
        node = ast.Dict(keys=[1, 2, 3], values=[4, 5, 6])
        pairs = [(1, 2), (3, 4), (None, 5), (6, 7)]
        mock_split_by_None.return_value = [[(1, 2), (3, 4)], [6, 7], [5]]
        mock_prepare_splitted.return_value = [ast.Dict(keys=[1, 3], values=[2, 4]), ast.Dict(keys=[5], values=[6]), ast.Call(func=ast.Name(id='dict'), args=[[]], keywords=[])]
        mock_merge_dicts.return_value = ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[ast.Dict(keys=[1, 3], values=[2, 4]), ast.Dict(keys=[5], values=[6]), ast.Call(func=ast.Name(id='dict'), args=[[]], keywords=[])])], keywords=[])
        result = transformer.visit_Dict(node)
        self.assertEqual(result, mock_merge_dicts.return_value)

if __name__ == '__main__':
    unittest.main()