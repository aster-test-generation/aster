import unittest
from unittest.mock import patch, mock_open, MagicMock
import os
import importlib
from semantic_release.settings import (
    _config,
    _config_from_ini,
    _config_from_pyproject,
    current_commit_parser,
    current_changelog_components,
    overload_configuration,
    ImproperConfigurationError,
    config
)
import tomlkit
from tomlkit.exceptions import TOMLKitError

class TestSemanticReleaseSettings(unittest.TestCase):

    @patch('semantic_release.settings.getcwd', return_value='/mocked/path')
    @patch('semantic_release.settings._config_from_ini', return_value={'key': 'value'})
    @patch('semantic_release.settings._config_from_pyproject', return_value={'key2': 'value2'})
    def test_config(self, mock_ini, mock_pyproject, mock_getcwd):
        result = _config()
        self.assertEqual(result, {'key': 'value', 'key2': 'value2'})

    @patch('semantic_release.settings.configparser.ConfigParser.read')
    @patch('semantic_release.settings.configparser.ConfigParser.items', return_value=[('key', 'value')])
    def test_config_from_ini(self, mock_items, mock_read):
        paths = ['/mocked/path/setup.cfg']
        result = _config_from_ini(paths)
        self.assertEqual(result, {'key': 'value'})

    @patch('builtins.open', new_callable=mock_open, read_data='[tool.semantic_release]\nkey="value"')
    @patch('semantic_release.settings.os.path.isfile', return_value=True)
    def test_config_from_pyproject(self, mock_isfile, mock_open):
        path = '/mocked/path/pyproject.toml'
        result = _config_from_pyproject(path)
        self.assertEqual(result, {'key': 'value'})

    @patch('builtins.open', new_callable=mock_open, read_data='invalid toml')
    @patch('semantic_release.settings.os.path.isfile', return_value=True)
    @patch('semantic_release.settings.logger.debug')
    def test_config_from_pyproject_toml_error(self, mock_logger, mock_isfile, mock_open):
        path = '/mocked/path/pyproject.toml'
        result = _config_from_pyproject(path)
        self.assertEqual(result, {})

    @patch('semantic_release.settings.config.get', return_value='module.parser')
    @patch('semantic_release.settings.importlib.import_module', return_value=MagicMock(parser=MagicMock()))
    def test_current_commit_parser(self, mock_import_module, mock_config_get):
        result = current_commit_parser()
        self.assertTrue(callable(result))

    @patch('semantic_release.settings.config.get', return_value='invalid.module.parser')
    def test_current_commit_parser_import_error(self, mock_config_get):
        with self.assertRaises(ImproperConfigurationError):
            current_commit_parser()

    @patch('semantic_release.settings.config.get', return_value='module.component1,module.component2')
    @patch('semantic_release.settings.importlib.import_module', return_value=MagicMock(component1=MagicMock(), component2=MagicMock()))
    def test_current_changelog_components(self, mock_import_module, mock_config_get):
        result = current_changelog_components()
        self.assertEqual(len(result), 2)
        self.assertTrue(all(callable(component) for component in result))

    @patch('semantic_release.settings.config.get', return_value='invalid.module.component')
    def test_current_changelog_components_import_error(self, mock_config_get):
        with self.assertRaises(ImproperConfigurationError):
            current_changelog_components()

    @patch('semantic_release.settings.config.__setitem__')
    def test_overload_configuration(self, mock_setitem):
        @overload_configuration
        def dummy_function():
            return True

        result = dummy_function(define=['key=value'])
        self.assertTrue(result)
        mock_setitem.assert_called_with('key', 'value')

if __name__ == '__main__':
    unittest.main()