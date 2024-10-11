import unittest
from ansible.module_utils.facts.system.lsb import *


class TestLSBFactCollector(unittest.TestCase):
    def test_lsb_release_bin(self):
        instance = LSBFactCollector()
        result = instance._lsb_release_bin(None, None)
        self.assertEqual(result, {})

    def test_lsb_release_file(self):
        instance = LSBFactCollector()
        result = instance._lsb_release_file(None)
        self.assertEqual(result, {})

    def test_collect(self):
        instance = LSBFactCollector()
        result = instance.collect(None, None)
        self.assertEqual(result, {})

class TestLSBFactCollector(unittest.TestCase):
    def test_lsb_release_bin(self):
        lsb_path = "lsb_path"
        module = "module"
        result = LSBFactCollector._lsb_release_bin(lsb_path, module)
        self.assertEqual(result, {})

    def test_lsb_release_file(self):
        etc_lsb_release_location = "etc_lsb_release_location"
        result = LSBFactCollector._lsb_release_file(etc_lsb_release_location)
        self.assertEqual(result, {})

    def test_collect(self):
        module = "module"
        collected_facts = "collected_facts"
        result = LSBFactCollector.collect(module, collected_facts)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()