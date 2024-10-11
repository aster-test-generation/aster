import unittest
from ansible.module_utils.facts.facts import Facts


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SystemCapabilitiesFactCollector()
        facts_dict = collector.collect()
        self.assertIn('system_capabilities', facts_dict)
        self.assertIn('system_capabilities_enforced', facts_dict)

    def test_collect_with_module(self):
        collector = SystemCapabilitiesFactCollector()
        module = Mock()
        facts_dict = collector.collect(module=module)
        self.assertIn('system_capabilities', facts_dict)
        self.assertIn('system_capabilities_enforced', facts_dict)

    def test_collect_with_module_and_facts(self):
        collector = SystemCapabilitiesFactCollector()
        module = Mock()
        facts = {'system_capabilities': ['foo', 'bar']}
        facts_dict = collector.collect(module=module, collected_facts=facts)
        self.assertIn('system_capabilities', facts_dict)
        self.assertIn('system_capabilities_enforced', facts_dict)
        self.assertEqual(facts_dict['system_capabilities'], ['foo', 'bar'])

    def test_collect_with_module_and_facts_and_enforced(self):
        collector = SystemCapabilitiesFactCollector()
        module = Mock()
        facts = {'system_capabilities': ['foo', 'bar'], 'system_capabilities_enforced': 'True'}
        facts_dict = collector.collect(module=module, collected_facts=facts)
        self.assertIn('system_capabilities', facts_dict)
        self.assertIn('system_capabilities_enforced', facts_dict)
        self.assertEqual(facts_dict['system_capabilities'], ['foo', 'bar'])
        self.assertEqual(facts_dict['system_capabilities_enforced'], 'True')

if __name__ == '__main__':
    unittest.main()