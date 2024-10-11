import unittest
from ansible.template.safe_eval import safe_eval


class TestSafeEval(unittest.TestCase):
    def test_safe_eval_with_valid_expression(self):
        result = safe_eval("1 + 1")
        self.assertEqual(result, 2)

    def test_safe_eval_with_invalid_expression(self):
        result = safe_eval("1 + 'a'")
        self.assertEqual(result, "1 + 'a'")

    def test_safe_eval_with_valid_expression_and_exceptions(self):
        result, exception = safe_eval("1 + 1", include_exceptions=True)
        self.assertEqual(result, 2)
        self.assertIsNone(exception)

    def test_safe_eval_with_invalid_expression_and_exceptions(self):
        result, exception = safe_eval("1 + 'a'", include_exceptions=True)
        self.assertEqual(result, "1 + 'a'")
        self.assertIsInstance(exception, Exception)

    def test_safe_eval_with_non_string_expression(self):
        result = safe_eval(123)
        self.assertEqual(result, 123)

    def test_safe_eval_with_non_string_expression_and_exceptions(self):
        result, exception = safe_eval(123, include_exceptions=True)
        self.assertEqual(result, 123)
        self.assertIsNone(exception)

    def test_safe_eval_with_function_call(self):
        with self.assertRaises(SomeSpecificException) as context:
            safe_eval("sum([1, 2, 3])")
        self.assertIn("invalid function", str(context.exception))

    def test_safe_eval_with_unsafe_node(self):
        with self.assertRaises(Exception):
            safe_eval("exec('print(1)')")
        self.assertIn("invalid expression", str(context.exception))

    def test_safe_eval_with_safe_node(self):
        result = safe_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()