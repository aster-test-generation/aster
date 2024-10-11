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
        self.assertEqual(self.dnf_module.allowerasing, True)
        self.assertEqual(self.dnf_module.nobest, False)

    @patch('ansible.modules.dnf.dnf')
    def test_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_without_modules(self, mock_dnf):
        del mock_dnf.base.WITH_MODULES
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_is_module_installed_with_modules(self, mock_dnf):
        self.dnf_module.with_modules = True
        self.dnf_module.module_base._get_modules = MagicMock(return_value=([], MagicMock(name='nsv', stream='stream')))
        self.dnf_module.base._moduleContainer.getEnabledStream = MagicMock(return_value=['stream'])
        result = self.dnf_module._is_module_installed('module_spec')
        self.assertTrue(result)

    @patch('ansible.modules.dnf.dnf')
    def test_is_module_installed_without_modules(self, mock_dnf):
        self.dnf_module.with_modules = False
        result = self.dnf_module._is_module_installed('module_spec')
        self.assertFalse(result)

    @patch('ansible.modules.dnf.dnf')
    def test_is_module_installed_no_stream(self, mock_dnf):
        self.dnf_module.with_modules = True
        self.dnf_module.module_base._get_modules = MagicMock(return_value=([], MagicMock(name='nsv', stream=None)))
        self.dnf_module.base._moduleContainer.getEnabledStream = MagicMock(return_value=['stream'])
        result = self.dnf_module._is_module_installed('module_spec')
        self.assertTrue(result)

    @patch('ansible.modules.dnf.dnf')
    def test_is_module_installed_stream_not_enabled(self, mock_dnf):
        self.dnf_module.with_modules = True
        self.dnf_module.module_base._get_modules = MagicMock(return_value=([], MagicMock(name='nsv', stream='stream')))
        self.dnf_module.base._moduleContainer.getEnabledStream = MagicMock(return_value=['other_stream'])
        result = self.dnf_module._is_module_installed('module_spec')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()