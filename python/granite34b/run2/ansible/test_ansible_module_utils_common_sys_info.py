import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_platform_subclass


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        self.assertEqual(get_distribution(), "Amazon")

    def test_get_distribution_version(self):
        self.assertEqual(get_distribution_version(), "2")

    def test_get_platform_subclass(self):
        class ExampleClass:
            pass
        self.assertEqual(get_platform_subclass(ExampleClass), ExampleClass)

if __name__ == '__main__':
    unittest.main()