import unittest
from ansible.module_utils.common.validation import (
    count_terms,
    safe_eval,
    check_mutually_exclusive,
    check_required_one_of,
    check_required_together,
    check_required_by,
)


class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        terms = ['a', 'b', 'c']
        parameters = {'a', 'b', 'd'}
        self.assertEqual(count_terms(terms, parameters), 2)

    def test_safe_eval(self):
        value = '1 + 1'
        result, error = safe_eval(value, include_exceptions=True)
        self.assertEqual(result, '1 + 1')
        self.assertIsNone(error)

    def test_check_mutually_exclusive(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a', 'c'}
        self.assertEqual(check_mutually_exclusive(terms, parameters), [])

    def test_check_required_one_of(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a', 'c'}
        self.assertEqual(check_required_one_of(terms, parameters), [])

    def test_check_required_together(self):
        terms = [['a', 'b'], ['c', 'd']]
        parameters = {'a', 'c'}
        self.assertEqual(check_required_together(terms, parameters), [])

    def test_check_required_by(self):
        requirements = {'a': 'b', 'c': 'd'}
        parameters = {'a': 1, 'c': 2}
        self.assertEqual(check_required_by(requirements, parameters), {'b'})

if __name__ == '__main__':
    unittest.main()