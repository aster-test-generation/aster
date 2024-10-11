import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        transformer = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call(func=ast.Name(id='super'), args=[], keywords=[])
        func = ast.FunctionDef(name='test_func', args=ast.arguments(args=[ast.arg(arg='self', annotation=None)], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[], decorator_list=[])
        cls = ast.ClassDef(name='TestClass', bases=[], keywords=[], body=[], decorator_list=[], starargs=None, kwargs=None)
        tree = ast.Module(body=[cls, func])
        transformer._tree = tree
        transformer._replace_super_args(node)
        self.assertEqual(len(node.args), 2)
        self.assertEqual(node.args[0].id, 'TestClass')
        self.assertEqual(node.args[1].id, 'self')

    def test_visit_call(self):
        transformer = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call(func=ast.Name(id='super'), args=[], keywords=[])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_call_with_args(self):
        transformer = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call(func=ast.Name(id='super'), args=[ast.Num(n=1)], keywords=[])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

    def test_visit_call_with_kwargs(self):
        transformer = SuperWithoutArgumentsTransformer(tree)
        node = ast.Call(func=ast.Name(id='super'), args=[], keywords=[ast.keyword(arg='x', value=ast.Num(n=1))])
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()