import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], '')
        self.assertEqual(result['virtualization_role'], '')
        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_collect(self):
        instance = OpenBSDVirtualCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertEqual(result['ansible_virtualization_type'], 'docker')
        self.assertEqual(result['ansible_virtualization_role'], '')
        self.assertEqual(result['ansible_virtualization_tech_guest'], [])
        self.assertEqual(result['ansible_virtualization_tech_host'], [])

if __name__ == '__main__':
    unittest.main()