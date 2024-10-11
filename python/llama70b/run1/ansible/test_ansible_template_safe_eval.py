import unittest
from ansible.parsing.template import safe_eva


class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_locals(self):
        result = safe_eval('x + 1', locals={'x': 2})
        self.assertEqual(result, 3)

    def test_safe_eval_include_exceptions(self):
        result, exception = safe_eval('invalid expression', include_exceptions=True)
        self.assertIsNone(result)
        self.assertIsInstance(exception, Exception)

    def test_safe_eval_non_string_expr(self):
        result = safe_eval(42)
        self.assertEqual(result, 42)

    def test_CleansingNodeVisitor_generic_visit(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Constant(value=42)
        cnv.generic_visit(node)
        # No exception raised

    def test_CleansingNodeVisitor_generic_visit_invalid_node(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.FunctionDef(name='foo', args=ast.arguments(args=[]), body=[])
        with self.assertRaises(Exception):
            cnv.generic_visit(node)

    def test_CleansingNodeVisitor_generic_visit_call(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Call(func=ast.Name(id='foo', ctx=ast.Load()), args=[])
        with self.assertRaises(Exception):
            cnv.generic_visit(node)

    def test_CleansingNodeVisitor_generic_visit_name(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Name(id='foo', ctx=ast.Load())
        cnv.generic_visit(node)
        # No exception raised

    def test_OUR_GLOBALS(self):
        self.assertIn('__builtins__', safe_eval.OUR_GLOBALS)
        self.assertIn('false', safe_eval.OUR_GLOBALS)
        self.assertIn('null', safe_eval.OUR_GLOBALS)
        self.assertIn('true', safe_eval.OUR_GLOBALS)
        self.assertIn('True', safe_eval.OUR_GLOBALS)
        self.assertIn('False', safe_eval.OUR_GLOBALS)
        self.assertIn('None', safe_eval.OUR_GLOBALS)

    def test_SAFE_NODES(self):
        self.assertIn(ast.Add, safe_eval.SAFE_NODES)
        self.assertIn(ast.BinOp, safe_eval.SAFE_NODES)
        self.assertIn(ast.Compare, safe_eval.SAFE_NODES)
        self.assertIn(ast.Constant, safe_eval.SAFE_NODES)
        self.assertIn(ast.Dict, safe_eval.SAFE_NODES)
        self.assertIn(ast.Div, safe_eval.SAFE_NODES)
        self.assertIn(ast.Expression, safe_eval.SAFE_NODES)
        self.assertIn(ast.List, safe_eval.SAFE_NODES)
        self.assertIn(ast.Load, safe_eval.SAFE_NODES)
        self.assertIn(ast.Mult, safe_eval.SAFE_NODES)
        self.assertIn(ast.Num, safe_eval.SAFE_NODES)
        self.assertIn(ast.Name, safe_eval.SAFE_NODES)
        self.assertIn(ast.Set, safe_eval.SAFE_NODES)
        self.assertIn(ast.Str, safe_eval.SAFE_NODES)
        self.assertIn(ast.Sub, safe_eval.SAFE_NODES)
        self.assertIn(ast.USub, safe_eval.SAFE_NODES)
        self.assertIn(ast.Tuple, safe_eval.SAFE_NODES)
        self.assertIn(ast.UnaryOp, safe_eval.SAFE_NODES)

if __name__ == '__main__':
    unittest.main()