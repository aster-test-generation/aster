from ansible.module_utils.common.dict_transformations import _snake_to_camel
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

    def test_camel_dict_to_snake_dict_complex_type(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_camel_dict_to_snake_dict_complex_type_reversible(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict, reversible=True)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_camel_dict_to_snake_dict_complex_type_ignore_list(self):
        camel_dict = {'test': {'test': {'test': 'test'}}}
        result = camel_dict_to_snake_dict(camel_dict, ignore_list=['test'])
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_complex_type(self):
        snake_dict = {'test': {'test': {'test': 'test'}}}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

    def test_snake_dict_to_camel_dict_complex_type_capitalize_first(self):
        snake_dict = {'test': {'test': {'test': 'test'}}}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {'test': {'test': {'test': 'test'}}})

class TestSnakeToCamel(unittest.TestCase):
    def test_snake_to_camel(self):
        snake = 'test'
        result = _snake_to_camel(snake)
        self.assertEqual(result, 'test')

    def test_snake_to_camel_capitalize_first(self):
        snake = 'test'
        result = _snake_to_camel(snake, capitalize_first=True)
        self.assertEqual(result, 'Test')


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

    def test_camel_dict_to_snake_dict_value_is_other(self):
        camel_dict = {'test': 1}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'test': 1})

class TestSnakeDictToCamelDict(unittest.TestCase):
    def test_snake_dict_to_camel_dict(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_capitalize_first(self):
        snake_dict = {}
        result = snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {})

    def test_snake_dict_to_camel_dict_value_is_list(self):
        snake_dict = {'test': []}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'test': []})

    def test_snake_dict_to_camel_dict_value_is_dict(self):
        snake_dict = {'test': {}}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'test': {}})

    def test_snake_dict_to_camel_dict_value_is_other(self):
        snake_dict = {'test': 1}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'test': 1})

class Test_SnakeToCamel(unittest.TestCase):
    def test__snake_to_camel(self):
        snake = ''
        result = _snake_to_camel(snake)
        self.assertEqual(result, '')

    def test__snake_to_camel_capitalize_first(self):
        snake = ''
        result = _snake_to_camel(snake, capitalize_first=True)
        self.assertEqual(result, '')

class Test_CamelToSnake(unittest.TestCase):
    def test__camel_to_snake(self):
        name = ''
        result = _camel_to_snake(name)
        self.assertEqual(result, '')

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