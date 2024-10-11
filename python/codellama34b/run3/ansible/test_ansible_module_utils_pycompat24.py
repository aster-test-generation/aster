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

    def test_literal_eval_2(self):
        result = literal_eval("1.0")
        self.assertEqual(result, 1.0)

    def test_literal_eval_3(self):
        result = literal_eval("True")
        self.assertEqual(result, True)

    def test_literal_eval_4(self):
        result = literal_eval("False")
        self.assertEqual(result, False)

    def test_literal_eval_5(self):
        result = literal_eval("None")
        self.assertEqual(result, None)

    def test_literal_eval_6(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_7(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_8(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_9(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_10(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_11(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_12(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_13(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_14(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_15(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_16(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_17(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_18(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_19(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_20(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_21(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_22(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_23(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

    def test_literal_eval_24(self):
        result = literal_eval("'hello'")
        self.assertEqual(result, 'hello')

if __name__ == '__main__':
    unittest.main()