import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        value = '1 + 2'
        result = safe_eval(value)
        self.assertEqual(result, 3)

    def test_safe_eval_with_exception(self):
        value = '1 + 2'
        result, exception = safe_eval(value, include_exceptions=True)
        self.assertIsNone(result)
        self.assertIsNotNone(exception)

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_with_error(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'c', 'd']
        with self.assertRaises(TypeError):
            check_mutually_exclusive(terms, parameters)

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'c']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, ['b', 'd'])

    def test_check_required_one_of_with_error(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['c']
        with self.assertRaises(TypeError):
            check_required_one_of(terms, parameters)

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'c']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_with_error(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a']
        with self.assertRaises(TypeError):
            check_required_together(terms, parameters)

    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'b', 'b': 'x', 'c': 'y'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {})

    def test_check_required_by_with_error(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'x', 'b': 'x'}
        with self.assertRaises(TypeError):
            check_required_by(requirements, parameters)

if __name__ == '__main__':
    unittest.main()