import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_none(self):
        pairs = [(None, 1), (2, 3), (None, 4), (5, 6)]
        splitted = DictUnpackingTransformer._split_by_None(pairs=pairs)
        self.assertEqual(splitted, [[(None, 1), (2, 3)], [(None, 4)], [(5, 6)]])

    def test_prepare_splitted(self):
        splitted = [[(None, 1), (2, 3)], [(None, 4)], [(5, 6)]]
        prepared = DictUnpackingTransformer._prepare_splitted(splitted, node)
        self.assertEqual(list(prepared), [ast.Dict(keys=[None, 2], values=[1, 3]), ast.Dict(keys=[None], values=[4]), ast.Dict(keys=[5], values=[6])])

    def test_merge_dicts(self):
        xs = [ast.literal_eval('{1:2}'), ast.literal_eval('{3:4}')]
        merged = DictUnpackingTransformer._merge_dicts(xs)
        self.assertEqual(merged.func.id, '_py_backwards_merge_dicts')
        self.assertEqual(merged.args[0].elts, xs)

    def test_visit_module(self):
        import ast
        DictUnpackingTransformer().visit_Module(node)
        self.assertEqual(len(node.body), 1)
        self.assertEqual(node.body[0].name, 'merge_dicts')

    def test_visit_dict(self):
        node = ast.Dict(keys=[None, 1], values=[2, 3])
        result = DictUnpackingTransformer().visit_Dict(node)
        self.assertEqual(result.func.id, '_py_backwards_merge_dicts')
        self.assertEqual(len(result.args), 1)
        self.assertEqual(len(result.args[0].elts), 2)
        self.assertEqual(result.args[0].elts[0].keys, [None, 1])
        self.assertEqual(result.args[0].elts[0].values, [2, 3])
        self.assertEqual(result.args[0].elts[1].keys, [])
        self.assertEqual(result.args[0].elts[1].values, [])

if __name__ == '__main__':
    unittest.main()