import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        self.assertEqual(config_manager._base_defs, {})
        self.assertEqual(config_manager._plugins, {})
        self.assertEqual(config_manager._parsers, {})
        self.assertEqual(config_manager._config_file, 'test.ini')
        self.assertEqual(config_manager.data, ConfigManager().data)

    def test_get_config_value_and_origin(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        result = config_manager.get_config_value_and_origin('key1')
        self.assertEqual(result, ('value1', 'default'))
        result = config_manager.get_config_value_and_origin('key2')
        self.assertEqual(result, ('value2', 'default'))

    def test_get_config_value_and_origin_with_direct(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        direct = {'key1': 'value3', 'key2': 'value4'}
        result = config_manager.get_config_value_and_origin('key1', direct=direct)
        self.assertEqual(result, ('value3', 'Direct'))
        result = config_manager.get_config_value_and_origin('key2', direct=direct)
        self.assertEqual(result, ('value4', 'Direct'))

    def test_get_config_value_and_origin_with_variables(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        variables = {'key1': 'value3', 'key2': 'value4'}
        result = config_manager.get_config_value_and_origin('key1', variables=variables)
        self.assertEqual(result, ('value3', 'var: key1'))
        result = config_manager.get_config_value_and_origin('key2', variables=variables)
        self.assertEqual(result, ('value4', 'var: key2'))

    def test_get_config_value_and_origin_with_cli(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        cli_args = {'key1': 'value3', 'key2': 'value4'}
        result = config_manager.get_config_value_and_origin('key1', cli_args=cli_args)
        self.assertEqual(result, ('value3', 'cli: key1'))
        result = config_manager.get_config_value_and_origin('key2', cli_args=cli_args)
        self.assertEqual(result, ('value4', 'cli: key2'))

    def test_get_config_value_and_origin_with_env(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        env = {'key1': 'value3', 'key2': 'value4'}
        result = config_manager.get_config_value_and_origin('key1', env=env)
        self.assertEqual(result, ('value3', 'env: key1'))
        result = config_manager.get_config_value_and_origin('key2', env=env)
        self.assertEqual(result, ('value4', 'env: key2'))

    def test_get_config_value_and_origin_with_ini(self):
        config_manager = ConfigManager(conf_file='test.ini', defs_file='test_defs.yml')
        config_manager._base_defs = {'key1': {'value': 'value1'}}
        config_manager._base_defs = {'key2': {'value': 'value2'}}
        result = config_manager.get_config_value_and_origin('key1')
        self.assertEqual(result, ('value1', 'default'))
        result = config_manager.get_config_value_and_origin('key2')
        self.assertEqual(result, ('value2', 'default'))

if __name__ == '__main__':
    unittest.main()