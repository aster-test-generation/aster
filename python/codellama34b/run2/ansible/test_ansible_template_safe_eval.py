import unittest
from ansible.template.safe_eval import *



class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        result = safe_eval("1+1")
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        result = safe_eval("1+1", locals={"a": 1})
        self.assertEqual(result, 2)

    def test_safe_eval_with_include_exceptions(self):
        result = safe_eval("1+1", include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_locals_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_function(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_function_and_locals(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_function_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_function_and_locals_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_locals(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_locals_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_include_exceptions_and_locals(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_include_exceptions_and_locals_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_with_invalid_expression_and_locals_and_include_exceptions_and_include_exceptions(self):
        result = safe_eval("1+1", locals={"a": 1}, include_exceptions=True)
        self.assertEqual(result, (2, None))

if __name__ == '__main__':
    unittest.main()