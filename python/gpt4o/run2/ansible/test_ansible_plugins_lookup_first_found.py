import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.first_found import LookupModule, _split_on
from ansible.errors import AnsibleLookupError
from ansible.module_utils.six import string_types


class TestSplitOnFunction(unittest.TestCase):
    def test_split_on_string(self):
        result = _split_on("a,b;c", ",;")
        self.assertEqual(result, ["a", "b", "c"])

    def test_split_on_list(self):
        result = _split_on(["a,b", "c;d"], ",;")
        self.assertEqual(result, ["a", "b", "c", "d"])

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_process_terms_with_string(self):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2', 'skip': False}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file2'])
        self.assertFalse(skip)

    def test_process_terms_with_mapping(self):
        terms = {"key": "value"}
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2', 'skip': False}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2'])
        self.assertFalse(skip)

    def test_process_terms_with_sequence(self):
        terms = ["file1", ["file2", "file3"]]
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2', 'skip': False}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2', 'path1/file3', 'path2/file2', 'path2/file3'])
        self.assertFalse(skip)

    def test_process_terms_with_invalid_type(self):
        terms = 123
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleLookupError):
            self.lookup._process_terms([terms], variables, kwargs)

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run(self, mock_find_file, mock_process_terms):
        terms = ["file1"]
        variables = {}
        kwargs = {}
        mock_process_terms.return_value = (["file1"], False)
        mock_find_file.return_value = "path/to/file1"
        result = self.lookup.run(terms, variables, **kwargs).template
        self.assertEqual(result, ["path/to/file1"])

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run_with_skip(self, mock_find_file, mock_process_terms):
        terms = ["file1"]
        variables = {}
        kwargs = {}
        mock_process_terms.return_value = (["file1"], True)
        mock_find_file.return_value = None
        result = self.lookup.run(terms, variables, **kwargs).template
        self.assertEqual(result, [])

    @patch.object(LookupModule, '_process_terms')
    @patch.object(LookupModule, 'find_file_in_search_path')
    def test_run_with_no_file_found(self, mock_find_file, mock_process_terms):
        terms = ["file1"]
        variables = {}
        kwargs = {}
        mock_process_terms.return_value = (["file1"], False)
        mock_find_file.return_value = None
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(terms, variables, **kwargs).template

if __name__ == '__main__':
    unittest.main()