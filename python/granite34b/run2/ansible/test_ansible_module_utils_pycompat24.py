import unittest
from ansible.module_utils.pycompat24 import get_exception, literal_eval


class TestPyCompat24(unittest.TestCase):
    def test_get_exception(self):
        try:
            raise Exception("Test exception")
        except Exception:
            exception = get_exception()
            self.assertEqual(str(exception), "Test exception")

    def test_literal_eval_int(self):
        result = literal_eval("1")
        self.assertEqual(result, 1)

    def test_literal_eval_float(self):
        result = literal_eval("1.2")
        self.assertEqual(result, 1.2)

    def test_literal_eval_str(self):
        result = literal_eval("'test'")
        self.assertEqual(result, "test")

    def test_literal_eval_list(self):
        result = literal_eval("[1, 2, 3]")
        self.assertEqual(result, [1, 2, 3])

    def test_literal_eval_tuple(self):
        result = literal_eval("(1, 2, 3)")
        self.assertEqual(result, (1, 2, 3))

    def test_literal_eval_dict(self):
        result = literal_eval("{1: 2, 3: 4}")
        self.assertEqual(result, {1: 2, 3: 4})

    def test_literal_eval_complex(self):
        result = literal_eval("1 + 2j")
        self.assertEqual(result, 1 + 2j)

if __name__ == '__main__':
    unittest.main()