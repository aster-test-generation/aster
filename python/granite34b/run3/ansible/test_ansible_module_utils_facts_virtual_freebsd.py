import unittest
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = FreeBSDVirtual(module=None).get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_collect_facts(self):
        virtual_facts = FreeBSDVirtualCollector().collect_facts()
        self.assertIsInstance(virtual_facts, dict)

if __name__ == '__main__':
    unittest.main()