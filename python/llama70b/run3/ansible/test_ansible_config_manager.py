import unittest
from ansible.parsing.dataloader import DataLoader


class TestPlugin(unittest.TestCase):
    def test_Plugin_init(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(plugin.name, 'name')
        self.assertEqual(plugin.type, 'type')

    def test_Plugin_repr(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(repr(plugin), "Plugin(name='name', type='type')")

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

class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        warnings = set()
        path = find_ini_config_file(warnings)
        self.assertIsNotNone(path)

    def test_find_ini_config_file_warnings(self):
        warnings = set()
        find_ini_config_file(warnings)
        self.assertEqual(len(warnings), 0)  # no warnings by default

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {'dummy': {'ini': [{'deprecated': True}]} }
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['dummy']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')

if __name__ == '__main__':
    unittest.main()