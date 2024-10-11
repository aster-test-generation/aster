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

    def test_mark_package_install_newer_version_installed_allow_downgrade_upgrade_installed(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=True)
        self.dnf_module._is_installed = MagicMock(return_value=True)
        self.dnf_module.allow_downgrade = True
        self.dnf_module.base = MagicMock()
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=True)
        self.dnf_module.base.upgrade.assert_called_with('pkg_spec')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_newer_version_installed_allow_downgrade_not_upgrade_installed(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=True)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.allow_downgrade = True
        self.dnf_module.base = MagicMock()
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=True)
        self.dnf_module.base.install.assert_called_with('pkg_spec')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_newer_version_installed_not_allow_downgrade(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=True)
        self.dnf_module._is_installed = MagicMock(return_value=True)
        self.dnf_module.allow_downgrade = False
        self.dnf_module.base = MagicMock()
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=True)
        self.dnf_module.base.upgrade.assert_not_called()
        self.dnf_module.base.install.assert_not_called()
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_installed_upgrade(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=True)
        self.dnf_module.base = MagicMock()
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=True)
        self.dnf_module.base.upgrade.assert_called_with('pkg_spec')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_not_installed(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.base = MagicMock()
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=False)
        self.dnf_module.base.install.assert_called_with('pkg_spec')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_marking_error(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.install.side_effect = dnf.exceptions.MarkingError('error')
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=False)
        self.assertEqual(result, {'failed': True, 'msg': 'No package pkg_spec available.', 'failure': 'pkg_spec error', 'rc': 1, 'results': []})

    def test_mark_package_install_depsolve_error(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.install.side_effect = dnf.exceptions.DepsolveError('error')
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=False)
        self.assertEqual(result, {'failed': True, 'msg': 'Depsolve Error occurred for package pkg_spec.', 'failure': 'pkg_spec error', 'rc': 1, 'results': []})

    def test_mark_package_install_generic_error(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.install.side_effect = dnf.exceptions.Error('already installed')
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=False)
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': ''})

    def test_mark_package_install_unknown_error(self):
        self.dnf_module._is_newer_version_installed = MagicMock(return_value=False)
        self.dnf_module._is_installed = MagicMock(return_value=False)
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.install.side_effect = dnf.exceptions.Error('unknown error')
        result = self.dnf_module._mark_package_install('pkg_spec', upgrade=False)
        self.assertEqual(result, {'failed': True, 'msg': 'Unknown Error occurred for package pkg_spec.', 'failure': 'pkg_spec unknown error', 'rc': 1, 'results': []})

if __name__ == '__main__':
    unittest.main()