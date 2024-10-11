import unittest
from ansible.module_utils.common.validation import *

class TestCountTerms(unittest.TestCase):
    def test_count_terms_with_list(self):
        terms = ['term1', 'term2']
        parameters = ['term1', 'term2', 'term3']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_count_terms_with_string(self):
        terms = 'term1'
        parameters = ['term1', 'term2', 'term3']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 1)

    def test_count_terms_with_none(self):
        terms = None
        parameters = ['term1', 'term2', 'term3']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 0)

class TestSafeEval(unittest.TestCase):
    def test_safe_eval_with_string(self):
        value = '1 + 1'
        result, exception = safe_eval(value)
        self.assertEqual(result, 2)
        self.assertIsNone(exception)

    def test_safe_eval_with_int(self):
        value = 1
        result, exception = safe_eval(value)
        self.assertEqual(result, 1)
        self.assertIsNone(exception)

    def test_safe_eval_with_exception(self):
        value = 'import os'
        result, exception = safe_eval(value)
        self.assertEqual(result, value)
        self.assertIsNotNone(exception)

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive_with_list(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, ['term1', 'term2'])

    def test_check_mutually_exclusive_with_string(self):
        terms = 'term1'
        parameters = ['term1', 'term2', 'term3']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, ['term1'])

    def test_check_mutually_exclusive_with_none(self):
        terms = None
        parameters = ['term1', 'term2', 'term3']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of_with_list(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, ['term1', 'term2'])

    def test_check_required_one_of_with_string(self):
        terms = 'term1'
        parameters = ['term1', 'term2', 'term3']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, ['term1'])

    def test_check_required_one_of_with_none(self):
        terms = None
        parameters = ['term1', 'term2', 'term3']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together_with_list(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term2', 'term3']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, ['term1', 'term2'])

    def test_check_required_together_with_string(self):
        terms = 'term1'
        parameters = ['term1', 'term2', 'term3']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, ['term1'])

    def test_check_required_together_with_none(self):
        terms = None
        parameters = ['term1', 'term2', 'term3']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()