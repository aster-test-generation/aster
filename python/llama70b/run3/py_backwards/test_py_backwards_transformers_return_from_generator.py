import unittest
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer, return_from_generator


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_init(self):
        instance = ReturnFromGeneratorTransformer()
        self.assertIsInstance(instance, BaseNodeTransformer)

    def test_target(self):
        instance = ReturnFromGeneratorTransformer()
        self.assertEqual(instance.target, (3, 2))

    def test_find_generator_returns(self):
        instance = ReturnFromGeneratorTransformer()
        node = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[]), body=[ast.Return(value=ast.Num(n=1))])
        result = instance._find_generator_returns(node)
        self.assertEqual(result, [(node, node.body[0])])

    def test_replace_return(self):
        instance = ReturnFromGeneratorTransformer()
        parent = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[]), body=[ast.Return(value=ast.Num(n=1))])
        return_ = ast.Return(value=ast.Num(n=2))
        instance._replace_return(parent, return_)
        self.assertEqual(len(parent.body), 2)

    def test_visit_FunctionDef(self):
        instance = ReturnFromGeneratorTransformer()
        node = ast.FunctionDef(name='test', args=ast.arguments(args=[], vararg=None, kwonlyargs=[]), body=[ast.Return(value=ast.Num(n=1))])
        result = instance.visit_FunctionDef(node)
        self.assertIsInstance(result, ast.FunctionDef)

    def test_str_method(self):
        instance = ReturnFromGeneratorTransformer()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = ReturnFromGeneratorTransformer()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = ReturnFromGeneratorTransformer()
        instance2 = ReturnFromGeneratorTransformer()
        self.assertTrue(instance1 == instance2)

class TestReturnFromGeneratorFunction(unittest.TestCase):
    def test_return_from_generator(self):
        result = return_from_generator(1)
        self.assertRaises(StopIteration, lambda: next(result))

if __name__ == '__main__':
    unittest.main()