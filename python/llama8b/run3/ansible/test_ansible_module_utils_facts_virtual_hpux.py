import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual(module='test')  # fixed
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_vecheck(self):
        instance = HPUXVirtual(module='test')  # fixed
        instance.module.run_command = lambda x: (0, 'Running HP vPar', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], 'guest')
        self.assertEqual(virtual_facts['virtualization_role'], 'HP vPar')

    def test_get_virtual_facts_with_hpvminfo(self):
        instance = HPUXVirtual(module='test')  # fixed
        instance.module.run_command = lambda x: (0, 'Running HPVM vPar', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], 'guest')
        self.assertEqual(virtual_facts['virtualization_role'], 'HPVM vPar')

    def test_get_virtual_facts_with_parstatus(self):
        instance = HPUXVirtual(module='test')  # fixed
        instance.module.run_command = lambda x: (0, 'Running HP nPar', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], 'guest')
        self.assertEqual(virtual_facts['virtualization_role'], 'HP nPar')

    def test_get_virtual_facts_without_vecheck_hpvminfo_parstatus(self):
        instance = HPUXVirtual(module='test')  # fixed
        instance.module.run_command = lambda x: (1, '', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertNotIn('virtualization_type', virtual_facts)
        self.assertNotIn('virtualization_role', virtual_facts)

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._fact_class, HPUXVirtual)
        self.assertEqual(instance._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()