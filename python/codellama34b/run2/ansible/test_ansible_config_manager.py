from ansible.config.manager import _add_base_defs_deprecations
import unittest
from ansible.config.manager import *


class TestConfigManager(unittest.TestCase):
    def test_find_ini_config_file(self):
        result = find_ini_config_file()
        self.assertIsNotNone(result)

    def test_find_ini_config_file_warnings(self):
        warnings = set()
        result = find_ini_config_file(warnings)
        self.assertIsNotNone(result)
        self.assertGreater(len(warnings), 0)

    def test_add_base_defs_deprecations(self):
        base_defs = {}
        _add_base_defs_deprecations(base_defs)
        self.assertGreater(len(base_defs), 0)

if __name__ == '__main__':
    unittest.main()