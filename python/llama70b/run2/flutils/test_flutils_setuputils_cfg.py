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
import configparser as ConfigParser
import os
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
        instance = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.camel, "camel")
        self.assertEqual(instance.description, "description")
        self.assertEqual(instance.commands, ("command1", "command2"))

    def test_str(self):
        instance = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(str(instance), "SetupCfgCommandConfig(name='name', camel='camel', description='description', commands=('command1', 'command2'))")

    def test_repr(self):
        instance = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(repr(instance), "SetupCfgCommandConfig(name='name', camel='camel', description='description', commands=('command1', 'command2'))")

    def test_eq(self):
        instance1 = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        instance2 = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(instance1, instance2)

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser.ConfigParser()
        parser.add_section("setup.command.foo")
        parser.set("setup.command.foo", "option", "value")
        result = list(_each_setup_cfg_command_section(parser))
        self.assertEqual(result, [("setup.command.foo", "foo")])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser.ConfigParser()
        parser.add_section("setup.command.foo")
        parser.set("setup.command.foo", "command", "foo_command")
        parser.set("setup.command.foo", "name", "foo_name")
        parser.set("setup.command.foo", "description", "foo_description")
        format_kwargs = {"name": "foo_name"}
        result = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], SetupCfgCommandConfig)

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser.ConfigParser()
        parser.add_section("metadata")
        parser.set("metadata", "name", "foo_name")
        setup_cfg_path = "setup.cfg"
        result = _get_name(parser, setup_cfg_path)
        self.assertEqual(result, "foo_name")

    def test_get_name_no_section(self):
        parser = ConfigParser.ConfigParser()
        setup_cfg_path = "setup.cfg"
        with self.assertRaises(LookupError):
            _get_name(parser, setup_cfg_path)

    def test_get_name_no_option(self):
        parser = ConfigParser.ConfigParser()
        parser.add_section("metadata")
        setup_cfg_path = "setup.cfg"
        with self.assertRaises(LookupError):
            _get_name(parser, setup_cfg_path)

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        setup_dir = "path/to/setup/dir"
        _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_not_exists(self):
        setup_dir = "path/to/non/existent/dir"
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_not_dir(self):
        setup_dir = "path/to/file"
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_no_setup_py(self):
        setup_dir = "path/to/dir/without/setup.py"
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_no_setup_cfg(self):
        setup_dir = "path/to/dir/without/setup.cfg"
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        setup_dir = "path/to/setup/dir"
        result = _prep_setup_dir(setup_dir)
        self.assertEqual(result, os.path.realpath(setup_dir))

    def test_prep_setup_dir_default(self):
        result = _prep_setup_dir()
        self.assertIsNotNone(result)


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        instance = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.camel, "camel")
        self.assertEqual(instance.description, "description")
        self.assertEqual(instance.commands, ("command1", "command2"))

    def test_repr(self):
        instance = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(repr(instance), "SetupCfgCommandConfig(name='name', camel='camel', description='description', commands=('command1', 'command2'))")

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.foo]
command = foo
[setup.command.bar]
command = bar
""")
        result = list(_each_setup_cfg_command_section(parser))
        self.assertEqual(result, [("setup.command.foo", "foo"), ("setup.command.bar", "bar")])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.read_string("""
[setup.command.foo]
command = foo
description = Foo command
[setup.command.bar]
commands = bar
            baz
""")
        format_kwargs = {"name": "my_package"}
        result = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], SetupCfgCommandConfig)
        self.assertIsInstance(result[1], SetupCfgCommandConfig)

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
name = my_package
""")
        self.assertEqual(_get_name(parser, "setup.cfg"), "my_package")

    def test_get_name_no_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

    def test_get_name_no_option(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
""")
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir("/path/to/setup/dir")

    def test_validate_setup_dir_not_exists(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir("/path/to/non/existent/setup/dir")

    def test_validate_setup_dir_not_dir(self):
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir("/path/to/file")

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir("/path/to/setup/dir"), "/path/to/setup/dir")

    def test_prep_setup_dir_default(self):
        self.assertEqual(_prep_setup_dir(), "/path/to/default/setup/dir")

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        result = list(each_sub_command_config("/path/to/setup/dir"))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], SetupCfgCommandConfig)
        self.assertIsInstance(result[1], SetupCfgCommandConfig)

if __name__ == '__main__':
    unittest.main()