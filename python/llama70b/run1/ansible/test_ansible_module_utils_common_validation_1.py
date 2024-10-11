import unittest
from ansible.module_utils.common.validation import *


class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b'], {'a': 1, 'b': 2})
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b']], {'a': 1, 'b': 2})
        self.assertRaises(TypeError, result)

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b']], {'a': 1})
        self.assertRaises(TypeError, result)

    def test_check_required_together(self):
        result = check_required_together([['a', 'b']], {'a': 1, 'b': 2})
        self.assertRaises(TypeError, result)

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1})
        self.assertRaises(TypeError, result)

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

class TestCountTerms(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = ['a', 'b', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 2)

    def test_count_terms_single_term(self):
        terms = 'a'
        parameters = ['a', 'b', 'd']
        result = count_terms(terms, parameters)
        self.assertEqual(result, 1)

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

    def test_safe_eval_attribute_access(self):
        value = 'os.path'
        result = safe_eval(value)
        self.assertEqual(result, value)

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_mutually_exclusive(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

    def test_check_mutually_exclusive_no_conflict(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'c']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_missing(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = []
        result = check_required_one_of(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a', 'b']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_missing(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = ['a']
        result = check_required_together(terms, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestCheckRequiredBy(unittest.TestCase):
    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'value', 'b': 'value', 'c': 'value'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {})

    def test_check_required_by_missing(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'value', 'b': 'value'}
        result = check_required_by(requirements, parameters)
        self.assertRaises(TypeError, lambda: result)

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b'], {'a': 1, 'b': 2})
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_with_locals(self):
        result = safe_eval('x + 1', locals={'x': 2})
        self.assertEqual(result, 3)

    def test_safe_eval_with_include_exceptions(self):
        result = safe_eval('invalid code', include_exceptions=True)
        self.assertIsInstance(result, tuple)
        self.assertEqual(result[1], SyntaxError)

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b']], {'a': 1, 'b': 2})
        self.assertRaises(TypeError, result)

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b']], {'c': 3})
        self.assertRaises(TypeError, result)

    def test_check_required_together(self):
        result = check_required_together([['a', 'b']], {'a': 1})
        self.assertRaises(TypeError, result)

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1})
        self.assertRaises(TypeError, result)

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
        result = safe_eval(value)
        self.assertIsInstance(result, tuple)
        self.assertEqual(result[0], value)
        self.assertIsInstance(result[1], Exception)

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [['a', 'b']])

    def test_check_mutually_exclusive_none(self):
        terms = None
        parameters = ['a', 'b']
        result = check_mutually_exclusive(terms, parameters)
        self.assertEqual(result, [])

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a']
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_one_of_missing(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = []
        result = check_required_one_of(terms, parameters)
        self.assertEqual(result, [['a', 'b'], ['b', 'c']])

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a', 'b']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [])

    def test_check_required_together_missing(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = ['a']
        result = check_required_together(terms, parameters)
        self.assertEqual(result, [['a', 'b']])

class TestCheckRequiredBy(unittest.TestCase):
    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 'value', 'b': 'value'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {'a': ['c']})

    def test_check_required_by_none(self):
        requirements = None
        parameters = {'a': 'value', 'b': 'value'}
        result = check_required_by(requirements, parameters)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()