import unittest
from ansible.module_utils.common.dict_transformations import camel_dict_to_snake_dict, snake_dict_to_camel_dict, _snake_to_camel, _camel_to_snake, dict_merge, recursive_diff

class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {'FooBar': 'Hello', 'FooBaz': 'World', 'Foo': {'Bar': 'Hello', 'Baz': 'World'}}
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {'foo_bar': 'Hello', 'foo_baz': 'World', 'foo': {'bar': 'Hello', 'baz': 'World'}})

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {'foo_bar': 'Hello', 'foo_baz': 'World', 'foo': {'bar': 'Hello', 'baz': 'World'}}
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {'FooBar': 'Hello', 'FooBaz': 'World', 'Foo': {'Bar': 'Hello', 'Baz': 'World'}})

    def test_snake_to_camel(self):
        self.assertEqual(_snake_to_camel('foo_bar'), 'fooBar')
        self.assertEqual(_snake_to_camel('foo_baz'), 'fooBaz')
        self.assertEqual(_snake_to_camel('foo'), 'foo')

    def test_camel_to_snake(self):
        self.assertEqual(_camel_to_snake('fooBar'), 'foo_bar')
        self.assertEqual(_camel_to_snake('fooBaz'), 'foo_baz')
        self.assertEqual(_camel_to_snake('foo'), 'foo')

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

if __name__ == '__main__':
    unittest.main()