import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual = NetBSDVirtual(module=None)
        facts = virtual.get_virtual_facts()
        self.assertEqual(facts['virtualization_type'], '')
        self.assertEqual(facts['virtualization_role'], '')
        self.assertEqual(facts['virtualization_tech_guest'], set())
        self.assertEqual(facts['virtualization_tech_host'], set())

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_collect(self):
        collector = NetBSDVirtualCollector()
        facts = collector.collect()
        self.assertEqual(facts['virtualization_type'], '')
        self.assertEqual(facts['virtualization_role'], '')
        self.assertEqual(facts['virtualization_tech_guest'], set())
        self.assertEqual(facts['virtualization_tech_host'], set())

if __name__ == '__main__':
    unittest.main()