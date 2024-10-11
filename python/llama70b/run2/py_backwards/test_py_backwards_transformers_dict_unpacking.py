import unittest
from py_backwards.transformers.dict_unpacking import DictUnpackingTransformer, merge_dicts


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_init(self):
        instance = DictUnpackingTransformer()
        self.assertIsInstance(instance, DictUnpackingTransformer)

    def test_target(self):
        instance = DictUnpackingTransformer()
        self.assertEqual(instance.target, (3, 4))

    def test_split_by_None(self):
        instance = DictUnpackingTransformer()
        pairs = [(1, 2), (None, 3), (4, 5), (None, 6)]
        result = instance._split_by_None(pairs)
        self.assertEqual(result, [[(1, 2)], 3, [(4, 5)], 6])

    def test_prepare_splitted(self):
        instance = DictUnpackingTransformer()
        splitted = [[(1, 2)], 3, [(4, 5)], 6]
        result = list(instance._prepare_splitted(splitted))
        self.assertEqual(len(result), 4)
        self.assertIsInstance(result[0], ast.Dict)
        self.assertIsInstance(result[1], ast.Call)
        self.assertIsInstance(result[2], ast.Dict)
        self.assertIsInstance(result[3], ast.Call)

    def test_merge_dicts(self):
        instance = DictUnpackingTransformer()
        xs = [ast.Dict(keys=[1], values=[2]), ast.Call(func=ast.Name(id='dict'), args=[3], keywords=[])]
        result = instance._merge_dicts(xs)
        self.assertIsInstance(result, ast.Call)
        self.assertEqual(result.func.id, '_py_backwards_merge_dicts')

    def test_visit_Module(self):
        instance = DictUnpackingTransformer()
        node = ast.Module(body=[])
        result = instance.visit_Module(node)
        self.assertIsInstance(result, ast.Module)
        self.assertEqual(len(result.body), 1)

    def test_visit_Dict(self):
        instance = DictUnpackingTransformer()
        node = ast.Dict(keys=[1, 2, None], values=[3, 4, 5])
        result = instance.visit_Dict(node)
        self.assertIsInstance(result, ast.Call)
        self.assertEqual(result.func.id, '_py_backwards_merge_dicts')

    def test_str_method(self):
        instance = DictUnpackingTransformer()
        result = instance.__str__()
        self.assertEqual(result, "DictUnpackingTransformer")

    def test_repr_method(self):
        instance = DictUnpackingTransformer()
        result = instance.__repr__()
        self.assertEqual(result, "DictUnpackingTransformer()")

class TestMergeDictsFunction(unittest.TestCase):
    def test_merge_dicts(self):
        result = merge_dicts._py_backwards_merge_dicts([{'a': 1}, {'b': 2}])
        self.assertEqual(result, {'a': 1, 'b': 2})

if __name__ == '__main__':
    unittest.main()