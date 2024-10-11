import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer
from typing import Union, Iterable, Optional, List, Tuple
from typed_ast import ast3 as ast
from utils.tree import insert_at
from ..utils.snippet import snippet
from .base import BaseNodeTransformer

@snippet
def merge_dicts():
    def _py_backwards_merge_dicts(dicts):
        result = {}
        for dict_ in dicts:
            result.update(dict_)
        return result
Splitted = List[Union[List[Tuple[ast.expr, ast.expr]], ast.expr]]
Pair = Tuple[Optional[ast.expr], ast.expr]
class DictUnpackingTransformer(BaseNodeTransformer):
    target = (3, 4)
    def _split_by_None(self, pairs: Iterable[Pair]) -> Splitted:
        result = [[]]  
        for key, value in pairs:
            if key is None:
                result.append(value)
                result.append([])
            else:
                assert isinstance(result[-1], list)
                result[-1].append((key, value))
        return result
    def _prepare_splitted(self, splitted: Splitted) \
            -> Iterable[Union[ast.Call, ast.Dict]]:
        for group in splitted:
            if not isinstance(group, list):
                yield ast.Call(
                    func=ast.Name(id='dict'),
                    args=[group],
                    keywords=[])
            elif group:
                yield ast.Dict(keys=[key for key, _ in group],
                               values=[value for _, value in group])
    def _merge_dicts(self, xs: Iterable[Union[ast.Call, ast.Dict]]) \
            -> ast.Call:
        return ast.Call(
            func=ast.Name(id='_py_backwards_merge_dicts'),
            args=[ast.List(elts=list(xs))],
            keywords=[])
    def visit_Module(self, node: ast.Module) -> ast.Module:
        insert_at(0, node, merge_dicts.get_body())  
        return self.generic_visit(node)  
    def visit_Dict(self, node: ast.Dict) -> Union[ast.Dict, ast.Call]:
        if None not in node.keys:
            return self.generic_visit(node)  
        self._tree_changed = True
        pairs = zip(node.keys, node.values)
        splitted = self._split_by_None(pairs)
        prepared = self._prepare_splitted(splitted)
        return self._merge_dicts(prepared)
class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_none(self):
        pairs = [(1, 2), (None, 3), (4, 5), (None, 6)]
        expected = [[(1, 2)], 3, [(4, 5)], 6]
        transformer = DictUnpackingTransformer()
        result = transformer._split_by_None(pairs)
        self.assertEqual(result, expected)
    def test_prepare_splitted(self):
        splitted = [[(1, 2)], 3, [(4, 5)], 6]
        expected = [ast.Dict(keys=[1], values=[2]),
                    ast.Call(func=ast.Name(id='dict'), args=[3], keywords=[]),
                    ast.Dict(keys=[4], values=[5]),
                    ast.Call(func=ast.Name(id='dict'), args=[6], keywords=[])]
        transformer = DictUnpackingTransformer()
        result = transformer._prepare_splitted(splitted)
        self.assertEqual(list(result), expected)
    def test_merge_dicts(self):
        xs = [ast.Dict(keys=[1], values=[2]),
              ast.Call(func=ast.Name(id='dict'), args=[3], keywords=[]),
              ast.Dict(keys=[4], values=[5]),
              ast.Call(func=ast.Name(id='dict'), args=[6], keywords=[])]
        expected = ast.Call(func=ast.Name(id='_py_backwards_merge_dicts'),
                            args=[ast.List(elts=xs)], keywords=[])
        transformer = DictUnpackingTransformer()
        result = transformer._merge_dicts(xs)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()