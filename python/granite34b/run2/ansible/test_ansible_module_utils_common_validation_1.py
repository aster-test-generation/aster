import unittest
from ansible.module_utils.common.validation import *


class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        self.assertEqual(count_terms(terms, parameters), 2)

    def test_safe_eval(self):
        value = '1 + 2'
        result = safe_eval(value)
        self.assertEqual(result, '1 + 2')

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 2}
        self.assertEqual(check_mutually_exclusive(terms, parameters), [])

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1}
        self.assertEqual(check_required_one_of(terms, parameters), [['c', 'd']])

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 2}
        self.assertEqual(check_required_together(terms, parameters), [])

    def test_check_required_by(self):
        requirements = {'a': 'b'}
        parameters = {'a': 1}
        self.assertEqual(check_required_by(requirements, parameters), {'a': ['b']})

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        self.assertEqual(count_terms(terms, parameters), 2)

    def test_safe_eval(self):
        value = '1 + 1'
        result, exception = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, 2)
        self.assertIsNone(exception)

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 2}
        with self.assertRaises(TypeError) as context:
            check_mutually_exclusive(terms, parameters)
        self.assertEqual(str(context.exception), "parameters are mutually exclusive: ['a', 'b']")

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1}
        with self.assertRaises(TypeError) as context:
            check_required_one_of(terms, parameters)
        self.assertEqual(str(context.exception), "one of the following is required: ['c', 'd']")

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 2}
        with self.assertRaises(TypeError) as context:
            check_required_together(terms, parameters)
        self.assertEqual(str(context.exception), "parameters are required together: ['c', 'd']")

    def test_check_required_by(self):
        requirements = {'a': 'b', 'c': 'd'}
        parameters = {'a': 1, 'c': 2}
        with self.assertRaises(TypeError) as context:
            check_required_by(requirements, parameters)
        self.assertEqual(str(context.exception), "missing parameter(s) required by 'a': b")

if __name__ == '__main__':
    unittest.main()