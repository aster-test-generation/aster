import unittest
from ansible.module_utils.common.validation import count_terms, safe_eval, check_mutually_exclusive, check_required_one_of, check_required_together, check_required_by
from ansible.module_utils.common.validation import *


class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        self.assertEqual(count_terms('foo', ['foo', 'bar']), 1)
        self.assertEqual(count_terms('foo', ['bar', 'baz']), 0)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar']), 2)
        self.assertEqual(count_terms(['foo', 'bar'], ['bar', 'baz']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['baz', 'qux']), 0)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1 + 1'), 2)
        self.assertEqual(safe_eval('1 + 1', include_exceptions=True)[0], 2)
        self.assertIsInstance(safe_eval('1 + 1', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[0], 'import os')
        self.assertIsInstance(safe_eval('import os', include_exceptions=True)[1], Exception)

    def test_check_mutually_exclusive(self):
        self.assertEqual(check_mutually_exclusive('foo', ['foo', 'bar']), [])
        self.assertEqual(check_mutually_exclusive('foo', ['bar', 'baz']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['bar', 'baz']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['baz', 'qux']), ['baz', 'qux'])

    def test_check_required_one_of(self):
        self.assertEqual(check_required_one_of('foo', ['foo', 'bar']), ['foo'])
        self.assertEqual(check_required_one_of('foo', ['bar', 'baz']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['bar', 'baz']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['baz', 'qux']), ['foo', 'bar'])

    def test_check_required_together(self):
        self.assertEqual(check_required_together('foo', ['foo', 'bar']), [])
        self.assertEqual(check_required_together('foo', ['bar', 'baz']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['bar', 'baz']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['baz', 'qux']), ['baz', 'qux'])

    def test_check_required_by(self):
        self.assertEqual(check_required_by({'foo': 'bar'}, {'foo': 'bar', 'bar': 'baz'}), {'foo': []})
        self.assertEqual(check_required_by({'foo': 'bar'}, {'foo': 'bar', 'bar': 'baz', 'baz': 'qux'}), {})
        self.assertEqual(check_required_by({'foo': 'bar'}, {'foo': 'bar', 'bar': 'baz', 'baz': 'qux', 'qux': 'foo'}), {})
        self.assertEqual(check_required_by({'foo': 'bar'}, {'foo': 'bar', 'bar': 'baz', 'baz': 'qux', 'qux': 'foo', 'foo': 'bar'}), {})
        self.assertEqual(check_required_by({'foo': 'bar'}, {'foo': 'bar', 'bar': 'baz', 'baz': 'qux', 'qux': 'foo', 'foo': 'baz'}), {'foo': ['bar', 'baz']})

class TestValidation(unittest.TestCase):
    def test_count_terms(self):
        self.assertEqual(count_terms('foo', ['foo', 'bar']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar']), 2)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['baz']), 0)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1+1'), 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[0], 2)
        self.assertIsInstance(safe_eval('1+1', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[0], 'import os')
        self.assertIsInstance(safe_eval('import os', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('1+1', {'foo': 2}, include_exceptions=True)[0], 3)

    def test_check_mutually_exclusive(self):
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar']), ['foo', 'bar'])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['baz']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'baz']), [])

    def test_check_required_one_of(self):
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['baz']), ['foo', 'bar'])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'baz']), ['foo', 'bar'])

    def test_check_required_together(self):
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'foo': 'foo'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'bar': 'bar'}), {'foo': ['bar']})
        self.assertEqual(check_required_together({'foo': ['bar']}, {'baz': 'baz'}), {})

    def test_check_required_by(self):
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo', 'bar': 'bar'}), {})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'foo': 'foo'}), {'foo': ['bar']})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'bar': 'bar'}), {'foo': ['bar']})
        self.assertEqual(check_required_by({'foo': ['bar']}, {'baz': 'baz'}), {})

if __name__ == '__main__':
    unittest.main()