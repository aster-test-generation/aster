import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        self.assertEqual(get_distribution(), 'CentOS')

    def test_get_distribution_version(self):
        self.assertEqual(get_distribution_version(), '7.7.1908')

    def test_get_distribution_codename(self):
        self.assertEqual(get_distribution_codename(), 'Core')

    def test_get_platform_subclass(self):
        class User:
            distribution = 'CentOS'
            platform = 'Linux'
        subclass = get_platform_subclass(User)
        self.assertEqual(subclass, User)

if __name__ == '__main__':
    unittest.main()