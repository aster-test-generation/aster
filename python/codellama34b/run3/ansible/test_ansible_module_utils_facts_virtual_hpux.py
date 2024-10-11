import unittest
from ansible.module_utils.facts.virtual.hpux import *


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual(module)
        result = instance.get_virtual_facts()
        self.assertEqual(result, {})

    def test_platform(self):
        instance = HPUXVirtual(module)
        result = instance.platform
        self.assertEqual(result, 'HP-UX')

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = HPUXVirtualCollector()
        result = instance._fact_class
        self.assertEqual(result, HPUXVirtual)

    def test_platform(self):
        instance = HPUXVirtualCollector()
        result = instance._platform
        self.assertEqual(result, 'HP-UX')

if __name__ == '__main__':
    unittest.main()