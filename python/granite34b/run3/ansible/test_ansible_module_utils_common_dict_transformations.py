import unittest
from ansible.module_utils.common.dict_transformations import (
    camel_dict_to_snake_dict,
    snake_dict_to_camel_dict,
    _snake_to_camel,
    _camel_to_snake,
    dict_merge,
    recursive_diff,
)

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelKey": "value",
            "nestedCamelDict": {
                "nestedKey": "nestedValue",
            },
            "camelList": [
                {"camelListDict": "listValue"},
                {"camelListDict2": "listValue2"},
            ],
        }
        expected_snake_dict = {
            "camel_key": "value",
            "nested_camel_dict": {
                "nested_key": "nestedValue",
            },
            "camel_list": [
                {"camel_list_dict": "listValue"},
                {"camel_list_dict2": "listValue2"},
            ],
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, expected_snake_dict)
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_key": "value",
            "nested_snake_dict": {
                "nested_key": "nestedValue",
            },
            "snake_list": [
                {"snake_list_dict": "listValue"},
                {"snake_list_dict2": "listValue2"},
            ],
        }
        expected_camel_dict = {
            "snakeKey": "value",
            "nestedSnakeDict": {
                "nestedKey": "nestedValue",
            },
            "snakeList": [
                {"snakeListDict": "listValue"},
                {"snakeListDict2": "listValue2"},
            ],
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, expected_camel_dict)
    def test_snake_to_camel(self):
        snake_str = "snake_case_string"
        expected_camel_str = "snakeCaseString"
        camel_str = _snake_to_camel(snake_str)
        self.assertEqual(camel_str, expected_camel_str)
    def test_camel_to_snake(self):
        camel_str = "camelCaseString"
        expected_snake_str = "camel_case_string"
        snake_str = _camel_to_snake(camel_str)
        self.assertEqual(snake_str, expected_snake_str)
    def test_dict_merge(self):
        dict1 = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1",
            },
        }
        dict2 = {
            "key2": {
                "nestedKey2": "nestedValue2",
            },
            "key3": "value3",
        }
        expected_merged_dict = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1",
                "nestedKey2": "nestedValue2",
            },
            "key3": "value3",
        }
        merged_dict = dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, expected_merged_dict)

if __name__ == '__main__':
    unittest.main()