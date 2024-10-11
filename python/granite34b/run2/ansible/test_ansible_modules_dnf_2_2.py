import unittest
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_ensure(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        dnf_module.names = ['apache']
        dnf_module.state = 'latest'
        dnf_module.base = MagicMock()
        dnf_module.base.upgrade_all = MagicMock()
        dnf_module.base.upgrade_all.side_effect = dnf.exceptions.DepsolveError('Depsolve Error')
        dnf_module.module.fail_json = MagicMock()
        dnf_module.ensure()
        dnf_module.base.upgrade_all.assert_called_once()
        dnf_module.module.fail_json.assert_called_once_with(msg='Depsolve Error occurred attempting to upgrade all packages')

        dnf_module.base.upgrade_all.reset_mock()
        dnf_module.module.fail_json.reset_mock()
        dnf_module.state = 'present'
        dnf_module.base.group_install = MagicMock()
        dnf_module.base.group_install.return_value = 0
        dnf_module.ensure()
        dnf_module.base.group_install.assert_called_once_with('Development tools', dnf.const.GROUP_PACKAGE_TYPES)
        dnf_module.module.exit_json.assert_called_once()

        dnf_module.base.group_install.reset_mock()
        dnf_module.module.exit_json.reset_mock()
        dnf_module.state = 'absent'
        dnf_module.base.group_remove = MagicMock()
        dnf_module.base.group_remove.side_effect = dnf.exceptions.CompsError('Comps Error')
        dnf_module.base.environment_remove = MagicMock()
        dnf_module.base.environment_remove.side_effect = dnf.exceptions.CompsError('Comps Error')
        dnf_module.ensure()
        dnf_module.base.group_remove.assert_called_once_with('Development tools')
        dnf_module.base.environment_remove.assert_called_once_with('Development tools')
        dnf_module.module.exit_json.assert_called_once()

if __name__ == '__main__':
    unittest.main()