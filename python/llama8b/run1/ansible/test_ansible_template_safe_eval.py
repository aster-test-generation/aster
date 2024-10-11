import unittest
from ansible.module_utils.basic import safe_eva


class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        result = safe_eval('a + 1', locals={'a': 1})
        self.assertEqual(result, 2)

    def test_safe_eval_with_include_exceptions(self):
        result, exception = safe_eval('1 / 0', include_exceptions=True)
        self.assertEqual(result, None)
        self.assertIsInstance(exception, ZeroDivisionError)

    def test_safe_eval_with_invalid_expression(self):
        with self.assertRaises(Exception):
            safe_eval('1 + 2 * (3 + 4)')

    def test_safe_eval_with_invalid_function(self):
        with self.assertRaises(Exception):
            safe_eval('print("Hello")')

    def test_safe_eval_with_invalid_name(self):
        with self.assertRaises(Exception):
            safe_eval('a')

    def test_safe_eval_with_invalid_call(self):
        with self.assertRaises(Exception):
            safe_eval('a()')

    def test_safe_eval_with_invalid_expression_syntax(self):
        with self.assertRaises(SyntaxError):
            safe_eval('1 +')

    def test_safe_eval_with_invalid_expression_syntax2(self):
        with self.assertRaises(SyntaxError):
            safe_eval('1')

    def test_safe_eval_with_invalid_expression_syntax3(self):
        with self.assertRaises(SyntaxError):
            safe_eval('1 + 2')

if __name__ == '__main__':
    unittest.main()