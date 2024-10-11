import unittest
from ansible.module_utils.facts.virtual.freebsd import *


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual(module=None)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_collect(self):
        instance = FreeBSDVirtualCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('virtualization_type', result.keys())
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

if __name__ == '__main__':
    unittest.main()