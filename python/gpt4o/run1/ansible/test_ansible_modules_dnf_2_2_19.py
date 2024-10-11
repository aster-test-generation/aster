import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, dnf


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
    def test_init_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_install_remote_rpms_dnf_v2(self, mock_dnf):
        mock_dnf.__version__ = '2.0.0'
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpms = MagicMock(return_value=['pkg1', 'pkg2'])
        self.dnf_module._install_remote_rpms(['file1', 'file2'])
        self.dnf_module.base.add_remote_rpms.assert_called_once_with(['file1', 'file2'])

    @patch('ansible.modules.dnf.dnf')
    def test_install_remote_rpms_dnf_v1(self, mock_dnf):
        mock_dnf.__version__ = '1.0.0'
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpm = MagicMock()
        self.dnf_module._install_remote_rpms(['file1', 'file2'])
        self.dnf_module.base.add_remote_rpm.assert_any_call('file1')
        self.dnf_module.base.add_remote_rpm.assert_any_call('file2')

    @patch('ansible.modules.dnf.dnf')
    def test_install_remote_rpms_ioerror(self, mock_dnf):
        mock_dnf.__version__ = '1.0.0'
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpm = MagicMock(side_effect=IOError('Can not load RPM file'))
        with self.assertRaises(SystemExit):
            self.dnf_module._install_remote_rpms(['file1'])

    def test_install_remote_rpms_update_only(self):
        self.dnf_module.update_only = True
        self.dnf_module._update_only = MagicMock()
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpms = MagicMock(return_value=['pkg1'])
        self.dnf_module._install_remote_rpms(['file1'])
        self.dnf_module._update_only.assert_called_once_with(['pkg1'])

    def test_install_remote_rpms_package_install(self):
        self.dnf_module.update_only = False
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._package_dict = MagicMock(return_value={'nevra': 'pkg1'})
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpms = MagicMock(return_value=['pkg1'])
        self.dnf_module.base.package_install = MagicMock()
        self.dnf_module._install_remote_rpms(['file1'])
        self.dnf_module.base.package_install.assert_called_once_with('pkg1')

    def test_install_remote_rpms_package_install_downgrade(self):
        self.dnf_module.update_only = False
        self.dnf_module.allow_downgrade = True
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=True)
        self.dnf_module._package_dict = MagicMock(return_value={'nevra': 'pkg1'})
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpms = MagicMock(return_value=['pkg1'])
        self.dnf_module.base.package_install = MagicMock()
        self.dnf_module._install_remote_rpms(['file1'])
        self.dnf_module.base.package_install.assert_called_once_with('pkg1')

    def test_install_remote_rpms_package_install_exception(self):
        self.dnf_module.update_only = False
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._package_dict = MagicMock(return_value={'nevra': 'pkg1'})
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.add_remote_rpms = MagicMock(return_value=['pkg1'])
        self.dnf_module.base.package_install = MagicMock(side_effect=Exception('Error'))
        with self.assertRaises(SystemExit):
            self.dnf_module._install_remote_rpms(['file1'])

if __name__ == '__main__':
    unittest.main()