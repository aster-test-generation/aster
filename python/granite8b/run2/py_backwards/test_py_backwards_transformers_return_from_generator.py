import unittest
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_find_generator_returns(self):
        tree = ast.parse(source)
        node = ast.parse("""
        def example_function():
            x = 1
            y = 2
            return x + y
        """)
        returns = transformer._find_generator_returns(node.body[0])
        self.assertEqual(len(returns), 1)
        self.assertEqual(returns[0][0], node.body[0])
        self.assertEqual(returns[0][1].value.id, 'x')

    def test_replace_return(self):
        tree = ast.parse("def foo():\n    yield 1\n    yield 2\n")
        node = ast.parse("""
        def example_function():
            x = 1
            y = 2
            return x + y
        """)
        transformer._replace_return(node.body[0], node.body[0].body[2])
        self.assertEqual(ast.dump(node), """
        FunctionDef(name='example_function', args=arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[Return(value=BinOp(left=Name(id='x', ctx=Load()), op=Add(), right=Name(id='y', ctx=Load())))], decorator_list=[], returns=None)
        """)

    def test_visit_functiondef(self):
        tree = ast.parse(source)
        node = ast.parse("""
        def example_function():
            x = 1
            y = 2
            return x + y
        """)
        transformer.visit(node)
        self.assertEqual(ast.dump(node), """
        FunctionDef(name='example_function', args=arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[Assign(targets=[Name(id='x', ctx=Store())], value=Num(n=1))], decorator_list=[], returns=None)
        """)

if __name__ == '__main__':
    unittest.main()