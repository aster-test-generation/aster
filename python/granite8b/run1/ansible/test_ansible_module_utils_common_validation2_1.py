import unittest
from ansible.module_utils.common.validation import *

class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        self.assertEqual(count_terms('foo', ['foo', 'bar']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar']), 2)
        self.assertEqual(count_terms('foo', ['bar']), 0)
        self.assertEqual(count_terms(['foo', 'bar'], ['baz']), 0)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1 + 1'), 2)
        self.assertEqual(safe_eval('1 + "1"'), '1 + "1"')
        self.assertEqual(safe_eval('1 + "1"', include_exceptions=True)[1], None)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[1], None)

    def test_check_mutually_exclusive(self):
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar']), ['foo', 'bar'])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['bar']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['baz']), [])

    def test_check_required_one_of(self):
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['baz']), ['foo', 'bar'])

    def test_check_required_together(self):
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'bar': 'bar'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'baz': 'baz'}), {})

    def test_check_required_by(self):
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo'}), {})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'bar': 'bar'}), {})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'baz': 'baz'}), {'foo': ['bar']})

if __name__ == '__main__':
    unittest.main()