import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_visit_Call(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call()
        result = instance.visit_Call(node)
        self.assertEqual(result, instance.generic_visit(node))

    def test__replace_super_args(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call()
        instance._replace_super_args(node)

if __name__ == '__main__':
    unittest.main()