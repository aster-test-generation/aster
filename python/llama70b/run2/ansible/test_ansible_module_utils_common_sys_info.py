import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertIsInstance(result, str)

    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertIsInstance(result, str)

    def test_get_distribution_codename(self):
        result = get_distribution_codename()
        self.assertIsInstance(result, str)

    def test_get_platform_subclass(self):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertIsInstance(result, type)

if __name__ == '__main__':
    unittest.main()