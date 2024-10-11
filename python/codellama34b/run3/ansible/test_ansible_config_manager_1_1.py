import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        instance = ConfigManager()
        self.assertIsInstance(instance, ConfigManager)

    def test_get_plugin_options(self):
        instance = ConfigManager()
        result = instance.get_plugin_options(plugin_type='', name='')
        self.assertIsInstance(result, dict)

    def test_get_plugin_vars(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars(plugin_type='', name='')
        self.assertIsInstance(result, list)

    def test_get_configuration_definition(self):
        instance = ConfigManager()
        result = instance.get_configuration_definition(name='', plugin_type='', plugin_name='')
        self.assertIsInstance(result, dict)

    def test_get_configuration_definitions(self):
        instance = ConfigManager()
        result = instance.get_configuration_definitions(plugin_type='', name='')
        self.assertIsInstance(result, dict)

    def test_loop_entries(self):
        instance = ConfigManager()
        result = instance._loop_entries(container={}, entry_list=[])
        self.assertIsInstance(result, tuple)

    def test_get_config_value(self):
        instance = ConfigManager()
        result = instance.get_config_value(config='', cfile='', plugin_type='', plugin_name='', keys='', variables='', direct='')
        self.assertIsInstance(result, object)

if __name__ == '__main__':
    unittest.main()