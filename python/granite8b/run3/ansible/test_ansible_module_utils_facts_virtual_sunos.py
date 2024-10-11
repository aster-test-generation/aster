import unittest
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual = SunOSVirtual(module)
        facts = virtual.get_virtual_facts()
        self.assertIsInstance(facts, dict)
        self.assertIn('platform', facts)
        self.assertEqual(facts['platform'], 'SunOS')
        self.assertIn('virtualization_type', facts)
        self.assertIn('virtualization_role', facts)
        self.assertIn('virtualization_tech_guest', facts)
        self.assertIn('virtualization_tech_host', facts)

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_get_virtual_collector(self):
        collector = SunOSVirtualCollector()
        self.assertIsInstance(collector, SunOSVirtualCollector)
        self.assertIsInstance(collector._virtual, SunOSVirtual)
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()