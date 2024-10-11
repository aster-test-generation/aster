import unittest
from ansible.module_utils.facts.other.facter import *


class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        instance = FacterFactCollector()
        result = instance.find_facter(None)
        self.assertEqual(result, None)

    def test_run_facter(self):
        instance = FacterFactCollector()
        result = instance.run_facter(None, None)
        self.assertEqual(result, None)

    def test_get_facter_output(self):
        instance = FacterFactCollector()
        result = instance.get_facter_output(None)
        self.assertEqual(result, None)

    def test_collect(self):
        instance = FacterFactCollector()
        result = instance.collect(None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()