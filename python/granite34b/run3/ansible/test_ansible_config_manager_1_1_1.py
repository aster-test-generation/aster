import configparser
import unittest
from ansible.config.manager import (
    _get_entry,
    ensure_type,
    resolve_path,
    get_config_type,
    get_ini_config_value,
)


class TestAnsibleConfigManager(unittest.TestCase):
    def test_get_entry(self):
        plugin_type = 'test_plugin_type'
        plugin_name = 'test_plugin_name'
        config = 'test_config'
        expected_entry = 'plugin_type: test_plugin_type plugin: test_plugin_name setting: test_config'
        entry = _get_entry(plugin_type, plugin_name, config)
        self.assertEqual(entry, 'plugin_type: test_plugin_type plugin: test_plugin_name setting: test_config')

    def test_ensure_type(self):
        value = 'test_value'
        value_type = 'string'
        expected_value = 'test_value'
        result = ensure_type(value, value_type)
        self.assertEqual(result, expected_value)

    def test_resolve_path(self):
        path = '/test/path'
        expected_path = '/test/path'
        result = resolve_path(path)
        self.assertEqual(result, expected_path)

    def test_get_config_type(self):
        cfile = '/test/config.ini'
        expected_config_type = 'ini'
        result = get_config_type(cfile)
        self.assertEqual(result, expected_config_type)

    def test_get_ini_config_value(self):
        p = configparser.ConfigParser()
        p.read_string('[test_section]\ntest_key = test_value')
        entry = {'section': 'test_section', 'key': 'test_key'}
        expected_value = 'test_value'
        result = get_ini_config_value(p, entry)
        self.assertEqual(result, expected_value)

if __name__ == '__main__':
    unittest.main()