import unittest
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config,
)
from configparser import ConfigParser
from unittest.mock import patch

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig(
            name='test',
            camel='test',
            description='test',
            commands=(),
        )
        self.assertEqual(config.name, 'test')
        self.assertEqual(config.camel, 'test')
        self.assertEqual(config.description, 'test')
        self.assertEqual(config.commands, ())

class TestEachSetupCfgCommandSection(unittest.TestCase):
    @patch('configparser.ConfigParser')
    def test_each_setup_cfg_command_section(self, mock_config_parser):
        parser = mock_config_parser.return_value
        parser.sections.return_value = ['test']
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, 'test')
            self.assertEqual(command_name, 'test')

class TestEachSetupCfgCommand(unittest.TestCase):
    @patch('configparser.ConfigParser')
    def test_each_setup_cfg_command(self, mock_config_parser):
        parser = mock_config_parser.return_value
        parser.options.return_value = ['test']
        parser.get.return_value = 'test'
        for config in _each_setup_cfg_command(parser, {}):
            self.assertEqual(config.name, 'test')
            self.assertEqual(config.camel, 'test')
            self.assertEqual(config.description, 'test')
            self.assertEqual(config.commands, ('test',))

class TestGetName(unittest.TestCase):
    @patch('configparser.ConfigParser')
    def test_get_name(self, mock_config_parser):
        parser = mock_config_parser.return_value
        parser.get.return_value = 'test'
        name = _get_name(parser, 'test')
        self.assertEqual(name, 'test')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('test')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        with self.assertRaises(FileNotFoundError):
            _prep_setup_dir()

class TestEachSubCommandConfig(unittest.TestCase):
    @patch('flutils.setuputils.cfg._prep_setup_dir')
    @patch('flutils.setuputils.cfg._validate_setup_dir')
    @patch('flutils.setuputils.cfg._get_name')
    @patch('flutils.setuputils.cfg._each_setup_cfg_command')
    @patch('flutils.setuputils.cfg._each_setup_cfg_command_section')
    @patch('configparser.ConfigParser')
    def test_each_sub_command_config(
        self,
        mock_config_parser,
        mock_each_setup_cfg_command_section,
        mock_each_setup_cfg_command,
        mock_get_name,
        mock_validate_setup_dir,
        mock_prep_setup_dir,
    ):
        parser = mock_config_parser.return_value
        parser.options.return_value = ['test']
        parser.get.return_value = 'test'
        mock_prep_setup_dir.return_value = 'test'
        mock_validate_setup_dir.return_value = None
        mock_get_name.return_value = 'test'
        for config in each_sub_command_config():
            self.assertEqual(config.name, 'test')
            self.assertEqual(config.camel, 'test')
            self.assertEqual(config.description, 'test')
            self.assertEqual(config.commands, ('test',))

if __name__ == '__main__':
    unittest.main()