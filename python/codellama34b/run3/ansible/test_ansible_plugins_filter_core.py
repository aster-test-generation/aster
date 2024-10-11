import unittest
from ansible.plugins.filter.yaml import *


class TestDictToListOfDictKeyValueElements(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'a': 1, 'b': 2}
        key_name = 'key'
        value_name = 'value'
        result = dict_to_list_of_dict_key_value_elements(mydict, key_name, value_name)
        self.assertEqual(result, [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}])

    def test_dict_to_list_of_dict_key_value_elements_with_non_mapping(self):
        mydict = 'a'
        key_name = 'key'
        value_name = 'value'
        self.assertRaises(AnsibleFilterTypeError, dict_to_list_of_dict_key_value_elements, mydict, key_name, value_name)

class TestListOfDictKeyValueElementsToDict(unittest.TestCase):
    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}]
        key_name = 'key'
        value_name = 'value'
        result = list_of_dict_key_value_elements_to_dict(mylist, key_name, value_name)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_list_of_dict_key_value_elements_to_dict_with_non_sequence(self):
        mylist = 'a'
        key_name = 'key'
        value_name = 'value'
        self.assertRaises(AnsibleFilterTypeError, list_of_dict_key_value_elements_to_dict, mylist, key_name, value_name)

class TestPathJoin(unittest.TestCase):
    def test_path_join(self):
        paths = ['a', 'b']
        result = path_join(paths)
        self.assertEqual(result, 'a/b')

    def test_path_join_with_non_sequence(self):
        paths = 'a'
        self.assertRaises(AnsibleFilterTypeError, path_join, paths)

if __name__ == '__main__':
    unittest.main()