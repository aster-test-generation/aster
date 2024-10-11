import unittest
from ansible.module_utils.common.validation import *


class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        self.assertEqual(count_terms('foo', ['foo', 'bar']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar']), 2)
        self.assertEqual(count_terms('foo', ['bar']), 0)
        self.assertEqual(count_terms(['foo', 'bar'], ['baz']), 0)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1+1'), '1+1')
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[0], 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[1], None)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[0], 'import os')
        self.assertIsInstance(safe_eval('import os', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('foo.bar', include_exceptions=True)[0], 'foo.bar')
        self.assertIsInstance(safe_eval('foo.bar', include_exceptions=True)[1], Exception)

    def test_check_mutually_exclusive(self):
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo']), ['foo', 'bar'])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['bar']), ['foo', 'bar'])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['baz']), [])

    def test_check_required_one_of(self):
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar']), ['foo', 'bar'])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['baz']), ['foo', 'bar'])

    def test_check_required_together(self):
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {'foo': ['bar'], 'bar': ['foo']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo', 'baz': 'baz'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'bar': 'bar', 'baz': 'baz'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'baz': 'baz'}), {})

    def test_check_required_by(self):
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {'foo': []})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo', 'baz': 'baz'}), {'foo': ['bar']})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'bar': 'bar', 'baz': 'baz'}), {'foo': ['bar']})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'baz': 'baz'}), {'foo': ['bar']})

class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        terms = ['term1', 'term2']
        parameters = ['term1', 'term3']
        self.assertEqual(count_terms(terms, parameters), 1)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1+1'), 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[0], 2)
        self.assertIsInstance(safe_eval('1+1', include_exceptions=True)[1], Exception)

    def test_check_mutually_exclusive(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term3']
        self.assertEqual(check_mutually_exclusive(terms, parameters), ['term1', 'term3'])

    def test_check_required_one_of(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term5']
        self.assertEqual(check_required_one_of(terms, parameters), ['term1', 'term5'])

    def test_check_required_together(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = {'term1': 'value1', 'term3': 'value3'}
        self.assertEqual(check_required_together(terms, parameters), {'term1': 'value1', 'term3': 'value3'})

    def test_check_required_by(self):
        requirements = {'term1': ['term2', 'term3'], 'term4': ['term5', 'term6']}
        parameters = {'term1': 'value1', 'term4': 'value4'}
        self.assertEqual(check_required_by(requirements, parameters), {'term1': ['term2', 'term3']})

if __name__ == '__main__':
    unittest.main()