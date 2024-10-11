import unittest
from ansible.module_utils.facts.facts import SystemFacts


class TestSystemCapabilitiesFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)

    def test_collect_with_module(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect(module=None)
        self.assertIsInstance(result, dict)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)

    def test_collect_with_module_and_capsh_path(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect(module=None, capsh_path='capsh')
        self.assertIsInstance(result, dict)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)

    def test_collect_with_module_and_capsh_path_and_out(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect(module=None, capsh_path='capsh', out='Current: =ep')
        self.assertIsInstance(result, dict)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)
        self.assertEqual(result['system_capabilities_enforced'], 'False')
        self.assertEqual(result['system_capabilities'], [])

    def test_collect_with_module_and_capsh_path_and_out_and_enforced(self):
        instance = SystemCapabilitiesFactCollector()
        result = instance.collect(module=None, capsh_path='capsh', out='Current: =ep', enforced='True')
        self.assertIsInstance(result, dict)
        self.assertIn('system_capabilities_enforced', result)
        self.assertIn('system_capabilities', result)
        self.assertEqual(result['system_capabilities_enforced'], 'True')
        self.assertEqual(result['system_capabilities'], [])

if __name__ == '__main__':
    unittest.main()