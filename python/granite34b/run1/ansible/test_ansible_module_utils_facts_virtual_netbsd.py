import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual(module=None)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_collect_facts(self):
        instance = NetBSDVirtualCollector()
        result = self.collect_facts()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()