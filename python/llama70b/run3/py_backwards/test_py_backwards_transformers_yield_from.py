import unittest
from py_backwards.transformers.yield_from import YieldFromTransformer, result_assignment, yield_from


class TestYieldFromTransformer(unittest.TestCase):
    def test_init(self):
        instance = YieldFromTransformer()
        self.assertIsInstance(instance, YieldFromTransformer)

    def test_target(self):
        instance = YieldFromTransformer()
        self.assertEqual(instance.target, (3, 2))

    def test_get_yield_from_index(self):
        instance = YieldFromTransformer()
        node = ast.Module(body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='x', ctx=ast.Load())))])
        self.assertEqual(instance._get_yield_from_index(node, ast.Expr), 0)

    def test_emulate_yield_from(self):
        instance = YieldFromTransformer()
        node = ast.YieldFrom(value=ast.Name(id='x', ctx=ast.Load()))
        result = instance._emulate_yield_from(None, node)
        self.assertIsInstance(result, list)

    def test_handle_assignments(self):
        instance = YieldFromTransformer()
        node = ast.Module(body=[ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='x', ctx=ast.Load())))])
        result = instance._handle_assignments(node)
        self.assertIsInstance(result, ast.Module)

    def test_handle_expressions(self):
        instance = YieldFromTransformer()
        node = ast.Module(body=[ast.Expr(value=ast.YieldFrom(value=ast.Name(id='x', ctx=ast.Load())))])
        result = instance._handle_expressions(node)
        self.assertIsInstance(result, ast.Module)

    def test_visit(self):
        instance = YieldFromTransformer()
        node = ast.Module(body=[ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.YieldFrom(value=ast.Name(id='x', ctx=ast.Load())))])
        result = instance.visit(node)
        self.assertIsInstance(result, ast.Module)

    def test_private_method__tree_changed(self):
        instance = YieldFromTransformer()
        self.assertFalse(instance._YieldFromTransformer__tree_changed)
        instance._handle_assignments(ast.Module(body=[]))
        self.assertTrue(instance._YieldFromTransformer__tree_changed)

    def test_str_method(self):
        instance = YieldFromTransformer()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = YieldFromTransformer()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestResultAssignmentSnippet(unittest.TestCase):
    def test_result_assignment(self):
        exc = ast.Exception()
        target = ast.Name(id='x', ctx=ast.Store())
        result = result_assignment.get_body(exc=exc, target=target)
        self.assertIsInstance(result, list)

class TestYieldFromSnippet(unittest.TestCase):
    def test_yield_from(self):
        generator = ast.Name(id='x', ctx=ast.Load())
        exc = ast.Exception()
        assignment = []
        result = yield_from.get_body(generator=generator, assignment=assignment, exc=exc)
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()