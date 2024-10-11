import unittest
from ansible.module_utils.facts.system.service_mgr import ServiceMgrFactCollector
from unittest.mock import Mock


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/systemctl'
        collector = ServiceMgrFactCollector()
        self.assertTrue(collector.is_systemd_managed(module))

    def test_is_systemd_managed_offline(self):
        module = Mock()
        module.get_bin_path.return_value = '/sbin/init'
        collector = ServiceMgrFactCollector()
        self.assertTrue(collector.is_systemd_managed_offline(module))

    def test_collect_systemd_managed(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/systemctl'
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'systemd')

    def test_collect_systemd_managed_offline(self):
        module = Mock()
        module.get_bin_path.return_value = '/sbin/init'
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'systemd')

    def test_collect_sysvinit(self):
        module = Mock()
        module.get_bin_path.return_value = None
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'sysvinit')

    def test_collect_openrc(self):
        module = Mock()
        module.get_bin_path.return_value = '/sbin/openrc'
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'openrc')

    def test_collect_upstart(self):
        module = Mock()
        module.get_bin_path.return_value = '/sbin/initctl'
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'upstart')

    def test_collect_openwrt_init(self):
        module = Mock()
        module.get_bin_path.return_value = None
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict['service_mgr'], 'openwrt_init')

if __name__ == '__main__':
    unittest.main()