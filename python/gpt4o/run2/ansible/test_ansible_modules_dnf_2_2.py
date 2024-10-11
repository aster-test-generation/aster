import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertEqual(self.dnf_module.allowerasing, self.module.params['allowerasing'])
        self.assertEqual(self.dnf_module.nobest, self.module.params['nobest'])

    def test_ensure_no_names_autoremove(self):
        self.dnf_module.names = []
        self.dnf_module.autoremove = True
        self.dnf_module.ensure()
        self.assertEqual(self.dnf_module.names, [])
        self.assertEqual(self.dnf_module.state, 'absent')

    @patch('ansible.modules.dnf.dnf.base.Base.upgrade_all')
    def test_ensure_upgrade_all(self, mock_upgrade_all):
        self.dnf_module.names = ['*']
        self.dnf_module.state = 'latest'
        self.dnf_module.ensure()
        mock_upgrade_all.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.upgrade_all', side_effect=Exception)
    def test_ensure_upgrade_all_depsolve_error(self, mock_upgrade_all):
        self.dnf_module.names = ['*']
        self.dnf_module.state = 'latest'
        with self.assertRaises(SystemExit):
            self.dnf_module.ensure()
        self.module.fail_json.assert_called_once_with(msg='Depsolve Error occurred attempting to upgrade all packages', failures=[], results=[], rc=1)

    @patch('ansible.modules.dnf.DnfModule._parse_spec_group_file', return_value=([], [], [], []))
    def test_ensure_parse_spec_group_file(self, mock_parse_spec_group_file):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_parse_spec_group_file.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._install_remote_rpms')
    def test_ensure_install_remote_rpms(self, mock_install_remote_rpms):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_install_remote_rpms.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._mark_package_install', return_value={'failed': False, 'msg': 'Installed'})
    def test_ensure_mark_package_install(self, mock_mark_package_install):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_mark_package_install.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._mark_package_install', return_value={'failed': True, 'msg': 'Failed', 'failure': 'Error'})
    def test_ensure_mark_package_install_failed(self, mock_mark_package_install):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        with self.assertRaises(SystemExit):
            self.dnf_module.ensure()
        self.module.fail_json.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._is_module_installed', return_value=False)
    @patch('ansible.modules.dnf.dnf.module.ModuleBase.install')
    def test_ensure_module_install(self, mock_module_install, mock_is_module_installed):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.with_modules = True
        self.dnf_module.ensure()
        mock_module_install.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._is_module_installed', return_value=True)
    @patch('ansible.modules.dnf.dnf.module.ModuleBase.upgrade')
    def test_ensure_module_upgrade(self, mock_module_upgrade, mock_is_module_installed):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'latest'
        self.dnf_module.with_modules = True
        self.dnf_module.ensure()
        mock_module_upgrade.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._is_module_installed', return_value=True)
    @patch('ansible.modules.dnf.dnf.module.ModuleBase.remove')
    def test_ensure_module_remove(self, mock_module_remove, mock_is_module_installed):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'absent'
        self.dnf_module.with_modules = True
        self.dnf_module.ensure()
        mock_module_remove.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.group_install')
    def test_ensure_group_install(self, mock_group_install):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_group_install.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.group_upgrade')
    def test_ensure_group_upgrade(self, mock_group_upgrade):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'latest'
        self.dnf_module.ensure()
        mock_group_upgrade.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.group_remove')
    def test_ensure_group_remove(self, mock_group_remove):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'absent'
        self.dnf_module.ensure()
        mock_group_remove.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.environment_install')
    def test_ensure_environment_install(self, mock_environment_install):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_environment_install.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.environment_upgrade')
    def test_ensure_environment_upgrade(self, mock_environment_upgrade):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'latest'
        self.dnf_module.ensure()
        mock_environment_upgrade.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.environment_remove')
    def test_ensure_environment_remove(self, mock_environment_remove):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'absent'
        self.dnf_module.ensure()
        mock_environment_remove.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.remove')
    def test_ensure_remove(self, mock_remove):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'absent'
        self.dnf_module.ensure()
        mock_remove.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.resolve', return_value=False)
    def test_ensure_resolve(self, mock_resolve):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_resolve.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.do_transaction')
    def test_ensure_do_transaction(self, mock_do_transaction):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.ensure()
        mock_do_transaction.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.download_packages')
    def test_ensure_download_packages(self, mock_download_packages):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'present'
        self.dnf_module.download_only = True
        self.dnf_module.ensure()
        mock_download_packages.assert_called_once()

    @patch('ansible.modules.dnf.dnf.base.Base.autoremove')
    def test_ensure_autoremove(self, mock_autoremove):
        self.dnf_module.names = ['test']
        self.dnf_module.state = 'absent'
        self.dnf_module.autoremove = True
        self.dnf_module.ensure()
        mock_autoremove.assert_called_once()

if __name__ == '__main__':
    unittest.main()