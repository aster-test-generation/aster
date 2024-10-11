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

    def test_literal_eval_with_safe_names(self):
        self.assertEqual(literal_eval('None'), None)
        self.assertEqual(literal_eval('True'), True)
        self.assertEqual(literal_eval('False'), False)

    def test_literal_eval_with_const(self):
        self.assertEqual(literal_eval('1'), 1)
        self.assertEqual(literal_eval('1.5'), 1.5)
        self.assertEqual(literal_eval('"string"'), "string")

    def test_literal_eval_with_tuple(self):
        self.assertEqual(literal_eval('(1, 2, 3)'), (1, 2, 3))

    def test_literal_eval_with_list(self):
        self.assertEqual(literal_eval('[1, 2, 3]'), [1, 2, 3])

    def test_literal_eval_with_dict(self):
        self.assertEqual(literal_eval('{"key": "value"}'), {"key": "value"})

    def test_literal_eval_with_unarysub(self):
        self.assertEqual(literal_eval('-1'), -1)

    def test_literal_eval_with_malformed_string(self):
        with self.assertRaises(ValueError):
            literal_eval('malformed')

if __name__ == '__main__':
    unittest.main()