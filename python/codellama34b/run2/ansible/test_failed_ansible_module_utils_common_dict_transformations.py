from ansible.module_utils.common.dict_transformations import _snake_to_camel

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

    def test_camel_dict_to_snake_dict_complex_type(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_camel_dict_to_snake_dict_complex_type_reversible(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_camel_dict_to_snake_dict_complex_type_ignore_list(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_complex_type(self):
        snake_dict = {'test': {'test': {'test': 'test'}}}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_snake_dict_to_camel_dict_complex_type_capitalize_first(self):
        snake_dict = {'test': {'test': {'test': 'test'}}}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {'Test': {'Test': {'Test': 'test'}}})

class TestSnakeToCamel(unittest.TestCase):
    def test_snake_to_camel(self):
        snake = 'test'
        result = _snake_to_camel(snake)
        self.assertEqual(result, 'test')

    def test_snake_to_camel_capitalize_first(self):
        snake = 'test'
        result = _snake_to_camel(snake, capitalize_first=True)
        self.assertEqual(result, 'Test')


if __name__ == '__main__':
    unittest.main()