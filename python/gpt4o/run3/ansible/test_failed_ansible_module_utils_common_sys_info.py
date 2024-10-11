import unittest
from unittest.mock import patch
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass

class TestSysInfo(unittest.TestCase):

    @patch('ansible.module_utils.distro.id', return_value='ubuntu')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_ubuntu(self, mock_platform, mock_distro_id):
        result = get_distribution()
        self.assertEqual(result, 'Ubuntu')

    @patch('ansible.module_utils.distro.id', return_value='amzn')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_amazon(self, mock_platform, mock_distro_id):
        result = get_distribution()
        self.assertEqual(result, 'Amazon')

    @patch('ansible.module_utils.distro.id', return_value='rhel')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_redhat(self, mock_platform, mock_distro_id):
        result = get_distribution()
        self.assertEqual(result, 'Redhat')

    @patch('ansible.module_utils.distro.id', return_value='')
    @patch('platform.system', return_value='Linux')
    def test_get_distribution_otherlinux(self, mock_platform, mock_distro_id):
        result = get_distribution()
        self.assertEqual(result, 'OtherLinux')

    @patch('ansible.module_utils.distro.version', return_value='8.3')
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
    @patch('ansible.module_utils.common.sys_info.get_all_subclasses', return_value=[])
    def test_get_platform_subclass_no_subclasses(self, mock_get_all_subclasses, mock_platform):
        class DummyClass:
            pass
        result = get_platform_subclass(DummyClass)
        self.assertEqual(result, DummyClass)

    @patch('platform.system', return_value='Linux')
    @patch('ansible.module_utils.common.sys_info.get_all_subclasses')
    def test_get_platform_subclass_with_subclasses(self, mock_get_all_subclasses, mock_platform):
        class DummyClass:
            pass

        class SubClass(DummyClass):
            platform = 'Linux'
            distribution = 'Ubuntu'

        mock_get_all_subclasses.return_value = [SubClass]
        result = get_platform_subclass(DummyClass)
        self.assertEqual(result, DummyClass)

if __name__ == '__main__':
    unittest.main()