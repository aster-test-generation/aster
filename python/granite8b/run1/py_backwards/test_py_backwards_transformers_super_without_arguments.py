import ast
import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        tree = ast.parse('def func(self): super()')
        transformer = SuperWithoutArgumentsTransformer(tree)
        transformer._replace_super_args(tree.body[0].value.func)
        self.assertEqual(ast.dump(tree), 'Module(body=[FunctionDef(name="func", args=arguments(posonlyargs=[], args=[Arg(arg="self", annotation=None)], kwonlyargs=[], kw_defaults=[], defaults=[]), body=[Expr(value=Call(func=Name(id="super", ctx=Load()), args=[], keywords=[]))], decorator_list=[], returns=None)])')

    def test_visit_call(self):
        tree = ast.parse('def func(self): super()')
        transformer = SuperWithoutArgumentsTransformer(tree)
        transformer.visit_Call(tree.body[0].value)
        self.assertEqual(ast.dump(tree), 'Module(body=[FunctionDef(name="func", args=arguments(posonlyargs=[], args=[Arg(arg="self", annotation=None)], kwonlyargs=[], kw_defaults=[], defaults=[]), body=[Expr(value=Call(func=Name(id="super", ctx=Load()), args=[], keywords=[]))], decorator_list=[], returns=None)])')

if __name__ == '__main__':
    unittest.main()