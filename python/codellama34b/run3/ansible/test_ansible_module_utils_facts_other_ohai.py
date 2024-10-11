import unittest
from ansible.module_utils.facts.other.ohai import *


class TestOhaiFactCollector(unittest.TestCase):
    def test_find_ohai(self):
        instance = OhaiFactCollector()
        result = instance.find_ohai(module=None)
        self.assertEqual(result, None)

    def test_run_ohai(self):
        instance = OhaiFactCollector()
        result = instance.run_ohai(module=None, ohai_path=None)
        self.assertEqual(result, (None, None, None))

    def test_get_ohai_output(self):
        instance = OhaiFactCollector()
        result = instance.get_ohai_output(module=None)
        self.assertEqual(result, None)

    def test_collect(self):
        instance = OhaiFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()