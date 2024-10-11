from ansible.config.manager import _get_entry
import unittest
from ansible.config.manager import *


class TestAnsibleConfigManager(unittest.TestCase):

    def test_get_entry(self):
        plugin_type = 'test_type'
        plugin_name = 'test_name'
        config = 'test_config'
        expected_entry = 'plugin_type: test_type plugin: test_name setting: test_config'
        entry = _get_entry(plugin_type, plugin_name, config)
        self.assertEqual(entry, expected_entry)

    def test_ensure_type(self):
        value = 'test_value'
        value_type = 'string'
        origin = '/path/to/origin'
        expected_value = 'test_value'
        value = ensure_type(value, value_type, origin)
        self.assertEqual(value, expected_value)

    def test_resolve_path(self):
        path = '/path/to/resolve'
        basedir = '/path/to/basedir'
        expected_path = '/path/to/resolved'
        path = resolve_path(path, basedir)
        self.assertEqual(resolve(path), expected_path)

    def test_get_config_type(self):
        cfile = '/path/to/config.ini'
        expected_type = 'ini'
        config_type = get_config_type(cfile)
        self.assertEqual(config_type, expected_type)

    def test_get_ini_config_value(self):
        p = configparser.ConfigParser()
        p.read('/path/to/config.ini')
        entry = {'section': 'defaults', 'key': 'test_key'}
        expected_value = 'test_value'
        value = get_ini_config_value(p, entry)
        self.assertEqual(value, 'test_value')

if __name__ == '__main__':
    unittest.main()