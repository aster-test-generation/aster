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

if __name__ == '__main__':
    unittest.main()