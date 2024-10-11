from flutils.setuputils.cfg import ConfigParser
import unittest
from flutils.setuputils.cfg import SetupCfgCommandConfig, _each_setup_cfg_command_section, _each_setup_cfg_command, _get_name, _validate_setup_dir, _prep_setup_dir, each_sub_command_config


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_setup_cfg_command_config(self):
        config = SetupCfgCommandConfig('name', 'camel', 'description', ('commands',))
        self.assertEqual(config.name, 'name')
        self.assertEqual(config.camel, 'camel')
        self.assertEqual(config.description, 'description')
        self.assertEqual(config.commands, ('commands',))

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.add_section('setup.command.section1')
        parser.add_section('setup.command.section2')
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertEqual(section, 'setup.command.section1')
            self.assertEqual(command_name, 'section1')
            self.assertEqual(section, 'setup.command.section2')
            self.assertEqual(command_name, 'section2')

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.add_section('setup.command.section1')
        parser.add_section('setup.command.section2')
        format_kwargs = {'name': 'test'}
        for section, command_name in _each_setup_cfg_command(parser, format_kwargs):
            self.assertEqual(section, 'setup.command.section1')
            self.assertEqual(command_name, 'section1')
            self.assertEqual(section, 'setup.command.section2')
            self.assertEqual(command_name, 'section2')

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', 'test_name')
        self.assertEqual(_get_name(parser, 'setup.cfg'), 'test_name')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir('test_dir')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir('test_dir'), 'test_dir')

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        for config in each_sub_command_config():
            self.assertIsInstance(config, SetupCfgCommandConfig)

if __name__ == '__main__':
    unittest.main()