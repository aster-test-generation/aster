import unittest
from ansible.module_utils.facts.virtual import LinuxVirtualCollecto


class TestLinuxVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = LinuxVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_private_method(self):
        instance = LinuxVirtual()
        virtual_facts = instance._get_virtual_facts_private()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_protected_method(self):
        instance = LinuxVirtual()
        virtual_facts = instance._get_virtual_facts_protected()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_init_method(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_str_method(self):
        instance = LinuxVirtual()
        result = str(instance)
        self.assertEqual(result, "LinuxVirtual")

    def test_repr_method(self):
        instance = LinuxVirtual()
        result = repr(instance)
        self.assertEqual(result, "LinuxVirtual()")

    def test_eq_method(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        self.assertTrue(instance1 == instance2)

    def test_ne_method(self):
        instance1 = LinuxVirtual()
        instance2 = object()
        self.assertTrue(instance1 != instance2)

if __name__ == '__main__':
    unittest.main()