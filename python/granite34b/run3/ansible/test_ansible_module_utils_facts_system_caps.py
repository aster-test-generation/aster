import unittest
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect_with_module(self):
        from unittest.mock import MagicMock
        module.get_bin_path.return_value = 'capsh'
        rc = 0
        out = 'Current: =ep\n'
        err = ''
        module.run_command.return_value = (rc, out, err)
        facts_dict = SystemCapabilitiesFactCollector().collect(module=module)
        self.assertEqual(facts_dict, {'system_capabilities_enforced': 'False', 'system_capabilities': []})

    def test_collect_without_module(self):
        facts_dict = SystemCapabilitiesFactCollector().collect()
        self.assertEqual(facts_dict, {})

if __name__ == '__main__':
    unittest.main()