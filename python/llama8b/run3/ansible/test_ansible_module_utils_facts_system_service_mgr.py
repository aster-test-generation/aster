import unittest
from ansible.module_utils.facts.system import service_mgr


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        module = {'get_bin_path': lambda x: '/usr/bin/systemctl'}
        self.assertTrue(service_mgr.is_systemd_managed(module))

    def test_is_systemd_managed_offline(self):
        module = {'get_bin_path': lambda x: '/usr/bin/systemctl'}
        self.assertTrue(service_mgr.is_systemd_managed_offline(module))

    def test_is_systemd_managed_no_systemctl(self):
        module = {'get_bin_path': lambda x: None}
        self.assertFalse(service_mgr.is_systemd_managed(module))

    def test_is_systemd_managed_offline_no_systemctl(self):
        module = {'get_bin_path': lambda x: None}
        self.assertFalse(service_mgr.is_systemd_managed_offline(module))

    def test_collect(self):
        module = {'get_bin_path': lambda x: '/usr/bin/systemctl'}
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'systemd')

    def test_collect_no_systemctl(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'service')

    def test_collect_macos(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'MacOSX', 'distribution': 'MacOSX'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'launchd')

    def test_collect_bsd(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'BSD', 'distribution': 'FreeBSD'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'bsdinit')

    def test_collect_aix(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'AIX', 'distribution': 'AIX'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'src')

    def test_collect_sunos(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'SunOS', 'distribution': 'SunOS'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'smf')

    def test_collect_openwrt(self):
        module = {'get_bin_path': lambda x: None}
        collected_facts = {'platform': 'Linux', 'distribution': 'OpenWrt'}
        facts_dict = service_mgr.ServiceMgrFactCollector().collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)
        self.assertEqual(facts_dict['service_mgr'], 'openwrt_init')

if __name__ == '__main__':
    unittest.main()