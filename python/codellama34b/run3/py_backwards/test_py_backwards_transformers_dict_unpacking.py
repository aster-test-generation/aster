import unittest
from py_backwards.transformers.dict_unpacking import *


class TestDictUnpackingTransformer(unittest.TestCase):
    def test_visit_Module(self):
        instance = DictUnpackingTransformer(tree)
        result = instance.visit_Module(ast.Module())
        self.assertEqual(result, None)

    def test_visit_Dict(self):
        instance = DictUnpackingTransformer(tree)
        result = instance.visit_Dict(ast.Dict())
        self.assertEqual(result, None)

    def test__split_by_None(self):
        instance = DictUnpackingTransformer(tree)
        result = instance._split_by_None([])
        self.assertEqual(result, [])

    def test__prepare_splitted(self):
        instance = DictUnpackingTransformer(tree)
        result = instance._prepare_splitted([])
        self.assertEqual(result, [])

    def test__merge_dicts(self):
        instance = DictUnpackingTransformer(tree)
        result = instance._merge_dicts([])
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()