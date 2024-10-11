import unittest
from ansible.module_utils.common.validation import *

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b'], {'a': 1, 'b': 2})
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        result = safe_eval('x + 1', locals={'x': 2})
        self.assertEqual(result, 3)

    def test_safe_eval_with_include_exceptions(self):
        result = safe_eval('invalid code', include_exceptions=True)
        self.assertIsInstance(result, tuple)
        self.assertEqual(result[1], SyntaxError)

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b']], {'a': 1, 'b': 2})
        self.assertRaises(TypeError, result)

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b']], {'c': 3})
        self.assertRaises(TypeError, result)

    def test_check_required_together(self):
        result = check_required_together([['a', 'b']], {'a': 1})
        self.assertRaises(TypeError, result)

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1})
        self.assertRaises(TypeError, result)

if __name__ == '__main__':
    unittest.main()