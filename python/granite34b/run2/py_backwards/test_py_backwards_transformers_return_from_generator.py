import unittest
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_find_generator_returns(self):
        code = """
        def func():
            yield 1
            return 2
        """
        import ast
        transformer = ReturnFromGeneratorTransformer()
        transformer.visit(tree)
        returns = transformer._find_generator_returns(tree.body[0])
        self.assertEqual(len(returns), 1)
        self.assertIsInstance(returns[0][0], ast.FunctionDef)
        self.assertIsInstance(returns[0][1], ast.Return)

    def test_replace_return(self):
        code = """
        def func():
            return 1
        """
        import ast
        transformer = ReturnFromGeneratorTransformer()
        transformer.visit(tree)
        func = tree.body[0]
        return_ = func.body[0]
        transformer._replace_return(func, return_)
        self.assertEqual(len(func.body), 3)
        self.assertIsInstance(func.body[0], ast.Assign)
        self.assertIsInstance(func.body[1], ast.Assign)
        self.assertIsInstance(func.body[2], ast.Raise)

    def test_visit_functiondef(self):
        code = """
        def func():
            yield 1
            return 2
        """
        import ast
        transformer = ReturnFromGeneratorTransformer()
        transformer.visit(tree)
        func = tree.body[0]
        self.assertEqual(len(func.body), 3)
        self.assertIsInstance(func.body[0], ast.Expr)
        self.assertIsInstance(func.body[1], ast.Assign)
        self.assertIsInstance(func.body[2], ast.Raise)

if __name__ == '__main__':
    unittest.main()