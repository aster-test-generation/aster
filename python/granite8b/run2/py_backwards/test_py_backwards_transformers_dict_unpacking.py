import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_split_by_none(self):
        pairs = [
            (None, 1),
            (2, 3),
            (None, 4),
            (5, 6),
        ]
        splitted = DictUnpackingTransformer()._split_by_None(pairs, None)
        self.assertEqual(splitted, [
            [(2, 3), (5, 6)],
            [1, 4],
        ])

    def test_prepare_splitted(self):
        splitted = [
            [(None, 1), (2, 3)],
            [4, 5],
        ]
        prepared = DictUnpackingTransformer()._prepare_splitted(splitted, tree)
        self.assertEqual(list(prepared), [
            ast.Dict(keys=[ast.Name(id='None', ctx=ast.Load()), ast.Name(id='2', ctx=ast.Load())], values=[ast.Name(id='1', ctx=ast.Load()), ast.Name(id='3', ctx=ast.Load())]),
            ast.Dict(keys=[ast.Name(id='4', ctx=ast.Load())], values=[ast.Name(id='5', ctx=ast.Load())]),
        ])

    def test_merge_dicts(self):
        xs = [
            ast.Dict(keys=[ast.Name(id='1', ctx=ast.Load())], values=[ast.Name(id='2', ctx=ast.Load())]),
            ast.Dict(keys=[ast.Name(id='3', ctx=ast.Load())], values=[ast.Name(id='4', ctx=ast.Load())]),
        ]
        merged = DictUnpackingTransformer()._merge_dicts(xs)
        self.assertEqual(merged, ast.Call(
            func=ast.Name(id='_py_backwards_merge_dicts'),
            args=[ast.List(elts=[
                ast.Dict(keys=[ast.Name(id='1', ctx=ast.Load())], values=[ast.Name(id='2', ctx=ast.Load())]),
                ast.Dict(keys=[ast.Name(id='3', ctx=ast.Load())], values=[ast.Name(id='4', ctx=ast.Load())]),
            ])],
            keywords=[],
        ))

if __name__ == '__main__':
    unittest.main()