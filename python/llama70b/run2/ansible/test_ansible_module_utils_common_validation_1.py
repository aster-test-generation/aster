import unittest
from ansible.module_utils.common.validation import *
from ansible.module_utils.common.validation import count_terms, safe_eval, check_mutually_exclusive, check_required_one_of, check_required_together, check_required_by


class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = {'a': 1, 'b': 2, 'c': 3}
        result = count_terms(terms, parameters)
        self.assertEqual(result, 3)

    def test_safe_eval(self):
        value = '1 + 1'
        result = safe_eval(value)
        self.assertEqual(result, 2)

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = {'a': 1, 'b': 2, 'c': 3}
        with self.assertRaises(TypeError):
            check_mutually_exclusive(terms, parameters)

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = {'a': 1, 'c': 3}
        with self.assertRaises(TypeError):
            check_required_one_of(terms, parameters)

    def test_check_required_together(self):
        terms = [['a', 'b'], ['b', 'c']]
        parameters = {'a': 1, 'c': 3}
        with self.assertRaises(TypeError):
            check_required_together(terms, parameters)

    def test_check_required_by(self):
        requirements = {'a': ['b', 'c']}
        parameters = {'a': 1, 'c': 3}
        with self.assertRaises(TypeError):
            check_required_by(requirements, parameters)

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
        self.assertRaises(TypeError, lambda: result)

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b']], {'c': 1})
        self.assertRaises(TypeError, lambda: result)

    def test_check_required_together(self):
        result = check_required_together([['a', 'b']], {'a': 1, 'c': 2})
        self.assertRaises(TypeError, lambda: result)

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1})
        self.assertRaises(TypeError, lambda: result)

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b'], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_string(self):
        result = safe_eval('import os')
        self.assertEqual(result, 'import os')

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, [['a', 'b'], ['b', 'c']])

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b'], ['b', 'c']], {'a': 1, 'c': 3})
        self.assertEqual(result, [['b', 'c']])

    def test_check_required_together(self):
        result = check_required_together([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(result, [['a', 'b']])

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1, 'b': 2})
        self.assertEqual(result, {})

class TestValidationFunctions(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms(['a', 'b', 'c'], ['a', 'b', 'd'])
        self.assertEqual(result, 2)

    def test_safe_eval(self):
        result = safe_eval('1 + 1')
        self.assertEqual(result, 2)

    def test_safe_eval_include_exceptions(self):
        result = safe_eval('1 + 1', include_exceptions=True)
        self.assertEqual(result, (2, None))

    def test_safe_eval_not_string(self):
        result = safe_eval(2)
        self.assertEqual(result, 2)

    def test_safe_eval_import(self):
        result = safe_eval('import os')
        self.assertEqual(result, 'import os')

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2})
        self.assertEqual(result, [['a', 'b'], ['b', 'c']])

    def test_check_required_one_of(self):
        result = check_required_one_of([['a', 'b'], ['b', 'c']], {'a': 1})
        self.assertEqual(result, [['b', 'c']])

    def test_check_required_together(self):
        result = check_required_together([['a', 'b'], ['b', 'c']], {'a': 1, 'b': 2})
        self.assertEqual(result, [['b', 'c']])

    def test_check_required_by(self):
        result = check_required_by({'a': 'b'}, {'a': 1})
        self.assertEqual(result, {'a': ['b']})

if __name__ == '__main__':
    unittest.main()