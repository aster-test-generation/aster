import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_None(self):
        transformer = DictUnpackingTransformer()
        pairs = [(1, 2), (None, 3), (4, 5), (None, 6)]
        result = transformer._split_by_None(pairs)
        self.assertEqual(result, [[(1, 2), (4, 5)], 3, [6]])

    def test_prepare_splitted(self):
        transformer = DictUnpackingTransformer()
        group1 = [(1, 2), (3, 4)]
        group2 = [(5, 6)]
        group3 = []
        result = list(transformer._prepare_splitted([group1, group2, group3]))
        self.assertEqual(len(result), 3)
        self.assertIsInstance(result[0], ast.Dict)
        self.assertIsInstance(result[1], ast.Call)
        self.assertIsInstance(result[2], ast.Dict)

    def test_merge_dicts(self):
        transformer = DictUnpackingTransformer()
        xs = [ast.Dict(keys=[ast.Name(id='a')], values=[ast.Num(n=1)]),
              ast.Dict(keys=[ast.Name(id='b')], values=[ast.Num(n=2)])]
        result = transformer._merge_dicts(xs)
        self.assertIsInstance(result, ast.Call)
        self.assertEqual(result.args[0].elts[0].elts[0].s, 'dict')
        self.assertEqual(result.args[0].elts[0].elts[1].elts[0].s, 'a')
        self.assertEqual(result.args[0].elts[0].elts[1].elts[1].n, 1)
        self.assertEqual(result.args[0].elts[1].elts[0].elts[0].s, 'b')
        self.assertEqual(result.args[0].elts[1].elts[0].elts[1].n, 2)

    def test_visit_Module(self):
        transformer = DictUnpackingTransformer()
        node = ast.Module(body=[ast.Expr(ast.Call(func=ast.Name(id='print'), args=[ast.Str(s='Hello, World!')], keywords=[]))])
        result = transformer.visit_Module(node)
        self.assertEqual(result.body[0].func.id, 'print')
        self.assertEqual(result.body[0].args[0].s, 'Hello, World!')

    def test_visit_Dict(self):
        transformer = DictUnpackingTransformer()
        node = ast.Dict(keys=[ast.Name(id='a'), ast.Name(id='b'), ast.Name(id='c')], values=[ast.Num(n=1), ast.Num(n=2), ast.Num(n=3)])
        result = transformer.visit_Dict(node)
        self.assertIsInstance(result, ast.Dict)
        self.assertEqual(len(result.keys), 3)
        self.assertEqual(len(result.values), 3)

if __name__ == '__main__':
    unittest.main()