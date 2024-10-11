import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = OpenBSDVirtual(module=None).get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

if __name__ == '__main__':
    unittest.main()