import unittest
from ansible.module_utils.facts.virtual.sunos import *


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = SunOSVirtual(module=None).get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)
        self.assertIsInstance(virtual_facts['virtualization_tech_guest'], set)
        self.assertIsInstance(virtual_facts['virtualization_tech_host'], set)

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_collect_facts(self):
        collector = SunOSVirtualCollector()
        facts = collector.collect_facts(self.host)
        self.assertIsInstance(facts, dict)
        self.assertIn('virtualization_tech_guest', facts)
        self.assertIn('virtualization_tech_host', facts)
        self.assertIsInstance(facts['virtualization_tech_guest'], set)
        self.assertIsInstance(facts['virtualization_tech_host'], set)

if __name__ == '__main__':
    unittest.main()