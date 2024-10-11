import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.first_found import LookupModule, _split_on
from ansible.errors import AnsibleLookupError
from ansible.module_utils.six import string_types


class TestSplitOn(unittest.TestCase):
    def test_split_on_string(self):
        result = _split_on("a,b;c", ',;')
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_split_on_list(self):
        result = _split_on(["a,b", "c;d"], ',;')
        self.assertEqual(result, ['a', 'b', 'c', 'd'])

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_process_terms_string(self):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup._templar = MagicMock()
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
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs.get(x, None))
        result, skip = self.lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1/file1', 'path1/file2', 'path2/file1', 'path2/file2', 'path1/file3', 'path2/file3'])

    def test_process_terms_invalid(self):
        terms = 123
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleLookupError):
            self.lookup._process_terms([terms], variables, kwargs)

    @patch('ansible.plugins.lookup.first_found.LookupModule.find_file_in_search_path')
    @patch('ansible.plugins.lookup.first_found.LookupModule._templar')
    def test_run(self, mock_templar, mock_find_file):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        mock_templar.template.side_effect = lambda x: x
        mock_find_file.side_effect = lambda *args, **kwargs: None if 'file2' in args[2] else 'path1/file1'
        result = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, ['path1/file1'])

    @patch('ansible.plugins.lookup.first_found.LookupModule.find_file_in_search_path')
    @patch('ansible.plugins.lookup.first_found.LookupModule._templar')
    def test_run_skip(self, mock_templar, mock_find_file):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2', 'skip': True}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        mock_templar.template.side_effect = lambda x: x
        mock_find_file.side_effect = lambda *args, **kwargs: None
        result = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    @patch('ansible.plugins.lookup.first_found.LookupModule.find_file_in_search_path')
    @patch('ansible.plugins.lookup.first_found.LookupModule._templar')
    def test_run_no_file_found(self, mock_templar, mock_find_file):
        terms = "file1,file2"
        variables = {}
        kwargs = {'files': 'file1,file2', 'paths': 'path1,path2'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=lambda x: kwargs[x])
        mock_templar.template.side_effect = lambda x: x
        mock_find_file.side_effect = lambda *args, **kwargs: None
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(terms, variables, **kwargs)

if __name__ == '__main__':
    unittest.main()