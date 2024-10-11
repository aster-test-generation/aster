import unittest
from ansible.plugins.filter.yaml import *



class TestDictToListOfDictKeyValueElements(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'a': 1, 'b': 2, 'c': 3}
        key_name = 'key'
        value_name = 'value'
        result = dict_to_list_of_dict_key_value_elements(mydict, key_name, value_name)
        self.assertEqual(result, [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}])

    def test_dict_to_list_of_dict_key_value_elements_with_empty_dict(self):
        mydict = {}
        key_name = 'key'
        value_name = 'value'
        result = dict_to_list_of_dict_key_value_elements(mydict, key_name, value_name)
        self.assertEqual(result, [])

    def test_dict_to_list_of_dict_key_value_elements_with_none_dict(self):
        mydict = None
        key_name = 'key'
        value_name = 'value'
        result = dict_to_list_of_dict_key_value_elements(mydict, key_name, value_name)
        self.assertEqual(result, [])

    def test_dict_to_list_of_dict_key_value_elements_with_non_dict(self):
        mydict = 'a'
        key_name = 'key'
        value_name = 'value'
        self.assertRaises(AnsibleFilterTypeError, dict_to_list_of_dict_key_value_elements, mydict, key_name, value_name)

    def test_dict_to_list_of_dict_key_value_elements_with_non_string_key_name(self):
        mydict = {'a': 1, 'b': 2, 'c': 3}
        key_name = 1
        value_name = 'value'
        self.assertRaises(AnsibleFilterTypeError, dict_to_list_of_dict_key_value_elements, mydict, key_name, value_name)

    def test_dict_to_list_of_dict_key_value_elements_with_non_string_value_name(self):
        mydict = {'a': 1, 'b': 2, 'c': 3}
        key_name = 'key'
        value_name = 1
        self.assertRaises(AnsibleFilterTypeError, dict_to_list_of_dict_key_value_elements, mydict, key_name, value_name)

class TestListOfDictKeyValueElementsToDict(unittest.TestCase):
    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}]
        key_name = 'key'
        value_name = 'value'
        result = list_of_dict_key_value_elements_to_dict(mylist, key_name, value_name)
        self.assertEqual(result, {'a': 1, 'b': 2, 'c': 3})

    def test_list_of_dict_key_value_elements_to_dict_with_empty_list(self):
        mylist = []
        key_name = 'key'
        value_name = 'value'
        result = list_of_dict_key_value_elements_to_dict(mylist, key_name, value_name)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()