import unittest
from ansible.module_utils._text import to_native


class TestDictToListOfDictKeyValueElements(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'a': 1, 'b': 2, 'c': 3}
        result = dict_to_list_of_dict_key_value_elements(mydict)
        self.assertEqual(result, [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}])

    def test_dict_to_list_of_dict_key_value_elements_invalid_input(self):
        with self.assertRaises(AnsibleFilterTypeError):
            dict_to_list_of_dict_key_value_elements(['a', 'b', 'c'])

class TestListofDictKeyValueElementsToDict(unittest.TestCase):
    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}]
        result = list_of_dict_key_value_elements_to_dict(mylist)
        self.assertEqual(result, {'a': 1, 'b': 2, 'c': 3})

    def test_list_of_dict_key_value_elements_to_dict_invalid_input(self):
        with self.assertRaises(AnsibleFilterTypeError):
            list_of_dict_key_value_elements_to_dict('not a list')

class TestPathJoin(unittest.TestCase):
    def test_path_join_string(self):
        result = path_join('/path/to')
        self.assertEqual(result, '/path/to')

    def test_path_join_sequence(self):
        result = path_join(['/path', 'to', 'file'])
        self.assertEqual(result, '/path/to/file')

    def test_path_join_invalid_input(self):
        with self.assertRaises(AnsibleFilterTypeError):
            path_join({'not': 'a string or sequence'})

if __name__ == '__main__':
    unittest.main()