import unittest
from ansible.module_utils.common.dict_transformations import *



class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['a'])
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_value_is_list(self):
        camel_dict = {'a': []}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': []})

    def test_camel_dict_to_snake_dict_value_is_list_value_is_dict(self):
        camel_dict = {'a': [{'b': 1}]}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': [{'b': 1}]})

    def test_camel_dict_to_snake_dict_value_is_dict(self):
        camel_dict = {'a': {'b': 1}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': 1}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_list(self):
        camel_dict = {'a': {'b': [1]}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': [1]}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_dict(self):
        camel_dict = {'a': {'b': {'c': 1}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': {'c': 1}}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_dict_value_is_list(self):
        camel_dict = {'a': {'b': {'c': [1]}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': {'c': [1]}}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_dict_value_is_dict(self):
        camel_dict = {'a': {'b': {'c': {'d': 1}}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': {'c': {'d': 1}}}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_dict_value_is_dict_value_is_list(self):
        camel_dict = {'a': {'b': {'c': {'d': [1]}}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'a': {'b': {'c': {'d': [1]}}}})

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_value_is_list(self):
        camel_dict = {'test': []}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': []})

    def test_camel_dict_to_snake_dict_value_is_list_reversible(self):
        camel_dict = {'test': []}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {'test': []})

    def test_camel_dict_to_snake_dict_value_is_list_ignore_list(self):
        camel_dict = {'test': []}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {'test': []})

    def test_camel_dict_to_snake_dict_value_is_dict(self):
        camel_dict = {'test': {}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': {}})

    def test_camel_dict_to_snake_dict_value_is_dict_reversible(self):
        camel_dict = {'test': {}}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {'test': {}})

    def test_camel_dict_to_snake_dict_value_is_dict_ignore_list(self):
        camel_dict = {'test': {}}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {'test': {}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_list(self):
        camel_dict = {'test': {'test': []}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': {'test': []}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_list_reversible(self):
        camel_dict = {'test': {'test': []}}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {'test': {'test': []}})

    def test_camel_dict_to_snake_dict_value_is_dict_value_is_list_ignore_list(self):
        camel_dict = {'test': {'test': []}}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {'test': {'test': []}})

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, ignore_list=["camelCase", "camelCase2"])
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })


class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {})

    def test_dict_merge(self):
        a = {}
        b = {}
        result = dict_merge(a, b)
        self.assertEqual(result, {})

    def test_recursive_diff(self):
        dict1 = {}
        dict2 = {}
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()