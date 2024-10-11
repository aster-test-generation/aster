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
        result = _each_setup_cfg_command_section(ConfigParser())
        self.assertEqual(result, None)

class Test_each_setup_cfg_command(unittest.TestCase):
    def test__each_setup_cfg_command(self):
        result = _each_setup_cfg_command(ConfigParser(), {})
        self.assertEqual(result, None)

class Test_get_name(unittest.TestCase):
    def test__get_name(self):
        result = get_name(ConfigParser(), 'setup.cfg')
        self.assertEqual(result, None)

class Test_validate_setup_dir(unittest.TestCase):
    def test__validate_setup_dir(self):
        result = _validate_setup_dir(setup_dir)
        self.assertEqual(result, None)

class Test_prep_setup_dir(unittest.TestCase):
    def test__prep_setup_dir(self):
        result = _prep_setup_dir('setup_dir')
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()