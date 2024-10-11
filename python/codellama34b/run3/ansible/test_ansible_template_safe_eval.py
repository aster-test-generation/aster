import unittest
from ansible.template.safe_eval import *


class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        expr = "1 + 1"
        locals = {}
        include_exceptions = False
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        expr = "a + b"
        locals = {"a": 1, "b": 2}
        include_exceptions = False
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, 3)

    def test_safe_eval_with_exceptions(self):
        expr = "1 + 1"
        locals = {}
        include_exceptions = True
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_exceptions_and_locals(self):
        expr = "a + b"
        locals = {"a": 1, "b": 2}
        include_exceptions = True
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_expression(self):
        expr = "1 + 1 +"
        locals = {}
        include_exceptions = False
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, "1 + 1 +")

    def test_safe_eval_with_invalid_expression_and_locals(self):
        expr = "a + b +"
        locals = {"a": 1, "b": 2}
        include_exceptions = False
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, "1 + 2 +")

    def test_safe_eval_with_invalid_expression_and_exceptions(self):
        expr = "1 + 1 +"
        locals = {}
        include_exceptions = True
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, ("1 + 1 +", None))

    def test_safe_eval_with_invalid_expression_and_exceptions_and_locals(self):
        expr = "a + b +"
        locals = {"a": 1, "b": 2}
        include_exceptions = True
        result = safe_eval(expr, locals, include_exceptions)
        self.assertEqual(result, ("1 + 2 +", None))

if __name__ == '__main__':
    unittest.main()