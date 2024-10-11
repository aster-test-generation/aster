import os
import unittest
from ansible.config.manager import find_ini_config_file, _add_base_defs_deprecations


class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        result = find_ini_config_file()
        self.assertEqual(result, None)

    def test_find_ini_config_file_with_warnings(self):
        warnings = set()
        result = find_ini_config_file(warnings)
        self.assertEqual(result, None)
        self.assertEqual(len(warnings), 1)

    def test_find_ini_config_file_with_path_from_env(self):
        os.environ['ANSIBLE_CONFIG'] = '/path/to/ansible.cfg'
        result = find_ini_config_file()
        self.assertEqual(result, '/path/to/ansible.cfg')

    def test_find_ini_config_file_with_public_directory(self):
        os.environ['ANSIBLE_CONFIG'] = '/path/to/public/directory'
        result = find_ini_config_file()
        self.assertEqual(result, None)

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {'ini': [{'key': 'value'}]}
        _add_base_defs_deprecations(base_defs)
        self.assertIn('deprecated', base_defs['ini'][0])

    def test_add_base_defs_deprecations_with_section(self):
        base_defs = {'ini': {'section': [{'key': 'value'}]}}
        _add_base_defs_deprecations(base_defs)
        self.assertIn('deprecated', base_defs['ini']['section'][0])

if __name__ == '__main__':
    unittest.main()