import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_platform_subclass


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        distribution = get_distribution()
        self.assertIsNotNone(distribution)

    def test_get_distribution_version(self):
        version = get_distribution_version()
        self.assertIsNotNone(version)

    def test_get_platform_subclass(self):
        subclass = get_platform_subclass(object())
        self.assertIsNotNone(subclass)

if __name__ == '__main__':
    unittest.main()