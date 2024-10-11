import os
import unittest
from ansible.plugins.filter.core import dict_to_list_of_dict_key_value_elements, list_of_dict_key_value_elements_to_dict, path_join
from ansible.errors import AnsibleFilterTypeError
from ansible.module_utils.common.collections import is_sequence
from ansible.module_utils.common._collections_compat import Mapping


class TestDictToListOfDictKeyValueElements(unittest.TestCase):
    def test_valid_dict(self):
        mydict = {'a': 1, 'b': 2}
        result = dict_to_list_of_dict_key_value_elements(mydict)
        expected = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}]
        self.assertEqual(result, expected)

    def test_invalid_dict(self):
        with self.assertRaises(AnsibleFilterTypeError):
            dict_to_list_of_dict_key_value_elements([1, 2, 3])

class TestListOfDictKeyValueElementsToDict(unittest.TestCase):
    def test_valid_list(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}]
        result = list_of_dict_key_value_elements_to_dict(mylist)
        expected = {'a': 1, 'b': 2}
        self.assertEqual(result, expected)

    def test_invalid_list(self):
        with self.assertRaises(AnsibleFilterTypeError):
            list_of_dict_key_value_elements_to_dict({'a': 1, 'b': 2})

class TestPathJoin(unittest.TestCase):
    def test_valid_string(self):
        paths = 'a/b/c'
        result = path_join(paths)
        expected = os.path.join(paths)
        self.assertEqual(result, expected)

    def test_valid_sequence(self):
        paths = ['a', 'b', 'c']
        result = path_join(paths)
        expected = os.path.join(*paths)
        self.assertEqual(result, expected)

    def test_invalid_type(self):
        with self.assertRaises(AnsibleFilterTypeError):
            path_join(123)

if __name__ == '__main__':
    unittest.main()