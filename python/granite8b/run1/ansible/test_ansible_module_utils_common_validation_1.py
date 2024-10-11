import unittest
from ansible.module_utils.common.validation import *


class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        self.assertEqual(count_terms('foo', ['foo', 'bar']), 1)
        self.assertEqual(count_terms('foo', ['foo', 'bar', 'foo']), 1)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar']), 2)
        self.assertEqual(count_terms(['foo', 'bar'], ['foo', 'bar', 'foo']), 3)
        self.assertEqual(count_terms(['foo', 'bar'], ['baz']), 0)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1+1'), 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[0], 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[1], None)
        self.assertEqual(safe_eval('1+1', locals={'x': 2}), 3)
        self.assertEqual(safe_eval('x+1', locals={'x': 2}), 3)
        self.assertEqual(safe_eval('x+1', locals={'x': 2}, include_exceptions=True)[0], 3)
        self.assertEqual(safe_eval('x+1', locals={'x': 2}, include_exceptions=True)[1], None)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[0], 'import os')
        self.assertIsInstance(safe_eval('import os', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('os.path.join("/foo", "bar")'), '/foo/bar')

    def test_check_mutually_exclusive(self):
        self.assertEqual(check_mutually_exclusive('foo', ['foo', 'bar']), [])
        self.assertEqual(check_mutually_exclusive('foo', ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['baz']), [])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'baz']), ['foo', 'bar', 'baz'])
        self.assertEqual(check_mutually_exclusive(['foo', 'bar'], ['foo', 'baz'], options_context=['foo', 'bar']), ['foo', 'bar'])

    def test_check_required_one_of(self):
        self.assertEqual(check_required_one_of('foo', ['foo', 'bar']), ['foo'])
        self.assertEqual(check_required_one_of('foo', ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['baz']), [])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'baz']), ['foo', 'bar'])
        self.assertEqual(check_required_one_of(['foo', 'bar'], ['foo', 'baz'], options_context=['foo', 'bar']), ['foo', 'bar'])

    def test_check_required_together(self):
        self.assertEqual(check_required_together('foo', ['foo', 'bar']), [])
        self.assertEqual(check_required_together('foo', ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['foo', 'bar']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['foo', 'bar', 'foo']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['baz']), [])
        self.assertEqual(check_required_together(['foo', 'bar'], ['foo', 'baz']), {'foo': ['baz'], 'bar': []})
        self.assertEqual(check_required_together(['foo', 'bar'], ['foo', 'baz'], options_context=['foo', 'bar']), {'foo': ['baz']})

class TestValidationMethods(unittest.TestCase):
    def test_count_terms(self):
        terms = ['term1', 'term2']
        parameters = ['term1', 'term3']
        self.assertEqual(count_terms(terms, parameters), 1)

    def test_safe_eval(self):
        self.assertEqual(safe_eval('1+1'), 2)
        self.assertEqual(safe_eval('1+1', include_exceptions=True)[0], 2)
        self.assertIsInstance(safe_eval('1+1', include_exceptions=True)[1], Exception)
        self.assertEqual(safe_eval('import os', include_exceptions=True)[0], 'import os')
        self.assertIsInstance(safe_eval('import os', include_exceptions=True)[1], Exception)

    def test_check_mutually_exclusive(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term3']
        self.assertEqual(check_mutually_exclusive(terms, parameters), ['term1', 'term3'])

    def test_check_required_one_of(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = ['term1', 'term5']
        self.assertEqual(check_required_one_of(terms, parameters), ['term1', 'term3', 'term4'])

    def test_check_required_together(self):
        terms = [['term1', 'term2'], ['term3', 'term4']]
        parameters = {'term1': 'value1', 'term3': 'value3'}
        self.assertEqual(check_required_together(terms, parameters), {'term1': ['term3']})

    def test_check_required_by(self):
        requirements = {'term1': ['term2', 'term3'], 'term4': ['term5']}
        parameters = {'term1': 'value1', 'term4': 'value4'}
        self.assertEqual(check_required_by(requirements, parameters), {'term1': ['term2', 'term3']})

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