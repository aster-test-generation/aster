import unittest
from flutils.setuputils.cfg import *



class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_init(self):
        instance = SetupCfgCommandConfig('name', 'camel', 'description', ('commands',))
        self.assertEqual(instance.name, 'name')
        self.assertEqual(instance.camel, 'camel')
        self.assertEqual(instance.description, 'description')
        self.assertEqual(instance.commands, ('commands',))

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        result = _each_setup_cfg_command_section(parser)
        self.assertEqual(result, None)

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        result = _each_setup_cfg_command(parser, {})
        self.assertEqual(result, None)

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        result = _get_name(parser, '')
        self.assertEqual(result, None)

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_validate_setup_dir(self):
        result = _validate_setup_dir('')
        self.assertEqual(result, None)

class TestSetupCfgCommandConfig(unittest.TestCase):
    def test_prep_setup_dir(self):
        result = _prep_setup_dir('')
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()