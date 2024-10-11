import unittest
from ansible.module_utils.facts.other.facter import *


class TestFacterFactCollector(unittest.TestCase):
    def test_init(self):
        instance = FacterFactCollector()
        self.assertIsInstance(instance, FacterFactCollector)

    def test_find_facter(self):
        instance = FacterFactCollector()
        result = instance.find_facter(None)
        self.assertIsNone(result)

    def test_run_facter(self):
        instance = FacterFactCollector()
        result = instance.run_facter(None, None)
        self.assertIsNone(result)

    def test_get_facter_output(self):
        instance = FacterFactCollector()
        result = instance.get_facter_output(None)
        self.assertIsNone(result)

    def test_collect(self):
        instance = FacterFactCollector()
        result = instance.collect(None)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()