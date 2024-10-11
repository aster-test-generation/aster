from ansible.config.manager import _add_base_defs_deprecations
import unittest
from ansible.config.manager import *


class TestPlugin(unittest.TestCase):
    def test_Plugin_init(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(plugin.name, 'name')
        self.assertEqual(plugin.type, 'type')

    def test_Plugin_repr(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(repr(plugin), "Plugin(name='name', type='type')")

    def test_Plugin_eq(self):
        plugin1 = Plugin('name', 'type')
        plugin2 = Plugin('name', 'type')
        self.assertEqual(plugin1, plugin2)

class TestSetting(unittest.TestCase):
    def test_Setting_init(self):
        setting = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(setting.name, 'name')
        self.assertEqual(setting.value, 'value')
        self.assertEqual(setting.origin, 'origin')
        self.assertEqual(setting.type, 'type')

    def test_Setting_repr(self):
        setting = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(repr(setting), "Setting(name='name', value='value', origin='origin', type='type')")

    def test_Setting_eq(self):
        setting1 = Setting('name', 'value', 'origin', 'type')
        setting2 = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(setting1, setting2)

class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsInstance(path, str)

    def test_find_ini_config_file_warnings(self):
        warnings = set()
        path = find_ini_config_file(warnings)
        self.assertIsInstance(path, str)
        self.assertIsInstance(warnings, set)

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {'dummy': {'ini': [{'deprecated': {}}]}}
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['dummy']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')

if __name__ == '__main__':
    unittest.main()