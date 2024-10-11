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
        self.dnf_module.module.fail_json = MagicMock()
        self.dnf_module.ensure()
        self.dnf_module.base.upgrade_all.assert_called_once()

    def test__parse_spec_group_file(self):
        self.dnf_module._parse_spec_group_file = MagicMock(return_value=([], [], [], []))
        result = self.dnf_module._parse_spec_group_file()
        self.assertEqual(result, ([], [], [], []))

    def test__install_remote_rpms(self):
        self.dnf_module._install_remote_rpms = MagicMock()
        self.dnf_module._install_remote_rpms(['filename'])
        self.dnf_module._install_remote_rpms.assert_called_once_with(['filename'])

    def test__is_module_installed(self):
        self.dnf_module._is_module_installed = MagicMock(return_value=True)
        result = self.dnf_module._is_module_installed('module')
        self.assertTrue(result)

    def test__mark_package_install(self):
        self.dnf_module._mark_package_install = MagicMock(return_value={'failed': False, 'msg': ''})
        result = self.dnf_module._mark_package_install('pkg_spec')
        self.assertEqual(result, {'failed': False, 'msg': ''})

    def test__sanitize_dnf_error_msg_install(self):
        self.dnf_module._sanitize_dnf_error_msg_install = MagicMock(return_value='error_msg')
        result = self.dnf_module._sanitize_dnf_error_msg_install('pkg_spec', 'failure')
        self.assertEqual(result, 'error_msg')

    def test__sanitize_dnf_error_msg_remove(self):
        self.dnf_module._sanitize_dnf_error_msg_remove = MagicMock(return_value=(False, 'handled_remove_error'))
        result = self.dnf_module._sanitize_dnf_error_msg_remove('pkg_spec', 'error')
        self.assertEqual(result, (False, 'handled_remove_error'))

    def test__update_only(self):
        self.dnf_module._update_only = MagicMock(return_value=['not_installed'])
        result = self.dnf_module._update_only(['pkg_specs'])
        self.assertEqual(result, ['not_installed'])

    def test__ensure_dnf(self):
        self.dnf_module._ensure_dnf = MagicMock()
        self.dnf_module._ensure_dnf()
        self.dnf_module._ensure_dnf.assert_called_once()

    def test__str__(self):
        result = self.dnf_module.__str__()
        self.assertEqual(result, 'DnfModule')

    def test__repr__(self):
        result = self.dnf_module.__repr__()
        self.assertEqual(result, 'DnfModule()')

if __name__ == '__main__':
    unittest.main()