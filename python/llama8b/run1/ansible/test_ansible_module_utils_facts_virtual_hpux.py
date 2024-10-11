import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual(module='test')  # Fixed
        virtual_facts = instance.get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)

    def test_get_virtual_facts_vecheck(self):
        instance = HPUXVirtual(module='test')  # Fixed
        rc, out, err = instance.module.run_command("/usr/sbin/vecheck")
        instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)

    def test_get_virtual_facts_hpvminfo(self):
        instance = HPUXVirtual(module='test')  # Fixed
        rc, out, err = instance.module.run_command("/opt/hpvm/bin/hpvminfo")
        instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)

    def test_get_virtual_facts_parstatus(self):
        instance = HPUXVirtual(module='test')  # Fixed
        rc, out, err = instance.module.run_command("/usr/sbin/parstatus")
        instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)

    def test_get_virtual_facts_no_vecheck(self):
        instance = HPUXVirtual(module='test')  # Fixed
        instance.module.run_command = lambda x: (0, '', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertNotIn('virtualization_type', virtual_facts)
        self.assertNotIn('virtualization_role', virtual_facts)

    def test_get_virtual_facts_no_hpvminfo(self):
        instance = HPUXVirtual(module='test')  # Fixed
        instance.module.run_command = lambda x: (0, '', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertNotIn('virtualization_type', virtual_facts)
        self.assertNotIn('virtualization_role', virtual_facts)

    def test_get_virtual_facts_no_parstatus(self):
        instance = HPUXVirtual(module='test')  # Fixed
        instance.module.run_command = lambda x: (0, '', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertNotIn('virtualization_type', virtual_facts)
        self.assertNotIn('virtualization_role', virtual_facts)

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._fact_class, HPUXVirtual)

    def test_get_platform(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()