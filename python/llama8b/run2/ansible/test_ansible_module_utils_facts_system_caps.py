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
        module.get_bin_path.return_value = 'capsh'
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_capsh_output(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = 'capsh'
        module.run_command.return_value = (0, 'Current=ep\n', '')
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {'system_capabilities_enforced': 'True', 'system_capabilities': ['ep']})

    def test_collect_with_capsh_error(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = 'capsh'
        module.run_command.return_value = (1, '', 'Error')
        facts_dict = collector.collect(module=module, collected_facts=None)
        self.assertEqual(facts_dict, {})

    def test_collect_with_no_capsh(self):
        collector = SystemCapabilitiesFactCollector()
        module = object()
        module.get_bin_path.return_value = None
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

if __name__ == '__main__':
    unittest.main()