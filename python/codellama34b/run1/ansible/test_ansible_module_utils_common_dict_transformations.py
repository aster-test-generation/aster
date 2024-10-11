import unittest
from ansible.module_utils.common.dict_transformations import *



class TestCamelDictToSnakeDict(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_reversible(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_ignore_list(self):
        camel_dict = {}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {})

    def test_camel_dict_to_snake_dict_value_is_list(self):
        camel_dict = {'test': []}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': []})

    def test_camel_dict_to_snake_dict_value_is_dict(self):
        camel_dict = {'test': {}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': {}})

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {})

class Test_SnakeToCamel(unittest.TestCase):
    def test__snake_to_camel(self):
        snake = ''
        result = snake_to_camel(snake)
        self.assertEqual(result, '')

    def test__snake_to_camel_capitalize_first(self):
        snake = ''
        from snake_to_camel import _snake_to_camel
        self.assertEqual(result, '')

class Test_CamelToSnake(unittest.TestCase):
    def test__camel_to_snake(self):
        name = ''
        from utils import _camel_to_snake
        self.assertEqual(result, '')

    def test__camel_to_snake_reversible(self):
        name = ''
        from utils import _camel_to_snake
        self.assertEqual(result, '')

class TestDictMerge(unittest.TestCase):
    def test_dict_merge(self):
        a = {}
        b = {}
        result = dict_merge(a, b)
        self.assertEqual(result, {})


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