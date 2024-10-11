import unittest
from ansible.module_utils.facts.system.service_mgr import ServiceMgrFactCollector


class TestServiceMgrFactCollector(unittest.TestCase):
    def test_is_systemd_managed(self):
        module = object()
        self.assertTrue(ServiceMgrFactCollector.is_systemd_managed(module))

    def test_is_systemd_managed_offline(self):
        module = object()
        self.assertTrue(ServiceMgrFactCollector.is_systemd_managed_offline(module))

    def test_collect(self):
        module = object()
        collected_facts = {}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)

    def test_collect_no_module(self):
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(None, {})
        self.assertEqual(facts_dict, {})

    def test_collect_collected_facts(self):
        module = object()
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertIn('service_mgr', facts_dict)

    def test_collect_systemd_managed(self):
        module = object()
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'systemd')

    def test_collect_upstart_managed(self):
        module = object()
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'upstart')

    def test_collect_openrc_managed(self):
        module = object()
        collected_facts = {'platform': 'Linux', 'distribution': 'OpenWrt'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'openwrt_init')

    def test_collect_sysvinit_managed(self):
        module = object()
        collected_facts = {'platform': 'Linux', 'distribution': 'Ubuntu'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'sysvinit')

    def test_collect_launchd_managed(self):
        module = object()
        collected_facts = {'platform': 'MacOSX', 'distribution': 'MacOSX'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'launchd')

    def test_collect_bsdinit_managed(self):
        module = object()
        collected_facts = {'platform': 'BSD', 'distribution': 'FreeBSD'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'bsdinit')

    def test_collect_src_managed(self):
        module = object()
        collected_facts = {'platform': 'AIX', 'distribution': 'AIX'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'src')

    def test_collect_smf_managed(self):
        module = object()
        collected_facts = {'platform': 'SunOS', 'distribution': 'Solaris'}
        collector = ServiceMgrFactCollector()
        facts_dict = collector.collect(module, collected_facts)
        self.assertEqual(facts_dict['service_mgr'], 'smf')

if __name__ == '__main__':
    unittest.main()