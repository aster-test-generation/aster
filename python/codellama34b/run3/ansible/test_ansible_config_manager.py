import unittest
from ansible.config.manager import *



class TestConfigManager(unittest.TestCase):
    def test_config_manager(self):
        instance = ConfigManager()
        self.assertIsInstance(instance, ConfigManager)

    def test_config_manager_get_configuration_definitions(self):
        instance = ConfigManager()
        result = instance.get_configuration_definitions()
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_config_data(self):
        instance = ConfigManager()
        result = instance.get_config_data()
        self.assertIsInstance(result, ConfigData)

    def test_config_manager_get_plugin_options(self):
        instance = ConfigManager()
        result = instance.get_plugin_options(plugin_type='', plugin_name='')
        self.assertIsInstance(result, Sequence)

    def test_config_manager_get_plugin_vars(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars(plugin_type='', plugin_name='')
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_plugin_options_sub(self):
        instance = ConfigManager()
        result = instance.get_plugin_options_sub(plugin_type='', plugin_name='', sub_plugin_type='', sub_plugin_name='')
        self.assertIsInstance(result, Sequence)

    def test_config_manager_get_plugin_vars_sub(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars_sub(plugin_type='', plugin_name='', sub_plugin_type='', sub_plugin_name='')
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_plugin_options_super(self):
        instance = ConfigManager()
        result = instance.get_plugin_options_super(plugin_type='', plugin_name='', super_plugin_type='', super_plugin_name='')
        self.assertIsInstance(result, Sequence)

    def test_config_manager_get_plugin_vars_super(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars_super(plugin_type='', plugin_name='', super_plugin_type='', super_plugin_name='')
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_plugin_options_all(self):
        instance = ConfigManager()
        result = instance.get_plugin_options_all(plugin_type='', plugin_name='')
        self.assertIsInstance(result, Sequence)

    def test_config_manager_get_plugin_vars_all(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars_all(plugin_type='', plugin_name='')
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_plugin_options_sub_all(self):
        instance = ConfigManager()
        result = instance.get_plugin_options_sub_all(plugin_type='', plugin_name='', sub_plugin_type='', sub_plugin_name='')
        self.assertIsInstance(result, Sequence)

    def test_config_manager_get_plugin_vars_sub_all(self):
        instance = ConfigManager()
        result = instance.get_plugin_vars_sub_all(plugin_type='', plugin_name='', sub_plugin_type='', sub_plugin_name='')
        self.assertIsInstance(result, Mapping)

    def test_config_manager_get_plugin_options_super_all(self):
        instance = ConfigManager()
        result = instance.get_plugin_options_super_all(plugin_type='', plugin_name='', super_plugin_type='', super_plugin_name='')
        self.assertIsInstance(result, Sequence)

if __name__ == '__main__':
    unittest.main()