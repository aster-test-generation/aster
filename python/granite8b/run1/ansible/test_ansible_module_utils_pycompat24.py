import unittest
from ansible.module_utils.pycompat24 import get_exception, literal_eval


class TestPycompat24(unittest.TestCase):
    def test_get_exception(self):
        try:
            raise Exception("Test Exception")
        except Exception as e:
            self.assertEqual(get_exception(), e)

    def test_literal_eval(self):
        self.assertEqual(literal_eval("1"), 1)
        self.assertEqual(literal_eval("(1, 2, 3)"), (1, 2, 3))
        self.assertEqual(literal_eval("{1: 2, 3: 4}"), {1: 2, 3: 4})
        self.assertEqual(literal_eval("-1"), -1)
        self.assertEqual(literal_eval("True"), True)
        self.assertEqual(literal_eval("False"), False)
        self.assertEqual(literal_eval("'Hello'"), 'Hello')
        self.assertEqual(literal_eval('"Hello"'), 'Hello')
        self.assertEqual(literal_eval("b'Hello'"), b'Hello')
        self.assertEqual(literal_eval("b'Hello'"), b'Hello')
        self.assertEqual(literal_eval("1.0"), 1.0)
        self.assertEqual(literal_eval("1+2j"), 1+2j)

if __name__ == '__main__':
    unittest.main()