import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.service_mgr import ServiceMgrFactCollector

class TestServiceMgrFactCollector(unittest.TestCase):

    def setUp(self):
        self.collector = ServiceMgrFactCollector()

    def test_is_systemd_managed_true(self):
        module = Mock()
        module.get_bin_path.return_value = '/bin/systemctl'
        with patch('os.path.exists', return_value=True):
            result = ServiceMgrFactCollector.is_systemd_managed(module)
            self.assertTrue(result)

    def test_is_systemd_managed_false(self):
        module = Mock()
        module.get_bin_path.return_value = None
        result = ServiceMgrFactCollector.is_systemd_managed(module)
        self.assertFalse(result)

    def test_is_systemd_managed_offline_true(self):
        module = Mock()
        module.get_bin_path.return_value = '/bin/systemctl'
        with patch('os.path.islink', return_value=True), patch('os.readlink', return_value='systemd'):
            result = ServiceMgrFactCollector.is_systemd_managed_offline(module)
            self.assertTrue(result)

    def test_is_systemd_managed_offline_false(self):
        module = Mock()
        module.get_bin_path.return_value = None
        result = ServiceMgrFactCollector.is_systemd_managed_offline(module)
        self.assertFalse(result)

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        module = Mock()
        module.run_command.return_value = (0, 'init', '')
        module.get_bin_path.side_effect = lambda x: '/bin/' + x if x == 'systemctl' else None
        collected_facts = {
            'ansible_distribution': 'Ubuntu',
            'ansible_system': 'Linux'
        }
        with patch('os.path.exists', return_value=True), patch('os.path.islink', return_value=False):
            result = self.collector.collect(module=module, collected_facts=collected_facts)
            self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_proc_1(self):
        module = Mock()
        module.run_command.return_value = (0, 'procd', '')
        collected_facts = {
            'ansible_distribution': 'OpenWrt',
            'ansible_system': 'Linux'
        }
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='procd'):
            result = self.collector.collect(module=module, collected_facts=collected_facts)
            self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_mac(self):
        module = Mock()
        collected_facts = {
            'ansible_distribution': 'MacOSX',
            'ansible_system': 'Darwin'
        }
        with patch('platform.mac_ver', return_value=('10.15', ('', '', ''), '')):
            result = self.collector.collect(module=module, collected_facts=collected_facts)
            self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_bsd(self):
        module = Mock()
        collected_facts = {
            'ansible_system': 'FreeBSD'
        }
        result = self.collector.collect(module=module, collected_facts=collected_facts)
        self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_aix(self):
        module = Mock()
        collected_facts = {
            'ansible_system': 'AIX'
        }
        result = self.collector.collect(module=module, collected_facts=collected_facts)
        self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_sunos(self):
        module = Mock()
        collected_facts = {
            'ansible_system': 'SunOS'
        }
        result = self.collector.collect(module=module, collected_facts=collected_facts)
        self.assertEqual(result['service_mgr'], 'systemd')

    def test_collect_with_default(self):
        module = Mock()
        collected_facts = {
            'ansible_system': 'UnknownOS'
        }
        result = self.collector.collect(module=module, collected_facts=collected_facts)
        self.assertEqual(result['service_mgr'], 'systemd')

if __name__ == '__main__':
    unittest.main()