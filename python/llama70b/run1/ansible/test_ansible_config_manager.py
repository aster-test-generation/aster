import unittest
from ansible.config.manager import find_ini_config_file 


class TestAnsibleConfigManager(unittest.TestCase):
    def test_find_ini_config_file(self):
        result = find_ini_config_file()
        self.assertIsInstance(result, str)

    def test_find_ini_config_file_warnings(self):
        warnings = set()
        result = find_ini_config_file(warnings)
        self.assertIsInstance(result, str)
        self.assertEqual(warnings, set())

    def test__add_base_defs_deprecations(self):
        base_defs = {'dummy': {'ini': [{'deprecated': {}}]}}
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['dummy']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')

    def test_Plugin_namedtuple(self):
        plugin = Plugin('name', 'type')
        self.assertEqual(plugin.name, 'name')
        self.assertEqual(plugin.type, 'type')

    def test_Setting_namedtuple(self):
        setting = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(setting.name, 'name')
        self.assertEqual(setting.value, 'value')
        self.assertEqual(setting.origin, 'origin')
        self.assertEqual(setting.type, 'type')

    def test_INTERNAL_DEFS(self):
        self.assertEqual(INTERNAL_DEFS, {'lookup': ('_terms',)})

if __name__ == '__main__':
    unittest.main()