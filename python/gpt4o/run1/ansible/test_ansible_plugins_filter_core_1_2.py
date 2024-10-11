import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_mandatory_defined(self):
        result = mandatory('defined_value')
        self.assertEqual(result, 'defined_value')

    def test_mandatory_undefined(self):
        from jinja2.runtime import Undefined
        with self.assertRaises(AnsibleFilterError):
            mandatory(Undefined(name='undefined_var'))

    def test_mandatory_custom_message(self):
        from jinja2.runtime import Undefined
        with self.assertRaises(AnsibleFilterError) as context:
            mandatory(Undefined(name='undefined_var'), msg="Custom error message")
        self.assertEqual(str(context.exception), "Custom error message")

    def test_combine_single_dict(self):
        result = combine({'a': 1})
        self.assertEqual(result, {'a': 1})

    def test_combine_multiple_dicts(self):
        result = combine({'a': 1}, {'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_combine_recursive(self):
        result = combine({'a': {'b': 1}}, {'a': {'c': 2}}, recursive=True)
        self.assertEqual(result, {'a': {'b': 1, 'c': 2}})

    def test_combine_invalid_kwargs(self):
        with self.assertRaises(AnsibleFilterError):
            combine({'a': 1}, invalid_kwarg=True)

    def test_comment_plain(self):
        result = comment('This is a comment')
        self.assertEqual(result, '#\n# This is a comment\n#')

    def test_extract(self):
        environment = {}
        container = {'a': {'b': 'value'}}
        result = extract(environment, 'b', container.get('a'))
        self.assertEqual(result, 'value')

    def test_do_groupby(self):
        environment = {}
        value = [{'a': 1}, {'a': 2}, {'a': 1}]
        result = do_groupby(environment, value, 'a', is_async=False)
        self.assertEqual(result, [(1, [{'a': 1}, {'a': 1}]), (2, [{'a': 2}])])

    def test_b64encode(self):
        result = b64encode('test')
        self.assertEqual(result, 'dGVzdA==')

    def test_b64decode(self):
        result = b64decode('dGVzdA==')
        self.assertEqual(result, 'test')

    def test_flatten(self):
        result = flatten([1, [2, [3, 4]], 5])
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_subelements(self):
        obj = [{'a': {'b': [1, 2]}}, {'a': {'b': [3, 4]}}]
        result = subelements(obj, 'a.b')
        self.assertEqual(result, [({'a': {'b': [1, 2]}}, 1), ({'a': {'b': [1, 2]}}, 2), ({'a': {'b': [3, 4]}}, 3), ({'a': {'b': [3, 4]}}, 4)])

    def test_subelements_skip_missing(self):
        obj = [{'a': {'b': [1, 2]}}, {'a': {}}]
        result = subelements(obj, 'a.b', skip_missing=True)
        self.assertEqual(result, [({'a': {'b': [1, 2]}}, 1), ({'a': {'b': [1, 2]}}, 2)])

    def test_subelements_key_error(self):
        obj = [{'a': {'b': [1, 2]}}, {'a': {}}]
        with self.assertRaises(AnsibleFilterError):
            subelements(obj, 'a.b')

    def test_subelements_type_error(self):
        obj = [{'a': {'b': [1, 2]}}, {'a': 'not_a_dict'}]
        with self.assertRaises(AnsibleFilterTypeError):
            subelements(obj, 'a.b')

if __name__ == '__main__':
    unittest.main()