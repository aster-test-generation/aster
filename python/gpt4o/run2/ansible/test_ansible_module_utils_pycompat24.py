import unittest
import sys
from ansible.module_utils.pycompat24 import get_exception, literal_eval


class TestPycompat24(unittest.TestCase):
    def test_get_exception(self):
        try:
            raise ValueError("Test exception")
        except ValueError:
            result = get_exception()
            self.assertEqual(str(result), "Test exception")

    def test_literal_eval_const(self):
        result = literal_eval("42")
        self.assertEqual(result, 42)

    def test_literal_eval_tuple(self):
        result = literal_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_literal_eval_list(self):
        result = literal_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_literal_eval_dict(self):
        result = literal_eval("{'a': 1, 'b': 2}")
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_literal_eval_name(self):
        result = literal_eval("True")
        self.assertEqual(result, True)

    def test_literal_eval_unarysub(self):
        result = literal_eval("-42")
        self.assertEqual(result, -42)

    def test_literal_eval_malformed_string(self):
        with self.assertRaises(ValueError):
            literal_eval("malformed")

if __name__ == '__main__':
    unittest.main()