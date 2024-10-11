import unittest
from ansible.module_utils.common import sys_info
from unittest.mock import patch
from ansible.module_utils import distro


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
        platform.system('Linux')
        result = sys_info.get_distribution()
        self.assertEqual(result, 'OtherLinux')

    def test_get_distribution_version_linux(self):
        platform.system('Linux')
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '')

    def test_get_distribution_codename_linux(self):
        platform.system('Linux')
        result = sys_info.get_distribution_codename()
        self.assertIsNone(result)

    def test_get_distribution_amzn(self):
        platform.system('Linux')
        distro.id('Amzn')
        result = sys_info.get_distribution()
        self.assertEqual(result, 'Amazon')

    def test_get_distribution_rhel(self):
        platform.system('Linux')
        distro.id('Rhel')
        result = sys_info.get_distribution()
        self.assertEqual(result, 'Redhat')

    def test_get_distribution_version_centos(self):
        platform.system('Linux')
        distro.id('centos')
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '0.0.0')

    def test_get_distribution_version_debian(self):
        platform.system('Linux')
        distro.id('debian')
        result = sys_info.get_distribution_version()
        self.assertEqual(result, '0.0.0')

    def test_get_distribution_version_best_centos(self):
        platform.system('Linux')
        distro.id('centos')
        result = sys_info.get_distribution_version(best=True)
        self.assertEqual(result, '0.0.0')

    def test_get_distribution_version_best_debian(self):
        platform.system('Linux')
        distro.id('debian')
        result = sys_info.get_distribution_version(best=True)
        self.assertEqual(result, '0.0.0')

class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        with patch.object(distro, 'id') as mock_id:
            mock_id.return_value = 'Amzn'
            result = sys_info.get_distribution()
            self.assertEqual(result, 'Amazon')

    def test_get_distribution_version(self):
        with patch.object(distro, 'version') as mock_version:
            mock_version.return_value = '1.2.3'
            result = sys_info.get_distribution_version()
            self.assertEqual(result, '1.2.3')

    def test_get_distribution_codename(self):
        with patch.object(distro, 'os_release_info') as mock_os_release_info:
            mock_os_release_info.return_value = {'version_codename': 'codename'}
            result = sys_info.get_distribution_codename()
            self.assertEqual(result, 'codename')

if __name__ == '__main__':
    unittest.main()