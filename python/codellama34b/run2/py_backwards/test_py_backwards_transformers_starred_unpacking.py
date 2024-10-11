import unittest
from py_backwards.transformers.starred_unpacking import *


class TestStarredUnpackingTransformer(unittest.TestCase):
    def test_has_starred(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance._has_starred([])
        self.assertEqual(result, False)

    def test_split_by_starred(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance._split_by_starred([])
        self.assertEqual(result, [])

    def test_prepare_lists(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance._prepare_lists([])
        self.assertEqual(result, [])

    def test_merge_lists(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance._merge_lists([])
        self.assertEqual(result, [])

    def test_to_sum_of_lists(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance._to_sum_of_lists([])
        self.assertEqual(result, [])

    def test_visit_List(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance.visit_List(ast.List())
        self.assertEqual(result, ast.List())

    def test_visit_Call(self):
        instance = StarredUnpackingTransformer(tree)
        result = instance.visit_Call(ast.Call())
        self.assertEqual(result, ast.Call())

if __name__ == '__main__':
    unittest.main()