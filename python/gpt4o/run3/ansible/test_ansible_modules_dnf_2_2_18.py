import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': True,
            'nobest': False
        }
        self.dnf_module = DnfModuleImpl(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_update_only(self):
        self.dnf_module._is_installed = MagicMock(side_effect=[True, False])
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.upgrade = MagicMock()
        self.dnf_module.base.package_upgrade = MagicMock()

        pkgs = ['pkg1', 'pkg2']
        not_installed = self.dnf_module._update_only(pkgs)

        self.dnf_module._is_installed.assert_any_call('pkg1')
        self.dnf_module._is_installed.assert_any_call('pkg2')
        self.dnf_module.base.upgrade.assert_called_once_with('pkg1')
        self.assertEqual(not_installed, ['pkg2'])

    def test_update_only_with_exception(self):
        self.dnf_module._is_installed = MagicMock(return_value=True)
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.upgrade = MagicMock(side_effect=Exception('Test Exception'))
        self.dnf_module.module.fail_json = MagicMock()

        pkgs = ['pkg1']
        not_installed = self.dnf_module._update_only(pkgs)

        self.dnf_module.module.fail_json.assert_called_once_with(
            msg='Error occurred attempting update_only operation: Test Exception',
            results=[],
            rc=1
        )
        self.assertEqual(not_installed, [])

    def test_private_methods(self):
        # Test private method _ensure_dnf
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            self.dnf_module._DnfModule__ensure_dnf()
            mock_dnf.assert_called_once()

    def test_protected_methods(self):
        # Test protected method _is_installed
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed.return_value = ['pkg1']
        result = self.dnf_module._is_installed('pkg1')
        self.assertTrue(result)

    def test_magic_methods(self):
        # Test __str__ method
        self.assertEqual(str(self.dnf_module), '<DnfModule>')

        # Test __repr__ method
        self.assertEqual(repr(self.dnf_module), '<DnfModule>')

if __name__ == '__main__':
    unittest.main()