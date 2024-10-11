
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

if __name__ == '__main__':
    unittest.main()