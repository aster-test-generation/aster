import unittest
from ansible.module_utils.common.dict_transformations import *
from ansible.module_utils.common.dict_transformations import camel_dict_to_snake_dict, snake_dict_to_camel_dict, _snake_to_camel, _camel_to_snake, dict_merge, recursive_diff


class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'CamelCase': 'value', 'AnotherCamelCase': {'NestedCamelCase': 'nested_value'}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'camel_case': 'value', 'another_camel_case': {'nested_camel_case': 'nested_value'}})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'snake_case': 'value', 'another_snake_case': {'nested_snake_case': 'nested_value'}}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'SnakeCase': 'value', 'AnotherSnakeCase': {'NestedSnakeCase': 'nested_value'}})

    def test__snake_to_camel(self):
        result = _snake_to_camel('snake_case')
        self.assertEqual(result, 'SnakeCase')

    def test__camel_to_snake(self):
        result = _camel_to_snake('CamelCase')
        self.assertEqual(result, 'camel_case')

    def test_dict_merge(self):
        a = {'key1': 'value1', 'key2': {'nested_key1': 'nested_value1'}}
        b = {'key2': {'nested_key2': 'nested_value2'}, 'key3': 'value3'}
        result = dict_merge(a, b)
        self.assertEqual(result, {'key1': 'value1', 'key2': {'nested_key1': 'nested_value1', 'nested_key2': 'nested_value2'}, 'key3': 'value3'})

    def test_recursive_diff(self):
        dict1 = {'key1': 'value1', 'key2': {'nested_key1': 'nested_value1'}}
        dict2 = {'key1': 'value1', 'key2': {'nested_key2': 'nested_value2'}}
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, ({'key2': {'nested_key1': 'nested_value1'}}, {'key2': {'nested_key2': 'nested_value2'}}))

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'CamelCase': 'value'}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'camel_case': 'value'})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'snake_case': 'value'}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'SnakeCase': 'value'})

    def test__snake_to_camel(self):
        snake = 'snake_case'
        result = _snake_to_camel(snake)
        self.assertEqual(result, 'SnakeCase')

    def test__camel_to_snake(self):
        camel = 'CamelCase'
        result = _camel_to_snake(camel)
        self.assertEqual(result, 'camel_case')

    def test_dict_merge(self):
        a = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        b = {'key2': {'subkey2': 'subvalue2'}, 'key3': 'value3'}
        result = dict_merge(a, b)
        self.assertEqual(result, {'key1': 'value1', 'key2': {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'}, 'key3': 'value3'})

    def test_recursive_diff(self):
        dict1 = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        dict2 = {'key1': 'value1', 'key2': {'subkey1': 'subvalue2'}}
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, ({'key2': {'subkey1': 'subvalue1'}}, {'key2': {'subkey1': 'subvalue2'}}))

if __name__ == '__main__':
    unittest.main()