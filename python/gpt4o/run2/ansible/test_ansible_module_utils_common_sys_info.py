import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass


class TestSysInfo(unittest.TestCase):

    @patch('ansible.module_utils.common.sys_info.distro.id')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_linux_amzn(self, mock_system, mock_distro_id):
        mock_system.return_value = 'Linux'
        mock_distro_id.return_value = 'amzn'
        result = get_distribution()
        self.assertEqual(result, 'Amazon')

    @patch('ansible.module_utils.common.sys_info.distro.id')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_linux_rhel(self, mock_system, mock_distro_id):
        mock_system.return_value = 'Linux'
        mock_distro_id.return_value = 'rhel'
        result = get_distribution()
        self.assertEqual(result, 'Redhat')

    @patch('ansible.module_utils.common.sys_info.distro.id')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_linux_other(self, mock_system, mock_distro_id):
        mock_system.return_value = 'Linux'
        mock_distro_id.return_value = ''
        result = get_distribution()
        self.assertEqual(result, 'OtherLinux')

    @patch('ansible.module_utils.common.sys_info.distro.id')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_non_linux(self, mock_system, mock_distro_id):
        mock_system.return_value = 'Windows'
        mock_distro_id.return_value = 'windows'
        result = get_distribution()
        self.assertEqual(result, 'Windows')

    @patch('ansible.module_utils.common.sys_info.distro.version')
    @patch('ansible.module_utils.common.sys_info.distro.id')
    def test_get_distribution_version_centos(self, mock_distro_id, mock_distro_version):
        mock_distro_id.return_value = 'centos'
        mock_distro_version.return_value = '7.9.2009'
        result = get_distribution_version()
        self.assertEqual(result, '7.9')

    @patch('ansible.module_utils.common.sys_info.distro.version')
    @patch('ansible.module_utils.common.sys_info.distro.id')
    def test_get_distribution_version_debian(self, mock_distro_id, mock_distro_version):
        mock_distro_id.return_value = 'debian'
        mock_distro_version.return_value = '10'
        result = get_distribution_version()
        self.assertEqual(result, '10')

    @patch('ansible.module_utils.common.sys_info.distro.version')
    @patch('ansible.module_utils.common.sys_info.distro.id')
    def test_get_distribution_version_empty(self, mock_distro_id, mock_distro_version):
        mock_distro_id.return_value = 'unknown'
        mock_distro_version.return_value = None
        result = get_distribution_version()
        self.assertEqual(result, '')

    @patch('ansible.module_utils.common.sys_info.distro.os_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.lsb_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.codename')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_codename(self, mock_system, mock_codename, mock_lsb_release_info, mock_os_release_info):
        mock_system.return_value = 'Linux'
        mock_os_release_info.return_value = {'version_codename': 'buster'}
        mock_lsb_release_info.return_value = {'codename': 'buster'}
        mock_codename.return_value = 'buster'
        result = get_distribution_codename()
        self.assertEqual(result, 'buster')

    @patch('ansible.module_utils.common.sys_info.distro.os_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.lsb_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.codename')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_codename_ubuntu(self, mock_system, mock_codename, mock_lsb_release_info, mock_os_release_info):
        mock_system.return_value = 'Linux'
        mock_os_release_info.return_value = {'ubuntu_codename': 'focal'}
        mock_lsb_release_info.return_value = {'codename': 'focal'}
        mock_codename.return_value = 'focal'
        result = get_distribution_codename()
        self.assertEqual(result, 'focal')

    @patch('ansible.module_utils.common.sys_info.distro.os_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.lsb_release_info')
    @patch('ansible.module_utils.common.sys_info.distro.codename')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    def test_get_distribution_codename_none(self, mock_system, mock_codename, mock_lsb_release_info, mock_os_release_info):
        mock_system.return_value = 'Linux'
        mock_os_release_info.return_value = {}
        mock_lsb_release_info.return_value = {}
        mock_codename.return_value = ''
        result = get_distribution_codename()
        self.assertIsNone(result)

    @patch('ansible.module_utils.common.sys_info.get_all_subclasses')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    @patch('ansible.module_utils.common.sys_info.get_distribution')
    def test_get_platform_subclass(self, mock_get_distribution, mock_system, mock_get_all_subclasses):
        mock_system.return_value = 'Linux'
        mock_get_distribution.return_value = 'Ubuntu'
        mock_get_all_subclasses.return_value = [MagicMock(distribution='Ubuntu', platform='Linux')]
        class DummyClass:
            pass
        result = get_platform_subclass(DummyClass)
        self.assertIsNot(result, DummyClass)

    @patch('ansible.module_utils.common.sys_info.get_all_subclasses')
    @patch('ansible.module_utils.common.sys_info.platform.system')
    @patch('ansible.module_utils.common.sys_info.get_distribution')
    def test_get_platform_subclass_default(self, mock_get_distribution, mock_system, mock_get_all_subclasses):
        mock_system.return_value = 'Linux'
        mock_get_distribution.return_value = 'Ubuntu'
        mock_get_all_subclasses.return_value = []
        class DummyClass:
            pass
        result = get_platform_subclass(DummyClass)
        self.assertIs(result, DummyClass)

if __name__ == '__main__':
    unittest.main()