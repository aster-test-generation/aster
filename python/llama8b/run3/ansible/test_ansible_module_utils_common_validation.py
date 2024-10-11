import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'c', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 3)

    def test_count_terms_empty_terms(self):
        terms = []
        parameters = ['a', 'b', 'c', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_count_terms_empty_parameters(self):
        terms = ['a', 'b', 'c']
        parameters = []
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_safe_eval(self):
        value = '1 + 2'
        result = safe_eval(value)
        self.assertEqual(result, 3)

    def test_safe_eval_include_exceptions(self):
        value = '1 + 2'
        result, exception = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, 3)
        self.assertIsNone(exception)

    def test_safe_eval_invalid_input(self):
        value = '1 + 2 *'
        result, exception = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, value)
        self.assertIsNotNone(exception)

    def test_check_mutually_exclusive(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_multiple_results(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, ['a|b', 'c|d'])

    def test_check_required_one_of(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_no_match(self):
        terms = ['a', 'b', 'c']
        parameters = ['d', 'e', 'f']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_no_match(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'c', 'e']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, ['a|b'])

    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'b', 'b': 'x', 'c': 'y'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'a': ['c']})

    def test_check_required_by_missing(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': None, 'b': 'x', 'c': 'y'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'a': ['b', 'c']})

if __name__ == '__main__':
    unittest.main()