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
        self.assertEqual(self.dnf_module.allowerasing, True)
        self.assertEqual(self.dnf_module.nobest, False)

    def test_is_lockfile_pid_valid(self):
        result = self.dnf_module.is_lockfile_pid_valid()
        self.assertTrue(result)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', True)
    def test_with_modules_true(self):
        self.dnf_module._ensure_dnf = MagicMock()
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', False)
    def test_with_modules_false(self):
        self.dnf_module._ensure_dnf = MagicMock()
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    def test_private_ensure_dnf(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            mock_dnf.base = MagicMock()
            self.dnf_module._DnfModule__ensure_dnf()
            mock_dnf.base.assert_called_once()

if __name__ == '__main__':
    unittest.main()