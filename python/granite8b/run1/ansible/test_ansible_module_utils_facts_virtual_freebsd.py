import unittest
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual(module=None)
        result = instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], '')
        self.assertEqual(result['virtualization_role'], '')
        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_collect(self):
        instance = FreeBSDVirtualCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertEqual(result['virtualization_type'], '')
        self.assertEqual(result['virtualization_role'], '')
        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

if __name__ == '__main__':
    unittest.main()