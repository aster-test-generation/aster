import unittest
from ansible.config.manager import *


class TestConfigManager(unittest.TestCase):
    def test_get_config_type(self):
        cfile = None
        ftype = get_config_type(cfile)
        self.assertEqual(ftype, None)

    def test_get_ini_config_value(self):
        p = None
        entry = None
        value = get_ini_config_value(p, entry)
        self.assertEqual(value, None)

if __name__ == '__main__':
    unittest.main()