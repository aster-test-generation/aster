import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer
from typed_ast import ast3 as ast
from utils.tree import get_closest_parent_of
from ..utils.helpers import warn
from ..exceptions import NodeNotFound


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(
            func=ast.Name(id='super'),
            args=[],
            keywords=[]
        )
        try:
            func = get_closest_parent_of(transformer._tree, node, ast.FunctionDef)
        except NodeNotFound:
            warn('super() outside of function')
            return
        try:
            cls = get_closest_parent_of(transformer._tree, node, ast.ClassDef)
        except NodeNotFound:
            warn('super() outside of class')
            return
        transformer._replace_super_args(node)
        self.assertEqual(len(node.args), 2)
        self.assertEqual(node.args[0].id, cls.name)
        self.assertEqual(node.args[1].id, func.args.args[0].arg)

    def test_visit_call(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(
            func=ast.Name(id='super'),
            args=[],
            keywords=[]
        )
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()