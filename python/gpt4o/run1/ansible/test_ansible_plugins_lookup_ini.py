import unittest
from ansible.plugins.lookup.ini import LookupModule, _parse_params
from ansible.errors import AnsibleLookupError, AnsibleOptionsError
from collections import defaultdict
from io import StringIO
import configparser
import re


class TestParseParams(unittest.TestCase):
    def test_parse_params(self):
        term = "key1=value1 key2=value2"
        paramvals = {'key1': '', 'key2': ''}
        result = _parse_params(term, paramvals)
        self.assertEqual(result, ['key1=value1', 'key2=value2'])

    def test_parse_params_with_spaces(self):
        term = "key1=value1 key2=value2 with spaces"
        paramvals = {'key1': '', 'key2': ''}
        result = _parse_params(term, paramvals)
        self.assertEqual(result, ['key1=value1', 'key2=value2 with spaces'])

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup.cp = configparser.ConfigParser()

    def test_get_value_with_regexp(self):
        self.lookup.cp.read_dict({'section': {'key1': 'value1', 'key2': 'value2'}})
        result = self.lookup.get_value('key.*', 'section', 'default', True)
        self.assertEqual(result, ['value1', 'value2'])

    def test_get_value_without_regexp(self):
        self.lookup.cp.read_dict({'section': {'key1': 'value1'}})
        result = self.lookup.get_value('key1', 'section', 'default', False)
        self.assertEqual(result, 'value1')

    def test_get_value_with_default(self):
        self.lookup.cp.read_dict({'section': {}})
        result = self.lookup.get_value('key1', 'section', 'default', False)
        self.assertEqual(result, 'default')

    def test_run(self):
        terms = ['key1=value1']
        variables = {}
        kwargs = {'file': 'test.ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8', 'type': 'ini', 'case_sensitive': False, 'allow_no_value': False}
        import unittest.mock
        self.lookup._loader._get_file_contents = unittest.mock.Mock(return_value=('key1=value1\n', None))
        self.lookup.find_file_in_search_path = unittest.mock.Mock(return_value='test.ini')
        result = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, ['value1'])

    def test_run_with_no_key(self):
        terms = ['key1=value1']
        variables = {}
        kwargs = {'file': 'test.ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8', 'type': 'ini', 'case_sensitive': False, 'allow_no_value': False}
        self.lookup._loader = unittest.mock.Mock()
        self.lookup._loader._get_file_contents = unittest.mock.Mock(return_value=('key1=value1\n', None))
        self.lookup.find_file_in_search_path = unittest.mock.Mock(return_value='test.ini')
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(['key1 value1'], variables, **kwargs)

    def test_run_with_invalid_option(self):
        terms = ['key1=value1']
        variables = {}
        kwargs = {'file': 'test.ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8', 'type': 'ini', 'case_sensitive': False, 'allow_no_value': False}
        import unittest.mock
        self.lookup._loader._get_file_contents = unittest.mock.Mock(return_value=('key1=value1\n', None))
        self.lookup.find_file_in_search_path = unittest.mock.Mock(return_value='test.ini')
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(['invalid_option=value'], variables, **kwargs)

    def test_run_with_no_section(self):
        terms = ['key1=value1']
        variables = {}
        kwargs = {'file': 'test.ini', 'section': 'invalid_section', 'default': 'default', 're': False, 'encoding': 'utf-8', 'type': 'ini', 'case_sensitive': False, 'allow_no_value': False}
        self.lookup._loader = unittest.mock.MagicMock()
        self.lookup._loader._get_file_contents = unittest.mock.Mock(return_value=('key1=value1\n', None))
        self.lookup.find_file_in_search_path = unittest.mock.Mock(return_value='test.ini')
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(terms, variables, **kwargs)

if __name__ == '__main__':
    unittest.main()