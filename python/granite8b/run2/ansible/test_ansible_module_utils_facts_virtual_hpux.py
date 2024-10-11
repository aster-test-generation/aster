import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual = HPUXVirtual(module=None)
        virtual_facts = virtual.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], 'kvm')
        self.assertEqual(virtual_facts['virtualization_role'], 'HP vPar')

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_get_virtual_collector(self):
        collector = HPUXVirtualCollector()
        self.assertEqual(collector._fact_class, HPUXVirtual)
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()