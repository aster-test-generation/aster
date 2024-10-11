import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass

class TestSysInfo(unittest.TestCase):

    @patch('ansible.module_utils.distro.id', return_value='amzn')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_amazon(self, mock_platform, mock_distro):
        result = get_distribution()
        self.assertEqual(result, 'Amazon')

    @patch('ansible.module_utils.distro.id', return_value='rhel')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_redhat(self, mock_platform, mock_distro):
        result = get_distribution()
        self.assertEqual(result, 'Redhat')

    @patch('ansible.module_utils.distro.id', return_value='')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_otherlinux(self, mock_platform, mock_distro):
        result = get_distribution()
        self.assertEqual(result, 'OtherLinux')

    @patch('ansible.module_utils.distro.id', return_value='ubuntu')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_ubuntu(self, mock_platform, mock_distro):
        result = get_distribution()
        self.assertEqual(result, 'Ubuntu')

    @patch('ansible.module_utils.distro.version', return_value='20.04')
    @patch('ansible.module_utils.distro.id', return_value='ubuntu')
    def test_get_distribution_version_ubuntu(self, mock_distro_id, mock_distro_version):
        result = get_distribution_version()
        self.assertEqual(result, '20.04')

    @patch('ansible.module_utils.distro.version', return_value='8.3.2011')
    @patch('ansible.module_utils.distro.id', return_value='centos')
    def test_get_distribution_version_centos(self, mock_distro_id, mock_distro_version):
        result = get_distribution_version()
        self.assertEqual(result, '8.3')

    @patch('ansible.module_utils.distro.version', return_value='10')
    @patch('ansible.module_utils.distro.id', return_value='debian')
    def test_get_distribution_version_debian(self, mock_distro_id, mock_distro_version):
        result = get_distribution_version()
        self.assertEqual(result, '10')

    @patch('ansible.module_utils.distro.version', return_value=None)
    def test_get_distribution_version_none(self, mock_distro_version):
        result = get_distribution_version()
        self.assertEqual(result, '')

    @patch('ansible.module_utils.distro.os_release_info', return_value={'version_codename': 'focal'})
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_codename_focal(self, mock_platform, mock_os_release_info):
        result = get_distribution_codename()
        self.assertEqual(result, 'focal')

    @patch('ansible.module_utils.distro.os_release_info', return_value={'ubuntu_codename': 'bionic'})
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_codename_bionic(self, mock_platform, mock_os_release_info):
        result = get_distribution_codename()
        self.assertEqual(result, 'bionic')

    @patch('ansible.module_utils.distro.os_release_info', return_value={})
    @patch('ansible.module_utils.distro.id', return_value='ubuntu')
    @patch('ansible.module_utils.distro.lsb_release_info', return_value={'codename': 'xenial'})
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_codename_xenial(self, mock_platform, mock_distro_id, mock_lsb_release_info, mock_os_release_info):
        result = get_distribution_codename()
        self.assertEqual(result, 'xenial')

    @patch('ansible.module_utils.distro.os_release_info', return_value={})
    @patch('ansible.module_utils.distro.codename', return_value='stretch')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_codename_stretch(self, mock_platform, mock_distro_codename, mock_os_release_info):
        result = get_distribution_codename()
        self.assertEqual(result, 'stretch')

    @patch('ansible.module_utils.distro.os_release_info', return_value={})
    @patch('ansible.module_utils.distro.codename', return_value='')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_codename_none(self, mock_platform, mock_distro_codename, mock_os_release_info):
        result = get_distribution_codename()
        self.assertIsNone(result)

    @patch('platform.system', return_value='Linux')
    @patch('ansible.module_utils.common.sys_info.get_all_subclasses', return_value=[MagicMock(distribution='Ubuntu', platform='Linux')])
    @patch('ansible.module_utils.common.sys_info.get_distribution', return_value='Ubuntu')
    def test_get_platform_subclass(self, mock_get_distribution, mock_get_all_subclasses, mock_platform):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, mock_get_all_subclasses.return_value[0])

    @patch('platform.system', return_value='Linux')
    @patch('ansible.module_utils.common.sys_info.get_all_subclasses', return_value=[MagicMock(distribution=None, platform='Linux')])
    @patch('ansible.module_utils.common.sys_info.get_distribution', return_value=None)
    def test_get_platform_subclass_no_distribution(self, mock_get_distribution, mock_get_all_subclasses, mock_platform):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, mock_get_all_subclasses.return_value[0])

    @patch('platform.system', return_value='Linux')
    @patch('ansible.module_utils.common.sys_info.get_all_subclasses', return_value=[])
    @patch('ansible.module_utils.common.sys_info.get_distribution', return_value=None)
    def test_get_platform_subclass_default(self, mock_get_distribution, mock_get_all_subclasses, mock_platform):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, TestClass)

if __name__ == '__main__':
    unittest.main()