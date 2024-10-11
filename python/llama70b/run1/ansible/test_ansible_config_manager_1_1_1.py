from ansible.config.manager import _get_entry
import unittest
from ansible.config.manager import *


class TestPlugin(unittest.TestCase):
    def test_plugin_init(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(plugin.name, 'name')
        self.assertEqual(plugin.type, 'type')

    def test_plugin_repr(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(repr(plugin), "Plugin(name='name', type='type')")

class TestSetting(unittest.TestCase):
    def test_setting_init(self):
        setting = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(setting.name, 'name')
        self.assertEqual(setting.value, 'value')
        self.assertEqual(setting.origin, 'origin')
        self.assertEqual(setting.type, 'type')

    def test_setting_repr(self):
        setting = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(repr(setting), "Setting(name='name', value='value', origin='origin', type='type')")

class TestGetEntry(unittest.TestCase):
    def test_get_entry(self):
        result = _get_entry('plugin_type', 'plugin_name', 'config')
        self.assertEqual(result, 'plugin_type: plugin_type plugin: plugin_name setting: config ')

class TestEnsureType(unittest.TestCase):
    def test_ensure_type_boolean(self):
        result = ensure_type('True', 'boolean')
        self.assertTrue(result)

    def test_ensure_type_integer(self):
        result = ensure_type('1', 'integer')
        self.assertEqual(result, 1)

    def test_ensure_type_float(self):
        result = ensure_type('1.0', 'float')
        self.assertEqual(result, 1.0)

    def test_ensure_type_list(self):
        result = ensure_type('a,b,c', 'list')
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_ensure_type_none(self):
        result = ensure_type('None', 'none')
        self.assertIsNone(result)

    def test_ensure_type_path(self):
        result = ensure_type('/path/to/file', 'path')
        self.assertEqual(result, '/path/to/file')

    def test_ensure_type_tmp(self):
        result = ensure_type('/path/to/tmp', 'tmp')
        self.assertTrue(os.path.exists(result))

    def test_ensure_type_pathspec(self):
        result = ensure_type('/path/to/file:/path/to/other/file', 'pathspec')
        self.assertEqual(result, ['/path/to/file', '/path/to/other/file'])

    def test_ensure_type_pathlist(self):
        result = ensure_type('/path/to/file,/path/to/other/file', 'pathlist')
        self.assertEqual(result, ['/path/to/file', '/path/to/other/file'])

    def test_ensure_type_dict(self):
        result = ensure_type({'a': 1, 'b': 2}, 'dict')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_ensure_type_str(self):
        result = ensure_type('hello', 'str')
        self.assertEqual(result, 'hello')

class TestResolvePath(unittest.TestCase):
    def test_resolve_path(self):
        result = resolve_path('/path/to/file')
        self.assertEqual(result, '/path/to/file')

    def test_resolve_path_with_cwd(self):
        result = resolve_path('{{CWD}}/path/to/file')
        self.assertEqual(result, os.getcwd() + '/path/to/file')

class TestGetConfigType(unittest.TestCase):
    def test_get_config_type_ini(self):
        result = get_config_type('config.ini')
        self.assertEqual(result, 'ini')

    def test_get_config_type_yaml(self):
        result = get_config_type('config.yaml')
        self.assertEqual(result, 'yaml')

    def test_get_config_type_unknown(self):
        with self.assertRaises(AnsibleOptionsError):
            get_config_type('config.txt')

class TestGetIniConfigValue(unittest.TestCase):
    def test_get_ini_config_value(self):
        p = configparser.ConfigParser()
        p.read_string('[defaults]\nkey = value')
        result = get_ini_config_value(p, {'section': 'defaults', 'key': 'key'})
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()