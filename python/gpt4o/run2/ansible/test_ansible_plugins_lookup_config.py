import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.config import LookupModule, _get_plugin_config, _get_global_config, MissingSetting
from ansible.errors import AnsibleError, AnsibleLookupError, AnsibleOptionsError
from ansible.utils.sentinel import Sentinel
from ansible import constants as C
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_valid_plugin_config(self):
        terms = ['valid_term']
        variables = {'var1': 'value1'}
        with patch('ansible.plugins.lookup.config._get_plugin_config', return_value='plugin_config_value'):
            self.lookup.set_options = MagicMock()
            self.lookup.get_option = MagicMock(side_effect=['error', 'plugin_type', 'plugin_name'])
            result = self.lookup.run(terms, variables)
            self.assertEqual(result, ['plugin_config_value'])

    def test_run_valid_global_config(self):
        terms = ['valid_term']
        variables = {'var1': 'value1'}
        with patch('ansible.plugins.lookup.config._get_global_config', return_value='global_config_value'):
            self.lookup.set_options = MagicMock()
            self.lookup.get_option = MagicMock(side_effect=['error', None, None])
            result = self.lookup.run(terms, variables)
            self.assertEqual(result, ['global_config_value'])

    def test_run_missing_setting_error(self):
        terms = ['missing_term']
        variables = {'var1': 'value1'}
        with patch('ansible.plugins.lookup.config._get_global_config', side_effect=MissingSetting('missing')):
            self.lookup.set_options = MagicMock()
            self.lookup.get_option = MagicMock(side_effect=['error', None, None])
            with self.assertRaises(AnsibleLookupError):
                self.lookup.run(terms, variables)

    def test_run_invalid_on_missing(self):
        terms = ['valid_term']
        variables = {'var1': 'value1'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=[123, 'plugin_type', 'plugin_name'])
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(terms, variables)

    def test_run_invalid_term_type(self):
        terms = [123]
        variables = {'var1': 'value1'}
        self.lookup.set_options = MagicMock()
        self.lookup.get_option = MagicMock(side_effect=['error', 'plugin_type', 'plugin_name'])
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(terms, variables)

class TestGetPluginConfig(unittest.TestCase):
    @patch('ansible.plugins.lookup.config.plugin_loader')
    @patch('ansible.plugins.lookup.config.C.config.get_config_value')
    def test_get_plugin_config_success(self, mock_get_config_value, mock_plugin_loader):
        mock_loader = MagicMock()
        mock_plugin_loader.plugin_type_loader.get.return_value = mock_loader
        mock_loader._load_name = 'plugin_name'
        mock_get_config_value.return_value = 'config_value'
        result = _get_plugin_config('plugin_name', 'plugin_type', 'config', 'variables')
        self.assertEqual(result, 'config_value')

    @patch('ansible.plugins.lookup.config.plugin_loader')
    def test_get_plugin_config_plugin_not_found(self, mock_plugin_loader):
        mock_plugin_loader.plugin_type_loader.get.return_value = None
        with self.assertRaises(AnsibleLookupError):
            _get_plugin_config('plugin_name', 'plugin_type', 'config', 'variables')

    @patch('ansible.plugins.lookup.config.plugin_loader')
    @patch('ansible.plugins.lookup.config.C.config.get_config_value')
    def test_get_plugin_config_missing_setting(self, mock_get_config_value, mock_plugin_loader):
        mock_loader = MagicMock()
        mock_plugin_loader.plugin_type_loader.get.return_value = mock_loader
        mock_loader._load_name = 'plugin_name'
        mock_get_config_value.side_effect = AnsibleError('was not defined')
        with self.assertRaises(MissingSetting):
            _get_plugin_config('plugin_name', 'plugin_type', 'config', 'variables')

class TestGetGlobalConfig(unittest.TestCase):
    def test_get_global_config_success(self):
        with patch('ansible.constants.valid_config', 'config_value'):
            result = _get_global_config('valid_config')
            self.assertEqual(result, 'config_value')

    def test_get_global_config_missing_setting(self):
        with self.assertRaises(MissingSetting):
            _get_global_config('invalid_config')

if __name__ == '__main__':
    unittest.main()