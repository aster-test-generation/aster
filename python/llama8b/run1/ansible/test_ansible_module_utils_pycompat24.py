import unittest
from ansible.module_utils import pycompat24


class TestGetException(unittest.TestCase):
    def test_get_exception(self):
        result = pycompat24.get_exception()
        self.assertIsInstance(result, Exception)

class TestLiteralEval(unittest.TestCase):
    def test_literal_eval_string(self):
        result = pycompat24.literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_tuple(self):
        result = pycompat24.literal_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_literal_eval_list(self):
        result = pycompat24.literal_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_literal_eval_dict(self):
        result = pycompat24.literal_eval("{'a': 1, 'b': 2}")
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_literal_eval_name(self):
        result = pycompat24.literal_eval("None")
        self.assertEqual(result, None)

    def test_literal_eval_unary_sub(self):
        result = pycompat24.literal_eval("-1")
        self.assertEqual(result, -1)

    def test_literal_eval_malformed_string(self):
        with self.assertRaises(ValueError):
            pycompat24.literal_eval("malformed string")

if __name__ == '__main__':
    unittest.main()