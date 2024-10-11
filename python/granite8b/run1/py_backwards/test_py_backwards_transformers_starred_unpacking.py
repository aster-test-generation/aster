import unittest
from py_backwards.transformers.starred_unpacking import StarredUnpackingTransformer
from typing import Union, Iterable, List
from typed_ast import ast3 as ast
from ..base import BaseNodeTransformer


class TestStarredUnpackingTransformer(unittest.TestCase):
    def test_has_starred(self):
        transformer = StarredUnpackingTransformer()
        self.assertFalse(transformer._has_starred([]))
        self.assertFalse(transformer._has_starred([ast.Name(id='x')]))
        self.assertTrue(transformer._has_starred([ast.Starred(value=ast.Name(id='x'))]))
        self.assertTrue(transformer._has_starred([ast.Starred(value=ast.Name(id='x')), ast.Name(id='y')]))

    def test_split_by_starred(self):
        transformer = StarredUnpackingTransformer()
        self.assertEqual(list(transformer._split_by_starred([])), [[]])
        self.assertEqual(list(transformer._split_by_starred([ast.Name(id='x')])), [[ast.Name(id='x')]])
        self.assertEqual(list(transformer._split_by_starred([ast.Starred(value=ast.Name(id='x'))])), [[], [ast.Starred(value=ast.Name(id='x'))]])
        self.assertEqual(list(transformer._split_by_starred([ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))])), [[ast.Name(id='x')], [], [ast.Starred(value=ast.Name(id='y'))]])

    def test_prepare_lists(self):
        transformer = StarredUnpackingTransformer()
        self.assertEqual(list(transformer._prepare_lists([])), [])
        self.assertEqual(list(transformer._prepare_lists([ast.Name(id='x')])), [ast.List(elts=[ast.Name(id='x')])])
        self.assertEqual(list(transformer._prepare_lists([ast.Starred(value=ast.Name(id='x'))])), [ast.Call(func=ast.Name(id='list'), args=[ast.Name(id='x')], keywords=[])])
        self.assertEqual(list(transformer._prepare_lists([ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))])), [ast.List(elts=[ast.Name(id='x')]), ast.Call(func=ast.Name(id='list'), args=[ast.Name(id='y')], keywords=[])])

    def test_merge_lists(self):
        transformer = StarredUnpackingTransformer()
        self.assertEqual(transformer._merge_lists([]), ast.List(elts=[]))
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Name(id='x')])]), ast.List(elts=[ast.Name(id='x')]))
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Name(id='x')]), ast.List(elts=[ast.Name(id='y')])]), ast.BinOp(left=ast.List(elts=[ast.Name(id='x')]), right=ast.List(elts=[ast.Name(id='y')]), op=ast.Add()))
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Name(id='x')]), ast.List(elts=[ast.Name(id='y')]), ast.List(elts=[ast.Name(id='z')])]), ast.BinOp(left=ast.BinOp(left=ast.List(elts=[ast.Name(id='x')]), right=ast.List(elts=[ast.Name(id='y')]), op=ast.Add()), right=ast.List(elts=[ast.Name(id='z')]), op=ast.Add()))

if __name__ == '__main__':
    unittest.main()