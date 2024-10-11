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
        expected_snake_dict = {
            'camel_case_key': 'value',
            'another_camel_case_key': 'anotherValue',
            'sub_dict': {
                'sub_camel_case_key': 'subValue'
            }
        }
        self.assertEqual(snake_dict, expected_snake_dict)

    def test_snake_dict_to_camel_dict(self):
        snake_dict = {
            'camel_case_key': 'value',
            'another_camel_case_key': 'anotherValue',
            'sub_dict': {
                'sub_camel_case_key': 'subValue'
            }
        }
        camel_dict = snake_dict_to_camel_dict(snake_dict)
        expected_camel_dict = {
            'camelCaseKey': 'value',
            'anotherCamelCaseKey': 'anotherValue',
            'subDict': {
                'subCamelCaseKey': 'subValue'
            }
        }
        self.assertEqual(camel_dict, expected_camel_dict)

    def test_dict_merge(self):
        dict1 = {
            'key1': 'value1',
            'key2': 'value2'
        }
        dict2 = {
            'key2': 'new_value2',
            'key3': 'value3'
        }
        merged_dict = dict_merge(dict1, dict2)
        expected_merged_dict = {
            'key1': 'value1',
            'key2': 'new_value2',
            'key3': 'value3'
        }
        self.assertEqual(merged_dict, expected_merged_dict)

    def test_recursive_diff(self):
        dict1 = {
            'key1': 'value1',
            'key2': 'value2',
            'sub_dict': {
                'sub_key1': 'sub_value1',
                'sub_key2': 'sub_value2'
            }
        }
        dict2 = {
            'key1': 'value1',
            'key2': 'new_value2',
            'sub_dict': {
                'sub_key1': 'sub_value1',
                'sub_key3': 'sub_value3'
            }
        }
        diff = recursive_diff(dict1, dict2)
        expected_diff = ({'key2': 'value2'}, {'key2': 'new_value2', 'sub_dict': {'sub_key3': 'sub_value3'}})
        self.assertEqual(diff, expected_diff)

if __name__ == '__main__':
    unittest.main()