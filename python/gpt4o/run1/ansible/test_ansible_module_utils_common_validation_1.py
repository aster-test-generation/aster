import unittest
from ansible.module_utils.common.validation import *


class TestValidationFunctions(unittest.TestCase):
    def test_count_terms_single_term(self):
        result = count_terms('term1', ['term1', 'term2'])
        self.assertEqual(result, 1)

    def test_count_terms_multiple_terms(self):
        result = count_terms(['term1', 'term2'], ['term1', 'term2', 'term3'])
        self.assertEqual(result, 2)

    def test_safe_eval_non_string(self):
        result = safe_eval(123)
        self.assertEqual(result, 123)

    def test_safe_eval_string_literal(self):
        result = safe_eval('123')
        self.assertEqual(result, 123)

    def test_safe_eval_string_with_function(self):
        result = safe_eval('os.path.join("a", "b")')
        self.assertEqual(result, 'os.path.join("a", "b")')

    def test_safe_eval_string_with_import(self):
        result = safe_eval('import os')
        self.assertEqual(result, 'import os')

    def test_safe_eval_with_exception(self):
        result = safe_eval('invalid_syntax', include_exceptions=True)
        self.assertIsInstance(result[1], Exception)

    def test_check_mutually_exclusive_no_terms(self):
        result = check_mutually_exclusive(None, ['param1', 'param2'])
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_no_conflict(self):
        result = check_mutually_exclusive([['param1', 'param2']], ['param1'])
        self.assertEqual(result, [])

    def test_check_mutually_exclusive_with_conflict(self):
        with self.assertRaises(TypeError):
            check_mutually_exclusive([['param1', 'param2']], ['param1', 'param2'])

    def test_check_required_one_of_no_terms(self):
        result = check_required_one_of(None, ['param1', 'param2'])
        self.assertEqual(result, [])

    def test_check_required_one_of_no_missing(self):
        result = check_required_one_of([['param1', 'param2']], ['param1'])
        self.assertEqual(result, [])

    def test_check_required_one_of_with_missing(self):
        with self.assertRaises(TypeError):
            check_required_one_of([['param1', 'param2']], ['param3'])

    def test_check_required_together_no_terms(self):
        result = check_required_together(None, ['param1', 'param2'])
        self.assertEqual(result, [])

    def test_check_required_together_no_missing(self):
        result = check_required_together([['param1', 'param2']], ['param1', 'param2'])
        self.assertEqual(result, [])

    def test_check_required_together_with_missing(self):
        with self.assertRaises(TypeError):
            check_required_together([['param1', 'param2']], ['param1'])

    def test_check_required_by_no_requirements(self):
        result = check_required_by(None, {'param1': 'value1'})
        self.assertEqual(result, {})

    def test_check_required_by_no_missing(self):
        result = check_required_by({'param1': 'param2'}, {'param1': 'value1', 'param2': 'value2'})
        self.assertEqual(result, {})

    def test_check_required_by_with_missing(self):
        with self.assertRaises(TypeError):
            check_required_by({'param1': 'param2'}, {'param1': 'value1'})

if __name__ == '__main__':
    unittest.main()