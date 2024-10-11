import unittest
from ansible.module_utils.common.sys_info import *


class TestGetDistribution(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertEqual(result, "Redhat")

class TestGetDistributionVersion(unittest.TestCase):
    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertEqual(result, "9.4")

class TestGetDistributionCodename(unittest.TestCase):
    def test_get_distribution_codename(self):
        result = get_distribution_codename(self)
        self.assertEqual(result, None)

class TestGetPlatformSubclass(unittest.TestCase):
    def test_get_platform_subclass(self):
        result = get_platform_subclass(cls)
        self.assertEqual(result, cls)

if __name__ == '__main__':
    unittest.main()