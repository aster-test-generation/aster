import unittest
from ansible.module_utils.common import sys_info
from ansible.module_utils import distro


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        result = sys_info.get_distribution()
        self.assertIsNotNone(result)

    def test_get_distribution_version(self):
        result = sys_info.get_distribution_version()
        self.assertIsNotNone(result)

    def test_get_distribution_codename(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNotNone(result)

    def test_get_platform_subclass(self):
        result = sys_info.get_platform_subclass(distro.Distro)
        self.assertIsNotNone(result)

    def test_get_distribution_private(self):
        result = sys_info._get_distribution()
        self.assertIsNotNone(result)

    def test_get_distribution_version_private(self):
        result = sys_info._get_distribution_version()
        self.assertIsNotNone(result)

    def test_get_distribution_codename_private(self):
        result = sys_info._get_distribution_codename()
        self.assertIsNotNone(result)

    def test_get_platform_subclass_private(self):
        result = sys_info._get_platform_subclass(distro.Distro)
        self.assertIsNotNone(result)

    def test_get_distribution_magic(self):
        result = str(sys_info.get_distribution())
        self.assertIsNotNone(result)

    def test_get_distribution_version_magic(self):
        result = str(sys_info.get_distribution_version())
        self.assertIsNotNone(result)

    def test_get_distribution_codename_magic(self):
        result = str(sys_info.get_distribution_codename())
        self.assertIsNotNone(result)

    def test_get_platform_subclass_magic(self):
        result = str(sys_info.get_platform_subclass(distro.Distro))
        self.assertIsNotNone(result)

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
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

    def test_get_distribution_linux(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version_linux(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_linux(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_linux(self):
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

    def test_get_distribution_amzn(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'Amazon')

    def test_get_distribution_version_amzn(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_amzn(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_amzn(self):
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

    def test_get_distribution_rhel(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'Redhat')

    def test_get_distribution_version_rhel(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_rhel(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_rhel(self):
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

    def test_get_distribution_centos(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version_centos(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_centos(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_centos(self):
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

    def test_get_distribution_debian(self):
        result = sys_info.get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version_debian(self):
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_debian(self):
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_platform_subclass_debian(self):
        cls = object
        result = sys_info.get_platform_subclass(cls)
        self.assertEqual(result, cls)

if __name__ == '__main__':
    unittest.main()