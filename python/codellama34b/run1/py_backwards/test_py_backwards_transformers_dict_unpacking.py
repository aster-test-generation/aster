import unittest
from py_backwards.transformers.dict_unpacking import *


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_None(self):
        instance = DictUnpackingTransformer(tree)
        pairs = [(1, 2), (3, 4), (5, 6)]
        result = instance._split_by_None(pairs)
        self.assertEqual(result, [[(1, 2), (3, 4), (5, 6)]])

    def test_prepare_splitted(self):
        instance = DictUnpackingTransformer(tree)
        splitted = [[(1, 2), (3, 4), (5, 6)]]
        result = instance._prepare_splitted(splitted)
        self.assertEqual(result, [[(1, 2), (3, 4), (5, 6)]])

    def test_merge_dicts(self):
        instance = DictUnpackingTransformer(tree)
        xs = [[(1, 2), (3, 4), (5, 6)]]
        result = instance._merge_dicts(xs)
        self.assertEqual(result, ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'), args=[ast.List(elts=[[(1, 2), (3, 4), (5, 6)]])], keywords=[]))

    def test_visit_Module(self):
        instance = DictUnpackingTransformer(tree)
        node = ast.Module()
        result = instance.visit_Module(node)
        self.assertEqual(result, ast.Module(body=[ast.FunctionDef(name='_py_backwards_merge_dicts', args=ast.arguments(args=[ast.arg(arg='dicts', annotation=None)], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[ast.Return(value=ast.Call(func=ast.Name(id='dict', ctx=ast.Load()), args=[ast.Name(id='dicts', ctx=ast.Load())], keywords=[]))], decorator_list=[], returns=None, type_comment=None)], type_ignores=[]))

    def test_visit_Dict(self):
        instance = DictUnpackingTransformer(tree)
        node = ast.Dict(keys=[], values=[])
        result = instance.visit_Dict(node)
        self.assertEqual(result, ast.Dict(keys=[], values=[]))

if __name__ == '__main__':
    unittest.main()