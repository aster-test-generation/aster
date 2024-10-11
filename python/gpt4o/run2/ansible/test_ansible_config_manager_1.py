import unittest
from ansible.config.manager import ConfigManager, Setting
from ansible.errors import AnsibleOptionsError, AnsibleError
from ansible.config.data import ConfigData


class TestConfigManager(unittest.TestCase):
    def setUp(self):
        self.config_manager = ConfigManager()

    def test_init(self):
        self.assertIsInstance(self.config_manager.data, ConfigData)
        self.assertIsInstance(self.config_manager._base_defs, dict)
        self.assertIsInstance(self.config_manager._plugins, dict)
        self.assertIsInstance(self.config_manager._parsers, dict)

    def test_get_config_value_and_origin(self):
        self.config_manager._base_defs = {
            'test_config': {
                'default': 'default_value',
                'type': 'string'
            }
        }
        value, origin = self.config_manager.get_config_value_and_origin('test_config')
        self.assertEqual(value, 'default_value')
        self.assertEqual(origin, 'default')

    def test_initialize_plugin_configuration_definitions(self):
        self.config_manager.initialize_plugin_configuration_definitions('test_type', 'test_name', {'key': 'value'})
        self.assertIn('test_type', self.config_manager._plugins)
        self.assertIn('test_name', self.config_manager._plugins['test_type'])
        self.assertEqual(self.config_manager._plugins['test_type']['test_name'], {'key': 'value'})

    def test_update_config_data(self):
        self.config_manager._base_defs = {
            'test_config': {
                'default': 'default_value',
                'type': 'string'
            }
        }
        self.config_manager.update_config_data()
        setting = self.config_manager.data.get_setting('test_config')
        self.assertEqual(setting.value, 'default_value')
        self.assertEqual(setting.origin, 'default')

    def test_update_config_data_invalid_defs(self):
        with self.assertRaises(AnsibleOptionsError):
            self.config_manager.update_config_data(defs='invalid_defs')

    def test_update_config_data_invalid_config(self):
        self.config_manager._base_defs = {
            'test_config': 'invalid_config'
        }
        with self.assertRaises(AnsibleOptionsError):
            self.config_manager.update_config_data()

    def test_private_methods(self):
        # Test private methods by name mangling
        self.assertTrue(hasattr(self.config_manager, '_ConfigManager__init__'))
        self.assertTrue(hasattr(self.config_manager, '_ConfigManager__str__'))
        self.assertTrue(hasattr(self.config_manager, '_ConfigManager__repr__'))
        self.assertTrue(hasattr(self.config_manager, '_ConfigManager__eq__'))

    def test_protected_methods(self):
        # Test protected methods by direct call
        self.assertTrue(hasattr(self.config_manager, '_parse_config_file'))
        self.assertTrue(hasattr(self.config_manager, '_read_config_yaml_file'))
        self.assertTrue(hasattr(self.config_manager, '_loop_entries'))

if __name__ == '__main__':
    unittest.main()