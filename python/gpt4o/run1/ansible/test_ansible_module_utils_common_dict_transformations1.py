import unittest
from ansible.module_utils.common.dict_transformations import (
    camel_dict_to_snake_dict,
    snake_dict_to_camel_dict,
    _snake_to_camel,
    _camel_to_snake,
    dict_merge,
    recursive_diff
)

class TestDictTransformations(unittest.TestCase):

    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'CamelCaseKey': 'value', 'NestedDict': {'InnerCamelCase': 'inner_value'}}
        expected = {'camel_case_key': 'value', 'nested_dict': {'inner_camel_case': 'inner_value'}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, expected)

    def test_camel_dict_to_snake_dict_with_list(self):
        camel_dict = {'CamelCaseKey': ['ListItemOne', {'InnerCamelCase': 'inner_value'}]}
        expected = {'camel_case_key': ['ListItemOne', {'inner_camel_case': 'inner_value'}]}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, expected)

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'snake_case_key': 'value', 'nested_dict': {'inner_snake_case': 'inner_value'}}
        expected = {'snakeCaseKey': 'value', 'nestedDict': {'innerSnakeCase': 'inner_value'}}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, expected)

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {'snake_case_key': 'value', 'nested_dict': {'inner_snake_case': 'inner_value'}}
        expected = {'SnakeCaseKey': 'value', 'NestedDict': {'InnerSnakeCase': 'inner_value'}}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, expected)

    def test_snake_to_camel(self):
        snake = 'snake_case_key'
        expected = 'snakeCaseKey'
        result = _snake_to_camel(snake)
        self.assertEqual(result, expected)

    def test_snake_to_camel_capitalize_first(self):
        snake = 'snake_case_key'
        expected = 'SnakeCaseKey'
        result = _snake_to_camel(snake, capitalize_first=True)
        self.assertEqual(result, expected)

    def test_camel_to_snake(self):
        camel = 'CamelCaseKey'
        expected = 'camel_case_key'
        result = _camel_to_snake(camel)
        self.assertEqual(result, expected)

    def test_camel_to_snake_reversible(self):
        camel = 'CamelCaseKey'
        expected = 'camel_case_key'
        result = _camel_to_snake(camel, reversible=True)
        self.assertEqual(result, expected)

    def test_dict_merge(self):
        dict_a = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        dict_b = {'key2': {'subkey2': 'subvalue2'}, 'key3': 'value3'}
        expected = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'}, 'key3': 'value3'}
        result = dict_merge(dict_a, dict_b)
        self.assertEqual(result, expected)

    def test_recursive_diff(self):
        dict1 = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        dict2 = {'key2': {'subkey1': 'subvalue2'}, 'key3': 'value3'}
        expected = ({'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}, {'key2': {'subkey1': 'subvalue2'}, 'key3': 'value3'})
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, expected)

    def test_recursive_diff_no_diff(self):
        dict1 = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        dict2 = {'key1': 'value1', 'key2': {'subkey1': 'subvalue1'}}
        result = recursive_diff(dict1, dict2)
        self.assertIsNone(result)

    def test_recursive_diff_type_error(self):
        dict1 = {'key1': 'value1'}
        dict2 = ['not', 'a', 'dict']
        with self.assertRaises(TypeError):
            recursive_diff(dict1, dict2)

if __name__ == '__main__':
    unittest.main()