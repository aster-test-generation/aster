import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollecto


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

    def test_get_virtual_facts_magic_method_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_get_virtual_facts_magic_method_str(self):
        instance = LinuxVirtual()
        self.assertEqual(str(instance), "LinuxVirtual")

    def test_get_virtual_facts_magic_method_repr(self):
        instance = LinuxVirtual()
        self.assertEqual(repr(instance), "LinuxVirtual({})".format(instance.get_virtual_facts()))

    def test_get_virtual_facts_magic_method_eq(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        self.assertEqual(instance1, instance2)

    def test_get_virtual_facts_magic_method_ne(self):
        instance1 = LinuxVirtual()
        instance2 = object()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()