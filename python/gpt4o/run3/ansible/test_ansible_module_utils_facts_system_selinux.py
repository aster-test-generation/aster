import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, HAVE_SELINUX, SELINUX_MODE_DICT
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, SELINUX_MODE_DICT, HAVE_SELINUX


class TestSelinuxFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = SelinuxFactCollector()

    def test_collect_selinux_not_present(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', False):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'Missing selinux Python library')
            self.assertFalse(result['selinux_python_present'])

    @patch('ansible.module_utils.facts.system.selinux.selinux')
    def test_collect_selinux_disabled(self, mock_selinux):
        mock_selinux.is_selinux_enabled.return_value = False
        result = self.collector.collect()
        self.assertTrue(result['selinux_python_present'])
        self.assertEqual(result['selinux']['status'], 'disabled')

    @patch('ansible.module_utils.facts.system.selinux.selinux')
    def test_collect_selinux_enabled(self, mock_selinux):
        mock_selinux.is_selinux_enabled.return_value = True
        mock_selinux.security_policyvers.return_value = 30
        mock_selinux.selinux_getenforcemode.return_value = (0, 1)
        mock_selinux.security_getenforce.return_value = 1
        mock_selinux.selinux_getpolicytype.return_value = (0, 'targeted')

        result = self.collector.collect()
        self.assertTrue(result['selinux_python_present'])
        self.assertEqual(result['selinux']['status'], 'enabled')
        self.assertEqual(result['selinux']['policyvers'], 30)
        self.assertEqual(result['selinux']['config_mode'], 'enforcing')
        self.assertEqual(result['selinux']['mode'], 'enforcing')
        self.assertEqual(result['selinux']['type'], 'targeted')

    @patch('ansible.module_utils.facts.system.selinux.selinux')
    def test_collect_selinux_exceptions(self, mock_selinux):
        mock_selinux.is_selinux_enabled.return_value = True
        mock_selinux.security_policyvers.side_effect = AttributeError
        mock_selinux.selinux_getenforcemode.side_effect = OSError
        mock_selinux.security_getenforce.side_effect = AttributeError
        mock_selinux.selinux_getpolicytype.side_effect = OSError

        result = self.collector.collect()
        self.assertTrue(result['selinux_python_present'])
        self.assertEqual(result['selinux']['status'], 'enabled')
        self.assertEqual(result['selinux']['policyvers'], 'unknown')
        self.assertEqual(result['selinux']['config_mode'], 'unknown')
        self.assertEqual(result['selinux']['mode'], 'unknown')
        self.assertEqual(result['selinux']['type'], 'unknown')

class TestSelinuxFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = SelinuxFactCollector()

    def test_collect_missing_selinux_library(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', False):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'Missing selinux Python library')
            self.assertFalse(result['selinux_python_present'])

    def test_collect_selinux_disabled(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=False):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'disabled')
            self.assertTrue(result['selinux_python_present'])

    def test_collect_selinux_enabled(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.security_policyvers', return_value=30), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getenforcemode', return_value=(0, 1)), \
             patch('ansible.module_utils.facts.system.selinux.selinux.security_getenforce', return_value=1), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getpolicytype', return_value=(0, 'targeted')):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'enabled')
            self.assertEqual(result['selinux']['policyvers'], 30)
            self.assertEqual(result['selinux']['config_mode'], 'enforcing')
            self.assertEqual(result['selinux']['mode'], 'enforcing')
            self.assertEqual(result['selinux']['type'], 'targeted')

    def test_collect_selinux_enabled_with_exceptions(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.security_policyvers', side_effect=OSError), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getenforcemode', side_effect=OSError), \
             patch('ansible.module_utils.facts.system.selinux.selinux.security_getenforce', side_effect=OSError), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getpolicytype', side_effect=OSError):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['status'], 'enabled')
            self.assertEqual(result['selinux']['policyvers'], 'unknown')
            self.assertEqual(result['selinux']['config_mode'], 'unknown')
            self.assertEqual(result['selinux']['mode'], 'unknown')
            self.assertEqual(result['selinux']['type'], 'unknown')

    def test_collect_selinux_getenforcemode_non_zero_rc(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getenforcemode', return_value=(1, 1)):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['config_mode'], 'unknown')

    def test_collect_selinux_getpolicytype_non_zero_rc(self):
        with patch('ansible.module_utils.facts.system.selinux.HAVE_SELINUX', True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.is_selinux_enabled', return_value=True), \
             patch('ansible.module_utils.facts.system.selinux.selinux.selinux_getpolicytype', return_value=(1, 'targeted')):
            result = self.collector.collect()
            self.assertEqual(result['selinux']['type'], 'unknown')

if __name__ == '__main__':
    unittest.main()