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
        config = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(config.name, "name")
        self.assertEqual(config.camel, "camel")
        self.assertEqual(config.description, "description")
        self.assertEqual(config.commands, ("command1", "command2"))

    def test_repr(self):
        config = SetupCfgCommandConfig("name", "camel", "description", ("command1", "command2"))
        self.assertEqual(repr(config), "SetupCfgCommandConfig(name='name', camel='camel', description='description', commands=('command1', 'command2'))")

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.add_section("setup.command.foo")
        parser.set("setup.command.foo", "command", "foo_command")
        parser.add_section("setup.command.bar")
        parser.set("setup.command.bar", "command", "bar_command")
        result = list(_each_setup_cfg_command_section(parser))
        self.assertEqual(result, [("setup.command.foo", "foo"), ("setup.command.bar", "bar")])

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.add_section("setup.command.foo")
        parser.set("setup.command.foo", "command", "foo_command")
        parser.set("setup.command.foo", "name", "foo_name")
        parser.set("setup.command.foo", "description", "foo_description")
        format_kwargs = {"name": "foo"}
        result = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(result), 1)
        config = result[0]
        self.assertEqual(config.name, "foo_name")
        self.assertEqual(config.camel, "fooName")
        self.assertEqual(config.description, "foo_description")
        self.assertEqual(config.commands, ("foo_command",))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.add_section("metadata")
        parser.set("metadata", "name", "foo")
        self.assertEqual(_get_name(parser, "setup.cfg"), "foo")

    def test_get_name_no_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

    def test_get_name_no_option(self):
        parser = ConfigParser()
        parser.add_section("metadata")
        with self.assertRaises(LookupError):
            _get_name(parser, "setup.cfg")

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir("/path/to/setup/dir")

    def test_validate_setup_dir_not_exists(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir("/path/to/non-existent/setup/dir")

    def test_validate_setup_dir_not_dir(self):
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir("/path/to/non-dir/setup")

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir("/path/to/setup/dir"), "/path/to/setup/dir")

    def test_prep_setup_dir_default(self):
        self.assertEqual(_prep_setup_dir(), "/path/to/default/setup/dir")

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        format_kwargs = {"setup_dir": "/path/to/setup/dir", "home": "/home/user"}
        parser = ConfigParser()
        parser.add_section("setup.command.foo")
        parser.set("setup.command.foo", "command", "foo_command")
        parser.set("setup.command.foo", "name", "foo_name")
        parser.set("setup.command.foo", "description", "foo_description")
        result = list(each_sub_command_config("/path/to/setup/dir"))
        self.assertEqual(len(result), 1)
        config = result[0]
        self.assertEqual(config.name, "foo_name")
        self.assertEqual(config.camel, "fooName")
        self.assertEqual(config.description, "foo_description")
        self.assertEqual(config.commands, ("foo_command",))

if __name__ == '__main__':
    unittest.main()