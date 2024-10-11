import ast
import unittest
from py_backwards.transformers.string_types import StringTypesTransformer


class TestStringTypesTransformer(unittest.TestCase):
    def test_transform_no_changes(self):
        tree = ast.parse('x = 5')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree, tree)
        self.assertFalse(result.tree_changed)

    def test_transform_changes_str_to_unicode(self):
        tree = ast.parse('x = str(5)')
        result = StringTypesTransformer.transform(tree)
        self.assertEqual(result.tree, tree)
        self.assertTrue(result.tree_changed)
        self.assertEqual(ast.dump(result.tree), 'Module(body=[Assign(targets=[Name(id="x", ctx=Store())], value=Call(func=Name(id="unicode", ctx=Load()), args=[Num(n=5)], keywords=[]))])')

if __name__ == '__main__':
    unittest.main()