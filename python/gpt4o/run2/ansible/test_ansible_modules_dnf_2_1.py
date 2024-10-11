import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': True,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_ensure_dnf(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            self.dnf_module._ensure_dnf()
            mock_dnf.base.WITH_MODULES = True
            self.assertTrue(self.dnf_module.with_modules)

    def test_private_methods(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            mock_dnf.base.WITH_MODULES = True
            self.dnf_module._DnfModule__ensure_dnf()
            self.assertTrue(self.dnf_module.with_modules)

    def test_protected_methods(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            mock_dnf.base.WITH_MODULES = True
            self.dnf_module._ensure_dnf()
            self.assertTrue(self.dnf_module.with_modules)

if __name__ == '__main__':
    unittest.main()