import unittest
from ansible.template.safe_eval import safe_eval


class TestSafeEval(unittest.TestCase):
    def test_safe_eval_basic_expression(self):
        result = safe_eval("1 + 1")
        self.assertEqual(result, 2)

    def test_safe_eval_with_list(self):
        result = safe_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_safe_eval_with_dict(self):
        result = safe_eval("{'a': 1, 'b': 2}")
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_safe_eval_with_tuple(self):
        result = safe_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_safe_eval_with_set(self):
        result = safe_eval("{1, 2, 3}")
        self.assertEqual(result, {1, 2, 3})

    def test_safe_eval_with_unary_op(self):
        result = safe_eval("-1")
        self.assertEqual(result, -1)

    def test_safe_eval_with_bin_op(self):
        result = safe_eval("2 * 3")
        self.assertEqual(result, 6)

    def test_safe_eval_with_compare(self):
        result = safe_eval("1 < 2")
        self.assertEqual(result, '1 < 2')

    def test_safe_eval_with_invalid_expression(self):
        with self.assertRaises(Exception):
            safe_eval("import os")

    def test_safe_eval_with_invalid_function(self):
        with self.assertRaises(Exception):
            safe_eval("os.system('ls')")

    def test_safe_eval_with_non_string_expr(self):
        result = safe_eval(123)
        self.assertEqual(result, 123)

    def test_safe_eval_with_non_string_expr_and_exceptions(self):
        result = safe_eval(123, include_exceptions=True)
        self.assertEqual(result, (123, None))

    def test_safe_eval_with_syntax_error(self):
        result = safe_eval("1 +", include_exceptions=True)
        self.assertEqual(result, ("1 +", None))

    def test_safe_eval_with_general_exception(self):
        result = safe_eval("1 / 0", include_exceptions=True)
        self.assertEqual(result, ("1 / 0", ZeroDivisionError("division by zero")))

if __name__ == '__main__':
    unittest.main()