import unittest
from ansible.module_utils.common.dict_transformations import camel_dict_to_snake_dict, snake_dict_to_camel_dict, dict_merge, recursive_diff


class TestDictTransformations(unittest.TestCase):
    def test_camel_dict_to_snake_dict(self):
        camel_dict = {
            'camelCaseKey': 'value',
            'anotherCamelCaseKey': 'anotherValue',
            'subDict': {
                'subCamelCaseKey': 'subValue'
            }
        }
        snake_dict = camel_dict_to_snake_dict(camel_dict)
        self.assertEqual(snake_dict, {
            'camel_case_key': 'value',
            'another_camel_case_key': 'anotherValue',
            'sub_dict': {
                'sub_camel_case_key': 'subValue'
            }
        })

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            'snake_case_key': 'value',
            'another_snake_case_key': 'anotherValue',
            'sub_dict': {
                'sub_snake_case_key': 'subValue'
            }
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        self.assertEqual(camel_dict, {
            'snakeCaseKey': 'value',
            'anotherSnakeCaseKey': 'anotherValue',
            'subDict': {
                'subSnakeCaseKey': 'subValue'
            }
        })

    def test_dict_merge(self):
        dict1 = {
            'key1': 'value1',
            'key2': 'value2',
            'subDict': {
                'subKey1': 'subValue1'
            }
        }
        dict2 = {
            'key2': 'new_value2',
            'key3': 'value3',
            'subDict': {
                'subKey2': 'subValue2'
            }
        }
        merged_dict = dict_merge(dict1, dict2)
        self.assertEqual(merged_dict, {
            'key1': 'value1',
            'key2': 'new_value2',
            'key3': 'value3',
            'subDict': {
                'subKey1': 'subValue1',
                'subKey2': 'subValue2'
            }
        })

    def test_recursive_diff(self):
        dict1 = {
            'key1': 'value1',
            'key2': 'value2',
            'subDict': {
                'subKey1': 'subValue1'
            }
        }
        dict2 = {
            'key2': 'new_value2',
            'key3': 'value3',
            'subDict': {
                'subKey2': 'subValue2'
            }
        }
        diff = recursive_diff(dict1, dict2)
        self.assertEqual(diff, ({'key2': 'value2', 'subDict': {'subKey1': 'subValue1'}}, {'key2': 'new_value2', 'key3': 'value3', 'subDict': {'subKey2': 'subValue2'}}))

if __name__ == '__main__':
    unittest.main()