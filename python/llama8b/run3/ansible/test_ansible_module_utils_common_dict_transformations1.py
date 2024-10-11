import unittest
from ansible.module_utils.common.dict_transformations import *

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'CamelCase': 'value', 'CamelCaseList': [1, 2, 3]}
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {'camel_case': 'value', 'camel_case_list': [1, 2, 3]})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'snake_case': 'value', 'snake_case_list': [1, 2, 3]}
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {'CamelCase': 'value', 'CamelCaseList': [1, 2, 3]})

    def test_snake_to_camel(self):
        snake = 'snake_case'
        camel = _snake_to_camel(snake)
        self.assertEqual(camel, 'snakeCase')

    def test_camel_to_snake(self):
        camel = 'CamelCase'
        snake = _camel_to_snake(camel)
        self.assertEqual(snake, 'snake_case')

    def test_dict_merge(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        merged_dict = dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, {'a': 1, 'b': 3, 'c': 4})

    def test_recursive_diff(self):
        dict1 = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        dict2 = {'a': 1, 'b': 3, 'c': {'d': 3, 'f': 5}}
        left, right = recursive_diff(dict1, dict2)
        self.assertEqual(left, {'b': 2, 'c': {'e': 4}})
        self.assertEqual(right, {'b': 3, 'c': {'f': 5}})

if __name__ == '__main__':
    unittest.main()