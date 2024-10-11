import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual = NetBSDVirtual(module=None)
        virtual_facts = virtual.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], '')
        self.assertEqual(virtual_facts['virtualization_role'], '')
        self.assertEqual(virtual_facts['virtualization_tech_guest'], set())
        self.assertEqual(virtual_facts['virtualization_tech_host'], set())

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_get_virtual_collector(self):
        collector = NetBSDVirtualCollector()
        self.assertEqual(collector._fact_class, NetBSDVirtual)
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()