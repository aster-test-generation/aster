
import unittest
from ansible.module_utils.common.dict_transformations import *

class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {
            "camelCase": "camel_case",
            "camelCase2": "camel_case2",
            "camelCase3": "camel_case3",
            "camelCase4": "camel_case4",
            "camelCase5": "camel_case5",
            "camelCase6": "camel_case6",
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict, ignore_list=["camelCase", "camelCase2"])
        self.assertEqual(snake_dict, {
            "camel_case": "camelCase",
            "camel_case2": "camelCase2",
            "camel_case3": "camelCase3",
            "camel_case4": "camelCase4",
            "camel_case5": "camelCase5",
            "camel_case6": "camelCase6",
        })

if __name__ == '__main__':
    unittest.main()