import unittest
from flutils.setuputils.cfg import *


class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_SetupCfgCommandConfig(self):
        result = SetupCfgCommandConfig('name', 'camel', 'description', ('commands',))
        self.assertEqual(result.name, 'name')
        self.assertEqual(result.camel, 'camel')
        self.assertEqual(result.description, 'description')
        self.assertEqual(result.commands, ('commands',))

class Test_each_setup_cfg_command_section(unittest.TestCase):
    def test__each_setup_cfg_command_section(self):
        parser = ConfigParser()
        result = parser._each_setup_cfg_command_section()
        self.assertEqual(result, None)

class Test_each_setup_cfg_command(unittest.TestCase):
    def test__each_setup_cfg_command(self):
        parser = ConfigParser()
        format_kwargs = {'setup_dir': 'setup_dir', 'home': 'home', 'name': 'name'}
        result = each_setup_cfg_command(parser, format_kwargs)
        self.assertEqual(result, None)

class Test_get_name(unittest.TestCase):
    def test__get_name(self):
        parser = ConfigParser()
        setup_cfg_path = 'setup_cfg_path'
        result = get_name(parser, setup_cfg_path)
        self.assertEqual(result, None)

class Test_validate_setup_dir(unittest.TestCase):
    def test__validate_setup_dir(self):
        setup_dir = 'setup_dir'
        result = validate_setup_dir(setup_dir)
        self.assertEqual(result, None)

class Test_prep_setup_dir(unittest.TestCase):
    def test__prep_setup_dir(self):
        setup_dir = 'setup_dir'
        result = _prep_setup_dir(setup_dir)
        self.assertEqual(result, None)

class Testeach_sub_command_config(unittest.TestCase):
    def test_each_sub_command_config(self):
        setup_dir = 'setup_dir'
        result = each_sub_command_config(setup_dir)
        self.assertEqual(result, each_sub_command_config(self.config))

if __name__ == '__main__':
    unittest.main()