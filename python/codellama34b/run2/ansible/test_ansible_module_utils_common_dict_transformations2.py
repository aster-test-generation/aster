
import unittest
from ansible.module_utils.common.dict_transformations import *

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelCaseKey": "camelCaseValue"
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case_key": "camelCaseValue"
        })

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {
            "camelCaseKey": "camelCaseValue"
        }
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {
            "camel_case_key": "camelCaseValue"
        })

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {
            "camelCaseKey": "camelCaseValue"
        }
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=["camelCaseKey"])
        self.assertEqual(result, {
            "camelCaseKey": "camelCaseValue"
        })

    def test_camel_dict_to_snake_dict_value_is_list(self):
        camel_dict = {
            "camelCaseKey": ["camelCaseValue"]
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case_key": ["camelCaseValue"]
        })

    def test_camel_dict_to_snake_dict_value_is_dict(self):
        camel_dict = {
            "camelCaseKey": {
                "camelCaseKey2": "camelCaseValue2"
            }
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case_key": {
                "camel_case_key2": "camelCaseValue2"
            }
        })

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_case_key": "snakeCaseValue"
        }
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {
            "snakeCaseKey": "snakeCaseValue"
        })

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {
            "snake_case_key": "snakeCaseValue"
        }
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {
            "SnakeCaseKey": "snakeCaseValue"
        })

    def test_snake_dict_to_camel_dict_value_is_list(self):
        snake_dict = {
            "snake_case_key": ["snakeCaseValue"]
        }
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {
            "snakeCaseKey": ["snakeCaseValue"]
        })

if __name__ == '__main__':
    unittest.main()