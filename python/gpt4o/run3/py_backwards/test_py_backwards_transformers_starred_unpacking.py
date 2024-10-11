import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.starred_unpacking import StarredUnpackingTransformer


class TestStarredUnpackingTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = StarredUnpackingTransformer(tree=None)

    def test_has_starred_true(self):
        node = [ast.Starred(value=ast.Name(id='x'))]
        result = self.transformer._has_starred(node)
        self.assertTrue(result)

    def test_has_starred_false(self):
        node = [ast.Name(id='x')]
        result = self.transformer._has_starred(node)
        self.assertFalse(result)

    def test_split_by_starred(self):
        node = [ast.Name(id='x'), ast.Starred(value=ast.Name(id='y')), ast.Name(id='z')]
        result = self.transformer._split_by_starred(node)
        expected = [[ast.Name(id='x')], ast.Starred(value=ast.Name(id='y')), [ast.Name(id='z')]]
        self.assertEqual(result, expected)

    def test_prepare_lists(self):
        node = [[ast.Name(id='x')], ast.Starred(value=ast.Name(id='y')), [ast.Name(id='z')]]
        result = list(self.transformer._prepare_lists(node))
        expected = [
            ast.List(elts=[ast.Name(id='x')]),
            ast.Call(func=ast.Name(id='list'), args=[ast.Name(id='y')], keywords=[]),
            ast.List(elts=[ast.Name(id='z')])
        ]
        self.assertEqual(result, expected)

    def test_merge_lists_single(self):
        node = [ast.List(elts=[ast.Name(id='x')])]
        result = self.transformer._merge_lists(node)
        self.assertEqual(result, node[0])

    def test_merge_lists_multiple(self):
        node = [
            ast.List(elts=[ast.Name(id='x')]),
            ast.List(elts=[ast.Name(id='y')]),
            ast.List(elts=[ast.Name(id='z')])
        ]
        result = self.transformer._merge_lists(node)
        expected = ast.BinOp(
            left=ast.BinOp(
                left=ast.List(elts=[ast.Name(id='x')]),
                right=ast.List(elts=[ast.Name(id='y')]),
                op=ast.Add()
            ),
            right=ast.List(elts=[ast.Name(id='z')]),
            op=ast.Add()
        )
        self.assertEqual(result, expected)

    def test_to_sum_of_lists(self):
        node = [ast.Name(id='x'), ast.Starred(value=ast.Name(id='y')), ast.Name(id='z')]
        result = self.transformer._to_sum_of_lists(node)
        expected = ast.BinOp(
            left=ast.List(elts=[ast.Name(id='x')]),
            right=ast.BinOp(
                left=ast.Call(func=ast.Name(id='list'), args=[ast.Name(id='y')], keywords=[]),
                right=ast.List(elts=[ast.Name(id='z')]),
                op=ast.Add()
            ),
            op=ast.Add()
        )
        self.assertEqual(result, expected)

    def test_visit_List_no_starred(self):
        node = ast.List(elts=[ast.Name(id='x')])
        result = self.transformer.visit_List(node)
        self.assertEqual(result, node)

    def test_visit_List_with_starred(self):
        node = ast.List(elts=[ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))])
        result = self.transformer.visit_List(node)
        self.assertIsInstance(result, ast.BinOp)

    def test_visit_Call_no_starred(self):
        node = ast.Call(func=ast.Name(id='func'), args=[ast.Name(id='x')], keywords=[])
        result = self.transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_Call_with_starred(self):
        node = ast.Call(func=ast.Name(id='func'), args=[ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))], keywords=[])
        result = self.transformer.visit_Call(node)
        self.assertIsInstance(result.args[0], ast.Starred)

if __name__ == '__main__':
    unittest.main()