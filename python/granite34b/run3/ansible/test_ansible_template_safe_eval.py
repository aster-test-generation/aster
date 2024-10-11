import unittest
from ansible.template.safe_eval import safe_eval


class TestSafeEval(unittest.TestCase):
    def test_safe_eval_with_valid_input(self):
        expr = "1 + 2"
        result = safe_eval(expr)
        self.assertEqual(result, 3)

    def test_safe_eval_with_invalid_input(self):
        expr = "1 + 2 + foo(bar)"
        with self.assertRaises(Exception) as context:
            safe_eval(expr)
        self.assertTrue("invalid function" in str(context.exception))

    def test_safe_eval_with_private_method(self):
        expr = "self.__private_method(3)"
        with self.assertRaises(Exception) as context:
            safe_eval(expr)
        self.assertTrue("invalid function" in str(context.exception))

    def test_safe_eval_with_protected_method(self):
        expr = "self._protected_method(3)"
        result = safe_eval(expr)
        self.assertEqual(self._protected_method(3), 6)

    def test_safe_eval_with_magic_method(self):
        expr = "self.__str__()"
        result = safe_eval(expr)
        self.assertEqual(str(result), "ExampleClass")

if __name__ == '__main__':
    unittest.main()