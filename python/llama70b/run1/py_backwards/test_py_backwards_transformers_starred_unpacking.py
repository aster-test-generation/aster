import unittest
from py_backwards.transformers.starred_unpacking import StarredUnpackingTransformer, BaseNodeTransformer


class TestStarredUnpackingTransformer(unittest.TestCase):
    def test_init(self):
        instance = StarredUnpackingTransformer()
        self.assertIsInstance(instance, BaseNodeTransformer)

    def test_target(self):
        instance = StarredUnpackingTransformer()
        self.assertEqual(instance.target, (3, 4))

    def test_has_starred(self):
        instance = StarredUnpackingTransformer()
        xs = [ast.expr()]
        result = instance._has_starred(xs)
        self.assertFalse(result)

        xs = [ast.expr(), ast.Starred()]
        result = instance._has_starred(xs)
        self.assertTrue(result)

    def test_split_by_starred(self):
        instance = StarredUnpackingTransformer()
        xs = [ast.expr(), ast.expr()]
        result = instance._split_by_starred(xs)
        self.assertEqual(result, [[ast.expr(), ast.expr()]])

        xs = [ast.expr(), ast.Starred(), ast.expr()]
        result = instance._split_by_starred(xs)
        self.assertEqual(result, [[ast.expr()], ast.Starred(), [ast.expr()]])

    def test_prepare_lists(self):
        instance = StarredUnpackingTransformer()
        xs = [[ast.expr()], ast.Starred(), [ast.expr()]]
        result = list(instance._prepare_lists(xs))
        self.assertEqual(result, [ast.List(elts=[ast.expr()]), ast.Call(func=ast.Name(id='list'), args=[ast.Starred()]), ast.List(elts=[ast.expr()])])

    def test_merge_lists(self):
        instance = StarredUnpackingTransformer()
        xs = [ast.List(elts=[ast.expr()]), ast.List(elts=[ast.expr()])]
        result = instance._merge_lists(xs)
        self.assertIsInstance(result, ast.BinOp)

        xs = [ast.List(elts=[ast.expr()])]
        result = instance._merge_lists(xs)
        self.assertIsInstance(result, ast.List)

    def test_to_sum_of_lists(self):
        instance = StarredUnpackingTransformer()
        xs = [ast.expr(), ast.expr()]
        result = instance._to_sum_of_lists(xs)
        self.assertIsInstance(result, ast.List)

        xs = [ast.expr(), ast.Starred(), ast.expr()]
        result = instance._to_sum_of_lists(xs)
        self.assertIsInstance(result, ast.BinOp)

    def test_visit_List(self):
        instance = StarredUnpackingTransformer()
        node = ast.List(elts=[ast.expr()])
        result = instance.visit_List(node)
        self.assertIsInstance(result, ast.List)

        node = ast.List(elts=[ast.expr(), ast.Starred(), ast.expr()])
        result = instance.visit_List(node)
        self.assertIsInstance(result, ast.BinOp)

    def test_visit_Call(self):
        instance = StarredUnpackingTransformer()
        node = ast.Call(args=[ast.expr()])
        result = instance.visit_Call(node)
        self.assertIsInstance(result, ast.Call)

        node = ast.Call(args=[ast.expr(), ast.Starred(), ast.expr()])
        result = instance.visit_Call(node)
        self.assertIsInstance(result, ast.Call)

    def test_str_method(self):
        instance = StarredUnpackingTransformer()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = StarredUnpackingTransformer()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()