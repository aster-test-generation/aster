import unittest
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], '')
        self.assertEqual(result['virtualization_role'], '')
        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_get_virtual_collector(self):
        instance = FreeBSDVirtualCollector()
        result = instance.get_virtual_collector()
        self.assertEqual(result._fact_class, FreeBSDVirtual)
        self.assertEqual(result._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()