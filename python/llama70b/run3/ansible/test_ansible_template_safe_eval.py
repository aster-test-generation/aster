import unittest
from ansible.utils.template import safe_eva


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

    def test_safe_eval_non_string_input(self):
        result = safe_eval(42)
        self.assertEqual(result, 42)

    def test_CleansingNodeVisitor_generic_visit(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Constant(value=42)
        cnv.generic_visit(node)
        # No exception should be raised

    def test_CleansingNodeVisitor_invalid_expression(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Call(func=ast.Name(id='invalid_function', ctx=ast.Load()), args=[])
        with self.assertRaises(Exception):
            cnv.generic_visit(node)

    def test_CleansingNodeVisitor_invalid_function(self):
        cnv = safe_eval.CleansingNodeVisitor()
        node = ast.Call(func=ast.Name(id='builtins_sum', ctx=ast.Load()), args=[])
        with self.assertRaises(Exception):
            cnv.generic_visit(node)

    def test_OUR_GLOBALS(self):
        self.assertEqual(safe_eval.OUR_GLOBALS['__builtins__'], {})
        self.assertEqual(safe_eval.OUR_GLOBALS['false'], False)
        self.assertEqual(safe_eval.OUR_GLOBALS['null'], None)
        self.assertEqual(safe_eval.OUR_GLOBALS['true'], True)
        self.assertEqual(safe_eval.OUR_GLOBALS['True'], True)
        self.assertEqual(safe_eval.OUR_GLOBALS['False'], False)
        self.assertEqual(safe_eval.OUR_GLOBALS['None'], None)

    def test_SAFE_NODES(self):
        self.assertIsInstance(safe_eval.SAFE_NODES, set)
        self.assertIn(ast.Add, safe_eval.SAFE_NODES)
        self.assertIn(ast.BinOp, safe_eval.SAFE_NODES)
        self.assertIn(ast.Compare, safe_eval.SAFE_NODES)
        # ... and so on for all nodes in SAFE_NODES

    def test_CALL_ENABLED(self):
        self.assertIsInstance(safe_eval.CALL_ENABLED, list)
        self.assertEqual(len(safe_eval.CALL_ENABLED), 0)

if __name__ == '__main__':
    unittest.main()