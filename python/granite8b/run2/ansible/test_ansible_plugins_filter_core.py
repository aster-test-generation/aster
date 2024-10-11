import unittest
from ansible.plugins.filter.core import yaml


class TestCoreFilter(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'a': 1, 'b': 2, 'c': 3}
        result = dict_to_list_of_dict_key_value_elements(mydict)
        expected = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}]
        self.assertEqual(result, expected)

    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}, {'key': 'c', 'value': 3}]
        result = list_of_dict_key_value_elements_to_dict(mylist)
        expected = {'a': 1, 'b': 2, 'c': 3}
        self.assertEqual(result, expected)

    def test_path_join(self):
        paths = ['/path', 'to', 'join']
        result = path_join(paths)
        expected = '/path/to/join'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()