import unittest
from ansible.module_utils.common.validation import *


class TestCountTerms(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

class TestSafeEval(unittest.TestCase):
    def test_safe_eval_string(self):
        value = '1 + 1'
        result = safe_eval(value)
        self.assertEqual(result, 2)

    def test_safe_eval_non_string(self):
        value = 2
        result = safe_eval(value)
        self.assertEqual(result, 2)

    def test_safe_eval_import(self):
        value = 'import os'
        result = safe_eval(value)
        self.assertEqual(result, value)

    def test_safe_eval_exception(self):
        value = 'invalid syntax'
        result = safe_eval(value, include_exceptions=True)
        self.assertIsInstance(result[1], Exception)

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_mutually_exclusive(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['c']
        result = check_required_one_of(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'c']
        result = check_required_together(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestCheckRequiredBy(unittest.TestCase):
    def test_check_required_by(self):
        requirements = {'a': 'b'}
        parameters = {'a': 'value'}
        result = check_required_by(requirements, parameters)
        self.assertRaises(TypeError, lambda: result)

if __name__ == '__main__':
    unittest.main()