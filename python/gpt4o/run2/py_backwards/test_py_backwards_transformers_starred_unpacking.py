import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.starred_unpacking import StarredUnpackingTransformer


class TestStarredUnpackingTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = StarredUnpackingTransformer(tree)

    def test_has_starred_true(self):
        node = ast.Starred(value=ast.Name(id='x'))
        result = self.transformer._has_starred([node])
        self.assertTrue(result)

    def test_has_starred_false(self):
        node = ast.Name(id='x')
        result = self.transformer._has_starred([node])
        self.assertFalse(result)

    def test_split_by_starred(self):
        nodes = [ast.Name(id='x'), ast.Starred(value=ast.Name(id='y')), ast.Name(id='z')]
        result = self.transformer._split_by_starred(nodes)
        self.assertEqual(len(result), 3)
        self.assertIsInstance(result[1], ast.Starred)

    def test_prepare_lists(self):
        nodes = [ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))]
        splitted = self.transformer._split_by_starred(nodes)
        result = list(self.transformer._prepare_lists(splitted))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], ast.List)
        self.assertIsInstance(result[1], ast.Call)

    def test_merge_lists_single(self):
        nodes = [ast.List(elts=[ast.Name(id='x')])]
        result = self.transformer._merge_lists(nodes)
        self.assertIsInstance(result, ast.List)

    def test_merge_lists_multiple(self):
        nodes = [ast.List(elts=[ast.Name(id='x')]), ast.List(elts=[ast.Name(id='y')])]
        result = self.transformer._merge_lists(nodes)
        self.assertIsInstance(result, ast.BinOp)

    def test_to_sum_of_lists(self):
        nodes = [ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))]
        result = self.transformer._to_sum_of_lists(nodes)
        self.assertIsInstance(result, ast.BinOp)

    def test_visit_List_no_starred(self):
        node = ast.List(elts=[ast.Name(id='x')])
        result = self.transformer.visit_List(node)
        self.assertIsInstance(result, ast.List)

    def test_visit_List_with_starred(self):
        node = ast.List(elts=[ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))])
        result = self.transformer.visit_List(node)
        self.assertIsInstance(result, ast.List)

    def test_visit_Call_no_starred(self):
        node = ast.Call(func=ast.Name(id='func'), args=[ast.Name(id='x')], keywords=[])
        result = self.transformer.visit_Call(node)
        self.assertIsInstance(result, ast.Call)

    def test_visit_Call_with_starred(self):
        node = ast.Call(func=ast.Name(id='func'), args=[ast.Name(id='x'), ast.Starred(value=ast.Name(id='y'))], keywords=[])
        result = self.transformer.visit_Call(node)
        self.assertIsInstance(result, ast.Call)

if __name__ == '__main__':
    unittest.main()