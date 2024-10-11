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
        plugin_type = 'some_type'
        plugin_name = 'some_name'
        config = 'some_config'
        expected_entry = 'plugin_type: some_type plugin: some_name setting: some_config'
        actual_entry = _get_entry(plugin_type, plugin_name, config)
        self.assertEqual(actual_entry, expected_entry)

    def test_ensure_type(self):
        value = 'some_value'
        value_type = 'string'
        expected_value = 'some_value'
        actual_value = ensure_type(value, value_type)
        self.assertEqual(actual_value, expected_value)

    def test_resolve_path(self):
        path = 'some_path'
        expected_path = 'some_path'
        actual_path = resolve_path(path)
        self.assertEqual(actual_path, expected_path)

    def test_get_config_type(self):
        cfile = 'some_file.ini'
        expected_config_type = 'ini'
        actual_config_type = get_config_type(cfile)
        self.assertEqual(actual_config_type, expected_config_type)

    def test_get_ini_config_value(self):
        p = configparser.ConfigParser()
        p.read_string('[some_section]\nsome_key = some_value')
        entry = {'section': 'some_section', 'key': 'some_key'}
        expected_value = 'some_value'
        actual_value = get_ini_config_value(p, entry)
        self.assertEqual(actual_value, expected_value)

if __name__ == '__main__':
    unittest.main()