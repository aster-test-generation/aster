
import unittest
from ansible.module_utils.common.dict_transformations import *

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelKey": "camelValue",
            "camelKey2": "camelValue2"
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_key": "camelValue",
            "camel_key2": "camelValue2"
        })

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {
            "camelKey": "camelValue",
            "camelKey2": "camelValue2"
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(snake_dict, {
            "camel_key": "camelValue",
            "camel_key2": "camelValue2"
        })

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {
            "camelKey": "camelValue",
            "camelKey2": "camelValue2"
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, ignore_list=["camelKey"])
        self.assertEqual(snake_dict, {
            "camelKey": "camelValue",
            "camel_key2": "camelValue2"
        })

    def test_camel_dict_to_snake_dict_complex_type(self):
        camel_dict = {
            "camelKey": {
                "camelKey2": "camelValue2"
            }
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_key": {
                "camel_key2": "camelValue2"
            }
        })

    def test_camel_dict_to_snake_dict_complex_type_list(self):
        camel_dict = {
            "camelKey": [
                "camelValue",
                "camelValue2"
            ]
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_key": [
                "camelValue",
                "camelValue2"
            ]
        })

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_key": "snakeValue",
            "snake_key2": "snakeValue2"
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {
            "snakeKey": "snakeValue",
            "snakeKey2": "snakeValue2"
        })

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {
            "snake_key": "snakeValue",
            "snake_key2": "snakeValue2"
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(camel_dict, {
            "SnakeKey": "snakeValue",
            "SnakeKey2": "snakeValue2"
        })

if __name__ == '__main__':
    unittest.main()