import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'vmm')
        self.assertEqual(result['virtualization_role'], 'host')
        self.assertEqual(result['virtualization_tech_guest'], {'vmm'})
        self.assertEqual(result['virtualization_tech_host'], {'vmm'})

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_collect(self):
        instance = OpenBSDVirtualCollector()
        result = instance.collect()
        self.assertEqual(result['virtualization_type'], 'hvm')
        self.assertEqual(result['virtualization_role'], 'host')
        self.assertEqual(result['virtualization_tech_guest'], {'vmm'})
        self.assertEqual(result['virtualization_tech_host'], {'vmm'})

if __name__ == '__main__':
    unittest.main()