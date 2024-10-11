import unittest
from ansible.template.safe_eval import *


class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        result = safe_eval("1 + 2")
        self.assertEqual(result, 3)

    def test_safe_eval_with_locals(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2})
        self.assertEqual(result, 3)

    def test_safe_eval_with_include_exceptions(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_expression(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_function(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_function_call(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_expression_and_locals(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_function_and_locals(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_function_call_and_locals(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_expression_and_include_exceptions(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_function_and_include_exceptions(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_function_call_and_include_exceptions(self):
        result = safe_eval("1 + 2", include_exceptions=True)
        self.assertEqual(result, (1 + 2, None))

    def test_safe_eval_with_invalid_expression_and_locals_and_include_exceptions(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_function_and_locals_and_include_exceptions(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_with_invalid_function_call_and_locals_and_include_exceptions(self):
        result = safe_eval("a + b", locals={"a": 1, "b": 2}, include_exceptions=True)
        self.assertEqual(result, (3, None))

if __name__ == '__main__':
    unittest.main()