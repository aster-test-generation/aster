import unittest
from ansible.module_utils.facts.sysctl import *


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = None
        prefixes = None
        result = get_sysctl(module, prefixes)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()