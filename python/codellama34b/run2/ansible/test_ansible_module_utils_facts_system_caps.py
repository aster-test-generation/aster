import unittest
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_name(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.name
        self.assertEqual(result, 'caps')

    def test_fact_ids(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'system_capabilities', 'system_capabilities_enforced'})

if __name__ == '__main__':
    unittest.main()