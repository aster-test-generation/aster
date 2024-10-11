import unittest
from ansible.module_utils.facts.system import caps


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = caps.SystemCapabilitiesFactCollector()
        facts_dict = collector.collect(module=None, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_module(self):
        module = object()
        collector = caps.SystemCapabilitiesFactCollector()
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_capsh_path(self):
        collector = caps.SystemCapabilitiesFactCollector()
        collector._fact_ids = set(['system_capabilities', 'system_capabilities_enforced'])
        facts_dict = collector.collect(module=object(), collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_enforced_caps(self):
        collector = caps.SystemCapabilitiesFactCollector()
        collector._fact_ids = set(['system_capabilities', 'system_capabilities_enforced'])
        facts_dict = collector.collect(module=object(), collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_enforced(self):
        collector = caps.SystemCapabilitiesFactCollector()
        collector._fact_ids = set(['system_capabilities', 'system_capabilities_enforced'])
        facts_dict = collector.collect(module=object(), collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_enforced_caps_and_enforced(self):
        collector = caps.SystemCapabilitiesFactCollector()
        collector._fact_ids = set(['system_capabilities', 'system_capabilities_enforced'])
        facts_dict = collector.collect(module=object(), collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_enforced_caps_and_enforced_and_capsh_path(self):
        collector = caps.SystemCapabilitiesFactCollector()
        collector._fact_ids = set(['system_capabilities', 'system_capabilities_enforced'])
        facts_dict = collector.collect(module=object(), collected_facts=None)
        self.assertEqual(facts_dict, {})

if __name__ == '__main__':
    unittest.main()