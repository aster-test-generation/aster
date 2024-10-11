import unittest
from ansible.config.manager import find_ini_config_file, _add_base_defs_deprecations


class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsNotNone(path)

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {
            'module_defaults': {
                'ini': [],
                'env': [],
                'vars': []
            }
        }
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(len(base_defs['module_defaults']['ini']), 1)
        self.assertEqual(len(base_defs['module_defaults']['env']), 1)
        self.assertEqual(len(base_defs['module_defaults']['vars']), 1)

if __name__ == '__main__':
    unittest.main()