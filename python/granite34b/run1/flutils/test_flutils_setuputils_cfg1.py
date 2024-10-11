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
from typing import Dict, Generator, List, Tuple, Union, cast
from flutils.strutils import underscore_to_camel

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

if __name__ == '__main__':
    unittest.main()