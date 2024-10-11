import unittest
from ansible.module_utils.common import dict_transformations

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'FooBar': 'Hello', 'FooBaz': 'World'}
        result = dict_transformations.camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(result, {'foo_bar': 'Hello', 'foo_baz': 'World'})

    def test_camel_dict_to_snake_dict_with_ignore_list(self):
        camel_dict = {'FooBar': 'Hello', 'FooBaz': 'World', 'FooQux': {'Quux': 'Wizzle'}}
        ignore_list = ['FooBar']
        result = dict_transformations.camel_dict_to_snake_dict(camel_dict, ignore_list=ignore_list)
        self.assertEqual(result, {'foo_baz': 'World', 'foo_qux': {'quux': 'Wizzle'}})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'foo_bar': 'Hello', 'foo_baz': 'World'}
        result = dict_transformations.snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(result, {'FooBar': 'Hello', 'FooBaz': 'World'})

    def test_snake_dict_to_camel_dict_with_capitalize_first(self):
        snake_dict = {'foo_bar': 'Hello', 'foo_baz': 'World'}
        result = dict_transformations.snake_dict_to_camel_dict(snake_dict, capitalize_first=True)
        self.assertEqual(result, {'FooBar': 'Hello', 'FooBaz': 'World'})

    def test_snake_to_camel(self):
        snake = 'foo_bar'
        result = dict_transformations._snake_to_camel(snake)
        self.assertEqual(result, 'fooBar')

    def test_camel_to_snake(self):
        camel = 'fooBar'
        result = dict_transformations._camel_to_snake(camel)
        self.assertEqual(result, 'foo_bar')

    def test_dict_merge(self):
        dict1 = {'a': 1, 'b': 2}
        dict2 = {'b': 3, 'c': 4}
        result = dict_transformations.dict_merge(dict1, dict2)
        self.assertEqual(result, {'a': 1, 'b': 3, 'c': 4})

    def test_recursive_diff(self):
        dict1 = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        dict2 = {'a': 1, 'b': 3, 'c': {'d': 3, 'f': 4}}
        result = dict_transformations.recursive_diff(dict1, dict2)
        self.assertEqual(result, ({'b': 2}, {'b': 3, 'c': {'e': 4}}))

if __name__ == '__main__':
    unittest.main()