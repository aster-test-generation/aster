from ansible.plugins.lookup.config import AnsibleError
import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.lookup.config import LookupModule, _get_plugin_config, _get_global_config, MissingSetting
from ansible.errors import AnsibleOptionsError, AnsibleLookupError
from ansible.utils.sentinel import Sentinel
from ansible import constants as C


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_valid_terms(self):
        terms = ['valid_term']
        variables = {'some_var': 'value'}
        with patch('ansible.plugins.lookup.config._get_global_config', return_value='some_value'):
            result = self.lookup.run(terms, variables, config=ansible.constants.config)
            self.assertEqual(result, ['some_value'])

    def test_run_with_invalid_term_type(self):
        terms = [123]
        with self.assertRaises(AnsibleOptionsError):
            self.lookup._load_name(terms)

    def test_run_with_missing_setting_error(self):
        terms = ['missing_term']
        self.lookup.set_options(var_options={}, direct={'on_missing': 'error'}, indirect={})
        with patch('ansible.plugins.lookup.config._get_global_config', side_effect=MissingSetting('missing')):
            with self.assertRaises(AnsibleLookupError):
                self.lookup.run(terms)

    def test_run_with_missing_setting_warn(self):
        terms = ['missing_term']
        self.lookup.set_options(var_options={}, direct={'on_missing': 'warn', 'load_name': 'default'})
        with patch('ansible.plugins.lookup.config._get_global_config', side_effect=MissingSetting('missing')):
            with patch.object(self.lookup._display, 'warning') as mock_warning:
                result = self.lookup.run(terms)
                self.assertEqual(result, [])
                mock_warning.assert_called_once_with('Skipping, did not find setting missing_term')

    def test_run_with_missing_setting_skip(self):
        terms = ['missing_term']
        self.lookup.set_options(var_options={}, direct={'on_missing': 'skip'}, indirect={})
        with patch('ansible.plugins.lookup.config._get_global_config', side_effect=MissingSetting('missing')):
            result = self.lookup.run(terms)
            self.assertEqual(result, [])

    def test_run_with_plugin_config(self):
        terms = ['valid_term']
        variables = {'some_var': 'value'}
        self.lookup.set_options(var_options=variables, direct={'plugin_type': 'lookup', 'name': 'some_plugin'})
        with patch('ansible.plugins.lookup.config._get_plugin_config', return_value='plugin_value'):
            result = self.lookup.run(terms, variables)
            self.assertEqual(result, ['plugin_value'])

    def test_run_with_invalid_on_missing(self):
        terms = ['valid_term']
        self.lookup.set_options(var_options={}, direct={'on_missing': 'skip'})
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(terms)

    def test_run_with_missing_plugin_type_or_name(self):
        terms = ['valid_term']
        self.lookup.set_options(var_options={}, direct={'_load_name': 'lookup'})
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.run(terms)

    def test_run_with_invalid_setting_identifier(self):
        terms = [123]
        with self.assertRaises(AnsibleOptionsError):
            self.lookup.get_name(terms)

class TestGetPluginConfig(unittest.TestCase):
    @patch('ansible.plugins.lookup.config.plugin_loader.lookup_loader.get', return_value=MagicMock(_load_name='some_plugin'))
    @patch('ansible.plugins.lookup.config.C.config.get_config_value', return_value='config_value')
    def test_get_plugin_config(self, mock_get_config_value, mock_loader_get):
        result = _get_plugin_config('some_plugin', 'lookup', 'some_config', {})
        self.assertEqual(result, 'config_value')

    @patch('ansible.plugins.lookup.config.plugin_loader.lookup_loader.get', return_value=None)
    def test_get_plugin_config_with_missing_plugin(self, mock_loader_get):
        with self.assertRaises(AnsibleLookupError):
            _get_plugin_config('missing_plugin', 'lookup', 'some_config', {})

    @patch('ansible.plugins.lookup.config.plugin_loader.lookup_loader.get', side_effect=AnsibleError('was not defined'))
    def test_get_plugin_config_with_missing_setting(self, mock_loader_get):
        with self.assertRaises(MissingSetting):
            _get_plugin_config('some_plugin', 'lookup', 'some_config', {})

class TestGetGlobalConfig(unittest.TestCase):
    @patch('ansible.plugins.lookup.config.C.some_config', 'global_value')
    def test_get_global_config(self):
        result = _get_global_config('some_config')
        self.assertEqual(result, 'global_value')

    @patch('ansible.plugins.lookup.config.C.some_config', side_effect=AttributeError('missing'))
    def test_get_global_config_with_missing_setting(self):
        with self.assertRaises(MissingSetting):
            _get_global_config('some_config')

if __name__ == '__main__':
    unittest.main()