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
            name='name',
            camel='camel',
            description='description',
            commands=('command1', 'command2'),
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
        name = command1
        description = command1 description
        command = command1
        [setup.command.command2]
        name = command2
        description = command2 description
        command = command2
        """)
        expected = {
            'setup.command.command1': 'command1',
            'setup.command.command2': 'command2',
        }
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, expected)

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
        [setup.command.command1]
        name = command1
        description = command1 description
        command = command1
        [setup.command.command2]
        name = command2
        description = command2 description
        command = command2
        """)
        format_kwargs = {'name': 'name'}
        expected = [
            SetupCfgCommandConfig(
                name='command1',
                camel='command1',
                description='command1 description',
                commands=('command1',),
            ),
            SetupCfgCommandConfig(
                name='command2',
                camel='command2',
                description='command2 description',
                commands=('command2',),
            ),
        ]
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertIn(config, expected)

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
        with patch('os.path.exists', return_value=True):
            with patch('os.path.isdir', return_value=True):
                with patch('os.path.isfile', return_value=True):
                    _validate_setup_dir('setup_dir')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        with patch('os.path.exists', return_value=True):
            with patch('os.path.isdir', return_value=True):
                with patch('os.path.isfile', return_value=True):
                    with patch('os.path.realpath', return_value='realpath'):
                        with patch('flutils.setuputils.cfg.extract_stack', return_value=[FrameSummary('filename', 1, 'name', 'code')]):
                            self.assertEqual(_prep_setup_dir(), 'realpath')


if __name__ == '__main__':
    unittest.main()