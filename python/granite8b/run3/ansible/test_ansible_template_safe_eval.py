import unittest
from ansible.template.safe_eval import safe_eval


class TestSafeEval(unittest.TestCase):
    def test_safe_eval_int(self):
        result = safe_eval("1 + 1")
        self.assertEqual(result, 2)

    def test_safe_eval_float(self):
        result = safe_eval("1.0 + 1.0")
        self.assertEqual(result, 2.0)

    def test_safe_eval_string(self):
        result = safe_eval("'hello' + 'world'")
        self.assertEqual(result, "helloworld")

    def test_safe_eval_list(self):
        result = safe_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_safe_eval_dict(self):
        result = safe_eval("{1: 'one', 2: 'two'}")
        self.assertEqual(result, {1: 'one', 2: 'two'})

    def test_safe_eval_tuple(self):
        result = safe_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_safe_eval_bool(self):
        result = safe_eval("True and False")
        self.assertEqual(result, False)

    def test_safe_eval_private_method(self):
        with self.assertRaises(Exception) as cm:
            safe_eval("safe_eval.__private_method(1)")
        self.assertEqual(str(cm.exception), "invalid function: __private_method")

    def test_safe_eval_protected_method(self):
        with self.assertRaises(Exception) as cm:
            safe_eval("safe_eval._protected_method(1)")
        self.assertEqual(str(cm.exception), "invalid function: _protected_method")

    def test_safe_eval_magic_method(self):
        with self.assertRaises(Exception) as cm:
            safe_eval("safe_eval.__str__()")
        self.assertEqual(str(cm.exception), "invalid function: __str__")

    def test_safe_eval_invalid_syntax(self):
        with self.assertRaises(SyntaxError) as cm:
            safe_eval("1 +")
        self.assertEqual(str(cm.exception), "invalid syntax")

    def test_safe_eval_invalid_function(self):
        with self.assertRaises(Exception) as cm:
            safe_eval("open('file.txt')")
        self.assertEqual(str(cm.exception), "invalid function: open")

    def test_safe_eval_invalid_expression(self):
        with self.assertRaises(Exception) as cm:
            safe_eval("1 + 'hello'")
        self.assertEqual(str(cm.exception), "invalid expression (1 + 'hello')")

if __name__ == '__main__':
    unittest.main()