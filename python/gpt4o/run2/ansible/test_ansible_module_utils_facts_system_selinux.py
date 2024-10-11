import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, SELINUX_MODE_DICT, HAVE_SELINUX


class TestSelinuxFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = SelinuxFactCollector()

    def test_collect_no_selinux_library(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', False):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'Missing selinux Python library')
            self.assertFalse(result['selinux_python_present'])

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=False)
    def test_collect_selinux_disabled(self, mock_is_selinux_enabled):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'disabled')
            self.assertTrue(result['selinux_python_present'])

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True)
    @patch('ansible.module_utils.facts.system.selinux.selinux.security_policyvers', return_value=30)
    @patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getenforcemode', return_value=(0, 1))
    @patch('ansible.module_utils.facts.system.selinux.selinux.security_getenforce', return_value=1)
    @patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getpolicytype', return_value=(0, 'targeted'))
    def test_collect_selinux_enabled(self, mock_is_selinux_enabled, mock_policyvers, mock_getenforcemode, mock_getenforce, mock_getpolicytype):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'enabled')
            self.assertEqual(result['selinux']['policyvers'], 30)
            self.assertEqual(result['selinux']['config_mode'], 'enforcing')
            self.assertEqual(result['selinux']['mode'], 'enforcing')
            self.assertEqual(result['selinux']['type'], 'targeted')

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True)
    @patch('ansible.module_utils.facts.system.selinux.selinux.security_policyvers', side_effect=AttributeError)
    def test_collect_policyvers_exception(self, mock_is_selinux_enabled, mock_policyvers):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['policyvers'], 'unknown')

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True)
    @patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getenforcemode', side_effect=OSError)
    def test_collect_getenforcemode_exception(self, mock_is_selinux_enabled, mock_getenforcemode):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['config_mode'], 'unknown')

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True)
    @patch('ansible.module_utils.facts.system.selinux.selinux.security_getenforce', side_effect=AttributeError)
    def test_collect_getenforce_exception(self, mock_is_selinux_enabled, mock_getenforce):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['mode'], 'unknown')

    @patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True)
    @patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getpolicytype', side_effect=OSError)
    def test_collect_getpolicytype_exception(self, mock_is_selinux_enabled, mock_getpolicytype):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['type'], 'unknown')

if __name__ == '__main__':
    unittest.main()