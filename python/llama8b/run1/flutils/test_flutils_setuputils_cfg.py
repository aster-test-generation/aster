import unittest
from flutils.setuputils.cfg import *
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
        parser.add_section('setup.command.section3')
        result = list(_each_setup_cfg_command_section(parser))
        self.assertEqual(len(result), 3)
        self.assertEqual(result[0][0], 'setup.command.section1')
        self.assertEqual(result[1][0], 'setup.command.section2')
        self.assertEqual(result[2][0], 'setup.command.section3')

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.add_section('setup.command.section1')
        parser.add_section('setup.command.section2')
        parser.add_section('setup.command.section3')
        format_kwargs = {'name': 'test', 'home': 'home'}
        result = list(_each_setup_cfg_command(parser, format_kwargs))
        self.assertEqual(len(result), 3)
        self.assertEqual(result[0].name, 'test')
        self.assertEqual(result[0].camel, 'section1')
        self.assertEqual(result[0].description, '')
        self.assertEqual(result[0].commands, ('',))
        self.assertEqual(result[1].name, 'test')
        self.assertEqual(result[1].camel, 'section2')
        self.assertEqual(result[1].description, '')
        self.assertEqual(result[1].commands, ('',))
        self.assertEqual(result[2].name, 'test')
        self.assertEqual(result[2].camel, 'section3')
        self.assertEqual(result[2].description, '')
        self.assertEqual(result[2].commands, ('',))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', 'test')
        result = _get_name(parser, 'path')
        self.assertEqual(result, 'test')

    def test_get_name_no_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

    def test_get_name_no_option(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

    def test_get_name_empty_option(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', '')
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        setup_dir = 'path'
        _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_not_exists(self):
        setup_dir = 'non_existent_path'
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_not_dir(self):
        setup_dir = 'path/non_existent_file'
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_no_setup_py(self):
        setup_dir = 'path'
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

    def test_validate_setup_dir_no_setup_cfg(self):
        setup_dir = 'path'
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir(setup_dir)

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        setup_dir = 'path'
        result = _prep_setup_dir(setup_dir)
        self.assertEqual(result, 'path')

    def test_prep_setup_dir_none(self):
        result = _prep_setup_dir(None)
        self.assertIsNone(result)

    def test_prep_setup_dir_not_exists(self):
        setup_dir = 'non_existent_path'
        with self.assertRaises(FileNotFoundError):
            _prep_setup_dir(setup_dir)

    def test_prep_setup_dir_not_dir(self):
        setup_dir = 'path/non_existent_file'
        with self.assertRaises(NotADirectoryError):
            _prep_setup_dir(setup_dir)

    def test_prep_setup_dir_no_setup_py(self):
        setup_dir = 'path'
        with self.assertRaises(FileNotFoundError):
            _prep_setup_dir(setup_dir)

class TestEachSetupCfgCommandSection(unittest.TestCase):
    def test_each_setup_cfg_command_section(self):
        parser = ConfigParser()
        parser.add_section('setup.command.section1')
        parser.add_section('setup.command.section2')
        parser.add_section('setup.command.section3')
        for section, command_name in _each_setup_cfg_command_section(parser):
            self.assertIn(section, ('setup.command.section1', 'setup.command.section2', 'setup.command.section3'))
            self.assertIn(command_name, ('section1', 'section2', 'section3'))

class TestEachSetupCfgCommand(unittest.TestCase):
    def test_each_setup_cfg_command(self):
        parser = ConfigParser()
        parser.add_section('setup.command.section1')
        parser.add_section('setup.command.section2')
        parser.add_section('setup.command.section3')
        format_kwargs = {'name': 'test', 'home': 'home'}
        for section, command_name in _each_setup_cfg_command(parser, format_kwargs):
            self.assertIn(section, ('setup.command.section1', 'setup.command.section2', 'setup.command.section3'))
            self.assertIn(command_name, ('section1', 'section2', 'section3'))

class TestGetName(unittest.TestCase):
    def test_get_name(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', 'test')
        self.assertEqual(_get_name(parser, 'path'), 'test')

    def test_get_name_no_section(self):
        parser = ConfigParser()
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

    def test_get_name_no_option(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

    def test_get_name_empty_option(self):
        parser = ConfigParser()
        parser.add_section('metadata')
        parser.set('metadata', 'name', '')
        with self.assertRaises(LookupError):
            _get_name(parser, 'path')

class TestValidateSetupDir(unittest.TestCase):
    def test_validate_setup_dir(self):
        _validate_setup_dir('path')

    def test_validate_setup_dir_not_exists(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('non-existent-path')

    def test_validate_setup_dir_not_directory(self):
        with self.assertRaises(NotADirectoryError):
            _validate_setup_dir('non-directory-path')

    def test_validate_setup_dir_no_setup_py(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('path')

    def test_validate_setup_dir_no_setup_cfg(self):
        with self.assertRaises(FileNotFoundError):
            _validate_setup_dir('path')

class TestPrepSetupDir(unittest.TestCase):
    def test_prep_setup_dir(self):
        self.assertEqual(_prep_setup_dir('path'), 'path')

    def test_prep_setup_dir_none(self):
        with self.assertRaises(FileNotFoundError):
            _prep_setup_dir(None)

class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        for config in each_sub_command_config():
            self.assertIsInstance(config, SetupCfgCommandConfig)

if __name__ == '__main__':
    unittest.main()