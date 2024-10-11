import unittest
from py_backwards.transformers.super_without_arguments import *


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_visit_Call(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call()
        result = instance.visit_Call(node)
        self.assertEqual(result, instance.generic_visit(node))

    def test_target(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        result = instance.target
        self.assertEqual(result, (2, 7))

    def test__replace_super_args(self):
        instance = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call()
        try:
            func = get_closest_parent_of(self._tree, node, ast.FunctionDef)
        except NodeNotFound:
            warn('super() outside of function')
            return
        try:
            cls = get_closest_parent_of(self._tree, node, ast.ClassDef)
        except NodeNotFound:
            warn('super() outside of class')
            return
        node.args = [ast.Name(id=cls.name), ast.Name(id=func.args.args[0].arg)]
        result = instance._replace_super_args(node)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()