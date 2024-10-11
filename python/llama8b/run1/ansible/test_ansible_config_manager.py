import unittest
from ansible.config.manager import ConfigManager, ConfigData
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import Mapping, Sequence
from ansible.module_utils.common.yaml import yaml_load
from ansible.module_utils.six import string_types
from ansible.module_utils.six.moves import configparser
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.parsing.quoting import unquote
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils import py3compat
from ansible.utils.path import cleanup_tmp_file, makedirs_safe, unfrackpath


class TestConfigManager(unittest.TestCase):
    def test_init(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        self.assertEqual(instance._base_defs, {})
        self.assertEqual(instance._plugins, {})
        self.assertEqual(instance._parsers, {})
        self.assertEqual(instance._config_file, None)
        self.assertEqual(instance.data, ConfigData())

    def test_read_config_yaml_file(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        yml_file = 'test.yml'
        with open(yml_file, 'w') as f:
            f.write('key: value')
        result = instance._read_config_yaml_file(yml_file)
        self.assertEqual(result, {'key': 'value'})
        os.remove(yml_file)

    def test_parse_config_file(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        cfile = 'test.ini'
        with open(cfile, 'w') as f:
            f.write('[section]\nkey = value')
        instance._parse_config_file(cfile)
        self.assertIn(cfile, instance._parsers)
        os.remove(cfile)

    def test_get_plugin_options(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        plugin_type = 'plugin_type'
        name = 'name'
        options = instance.get_plugin_options(plugin_type, name)
        self.assertEqual(options, {})

    def test_get_plugin_vars(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        plugin_type = 'plugin_type'
        name = 'name'
        pvars = instance.get_plugin_vars(plugin_type, name)
        self.assertEqual(pvars, [])

    def test_get_configuration_definition(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        name = 'name'
        plugin_type = 'plugin_type'
        plugin_name = 'plugin_name'
        ret = instance.get_configuration_definition(name, plugin_type, plugin_name)
        self.assertEqual(ret, {})

    def test_get_configuration_definitions(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        plugin_type = 'plugin_type'
        name = 'name'
        ret = instance.get_configuration_definitions(plugin_type, name)
        self.assertEqual(ret, {})

    def test_loop_entries(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        container = {'key1': 'value1', 'key2': 'value2'}
        entry_list = [{'name': 'key1'}, {'name': 'key2'}]
        value, origin = instance._loop_entries(container, entry_list)
        self.assertEqual(value, 'value1')
        self.assertEqual(origin, 'key1')

    def test_get_config_value(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        config = 'config'
        cfile = 'test.ini'
        with open(cfile, 'w') as f:
            f.write('[section]\nkey = value')
        value = instance.get_config_value(config, cfile)
        self.assertEqual(value, 'value')
        os.remove(cfile)

    def test_private_method(self):
        instance = ConfigManager(conf_file=None, defs_file=None)
        yml_file = 'test.yml'
        with open(yml_file, 'w') as f:
            f.write('key: value')
        result = instance._read_config_yaml_file(yml_file)
        self.assertEqual(result, {'key': 'value'})
        os.remove(yml_file)

if __name__ == '__main__':
    unittest.main()