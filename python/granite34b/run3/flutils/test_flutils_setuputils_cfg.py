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
from typing import Dict, Generator, List, NamedTuple, Tuple, Union, cast
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


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        config = SetupCfgCommandConfig(
            name='test',
            camel='Test',
            description='Test description',
            commands=(),
        )
        self.assertEqual(config.name, 'test')
        self.assertEqual(config.camel, 'Test')
        self.assertEqual(config.description, 'Test description')
        self.assertEqual(config.commands, ())

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.test1]
name = Test 1
description = Test 1 description

[setup.command.test2]
name = Test 2
description = Test 2 description

[not_a_command]
name = Not a command
description = Not a command description
""")
        expected = {
            'setup.command.test1': 'test1',
            'setup.command.test2': 'test2',
        }
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, expected[section])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.test1]
name = Test 1
description = Test 1 description
command = echo test1

[setup.command.test2]
name = Test 2
description = Test 2 description
commands =
    echo test2a
    echo test2b

[not_a_command]
name = Not a command
description = Not a command description
command = echo notacommand
""")
        format_kwargs = {
            'name': 'test',
            'setup_dir': '/path/to/setup',
            'home': '/path/to/home',
        }
        expected = [
            SetupCfgCommandConfig(
                name='test1',
                camel='Test1',
                description='Test 1 description',
                commands=('echo test1',),
            ),
            SetupCfgCommandConfig(
                name='test2',
                camel='Test2',
                description='Test 2 description',
                commands=('echo test2a', 'echo test2b'),
            ),
        ]
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertIn(config, expected)

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
name = Test
""")
        self.assertEqual(_get_name(parser, 'setup.cfg'), 'Test')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir('/path/to/setup')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir(), '/path/to/setup')

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        expected = [
            SetupCfgCommandConfig(
                name='test1',
                camel='Test1',
                description='Test 1 description',
                commands=('echo test1',),
            ),
            SetupCfgCommandConfig(
                name='test2',
                camel='Test2',
                description='Test 2 description',
                commands=('echo test2a', 'echo test2b'),
            ),
        ]
        for config in each_sub_command_config():
            self.assertIn(config, expected)

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
        command = test
        """)
        format_kwargs = {"name": "test"}
        for config in _each_setup_cfg_command(parser, format_kwargs):
            self.assertEqual(config.name, "test")
            self.assertEqual(config.camel, "test")
            self.assertEqual(config.description, "")
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
        _validate_setup_dir("test")

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        _prep_setup_dir("test")


if __name__ == '__main__':
    unittest.main()