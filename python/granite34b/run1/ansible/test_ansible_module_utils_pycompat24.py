import unittest
from ansible.module_utils.pycompat24 import get_exception, literal_eval


class TestPyCompat24(unittest.TestCase):
    def test_get_exception(self):
        try:
            raise Exception("Test exception")
        except Exception:
            exception = get_exception()
            self.assertEqual(str(exception), "Test exception")

    def test_literal_eval(self):
        self.assertEqual(literal_eval("1 + 2"), 3)
        self.assertEqual(literal_eval("[1, 2, 3]"), [1, 2, 3])
        self.assertEqual(literal_eval("{'a': 1, 'b': 2}"), {'a': 1, 'b': 2})
        self.assertEqual(literal_eval("1 - 2"), -1)

if __name__ == '__main__':
    unittest.main()