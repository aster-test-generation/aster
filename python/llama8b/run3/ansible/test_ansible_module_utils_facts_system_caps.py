import unittest
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = SystemCapabilitiesFactCollector()
        facts_dict = collector.collect(module=None, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_module(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_capsh_path(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = 'capsh_path'
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_capsh_output(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = 'capsh_path'
        module.run_command.return_value = (0, 'Current=ep\n', '')
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {'system_capabilities_enforced': 'True', 'system_capabilities': ['ep']})

    def test_collect_with_capsh_error(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = 'capsh_path'
        module.run_command.return_value = (1, '', 'Error')
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_str_method(self):
        collector = SystemCapabilitiesFactCollector()
        result = str(collector)
        self.assertEqual(result, 'SystemCapabilitiesFactCollector')

    def test_repr_method(self):
        collector = SystemCapabilitiesFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'SystemCapabilitiesFactCollector()')

    def test_eq_method(self):
        collector1 = SystemCapabilitiesFactCollector()
        collector2 = SystemCapabilitiesFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()