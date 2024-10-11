import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['term1', 'term2']
        parameters = ['term1', 'term2', 'term3']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_count_terms_empty_terms(self):
        terms = []
        parameters = ['term1', 'term2', 'term3']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

    def test_count_terms_empty_parameters(self):
        terms = ['term1', 'term2']
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

    def test_safe_eval_import(self):
        value = 'import math'
        result, exception = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, value)
        self.assertIsNotNone(exception)

    def test_check_mutually_exclusive(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, ['term1|term2', 'term3|term4'])

    def test_check_mutually_exclusive_empty_terms(self):
        terms = []
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_empty_terms(self):
        terms = []
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [['term1', 'term2'], ['term3', 'term4']])

    def test_check_required_together_empty_terms(self):
        terms = []
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_by(self):
        requirements = {'key1': ['term1', 'term2'], 'key2': ['term3', 'term4']}
        parameters = ['term1', 'term2', 'term3', 'term4']
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'key1': [], 'key2': []})

    def test_check_required_by_missing_parameters(self):
        requirements = {'key1': ['term1', 'term2'], 'key2': ['term3', 'term4']}
        parameters = ['term1', 'term2']
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'key1': [], 'key2': ['term3', 'term4']})

if __name__ == '__main__':
    unittest.main()