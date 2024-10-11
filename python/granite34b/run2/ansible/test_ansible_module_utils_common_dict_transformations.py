import unittest
from ansible.module_utils.common.dict_transformations import *


class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelKey": "value",
            "nestedCamelDict": {
                "nestedKey": "nestedValue"
            },
            "camelList": [
                {"nestedCamelDict": {"nestedListKey": "nestedListValue"}}
            ]
        }
        expected_snake_dict = {
            "camel_key": "value",
            "nested_camel_dict": {
                "nested_key": "nestedValue"
            },
            "camel_list": [
                {"nested_camel_dict": {"nested_list_key": "nestedListValue"}}
            ]
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, expected_snake_dict)

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_key": "value",
            "nested_snake_dict": {
                "nested_key": "nestedValue"
            },
            "snake_list": [
                {"nested_snake_dict": {"nested_list_key": "nestedListValue"}}
            ]
        }
        expected_camel_dict = {
            "snakeKey": "value",
            "nestedSnakeDict": {
                "nestedKey": "nestedValue"
            },
            "snakeList": [
                {"nestedSnakeDict": {"nestedListKey": "nestedListValue"}}
            ]
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, expected_camel_dict)

    def test_dict_merge(self):
        dict1 = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1"
            }
        }
        dict2 = {
            "key2": {
                "nestedKey2": "nestedValue2"
            },
            "key3": "value3"
        }
        expected_merged_dict = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1",
                "nestedKey2": "nestedValue2"
            },
            "key3": "value3"
        }
        merged_dict = dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, expected_merged_dict)

    def test_recursive_diff(self):
        dict1 = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1",
                "nestedKey2": "nestedValue2"
            }
        }
        dict2 = {
            "key1": "value1",
            "key2": {
                "nestedKey1": "nestedValue1",
                "nestedKey3": "nestedValue3"
            }
        }
        expected_diff = {
            "key2": {
                "nestedKey2": "nestedValue2",
                "nestedKey3": "nestedValue3"
            }
        }
        diff = recursive_diff(dict1, dict2)
        self.assertEqual(diff, expected_diff)

if __name__ == '__main__':
    unittest.main()