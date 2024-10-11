import unittest
from ansible.module_utils.common import sys_info


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass(self):
        subclass = sys_info.get_platform_subclass(sys_info)
        self.assertIsNotNone(subclass)

    def test_get_distribution_private(self):
        result = sys_info._get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version_private(self):
        result = sys_info._get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_private(self):
        result = sys_info._get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_private(self):
        subclass = sys_info._get_platform_subclass(sys_info)
        self.assertIsNotNone(subclass)

    def test_get_distribution_magic(self):
        result = str(sys_info())
        self.assertEqual(result, 'ansible.module_utils.common.sys_info object')

    def test_get_distribution_version_magic(self):
        result = repr(sys_info())
        self.assertEqual(result, 'ansible.module_utils.common.sys_info object')

    def test_get_distribution_codename_magic(self):
        result = repr(sys_info())
        self.assertEqual(result, 'ansible.module_utils.common.sys_info object')

    def test_get_platform_subclass_magic(self):
        result = repr(sys_info())
        self.assertEqual(result, 'ansible.module_utils.common.sys_info object')

if __name__ == '__main__':
    unittest.main()