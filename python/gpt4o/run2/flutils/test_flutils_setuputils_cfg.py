import unittest
from configparser import ConfigParser, NoOptionError, NoSectionError
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config
)
from unittest.mock import patch, mock_open, MagicMock
import os


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_setup_cfg_command_config(self):
        config = SetupCfgCommandConfig(
            name="test_name",
            camel="TestName",
            description="Test description",
            commands=("command1", "command2")
        )
        self.assertEqual(config.name, "test_name")
        self.assertEqual(config.camel, "TestName")
        self.assertEqual(config.description, "Test description")
        self.assertEqual(config.commands, ("command1", "command2"))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.add_section('setup.command.test')
        sections = list(_each_setup_cfg_command_section(parser))
        self.assertEqual(sections, [('setup.command.test', 'test')])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.add_section('setup.command.test')
        parser.set('setup.command.test', 'command', 'test_command')
        format_kwargs = {'name': 'test_name'}
        commands = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(commands), 1)
        self.assertEqual(commands[0].name, 'test')
        self.assertEqual(commands[0].commands, ('test_command',))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', 'test_name')
        name = _get_name(parser, 'setup.cfg')
        self.assertEqual(name, 'test_name')

    def test_get_name_no_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, 'setup.cfg')

    def test_get_name_no_option(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        with self.assertRaises(LookupError):
            _get_name(parser, 'setup.cfg')

    def test_get_name_empty(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', '')
        with self.assertRaises(LookupError):
            _get_name(parser, 'setup.cfg')

class TestValidateSetupDir(unittest.TestCase):
    @patch('os.path.exists', return_value=False)
    def test_validate_setup_dir_not_exist(self, mock_exists):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('invalid_dir')

    @patch('os.path.exists', return_value=True)
    @patch('os.path.isdir', return_value=False)
    def test_validate_setup_dir_not_directory(self, mock_isdir, mock_exists):
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir('invalid_dir')

    @patch('os.path.exists', return_value=True)
    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', side_effect=[False, True])
    def test_validate_setup_dir_no_setup_py(self, mock_isfile, mock_isdir, mock_exists):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('invalid_dir')

    @patch('os.path.exists', return_value=True)
    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', side_effect=[True, False])
    def test_validate_setup_dir_no_setup_cfg(self, mock_isfile, mock_isdir, mock_exists):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('invalid_dir')

class TestPrepSetupDir(unittest.TestCase):
    @patch('os.path.exists', return_value=True)
    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('os.path.realpath', return_value='/real/path')
    def test_prep_setup_dir(self, mock_realpath, mock_isfile, mock_isdir, mock_exists):
        setup_dir = _prep_setup_dir('/some/path')
        self.assertEqual(setup_dir, '/real/path')

    @patch('os.path.exists', return_value=True)
    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('os.path.realpath', return_value='/real/path')
    @patch('flutils.setuputils.cfg.extract_stack', return_value=[MagicMock(filename='setup.py')])
    def test_prep_setup_dir_find_setup_py(self, mock_extract_stack, mock_realpath, mock_isfile, mock_isdir, mock_exists):
        setup_dir = _prep_setup_dir()
        self.assertEqual(setup_dir, '/real/path')

    @patch('flutils.setuputils.cfg.extract_stack', return_value=[MagicMock(filename='other.py')])
    def test_prep_setup_dir_no_setup_py(self, mock_extract_stack):
        with self.assertRaises(FileNotFoundError):
            _prep_setup_dir()

class TestEachSubCommandConfig(unittest.TestCase):
    @patch('flutils.setuputils.cfg._prep_setup_dir', return_value='/real/path')
    @patch('flutils.setuputils.cfg._get_name', return_value='test_name')
    @patch('os.path.isfile', return_value=True)
    @patch('configparser.ConfigParser.read')
    def test_each_sub_command_config(self, mock_read, mock_isfile, mock_get_name, mock_prep_setup_dir):
        parser = ConfigParser()
        parser.add_section('setup.command.test')
        parser.set('setup.command.test', 'command', 'test_command')
        with patch('configparser.ConfigParser', return_value=parser):
            configs = list(each_sub_command_config('/some/path'))
            self.assertEqual(len(configs), 0)
            self.assertEqual(configs[0].name, 'test')
            self.assertEqual(configs[0].commands, ('test_command',))

if __name__ == '__main__':
    unittest.main()