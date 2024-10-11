import unittest
from py_backwards.transformers.starred_unpacking import StarredUnpackingTransformer


class TestStarredUnpackingTransformer(unittest.TestCase):
    def test_has_starred(self):
        transformer = StarredUnpackingTransformer(tree)
        self.assertFalse(transformer._has_starred([ast.Num(n=1), ast.Num(n=2)]))
        self.assertTrue(transformer._has_starred([ast.Num(n=1), ast.Starred(value=ast.Num(n=2))]))

    def test_split_by_starred(self):
        transformer = StarredUnpackingTransformer(tree)
        self.assertEqual(transformer._split_by_starred([ast.Num(n=1), ast.Num(n=2)]), [[ast.Num(n=1), ast.Num(n=2)]])
        self.assertEqual(transformer._split_by_starred([ast.Num(n=1), ast.Starred(value=ast.Num(n=2)), ast.Num(n=3)]), [[ast.Num(n=1)], ast.Starred(value=ast.Num(n=2)), [ast.Num(n=3)]])

    def test_prepare_lists(self):
        transformer = StarredUnpackingTransformer(tree)
        self.assertEqual(list(transformer._prepare_lists([[ast.Num(n=1), ast.Num(n=2)]])), [ast.List(elts=[ast.Num(n=1), ast.Num(n=2)])])
        self.assertEqual(list(transformer._prepare_lists([[ast.Num(n=1), ast.Num(n=2)], ast.Starred(value=ast.Num(n=3)), [ast.Num(n=4), ast.Num(n=5)]])), [ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]), ast.Call(func=ast.Name(id='list'), args=[ast.Num(n=3)], keywords=[]), ast.List(elts=[ast.Num(n=4), ast.Num(n=5)])])

    def test_merge_lists(self):
        transformer = StarredUnpackingTransformer(tree)
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Num(n=1), ast.Num(n=2)])]), ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]))
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]), ast.List(elts=[ast.Num(n=3), ast.Num(n=4)])]), ast.BinOp(left=ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]), right=ast.List(elts=[ast.Num(n=3), ast.Num(n=4)]), op=ast.Add()))
        self.assertEqual(transformer._merge_lists([ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]), ast.Call(func=ast.Name(id='list'), args=[ast.Num(n=3)], keywords=[]), ast.List(elts=[ast.Num(n=4), ast.Num(n=5)])]), ast.BinOp(left=ast.BinOp(left=ast.List(elts=[ast.Num(n=1), ast.Num(n=2)]), right=ast.Call(func=ast.Name(id='list'), args=[ast.Num(n=3)], keywords=[]), op=ast.Add()), right=ast.List(elts=[ast.Num(n=4), ast.Num(n=5)]), op=ast.Add()))

if __name__ == '__main__':
    unittest.main()