import unittest
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer, BaseNodeTransformer


class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_init(self):
        instance = SuperWithoutArgumentsTransformer()
        self.assertIsInstance(instance, BaseNodeTransformer)

    def test_target(self):
        instance = SuperWithoutArgumentsTransformer()
        self.assertEqual(instance.target, (2, 7))

    def test_replace_super_args(self):
        instance = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        instance._tree = ast.Module(body=[ast.FunctionDef(name='func', args=ast.arguments(args=[ast.arg(arg='self')], vararg=None), body=[]), ast.ClassDef(name='cls', bases=[], body=[node])])
        instance._replace_super_args(node)
        self.assertEqual(node.args, [ast.Name(id='cls'), ast.Name(id='self')])

    def test_visit_Call(self):
        instance = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        instance._tree = ast.Module(body=[ast.FunctionDef(name='func', args=ast.arguments(args=[ast.arg(arg='self')], vararg=None), body=[]), ast.ClassDef(name='cls', bases=[], body=[node])])
        result = instance.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(instance._tree_changed)

    def test_visit_Call_not_super(self):
        instance = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='not_super'), args=[])
        result = instance.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(instance._tree_changed)

    def test_str_method(self):
        instance = SuperWithoutArgumentsTransformer()
        result = instance.__str__()
        self.assertEqual(result, "SuperWithoutArgumentsTransformer")

    def test_repr_method(self):
        instance = SuperWithoutArgumentsTransformer()
        result = instance.__repr__()
        self.assertEqual(result, "SuperWithoutArgumentsTransformer()")

    def test_eq_method(self):
        instance1 = SuperWithoutArgumentsTransformer()
        instance2 = SuperWithoutArgumentsTransformer()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()