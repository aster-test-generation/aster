import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        self.assertEqual(count_terms(terms, parameters), 2)

    def test_safe_eval(self):
        value = '1 + 1'
        result = safe_eval(value)
        self.assertEqual(result, 2)

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 1}
        with self.assertRaises(TypeError) as context:
            check_mutually_exclusive(terms, parameters)
        self.assertTrue('parameters are mutually exclusive' in str(context.exception))

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1}
        with self.assertRaises(TypeError) as context:
            check_required_one_of(terms, parameters)
        self.assertTrue('one of the following is required' in str(context.exception))

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a': 1, 'c': 1}
        with self.assertRaises(TypeError) as context:
            check_required_together(terms, parameters)
        self.assertTrue('parameters are required together' in str(context.exception))

    def test_check_required_by(self):
        requirements = {'a': 'b', 'c': 'd'}
        parameters = {'a': 1, 'c': 1}
        with self.assertRaises(TypeError) as context:
            check_required_by(requirements, parameters)
        self.assertTrue('missing parameter(s) required by' in str(context.exception))

if __name__ == '__main__':
    unittest.main()