import unittest
from ansible.module_utils.common.sys_info import *

class TestGetDistribution(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertEqual(result, None)

    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertEqual(result, None)

    def test_get_distribution_codename(self):
        result = get_distribution_codename()
        self.assertEqual(result, None)

    def test_get_platform_subclass(self):
        result = get_platform_subclass(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()