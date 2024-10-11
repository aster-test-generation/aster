import unittest
from ansible.module_utils.common.dict_transformations import *

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelKey": "camelValue",
            "camelKey2": {
                "camelKey3": "camelValue3"
            },
            "camelKey4": [
                "camelValue4",
                "camelValue5"
            ]
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_key": "camelValue",
            "camel_key2": {
                "camel_key3": "camelValue3"
            },
            "camel_key4": [
                "camelValue4",
                "camelValue5"
            ]
        })

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_key": "snakeValue",
            "snake_key2": {
                "snake_key3": "snakeValue3"
            },
            "snake_key4": [
                "snakeValue4",
                "snakeValue5"
            ]
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {
            "snakeKey": "snakeValue",
            "snakeKey2": {
                "snakeKey3": "snakeValue3"
            },
            "snakeKey4": [
                "snakeValue4",
                "snakeValue5"
            ]
        })

    def test_dict_merge(self):
        dict1 = {
            "key1": "value1",
            "key2": {
                "key3": "value3"
            },
            "key4": [
                "value4",
                "value5"
            ]
        }
        dict2 = {
            "key1": "value1",
            "key2": {
                "key3": "value3"
            },
            "key4": [
                "value4",
                "value5"
            ]
        }
        result = dict_merge(dict1, dict2)
        self.assertEqual(result, {
            "key1": "value1",
            "key2": {
                "key3": "value3"
            },
            "key4": [
                "value4",
                "value5"
            ]
        })

    def test_recursive_diff(self):
        dict1 = {
            "key1": "value1",
            "key2": {
                "key3": "value3"
            },
            "key4": [
                "value4",
                "value5"
            ]
        }
        dict2 = {
            "key1": "value1",
            "key2": {
                "key3": "value3"
            },
            "key4": [
                "value4",
                "value5"
            ]
        }
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()