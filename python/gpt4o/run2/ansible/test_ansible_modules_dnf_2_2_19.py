import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': False,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf')
    def test_install_remote_rpms_dnf_v2(self, mock_dnf):
        mock_dnf.__version__ = '2.0.0'
        self.dnf_module.base = MagicMock()
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module.allow_downgrade = False
        filenames = ['package1.rpm', 'package2.rpm']
        self.dnf_module._install_remote_rpms(filenames)
        self.dnf_module.base.add_remote_rpms.assert_called_once_with(filenames)
        self.dnf_module.base.package_install.assert_called()

    @patch('ansible.modules.dnf.dnf')
    def test_install_remote_rpms_dnf_v1(self, mock_dnf):
        mock_dnf.__version__ = '1.0.0'
        self.dnf_module.base = MagicMock()
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module.allow_downgrade = False
        filenames = ['package1.rpm', 'package2.rpm']
        self.dnf_module._install_remote_rpms(filenames)
        self.dnf_module.base.add_remote_rpm.assert_called()

    def test_install_remote_rpms_ioerror(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpm.side_effect = IOError('Can not load RPM file')
        filenames = ['package1.rpm']
        with self.assertRaises(Exception) as context:
            self.dnf_module._install_remote_rpms(filenames)
        self.assertIn('Error occurred attempting remote rpm install of package', str(context.exception))

    def test_install_remote_rpms_update_only(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.update_only = True
        self.dnf_module._update_only = MagicMock()
        filenames = ['package1.rpm']
        self.dnf_module._install_remote_rpms(filenames)
        self.dnf_module._update_only.assert_called()

    def test_install_remote_rpms_allow_downgrade(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=True)
        self.dnf_module.allow_downgrade = True
        filenames = ['package1.rpm']
        self.dnf_module._install_remote_rpms(filenames)
        self.dnf_module.base.package_install.assert_called()

    def test_install_remote_rpms_exception(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.package_install.side_effect = Exception('Test exception')
        filenames = ['package1.rpm']
        with self.assertRaises(Exception) as context:
            self.dnf_module._install_remote_rpms(filenames)
        self.assertIn('Error occurred attempting remote rpm operation', str(context.exception))

if __name__ == '__main__':
    unittest.main()