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
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config,
)
from typing import Dict, Generator, List, Tuple, Union, cast
from flutils.strutils import underscore_to_camel
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config,
)
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config,
)
from flutils.setuputils.cfg import (
    SetupCfgCommandConfig,
    _each_setup_cfg_command_section,
    _each_setup_cfg_command,
    _get_name,
    _validate_setup_dir,
    _prep_setup_dir,
    each_sub_command_config,
)


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig('name', 'camel', 'description', ('command1', 'command2'))
        self.assertEqual(config.name, 'name')
        self.assertEqual(config.camel, 'camel')
        self.assertEqual(config.description, 'description')
        self.assertEqual(config.commands, ('command1', 'command2'))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.command1]
name = Command 1
description = This is command 1

[setup.command.command2]
name = Command 2
description = This is command 2

[not_a_command]
name = Not a command
description = This is not a command
""")
        expected = {
            'setup.command.command1': 'command1',
            'setup.command.command2': 'command2',
        }
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, expected[section])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.command1]
name = Command 1
description = This is command 1
command = command1 {name}

[setup.command.command2]
name = Command 2
description = This is command 2
commands =
    command2 {name}
    command3 {name}

[not_a_command]
name = Not a command
description = This is not a command
command = not_a_command {name}
""")
        format_kwargs = {'name': 'test'}
        expected = [
            SetupCfgCommandConfig('Command 1', 'Command1', 'This is command 1', ('command1 test',)),
            SetupCfgCommandConfig('Command 2', 'Command2', 'This is command 2', ('command2 test', 'command3 test')),
        ]
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertIn(config, expected)

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
name = Test Name
""")
        self.assertEqual(_get_name(parser, 'setup.cfg'), 'Test Name')

class TestValidateSetupDir(unittest.TestCase):
    @patch('os.path.exists')
    @patch('os.path.isdir')
    def test_validate_setup_dir(self, mock_isdir, mock_exists):
        mock_exists.return_value = True
        mock_isdir.return_value = True
        _validate_setup_dir('setup_dir')
        mock_exists.assert_called_with('setup_dir')
        mock_isdir.assert_called_with('setup_dir')

class TestPrepSetupDir(unittest.TestCase):
    @patch('os.path.exists')
    @patch('os.path.isdir')
    @patch('os.path.join')
    @patch('os.path.realpath')
    @patch('flutils.setuputils.cfg.extract_stack')
    def test_prep_setup_dir(self, mock_extract_stack, mock_realpath, mock_join, mock_isdir, mock_exists):
        mock_extract_stack.return_value = [FrameSummary('filename', 1, 'function', 'code', [])]
        mock_exists.return_value = True
        mock_isdir.return_value = True
        mock_join.return_value = 'setup.py'
        mock_realpath.return_value = 'setup_dir'
        self.assertEqual(_prep_setup_dir(), 'setup_dir')

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig(
            name='name',
            camel='camel',
            description='description',
            commands=('command1', 'command2')
        )
        self.assertEqual(config.name, 'name')
        self.assertEqual(config.camel, 'camel')
        self.assertEqual(config.description, 'description')
        self.assertEqual(config.commands, ('command1', 'command2'))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
        [setup.command.command1]
        command = command1
        [setup.command.command2]
        command = command2
        """)
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertIn(section, ('setup.command.command1', 'setup.command.command2'))
            self.assertIn(command_name, ('command1', 'command2'))

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
        [setup.command.command1]
        command = command1
        [setup.command.command2]
        command = command2
        """)
        format_kwargs = {'name': 'name'}
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertIn(config.name, ('command1', 'command2'))
            self.assertIn(config.camel, ('command1', 'command2'))
            self.assertIn(config.description, ('', ''))
            self.assertIn(config.commands, (('command1',), ('command2',)))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
        [metadata]
        name = name
        """)
        self.assertEqual(_get_name(parser, 'setup.cfg'), 'name')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir('setup_dir')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        _prep_setup_dir('setup_dir')

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        for config in each_sub_command_config('setup_dir'):
            self.assertIn(config.name, ('command1', 'command2'))
            self.assertIn(config.camel, ('command1', 'command2'))
            self.assertIn(config.description, ('', ''))
            self.assertIn(config.commands, (('command1',), ('command2',)))

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig(
            name='test',
            camel='test',
            description='test',
            commands=('test',),
        )
        self.assertEqual(config.name, 'test')
        self.assertEqual(config.camel, 'test')
        self.assertEqual(config.description, 'test')
        self.assertEqual(config.commands, ('test',))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
        [setup.command.test]
        command = test
        """)
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, 'setup.command.test')
            self.assertEqual(command_name, 'test')

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
        [setup.command.test]
        command = test
        """)
        format_kwargs = {'name': 'test'}
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertEqual(config.name, 'test')
            self.assertEqual(config.camel, 'test')
            self.assertEqual(config.description, '')
            self.assertEqual(config.commands, ('test',))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
        [metadata]
        name = test
        """)
        name = _get_name(parser, 'test')
        self.assertEqual(name, 'test')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        setup_dir = 'test'
        _validate_setup_dir(setup_dir)

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        setup_dir = 'test'
        _prep_setup_dir(setup_dir)

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        for config in each_sub_command_config():
            self.assertEqual(config.name, 'test')
            self.assertEqual(config.camel, 'test')
            self.assertEqual(config.description, '')
            self.assertEqual(config.commands, ('test',))

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

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig(
            name="test",
            camel="test",
            description="test",
            commands=("test",),
        )
        self.assertEqual(config.name, "test")
        self.assertEqual(config.camel, "test")
        self.assertEqual(config.description, "test")
        self.assertEqual(config.commands, ("test",))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.test]
command = test
""")
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, "setup.command.test")
            self.assertEqual(command_name, "test")

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.test]
name = test
description = test
command = test
""")
        format_kwargs = {"name": "test"}
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertEqual(config.name, "test")
            self.assertEqual(config.camel, "test")
            self.assertEqual(config.description, "test")
            self.assertEqual(config.commands, ("test",))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
name = test
""")
        self.assertEqual(_get_name(parser, "test"), "test")

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        with patch("os.path.exists", return_value=True):
            with patch("os.path.isdir", return_value=True):
                with patch("os.path.isfile", return_value=True):
                    _validate_setup_dir("test")

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        with patch("flutils.setuputils.cfg.extract_stack", return_value=[]):
            with self.assertRaises(FileNotFoundError):
                _prep_setup_dir()


if __name__ == '__main__':
    unittest.main()