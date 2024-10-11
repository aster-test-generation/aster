import unittest
from unittest.mock import Mock
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector

class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = SystemCapabilitiesFactCollector()

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

    def test_collect_with_module_no_capsh(self):
        module = Mock()
        module.get_bin_path.return_value = None
        result = self.collector.collect(module=module)
        self.assertEqual(result, {})

    def test_collect_with_module_with_capsh(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/capsh'
        module.run_command.return_value = (0, "Current: =ep\n", "")
        result = self.collector.collect(module=module)
        self.assertEqual(result['system_capabilities_enforced'], 'False')
        self.assertEqual(result['system_capabilities'], [])

    def test_collect_with_module_with_capsh_enforced(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/capsh'
        module.run_command.return_value = (0, "Current: cap_net_bind_service=ep\n", "")
        result = self.collector.collect(module=module)
        self.assertEqual(result['system_capabilities_enforced'], 'True')
        self.assertEqual(result['system_capabilities'], ['ep'])

    def test_name(self):
        self.assertEqual(self.collector.name, 'caps')

    def test_fact_ids(self):
        self.assertEqual(self.collector._fact_ids, {'system_capabilities', 'system_capabilities_enforced'})

if __name__ == '__main__':
    unittest.main()