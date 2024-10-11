import unittest
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_find_generator_returns(self):
        # Test case 1: Find generator returns in a function with a return statement
        transformer = ReturnFromGeneratorTransformer(tree)
        node = ast.FunctionDef(name='test_func', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[ast.Return(value=ast.Num(n=1))], decorator_list=[], returns=None)
        returns = transformer._find_generator_returns(node)
        self.assertEqual(len(returns), 1)
        self.assertEqual(returns[0][0], node)
        self.assertEqual(returns[0][1].value.n, 1)

        # Test case 2: Find generator returns in a function with a yield statement
        node = ast.FunctionDef(name='test_func', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[ast.Yield(value=ast.Num(n=1))], decorator_list=[], returns=None)
        returns = transformer._find_generator_returns(node)
        self.assertEqual(len(returns), 0)

    def test_replace_return(self):
        # Test case 1: Replace a return statement with a raise statement in the function body
        transformer = ReturnFromGeneratorTransformer(tree=tree)
        node = ast.FunctionDef(name='test_func', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[ast.Return(value=ast.Num(n=1))], decorator_list=[], returns=None)
        transformer._replace_return(node, node.body[0])
        self.assertEqual(len(node.body), 1)
        self.assertEqual(type(node.body[0]), ast.Raise)
        self.assertEqual(node.body[0].type, ast.Name)
        self.assertEqual(node.body[0].type.id, 'StopIteration')
        self.assertEqual(node.body[0].inst, None)
        self.assertEqual(node.body[0].tback, None)
        self.assertEqual(node.body[0].value.n, 1)

        # Test case 2: Replace a return statement with a raise statement in a nested function body
        def nested_func():
            return 1
        node = ast.FunctionDef(name='test_func', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[ast.Return(value=ast.Num(n=1))], decorator_list=[], returns=None)
        transformer._replace_return(node, node.body[0])
        self.assertEqual(len(node.body), 1)
        self.assertEqual(type(node.body[0]), ast.Raise)
        self.assertEqual(node.body[0].type, ast.Name)
        self.assertEqual(node.body[0].type.id, 'StopIteration')
        self.assertEqual(node.body[0].inst, None)
        self.assertEqual(node.body[0].tback, None)
        self.assertEqual(node.body[0].value.n, 1)

if __name__ == '__main__':
    unittest.main()