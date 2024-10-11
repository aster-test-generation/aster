import unittest
from ansible.module_utils.pycompat24 import get_exception, literal_eval


class TestPyCompat24(unittest.TestCase):
    def test_get_exception(self):
        try:
            raise ValueError("Test exception")
        except ValueError as e:
            result = get_exception()
            self.assertEqual(result, e)

    def test_literal_eval(self):
        result = literal_eval("1 + 1")
        self.assertEqual(result, 2)

    def test_literal_eval_string(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_tuple(self):
        result = literal_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_literal_eval_list(self):
        result = literal_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_literal_eval_dict(self):
        result = literal_eval("{'a': 1, 'b': 2}")
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_literal_eval_unary_sub(self):
        result = literal_eval("-1")
        self.assertEqual(result, -1)

    def test_literal_eval_safe_names(self):
        result = literal_eval("None")
        self.assertEqual(result, None)

    def test_literal_eval_safe_names_true(self):
        result = literal_eval("True")
        self.assertEqual(result, True)

    def test_literal_eval_safe_names_false(self):
        result = literal_eval("False")
        self.assertEqual(result, False)

    def test_literal_eval_malformed_string(self):
        with self.assertRaises(ValueError):
            literal_eval("malformed string")

if __name__ == '__main__':
    unittest.main()