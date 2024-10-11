import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertEqual(self.dnf_module.allowerasing, self.module.params['allowerasing'])
        self.assertEqual(self.dnf_module.nobest, self.module.params['nobest'])

    def test_ensure(self):
        self.dnf_module.names = ['*']
        self.dnf_module.state = 'latest'
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.upgrade_all = MagicMock()
        self.dnf_module.ensure()
        self.dnf_module.base.upgrade_all.assert_called_once()

    def test__ensure_dnf(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            self.dnf_module._ensure_dnf()
            mock_dnf.Base.assert_called_once()

    def test__parse_spec_group_file(self):
        self.dnf_module.module.params = {'name': 'httpd'}
        result = self.dnf_module._parse_spec_group_file()
        self.assertEqual(result, (['httpd'], [], [], []))

    def test__install_remote_rpms(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module._install_remote_rpms(['httpd.rpm'])
        self.dnf_module.base.install.assert_called_once_with(['httpd.rpm'])

    def test__is_module_installed(self):
        self.dnf_module.module_base = MagicMock()
        self.dnf_module.module_base.get_installed_modules = MagicMock(return_value=['module1'])
        result = self.dnf_module._is_module_installed('module1')
        self.assertTrue(result)

    def test__mark_package_install(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.install = MagicMock()
        result = self.dnf_module._mark_package_install('httpd')
        self.dnf_module.base.install.assert_called_once_with('httpd')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': ''})

    def test__sanitize_dnf_error_msg_install(self):
        result = self.dnf_module._sanitize_dnf_error_msg_install('httpd', 'error')
        self.assertEqual(result, 'error')

    def test__sanitize_dnf_error_msg_remove(self):
        result = self.dnf_module._sanitize_dnf_error_msg_remove('httpd', 'error')
        self.assertEqual(result, (True, 'error'))

    def test__update_only(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.upgrade = MagicMock()
        result = self.dnf_module._update_only(['httpd'])
        self.dnf_module.base.upgrade.assert_called_once_with(['httpd'])
        self.assertEqual(result, [])

    def test__str__(self):
        result = self.dnf_module.__str__()
        self.assertEqual(result, 'DnfModule')

    def test__repr__(self):
        result = self.dnf_module.__repr__()
        self.assertEqual(result, 'DnfModule()')

if __name__ == '__main__':
    unittest.main()