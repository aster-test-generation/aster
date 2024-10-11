import unittest
from typing import Union, Iterable, Optional, List, Tuple
from typed_ast import ast3 as ast
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer, merge_dicts


class TestDictUnpackingTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = DictUnpackingTransformer(tree)

    def test_split_by_None(self):
        pairs = [(ast.Constant(value=1), ast.Constant(value=2)), (None, ast.Constant(value=3)), (ast.Constant(value=4), ast.Constant(value=5))]
        result = self.transformer._split_by_None(pairs)
        expected = [[(ast.Constant(value=1), ast.Constant(value=2))], ast.Constant(value=3), [(ast.Constant(value=4), ast.Constant(value=5))]]
        self.assertEqual(result, expected)

    def test_prepare_splitted(self):
        splitted = [[(ast.Constant(value=1), ast.Constant(value=2))], ast.Constant(value=3), [(ast.Constant(value=4), ast.Constant(value=5))]]
        result = list(self.transformer._prepare_splitted(splitted))
        expected = [
            ast.Dict(keys=[ast.Constant(value=1)], values=[ast.Constant(value=2)]),
            ast.Call(func=ast.Name(id='dict'), args=[ast.Constant(value=3)], keywords=[]),
            ast.Dict(keys=[ast.Constant(value=4)], values=[ast.Constant(value=5)])
        ]
        self.assertEqual(len(result), len(expected))
        for res, exp in zip(result, expected):
            self.assertEqual(ast.dump(res), ast.dump(exp))

    def test_merge_dicts(self):
        xs = [
            ast.Dict(keys=[ast.Constant(value=1)], values=[ast.Constant(value=2)]),
            ast.Call(func=ast.Name(id='dict'), args=[ast.Constant(value=3)], keywords=[]),
            ast.Dict(keys=[ast.Constant(value=4)], values=[ast.Constant(value=5)])
        ]
        result = self.transformer._merge_dicts(xs)
        expected = ast.Call(
            func=ast.Name(id='_py_backwards_merge_dicts'),
            args=[ast.List(elts=xs)],
            keywords=[]
        )
        self.assertEqual(ast.dump(result), ast.dump(expected))

    def test_visit_Module(self):
        node = ast.Module(body=[])
        result = self.transformer.visit_Module(node)
        self.assertTrue(any(isinstance(stmt, ast.FunctionDef) and stmt.name == '_py_backwards_merge_dicts' for stmt in result.body))

    def test_visit_Dict(self):
        node = ast.Dict(keys=[ast.Constant(value=1), None, ast.Constant(value=4)], values=[ast.Constant(value=2), ast.Constant(value=3), ast.Constant(value=5)])
        result = self.transformer.visit_Dict(node)
        self.assertIsInstance(result, ast.Call)
        self.assertEqual(result.func.id, '_py_backwards_merge_dicts')

class TestMergeDictsSnippet(unittest.TestCase):
    def test_merge_dicts(self):
        dicts = [{'a': 1}, {'b': 2}, {'c': 3}]
        result = merge_dicts(dicts)
        expected = {'a': 1, 'b': 2, 'c': 3}
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()