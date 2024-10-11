import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_vecheck(self):
        instance = HPUXVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_hpvminfo(self):
        instance = HPUXVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_parstatus(self):
        instance = HPUXVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._fact_class, HPUXVirtual)

    def test_get_platform(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()