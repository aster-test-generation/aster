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
        term = "key1=value1 key2=value with spaces"
        paramvals = {'key1': '', 'key2': ''}
        result = _parse_params(term, paramvals)
        self.assertEqual(result, ['key1=value1', 'key2=value with spaces'])

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup.cp = configparser.ConfigParser()

    def test_get_value(self):
        self.lookup.cp.add_section('section')
        self.lookup.cp.set('section', 'key', 'value')
        result = self.lookup.get_value('key', 'section', 'default', False)
        self.assertEqual(result, 'value')

    def test_get_value_with_default(self):
        result = self.lookup.get_value('nonexistent_key', 'default', 'default', False)
        self.assertEqual(result, 'default')

    def test_get_value_with_regexp(self):
        self.lookup.cp.add_section('section')
        self.lookup.cp.set('section', 'key1', 'value1')
        self.lookup.cp.set('section', 'key2', 'value2')
        result = self.lookup.get_value('key[12]', 'section', 'default', True)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run(self):
        terms = ['key=value']
        variables = {}
        kwargs = {'allow_no_value': False, 'allow_none': False, 'case_sensitive': False, 'file': 'test.ini', 'type': 'ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8'}
        self.lookup.set_options(var_options=variables, direct=kwargs, loader=self._loader)
        self.lookup.cp = configparser.ConfigParser()
        self.lookup.cp.add_section('section')
        self.lookup.cp.set('section', 'key', 'value')
        result = self.lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, ['value'])

    def test_run_with_invalid_option(self):
        terms = ['key=value']
        variables = {}
        kwargs = {'allow_no_value': False, 'allow_none': False, 'case_sensitive': False, 'file': 'test.ini', 'type': 'ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8'}
        self.lookup.set_options(var_options=variables, direct=kwargs, loader=self._loader)
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(terms, variables, **kwargs)

    def test_run_with_no_key(self):
        terms = ['=value']
        variables = {}
        kwargs = {'allow_no_value': False, 'allow_none': False, 'case_sensitive': False, 'file': 'test.ini', 'type': 'ini', 'section': 'section', 'default': 'default', 're': False, 'encoding': 'utf-8'}
        self.lookup.set_options(var_options=variables, direct=kwargs, loader=self._loader)
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(terms, variables, **kwargs)

    def test_run_with_no_section(self):
        terms = ['key=value']
        variables = {}
        kwargs = {'allow_no_value': False, 'allow_none': False, 'case_sensitive': False, 'file': 'test.ini', 'type': 'ini', 'section': 'nonexistent_section', 'default': 'default', 're': False, 'encoding': 'utf-8'}
        self.lookup.set_options(var_options=variables, direct=kwargs, templar=None)
        with self.assertRaises(AnsibleLookupError):
            self.lookup.run(terms, variables, **kwargs)

if __name__ == '__main__':
    unittest.main()