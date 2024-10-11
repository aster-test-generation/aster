import unittest
from ansible.module_utils.basic import AnsibleModul
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import MutableSequence
from collections import defaultdict
from io import StringIO
from configparser import ConfigParser
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native


class TestLookupModule(unittest.TestCase):
    def test_get_value(self):
        lookup = LookupModule()
        self.assertEqual(lookup.get_value('key', 'section', 'default', False), 'default')
        self.assertEqual(lookup.get_value('key', 'section', 'default', True), ['key'])
        self.assertEqual(lookup.get_value('key', 'section', 'default', True), ['key'])

    def test_run(self):
        lookup = LookupModule()
        terms = ['key']
        variables = {}
        paramvals = {'case_sensitive': False, 'allow_no_value': True, 'allow_none': True, 'file': 'file', 'type': 'properties', 'encoding': 'utf-8', 'default': 'default', 're': False}
        result = lookup.run(terms, variables, **paramvals)
        self.assertEqual(result, ['default'])

    def test_parse_params(self):
        lookup = LookupModule()
        term = 'key=value'
        paramvals = {'case_sensitive': False, 'allow_no_value': True, 'allow_none': True, 'file': 'file', 'type': 'properties', 'encoding': 'utf-8', 'default': 'default', 're': False}
        params = lookup._parse_params(term, paramvals)
        self.assertEqual(params, ['key'])

    def test_deprecate_inline_kv(self):
        lookup = LookupModule()
        term = 'key=value'
        lookup._deprecate_inline_kv()
        self.assertEqual(term, 'key=value')

    def test_set_options(self):
        lookup = LookupModule()
        variables = {}
        lookup.set_options(var_options=variables, direct={})
        self.assertEqual(lookup.get_options(), {})

    def test_get_options(self):
        lookup = LookupModule()
        variables = {}
        lookup.set_options(var_options=variables, direct={})
        self.assertEqual(lookup.get_options(), {})

    def test_find_file_in_search_path(self):
        lookup = LookupModule()
        variables = {}
        path = lookup.find_file_in_search_path(variables, 'files', 'file')
        self.assertEqual(path, 'file')

    def test_loader_get_file_contents(self):
        lookup = LookupModule()
        path = 'path'
        contents, show_data = lookup._loader._get_file_contents(path)
        self.assertEqual(contents, b'')

    def test_loader_get_file_contents_with_contents(self):
        lookup = LookupModule()
        path = 'path'
        contents = b'content'
        show_data = True
        lookup._loader._get_file_contents = lambda x: (contents, show_data)
        result, _ = lookup._loader._get_file_contents(path)
        self.assertEqual(result, contents)

    def test_loader_get_file_contents_with_show_data(self):
        lookup = LookupModule()
        path = 'path'
        contents = b'content'
        show_data = False
        lookup._loader._get_file_contents = lambda x: (contents, show_data)
        result, _ = lookup._loader._get_file_contents(path)
        self.assertEqual(result, contents)

    def test_loader_get_file_contents_with_error(self):
        lookup = LookupModule()
        path = 'path'
        lookup._loader._get_file_contents = lambda x: (None, None)
        result, _ = lookup._loader._get_file_contents(path)
        self.assertIsNone(result)

    def test_loader_get_file_contents_with_exception(self):
        lookup = LookupModule()
        path = 'path'
        def get_file_contents(path):
            raise Exception('Error')
        lookup._loader._get_file_contents = get_file_contents
        result, _ = lookup._loader._get_file_contents(path)
        self.assertIsNone(result)

    def test_loader_get_file_contents_with_configparser(self):
        lookup = LookupModule()
        path = 'path'
        config = StringIO()
        config.write(b'content')
        config.seek(0, os.SEEK_SET)
        lookup._loader._get_file_contents = lambda x: (config, False)
        result, _ = lookup._loader._get_file_contents(path)
        self.assertEqual(result, b'content')

if __name__ == '__main__':
    unittest.main()