import unittest
from ansible.module_utils.common.validation import *


class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_count_terms_empty_terms(self):
        terms = []
        parameters = ['a', 'b']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_count_terms_empty_parameters(self):
        terms = ['a', 'b', 'c']
        parameters = []
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_count_terms_no_intersection(self):
        terms = ['a', 'b', 'c']
        parameters = ['d', 'e', 'f']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_safe_eval(self):
        value = '1 + 2'
        result = safe_eval(value)
        self.assertEqual(result, 3)

    def test_safe_eval_include_exceptions(self):
        value = '1 + 2'
        result = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, (3, None))

    def test_safe_eval_invalid_expression(self):
        value = '1 + 2 *'
        result = safe_eval(value)
        self.assertEqual(result, value)

    def test_safe_eval_include_exceptions_invalid_expression(self):
        value = '1 + 2 *'
        result = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, (value, None))

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_no_intersection(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['e', 'f', 'g', 'h']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_intersection(self):
        terms = [['a', 'b'], ['a', 'c']]
        parameters = ['a', 'b', 'c']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, ['a'])

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_no_intersection(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['e', 'f', 'g', 'h']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_intersection(self):
        terms = [['a', 'b'], ['a', 'c']]
        parameters = ['a', 'b', 'c']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, ['a'])

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_no_intersection(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['e', 'f', 'g', 'h']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_intersection(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, ['a', 'b'])

    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'b', 'b': 'x', 'c': 'y'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {})

    def test_check_required_by_missing(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': None, 'b': 'x', 'c': 'y'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'a': ['b', 'c']})

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