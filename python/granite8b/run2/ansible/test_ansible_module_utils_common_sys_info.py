import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass


class TestGetDistribution(unittest.TestCase):
    def test_get_distribution(self):
        self.assertEqual(get_distribution(), 'CentOS')

    def test_get_distribution_version(self):
        self.assertEqual(get_distribution_version(), '7.9.2009')

    def test_get_distribution_codename(self):
        self.assertEqual(get_distribution_codename(), 'Core')

class TestGetPlatformSubclass(unittest.TestCase):
    def test_get_platform_subclass(self):
        class User:
            platform = 'Linux'
            distribution = 'CentOS'

        subclass = get_platform_subclass(User)
        self.assertEqual(subclass.platform, 'Linux')
        self.assertEqual(subclass.distribution, 'CentOS')

if __name__ == '__main__':
    unittest.main()