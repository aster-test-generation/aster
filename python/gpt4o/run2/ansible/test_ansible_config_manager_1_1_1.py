import configparser
import unittest
from ansible.config.manager import _get_entry, ensure_type, resolve_path, get_config_type, get_ini_config_value
from ansible.errors import AnsibleOptionsError
from ansible.module_utils.six import string_types
from ansible.module_utils.common._collections_compat import Mapping, Sequence
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
import os
import tempfile


class TestAnsibleConfigManager(unittest.TestCase):

    def test_get_entry_with_plugin_type_and_name(self):
        result = _get_entry('lookup', 'plugin_name', 'config')
        self.assertEqual(result, 'plugin_type: lookup plugin: plugin_name setting: config ')

    def test_get_entry_with_plugin_type_only(self):
        result = _get_entry('lookup', None, 'config')
        self.assertEqual(result, 'plugin_type: lookup setting: config ')

    def test_get_entry_with_no_plugin_type(self):
        result = _get_entry(None, None, 'config')
        self.assertEqual(result, 'setting: config ')

    def test_ensure_type_boolean(self):
        result = ensure_type('true', 'boolean')
        self.assertEqual(result, True)

    def test_ensure_type_integer(self):
        result = ensure_type('123', 'integer')
        self.assertEqual(result, 123)

    def test_ensure_type_float(self):
        result = ensure_type('123.45', 'float')
        self.assertEqual(result, 123.45)

    def test_ensure_type_list(self):
        result = ensure_type('a,b,c', 'list')
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_ensure_type_none(self):
        result = ensure_type('None', 'none')
        self.assertEqual(result, None)

    def test_ensure_type_path(self):
        result = ensure_type('/tmp', 'path')
        self.assertEqual(result, '/tmp')

    def test_ensure_type_tmp(self):
        with tempfile.TemporaryDirectory() as tmpdirname:
            result = ensure_type(tmpdirname, 'tmp')
            self.assertTrue(os.path.exists(result))

    def test_ensure_type_pathspec(self):
        result = ensure_type('/tmp:/var', 'pathspec')
        self.assertEqual(result, ['/tmp', '/var'])

    def test_ensure_type_pathlist(self):
        result = ensure_type('/tmp,/var', 'pathlist')
        self.assertEqual(result, ['/tmp', '/var'])

    def test_ensure_type_dict(self):
        result = ensure_type({'key': 'value'}, 'dict')
        self.assertEqual(result, {'key': 'value'})

    def test_ensure_type_string(self):
        result = ensure_type('string', 'str')
        self.assertEqual(result, 'string')

    def test_ensure_type_invalid(self):
        with self.assertRaises(ValueError):
            ensure_type('value', 'invalid')

    def test_resolve_path_with_cwd(self):
        result = resolve_path('{{CWD}}/test')
        self.assertTrue(result.endswith('/test'))

    def test_resolve_path_without_cwd(self):
        result = resolve_path('/tmp/test')
        self.assertEqual(result, '/tmp/test')

    def test_get_config_type_ini(self):
        result = get_config_type('config.ini')
        self.assertEqual(result, 'ini')

    def test_get_config_type_yaml(self):
        result = get_config_type('config.yaml')
        self.assertEqual(result, 'yaml')

    def test_get_config_type_unsupported(self):
        with self.assertRaises(AnsibleOptionsError):
            get_config_type('config.txt')

    def test_get_ini_config_value(self):
        config = configparser.ConfigParser()
        config.add_section('defaults')
        config.set('defaults', 'key', 'value')
        result = get_ini_config_value(config, {'section': 'defaults', 'key': 'key'})
        self.assertEqual(result, 'value')

    def test_get_ini_config_value_no_section(self):
        config = configparser.ConfigParser()
        result = get_ini_config_value(config, {'section': 'defaults', 'key': 'key'})
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()