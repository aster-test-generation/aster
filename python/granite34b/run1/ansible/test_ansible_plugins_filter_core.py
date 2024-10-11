import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'key1': 'value1', 'key2': 'value2'}
        expected_result = [{'key': 'key1', 'value': 'value1'}, {'key': 'key2', 'value': 'value2'}]
        result = dict_to_list_of_dict_key_value_elements(mydict)
        self.assertEqual(result, expected_result)

    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'key1', 'value': 'value1'}, {'key': 'key2', 'value': 'value2'}]
        expected_result = {'key1': 'value1', 'key2': 'value2'}
        result = list_of_dict_key_value_elements_to_dict(mylist)
        self.assertEqual(result, expected_result)

    def test_path_join(self):
        paths = ['path1', 'path2', 'path3']
        expected_result = os.path.join(*paths)
        result = path_join(paths)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()