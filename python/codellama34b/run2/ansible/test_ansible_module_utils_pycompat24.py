import unittest
from ansible.module_utils.pycompat24 import *


class TestGetException(unittest.TestCase):
    def test_get_exception(self):
        result = get_exception()
        self.assertEqual(result, None)

class TestLiteralEval(unittest.TestCase):
    def test_literal_eval(self):
        result = literal_eval("1")
        self.assertEqual(result, 1)

    def test_literal_eval_with_tuple(self):
        result = literal_eval("(1,2)")
        self.assertEqual(result, (1,2))

    def test_literal_eval_with_list(self):
        result = literal_eval("[1,2]")
        self.assertEqual(result, [1,2])

    def test_literal_eval_with_dict(self):
        result = literal_eval("{'a':1}")
        self.assertEqual(result, {'a':1})

    def test_literal_eval_with_name(self):
        result = literal_eval("None")
        self.assertEqual(result, None)

    def test_literal_eval_with_unary_sub(self):
        result = literal_eval("-1")
        self.assertEqual(result, -1)

if __name__ == '__main__':
    unittest.main()