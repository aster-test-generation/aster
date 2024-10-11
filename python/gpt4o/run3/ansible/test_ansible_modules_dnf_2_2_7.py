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
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf')
    def test_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_with_modules_attribute_error(self, mock_dnf):
        del mock_dnf.base.WITH_MODULES
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    def test_compare_evr(self):
        result = self.dnf_module._compare_evr('1', '2.0', '3', '1', '2.0', '3')
        self.assertEqual(result, 0)

    def test_compare_evr_different(self):
        result = self.dnf_module._compare_evr('1', '2.0', '3', '1', '2.1', '3')
        self.assertNotEqual(result, 0)

    def test_compare_evr_none_epoch(self):
        result = self.dnf_module._compare_evr(None, '2.0', '3', None, '2.0', '3')
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()