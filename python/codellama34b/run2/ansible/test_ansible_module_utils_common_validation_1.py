import unittest
from ansible.module_utils.common.validation import *



class TestCountTerms(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'c']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 3)

    def test_count_terms_iterable(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'c']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 3)

    def test_count_terms_not_iterable(self):
        terms = 'a'
        parameters = ['a', 'b', 'c']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 1)

class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        value = 'a'
        result = safe_eval(value)
        self.assertEqual(result, 'a')

    def test_safe_eval_include_exceptions(self):
        value = 'a'
        result = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, ('a', ValueError('malformed node or string on line 1: <ast.Name object at 0x7f27c6d80d00>')))

    def test_safe_eval_literal_eval(self):
        value = 'a'
        result = safe_eval(value)
        self.assertEqual(result, 'a')

    def test_safe_eval_literal_eval_exception(self):
        value = 'a'
        result = safe_eval(value)
        self.assertEqual(result, 'a')

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [['a', 'b'], ['c', 'd']])

    def test_check_mutually_exclusive_options_context(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        options_context = ['a', 'b', 'c', 'd']
        result = check_mutually_exclusive(terms, parameters, options_context)
        self.assertEqual(result, [['a', 'b'], ['c', 'd']])

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_options_context(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        options_context = ['a', 'b', 'c', 'd']
        result = check_required_one_of(terms, parameters, options_context)
        self.assertEqual(result, [])

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b', 'c', 'd']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()