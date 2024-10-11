import unittest
from ansible.module_utils.common.validation import count_terms, safe_eval, check_mutually_exclusive, check_required_one_of, check_required_together, check_required_by

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b'], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_string(self):
        result = safe_eval('import os')
        self.assertEqual(result, 'import os')

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, [['a', 'b'], ['b', 'c']])

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b'], ['b', 'c']], {'a': 1, 'c': 3})
        self.assertEqual(result, [['b', 'c']])

    def test_check_required_together(self):
        result = check_required_together([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, [['a', 'b']])

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1, 'b': 2})
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()