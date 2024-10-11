import unittest
from ansible.module_utils.facts.system.caps import SystemCapabilitiesFactCollector


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_init(self):
        instance = SystemCapabilitiesFactCollector()
        self.assertIsInstance(instance, SystemCapabilitiesFactCollector)

    def test_name(self):
        instance = SystemCapabilitiesFactCollector()
        self.assertEqual(instance.name, 'caps')

    def test_fact_ids(self):
        instance = SystemCapabilitiesFactCollector()
        self.assertEqual(instance._fact_ids, set(['system_capabilities', 'system_capabilities_enforced']))

    def test_collect_no_module(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        instance = SystemCapabilitiesFactCollector()
        module = MockModule()  # mock module object
        result = instance.collect(module=module, collected_facts=None)
        self.assertIsInstance(result, dict)

    def test_collect_capsh_path_found(self):
        instance = SystemCapabilitiesFactCollector()
        module = MockModule(capsh_path='/path/to/capsh')  # mock module object
        result = instance.collect(module=module, collected_facts=None)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)

    def test_collect_capsh_path_not_found(self):
        instance = SystemCapabilitiesFactCollector()
        module = MockModule(capsh_path=None)  # mock module object
        result = instance.collect(module=module, collected_facts=None)
        self.assertEqual(result, {})

    def test_str_method(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.__str__()
        self.assertEqual(result, "SystemCapabilitiesFactCollector")

    def test_repr_method(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, "SystemCapabilitiesFactCollector()")

class MockModule:
    def __init__(self, capsh_path=None):
        self.capsh_path = capsh_path

    def get_bin_path(self, name):
        return self.capsh_path

    def run_command(self, args, errors='surrogate_then_replace'):
        return (0, 'Current: =ep\n', '')

if __name__ == '__main__':
    unittest.main()