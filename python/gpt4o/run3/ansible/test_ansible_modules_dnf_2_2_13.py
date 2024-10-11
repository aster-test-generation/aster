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
    def test_init_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    def test_is_installed(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter.return_value = True
        result = self.dnf_module._is_installed('testpkg')
        self.assertTrue(result)

    def test_is_installed_not_found(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter.return_value = False
        result = self.dnf_module._is_installed('testpkg')
        self.assertFalse(result)

    def test_split_package_arch(self):
        result = self.dnf_module._split_package_arch('testpkg.x86_64')
        self.assertEqual(result, ('testpkg', 'x86_64'))

    def test_split_package_arch_no_arch(self):
        result = self.dnf_module._split_package_arch('testpkg')
        self.assertEqual(result, ('testpkg', None))

    def test_packagename_dict(self):
        result = self.dnf_module._packagename_dict('testpkg-1.0-1.x86_64')
        expected = {
            'name': 'testpkg',
            'version': '1.0',
            'release': '1',
            'arch': 'x86_64',
            'epoch': '0'
        }
        self.assertEqual(result, expected)

    def test_packagename_dict_no_epoch(self):
        result = self.dnf_module._packagename_dict('testpkg-1.0-1.x86_64')
        self.assertEqual(result['epoch'], '0')

if __name__ == '__main__':
    unittest.main()