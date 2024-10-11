
import unittest
from ansible.module_utils.common.dict_transformations import *

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelCase": "value",
            "camelCase2": "value2",
            "camelCase3": "value3"
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case": "value",
            "camel_case2": "value2",
            "camel_case3": "value3"
        })

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {
            "camelCase": "value",
            "camelCase2": "value2",
            "camelCase3": "value3"
        }
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {
            "camel_case": "value",
            "camel_case2": "value2",
            "camel_case3": "value3"
        })

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {
            "camelCase": "value",
            "camelCase2": "value2",
            "camelCase3": "value3"
        }
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=["camelCase2"])
        self.assertEqual(result, {
            "camel_case": "value",
            "camelCase2": "value2",
            "camel_case3": "value3"
        })

    def test_camel_dict_to_snake_dict_complex_type(self):
        camel_dict = {
            "camelCase": {
                "camelCase2": "value2",
                "camelCase3": "value3"
            }
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case": {
                "camel_case2": "value2",
                "camel_case3": "value3"
            }
        })

    def test_camel_dict_to_snake_dict_complex_type_list(self):
        camel_dict = {
            "camelCase": [
                "value1",
                "value2",
                "value3"
            ]
        }
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {
            "camel_case": [
                "value1",
                "value2",
                "value3"
            ]
        })

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            "snake_case": "value",
            "snake_case2": "value2",
            "snake_case3": "value3"
        }
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {
            "snakeCase": "value",
            "snakeCase2": "value2",
            "snakeCase3": "value3"
        })

if __name__ == '__main__':
    unittest.main()