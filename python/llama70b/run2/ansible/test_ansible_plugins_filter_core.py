import unittest
from ansible.module_utils._text import to_native


class TestAnsibleFilterCore(unittest.TestCase):
    def test_dict_to_list_of_dict_key_value_elements(self):
        mydict = {'a': 1, 'b': 2}
        result = dict_to_list_of_dict_key_value_elements(mydict)
        self.assertEqual(result, [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}])

    def test_list_of_dict_key_value_elements_to_dict(self):
        mylist = [{'key': 'a', 'value': 1}, {'key': 'b', 'value': 2}]
        result = list_of_dict_key_value_elements_to_dict(mylist)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_path_join_string(self):
        paths = 'path/to/file'
        result = path_join(paths)
        self.assertEqual(result, 'path/to/file')

    def test_path_join_sequence(self):
        paths = ['path', 'to', 'file']
        result = path_join(paths)
        self.assertEqual(result, 'path/to/file')

    def test_path_join_invalid_type(self):
        paths = 123
        with self.assertRaises(AnsibleFilterTypeError):
            path_join(paths)

if __name__ == '__main__':
    unittest.main()