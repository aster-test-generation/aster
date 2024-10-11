import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def setUp(self):
        self.config_manager = ConfigManager()

    def test_read_config_yaml_file(self):
        yml_file = '%s/base.yml' % os.path.dirname(__file__)
        result = self.config_manager._read_config_yaml_file(yml_file)
        self.assertIsInstance(result, dict)

    def test_parse_config_file(self):
        cfile = self.config_manager._config_file
        result = self.config_manager._parse_config_file(cfile)
        self.assertIsNone(result)

    def test_find_yaml_config_files(self):
        result = self.config_manager._find_yaml_config_files()
        self.assertIsNone(result)

    def test_get_plugin_options(self):
        plugin_type = 'test_plugin_type'
        name = 'test_name'
        keys = ['test_key1', 'test_key2']
        variables = {'test_var1': 'value1', 'test_var2': 'value2'}
        direct = {'test_direct1': 'value1', 'test_direct2': 'value2'}
        result = self.config_manager.get_plugin_options(plugin_type, name, keys, variables, direct)
        self.assertIsInstance(result, dict)

    def test_get_plugin_vars(self):
        plugin_type = 'test_plugin_type'
        name = 'test_name'
        result = self.config_manager.get_plugin_vars(plugin_type, name)
        self.assertIsInstance(result, list)

    def test_get_configuration_definition(self):
        name = 'test_name'
        plugin_type = 'test_plugin_type'
        plugin_name = 'test_plugin_name'
        result = self.config_manager.get_configuration_definition(name, plugin_type, plugin_name)
        self.assertIsNone(result)

    def test_get_configuration_definitions(self):
        plugin_type = 'test_plugin_type'
        name = 'test_name'
        ignore_private = True
        result = self.config_manager.get_configuration_definitions(plugin_type, name, ignore_private)
        self.assertIsInstance(result, dict)

    def test_loop_entries(self):
        container = {'test_key1': 'value1', 'test_key2': 'value2'}
        entry_list = [{'name': 'test_key1'}, {'name': 'test_key2'}]
        result = self.config_manager._loop_entries(container, entry_list)
        self.assertIsInstance(result, tuple)

    def test_get_config_value(self):
        config = 'test_config'
        cfile = 'test_cfile'
        plugin_type = 'test_plugin_type'
        plugin_name = 'test_plugin_name'
        keys = ['test_key1', 'test_key2']
        variables = {'test_var1': 'value1', 'test_var2': 'value2'}
        direct = {'test_direct1': 'value1', 'test_direct2': 'value2'}
        result = self.config_manager.get_config_value(config, cfile, plugin_type, plugin_name, keys, variables, direct)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()