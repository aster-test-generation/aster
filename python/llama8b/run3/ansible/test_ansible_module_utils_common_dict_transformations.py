import unittest
from ansible.module_utils.common.dict_transformations import *
from ansible.module_utils.common import dict_transformations


class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'FooBar': 'Hello', 'Baz': 'World'}
        result = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'foo_bar': 'Hello', 'baz': 'World'})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'foo_bar': 'Hello', 'baz': 'World'}
        result = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'FooBar': 'Hello', 'Baz': 'World'})

    def test_snake_to_camel(self):
        snake = 'foo_bar'
        result = _snake_to_camel(snake)
        self.assertEqual(result, 'fooBar')

    def test_camel_to_snake(self):
        camel = 'fooBar'
        result = _camel_to_snake(camel)
        self.assertEqual(result, 'foo_bar')

    def test_dict_merge(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        result = dict_merge(dict1, dict2)
        self.assertEqual(result, {'a': 1, 'b': 3, 'c': 4})

    def test_recursive_diff(self):
        dict1 = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        dict2 = {'a': 1, 'b': 3, 'c': {'d': 3, 'f': 4}}
        result = recursive_diff(dict1, dict2)
        self.assertEqual(result, ({'b': 2, 'c': {'e': 4}}, {'b': 3, 'c': {'f': 4}}))

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

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'FooBar': 1, 'BazQux': 2, 'Foo': {'Bar': 3, 'Qux': 4}}
        snake_dict = dict_transformations.camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {'foo_bar': 1, 'baz_qux': 2, 'foo': {'bar': 3, 'qux': 4}})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'foo_bar': 1, 'baz_qux': 2, 'foo': {'bar': 3, 'qux': 4}}
        camel_dict = dict_transformations.snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {'FooBar': 1, 'BazQux': 2, 'Foo': {'Bar': 3, 'Qux': 4}})

    def test_snake_to_camel(self):
        snake = 'foo_bar'
        camel = dict_transformations._snake_to_camel(snake)
        self.assertEqual(camel, 'fooBar')

    def test_camel_to_snake(self):
        camel = 'fooBar'
        snake = dict_transformations._camel_to_snake(camel)
        self.assertEqual(snake, 'foo_bar')

    def test_dict_merge(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        merged_dict = dict_transformations.dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, {'a': 1, 'b': 3, 'c': 4})

    def test_recursive_diff(self):
        dict1 = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        dict2 = {'a': 1, 'b': 3, 'c': {'d': 3, 'f': 5}}
        left, right = dict_transformations.recursive_diff(dict1, dict2)
        self.assertEqual(left, {'b': 2, 'c': {'e': 4}})
        self.assertEqual(right, {'b': 3, 'c': {'f': 5}})

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'CamelCase': 'value', 'CamelCaseList': [1, 2, 3], 'CamelCaseDict': {'innerKey': 'innerValue'}}
        snake_dict = dict_transformations.camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {'camel_case': 'value', 'camel_case_list': [1, 2, 3], 'camel_case_dict': {'inner_key': 'inner_value'}})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'snake_case': 'value', 'snake_case_list': [1, 2, 3], 'snake_case_dict': {'inner_key': 'inner_value'}}
        camel_dict = dict_transformations.snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {'CamelCase': 'value', 'CamelCaseList': [1, 2, 3], 'CamelCaseDict': {'innerKey': 'innerValue'}})

    def test_snake_to_camel(self):
        self.assertEqual(dict_transformations._snake_to_camel('snake_case'), 'snakeCase')
        self.assertEqual(dict_transformations._snake_to_camel('snake_case', capitalize_first=True), 'SnakeCase')

    def test_camel_to_snake(self):
        self.assertEqual(dict_transformations._camel_to_snake('CamelCase'), 'snake_case')
        self.assertEqual(dict_transformations._camel_to_snake('CamelCase', reversible=True), 'camelCase')

    def test_dict_merge(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        merged_dict = dict_transformations.dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, {'a': 1, 'b': 3, 'c': 4})

    def test_recursive_diff(self):
        dict1 = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        dict2 = {'a': 1, 'b': 3, 'c': {'d': 3, 'f': 5}}
        left, right = dict_transformations.recursive_diff(dict1, dict2)
        self.assertEqual(left, {'b': 2, 'c': {'e': 4}})
        self.assertEqual(right, {'b': 3, 'c': {'f': 5}})

if __name__ == '__main__':
    unittest.main()