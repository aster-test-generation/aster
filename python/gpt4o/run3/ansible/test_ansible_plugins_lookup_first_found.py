import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.first_found import LookupModule, _split_on
from ansible.errors import AnsibleLookupError
from ansible.module_utils.six import string_types


class TestSplitOn(unittest.TestCase):
    def test_split_on_string(self):
        result = _split_on("a,b;c", ",;")
        self.assertEqual(result, ["a", "b", "c"])

    def test_split_on_list(self):
        result = _split_on(["a,b", "c;d"], ",;")
        self.assertEqual(result, ["a", "b", "c", "d"])

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_process_terms_string(self):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs.get(x))
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2'])

    def test_process_terms_mapping(self):
        terms = {"files": "file1,file2"}
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs.get(x))
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2'])

    def test_process_terms_sequence(self):
        terms = [["file1", "file2"], "file3"]
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs.get(x))
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2', 'path1/file3', 'path2/file3'])

    def test_process_terms_invalid(self):
        terms = 123
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleLookupError):
            self.lookup._process_terms([terms], variables, kwargs)

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run(self, mock_find_file, mock_process_terms):
        mock_process_terms.return_value = (['file1', 'file2'], False)
        mock_find_file.side_effect = [None, 'path/to/file2']
        variables = {}
        result = self.lookup.run(['file1', 'file2'], variables=variables)
        self.assertEqual(result, ['path/to/file2'])

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run_skip(self, mock_find_file, mock_process_terms):
        mock_process_terms.return_value = (['file1', 'file2'], True)
        mock_find_file.return_value = None
        variables = {}
        result = self.lookup.run(['file1', 'file2'], variables=variables)
        self.assertEqual(result, [])

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run_no_file_found(self, mock_find_file, mock_process_terms):
        mock_process_terms.return_value = (['file1', 'file2'], False)
        mock_find_file.return_value = None
        variables = {}
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(['file1', 'file2'], variables=variables)

if __name__ == '__main__':
    unittest.main()