import unittest
from ansible.module_utils.common.validation import *

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        value = '1 + 1'
        result = safe_eval(value)
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        value = 'x + 1'
        locals_dict = {'x': 1}
        result = safe_eval(value, locals_dict)
        self.assertEqual(result, 2)

    def test_safe_eval_with_include_exceptions(self):
        value = 'import os'
        result = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, (value, None))

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [['a', 'b']])

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 1, 'b': 1}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'a': ['c']})

if __name__ == '__main__':
    unittest.main()