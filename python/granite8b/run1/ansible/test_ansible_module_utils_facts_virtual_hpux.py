import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual = HPUXVirtual(module=None)
        virtual_facts = virtual.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], 'kvm')
        self.assertEqual(virtual_facts['virtualization_role'], 'HP vPar')
        self.assertEqual(virtual_facts['virtualization_tech_guest'], {'HP vPar'})
        self.assertEqual(virtual_facts['virtualization_tech_host'], set())

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_collect(self):
        collector = HPUXVirtualCollector()
        facts = collector.collect()
        self.assertEqual(facts['virtualization_type'], 'guest')
        self.assertEqual(facts['virtualization_role'], 'HP vPar')
        self.assertEqual(facts['virtualization_tech_guest'], {'HP vPar'})
        self.assertEqual(facts['virtualization_tech_host'], set())

if __name__ == '__main__':
    unittest.main()