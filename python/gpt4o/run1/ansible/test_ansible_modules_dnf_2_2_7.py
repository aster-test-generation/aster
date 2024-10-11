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

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', True)
    def test_with_modules_true(self):
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', False)
    def test_with_modules_false(self):
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf.rpm.rpm.labelCompare', return_value=1)
    def test_compare_evr(self, mock_label_compare):
        result = self.dnf_module._compare_evr('1', '2.0', '3', '1', '2.0', '2')
        self.assertEqual(result, 1)
        mock_label_compare.assert_called_once_with(('1', '2.0', '3'), ('1', '2.0', '2'))

    @patch('ansible.modules.dnf.dnf.rpm.rpm.labelCompare', return_value=-1)
    def test_compare_evr_none_epoch(self, mock_label_compare):
        result = self.dnf_module._compare_evr(None, '2.0', '3', None, '2.0', '2')
        self.assertEqual(result, -1)
        mock_label_compare.assert_called_once_with(('0', '2.0', '3'), ('0', '2.0', '2'))

if __name__ == '__main__':
    unittest.main()