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