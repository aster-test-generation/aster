import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def setUp(self):
        self.config_manager = ConfigManager()

    def test_read_config_yaml_file(self):
        yml_file = 'path/to/base.yml'
        expected_result = {'key': 'value'}
        actual_result = self.config_manager._read_config_yaml_file(yml_file)
        self.assertEqual(actual_result, expected_result)

    def test_parse_config_file(self):
        cfile = 'path/to/config.ini'
        self.config_manager._parse_config_file(cfile)
        self.assertTrue(cfile in self.config_manager._parsers)

    def test_find_yaml_config_files(self):
        expected_result = ['path/to/config1.yml', 'path/to/config2.yml']
        actual_result = self.config_manager._find_yaml_config_files()
        self.assertEqual(actual_result, expected_result)

    def test_get_plugin_options(self):
        plugin_type = 'type'
        name = 'name'
        expected_result = {'option': 'value'}
        actual_result = self.config_manager.get_plugin_options(plugin_type, name)
        self.assertEqual(actual_result, expected_result)

    def test_get_plugin_vars(self):
        plugin_type = 'type'
        name = 'name'
        expected_result = ['var1', 'var2']
        actual_result = self.config_manager.get_plugin_vars(plugin_type, name)
        self.assertEqual(actual_result, expected_result)

    def test_get_configuration_definition(self):
        name = 'name'
        expected_result = {'key': 'value'}
        actual_result = self.config_manager.get_configuration_definition(name)
        self.assertEqual(actual_result, expected_result)

    def test_get_configuration_definitions(self):
        expected_result = {'name': {'key': 'value'}}
        actual_result = self.config_manager.get_configuration_definitions()
        self.assertEqual(actual_result, expected_result)

    def test_loop_entries(self):
        container = {'name': 'value'}
        entry_list = [{'name': 'name'}]
        expected_result = ('value', 'name')
        actual_result = self.config_manager._loop_entries(container, entry_list)
        self.assertEqual(actual_result, expected_result)

    def test_get_config_value(self):
        config = 'config'
        expected_result = 'value'
        actual_result = self.config_manager.get_config_value(config)
        self.assertEqual(actual_result, expected_result)

if __name__ == '__main__':
    unittest.main()