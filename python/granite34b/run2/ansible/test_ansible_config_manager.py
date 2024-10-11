from ansible.config.manager import _add_base_defs_deprecations
import unittest
from ansible.config.manager import *
from ansible.config.manager import find_ini_config_file


class TestAnsibleConfigManager(unittest.TestCase):
    def test_find_ini_config_file(self):
        warnings = set()
        path = find_ini_config_file(warnings)
        self.assertIsNotNone(self.path)

    def test_add_base_defs_deprecations(self):
        base_defs = {'section1': {'deprecated': {'version': '1.0', 'reason': 'test'}},
                     'section2': {'ini': [{'deprecated': {'version': '1.0', 'reason': 'test'}}]}}
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['section1']['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['section2']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')

class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsNotNone(path)

if __name__ == '__main__':
    unittest.main()