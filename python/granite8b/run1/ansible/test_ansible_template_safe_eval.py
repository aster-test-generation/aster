import unittest
from ansible.template.safe_eval import safe_eval


class TestSafeEval(unittest.TestCase):
    def test_safe_eval_int(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_float(self):
        result = safe_eval('1.0 + 1.0')
        self.assertEqual(result, 2.0)

    def test_safe_eval_string(self):
        result = safe_eval('"hello" + " " + "world"')
        self.assertEqual(result, 'hello world')

    def test_safe_eval_bool(self):
        result = safe_eval('True and False')
        self.assertEqual(result, False)

    def test_safe_eval_list(self):
        result = safe_eval('[1, 2, 3]')
        self.assertEqual(result, [1, 2, 3])

    def test_safe_eval_dict(self):
        result = safe_eval('{"a": 1, "b": 2}')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_safe_eval_tuple(self):
        result = safe_eval('(1, 2, 3)')
        self.assertEqual(result, (1, 2, 3))

    def test_safe_eval_function(self):
        result = safe_eval('len("hello")')
        self.assertEqual(result, 5)

    def test_safe_eval_private_method(self):
        result = safe_eval('safe_eval.__name__')
        self.assertEqual(result, 'safe_eval')

    def test_safe_eval_protected_method(self):
        result = safe_eval('safe_eval._safe_eval.__name__')
        self.assertEqual(result, '_safe_eval')

    def test_safe_eval_magic_method(self):
        result = safe_eval('safe_eval.__str__()')
        self.assertEqual(result, '<function safe_eval at 0x7f8c6e1220d0>')

    def test_safe_eval_invalid_expression(self):
        with self.assertRaises(Exception) as cm:
            safe_eval('invalid expression')
        self.assertEqual(str(cm.exception), 'invalid expression (invalid expression)')

    def test_safe_eval_invalid_function(self):
        with self.assertRaises(Exception) as cm:
            safe_eval('open("test.txt")')
        self.assertEqual(str(cm.exception), 'invalid function: open')

if __name__ == '__main__':
    unittest.main()