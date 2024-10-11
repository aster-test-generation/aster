from flutils.setuputils.cfg import ConfigParser
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
commands = bar baz
description = Bar command
""")
        format_kwargs = {"name": "my_package"}
        result = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0].name, "foo")
        self.assertEqual(result[0].camel, "Foo")
        self.assertEqual(result[0].description, "Foo command")
        self.assertEqual(result[0].commands, ("foo",))
        self.assertEqual(result[1].name, "bar baz")
        self.assertEqual(result[1].camel, "BarBaz")
        self.assertEqual(result[1].description, "Bar command")
        self.assertEqual(result[1].commands, ("bar", "baz"))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
name = my_package
""")
        self.assertEqual(_get_name(parser, "setup.cfg"), "my_package")

    def test_get_name_missing_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

    def test_get_name_missing_option(self):
        parser = ConfigParser()
        parser.read_string("""
[metadata]
""")
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir("path/to/setup/dir")

    def test_validate_setup_dir_not_exists(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir("non/existent/path")

    def test_validate_setup_dir_not_dir(self):
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir("path/to/file")

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir("path/to/setup/dir"), "path/to/setup/dir")

    def test_prep_setup_dir_default(self):
        self.assertEqual(_prep_setup_dir(), "path/to/default/setup/dir")

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        result = list(each_sub_command_config("path/to/setup/dir"))
        self.assertEqual(len(result), 2)  # assuming there are 2 commands in the setup.cfg file

if __name__ == '__main__':
    unittest.main()