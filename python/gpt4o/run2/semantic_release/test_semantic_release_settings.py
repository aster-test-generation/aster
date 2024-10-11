import unittest
from unittest.mock import patch, mock_open, MagicMock
import os
import importlib
import configparser
import tomlkit
from tomlkit.exceptions import TOMLKitError
from semantic_release.settings import (
    _config,
    _config_from_ini,
    _config_from_pyproject,
    current_commit_parser,
    current_changelog_components,
    overload_configuration,
    ImproperConfigurationError,
)


class TestSemanticReleaseSettings(unittest.TestCase):

    @patch('semantic_release.settings.getcwd', return_value='/mocked/path')
    @patch('semantic_release.settings._config_from_ini', return_value={'key': 'value'})
    @patch('semantic_release.settings._config_from_pyproject', return_value={'key2': 'value2'})
    def test_config(self, mock_ini, mock_pyproject, mock_getcwd):
        result = _config()
        self.assertEqual(result, {'key': 'value', 'key2': 'value2'})

    @patch('configparser.ConfigParser.read')
    @patch('configparser.ConfigParser.items', return_value=[('key', 'value')])
    def test_config_from_ini(self, mock_items, mock_read):
        paths = ['/mocked/path/defaults.cfg', '/mocked/path/setup.cfg']
        result = _config_from_ini(paths, section='semantic_release')
        self.assertEqual(result, {'key': 'value'})

    @patch('os.path.isfile', return_value=True)
    @patch('builtins.open', new_callable=mock_open, read_data='[tool.semantic_release]\nkey="value"')
    def test_config_from_pyproject(self, mock_open, mock_isfile):
        path = '/mocked/path/pyproject.toml'
        result = _config_from_pyproject(path)
        self.assertEqual(result, {'key': 'value'})

    @patch('os.path.isfile', return_value=False)
    def test_config_from_pyproject_no_file(self, mock_isfile):
        path = '/mocked/path/pyproject.toml'
        result = _config_from_pyproject(path)
        self.assertEqual(result, {})

    @patch('tomlkit.loads', side_effect=TOMLKitError('Error'))
    @patch('builtins.open', new_callable=mock_open)
    @patch('os.path.isfile', return_value=True)
    def test_config_from_pyproject_tomlkit_error(self, mock_isfile, mock_open, mock_tomlkit):
        path = '/mocked/path/pyproject.toml'
        result = _config_from_pyproject(path)
        self.assertEqual(result, {})

    @patch('semantic_release.settings.config', {'commit_parser': 'module.parser'})
    @patch('importlib.import_module', return_value=MagicMock(parser=lambda x: x))
    def test_current_commit_parser(self, mock_import_module):
        result = current_commit_parser()
        self.assertTrue(callable(result))

    @patch('semantic_release.settings.config', {'commit_parser': 'module.parser'})
    @patch('importlib.import_module', side_effect=ImportError('Error'))
    def test_current_commit_parser_import_error(self, mock_import_module):
        with self.assertRaises(ImproperConfigurationError):
            current_commit_parser()

    @patch('semantic_release.settings.config', {'changelog_components': 'module.component'})
    @patch('importlib.import_module', return_value=MagicMock(component=lambda x: x))
    def test_current_changelog_components(self, mock_import_module):
        result = current_changelog_components()
        self.assertTrue(all(callable(comp) for comp in result))

    @patch('semantic_release.settings.config', {'changelog_components': 'module.component'})
    @patch('importlib.import_module', side_effect=ImportError('Error'))
    def test_current_changelog_components_import_error(self, mock_import_module):
        with self.assertRaises(ImproperConfigurationError):
            current_changelog_components()

    def test_overload_configuration(self):
        @overload_configuration
        def dummy_function(*args, **kwargs):
            return kwargs

        result = dummy_function(define=['key=value'])
        self.assertEqual(result, {'define': ['key=value']})

if __name__ == '__main__':
    unittest.main()