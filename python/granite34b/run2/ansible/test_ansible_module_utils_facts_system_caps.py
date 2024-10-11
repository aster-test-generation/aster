import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect_with_module(self):
        module = MagicMock()
        module.get_bin_path.return_value = "capsh"
        collector = SystemCapabilitiesFactCollector()
        facts_dict = collector.collect(module)
        self.assertEqual(facts_dict["system_capabilities_enforced"], "False")
        self.assertEqual(facts_dict["system_capabilities"], [])

    def test_collect_without_module(self):
        collector = SystemCapabilitiesFactCollector()
        facts_dict = collector.collect()
        self.assertEqual(facts_dict, {})

if __name__ == '__main__':
    unittest.main()