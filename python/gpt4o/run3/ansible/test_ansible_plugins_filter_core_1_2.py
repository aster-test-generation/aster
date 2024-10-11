import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_mandatory_defined(self):
        result = mandatory("defined_value")
        self.assertEqual(result, "defined_value")

    def test_mandatory_undefined(self):
        from jinja2.runtime import Undefined
        with self.assertRaises(AnsibleFilterError):
            mandatory(Undefined(name="undefined_var"))

    def test_combine(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        result = combine(dict1, dict2)
        self.assertEqual(result, {'a': 1, 'b': 3, 'c': 4})

    def test_combine_recursive(self):
        dict1 = {'a': {'x': 1}, 'b': 2}
        dict2 = {'a': {'y': 2}, 'b': 3}
        result = combine(dict1, dict2, recursive=True)
        self.assertEqual(result, {'a': {'x': 1, 'y': 2}, 'b': 3})

    def test_combine_invalid_kwargs(self):
        with self.assertRaises(AnsibleFilterError):
            combine({}, invalid_kwarg=True)

    def test_comment_plain(self):
        result = comment("This is a comment")
        self.assertEqual(result, "#\n# This is a comment\n#")

    def test_extract(self):
        environment = {}
        container = {'a': {'b': {'c': 1}}}
        result = extract(environment.get, 'a', container, ['b', 'c'])
        self.assertEqual(result, 1)

    def test_do_groupby(self):
        environment = {}
        value = [{'name': 'apple', 'type': 'fruit'}, {'name': 'carrot', 'type': 'vegetable'}, {'name': 'banana', 'type': 'fruit'}]
        result = do_groupby(environment, value, 'type', is_async=False)
        self.assertEqual(result, [('fruit', [{'name': 'apple', 'type': 'fruit'}, {'name': 'banana', 'type': 'fruit'}]), ('vegetable', [{'name': 'carrot', 'type': 'vegetable'}])])

    def test_b64encode(self):
        result = b64encode("test")
        self.assertEqual(result, "dGVzdA==")

    def test_b64decode(self):
        result = b64decode("dGVzdA==")
        self.assertEqual(result, "test")

    def test_flatten(self):
        nested_list = [1, [2, [3, 4], 5], 6]
        result = flatten(nested_list)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6])

    def test_subelements(self):
        obj = [{'a': {'b': [1, 2, 3]}}, {'a': {'b': [4, 5]}}]
        result = subelements(obj, 'a.b')
        self.assertEqual(result, [({'a': {'b': [1, 2, 3]}}, 1), ({'a': {'b': [1, 2, 3]}}, 2), ({'a': {'b': [1, 2, 3]}}, 3), ({'a': {'b': [4, 5]}}, 4), ({'a': {'b': [4, 5]}}, 5)])

    def test_subelements_skip_missing(self):
        obj = [{'a': {'b': [1, 2, 3]}}, {'a': {}}]
        result = subelements(obj, 'a.b', skip_missing=True)
        self.assertEqual(result, [({'a': {'b': [1, 2, 3]}}, 1), ({'a': {'b': [1, 2, 3]}}, 2), ({'a': {'b': [1, 2, 3]}}, 3)])

    def test_subelements_key_error(self):
        obj = [{'a': {'b': [1, 2, 3]}}, {'a': {}}]
        with self.assertRaises(AnsibleFilterError):
            subelements(obj, 'a.b')

    def test_subelements_type_error(self):
        obj = [{'a': {'b': [1, 2, 3]}}, {'a': {'b': 'not_a_list'}}]
        with self.assertRaises(AnsibleFilterTypeError):
            subelements(obj, 'a.b')

if __name__ == '__main__':
    unittest.main()