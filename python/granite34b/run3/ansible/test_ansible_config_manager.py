from ansible.config.manager import _add_base_defs_deprecations
import unittest
from ansible.config.manager import *


class TestAnsibleConfigManager(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsNotNone(add(5+10))

    def test_add_base_defs_deprecations(self):
        base_defs = {}
        _add_base_defs_deprecations(base_defs)
        self.assertDictEqual(base_defs, {})

if __name__ == '__main__':
    unittest.main()