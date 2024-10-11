import unittest
from ansible.module_utils.facts.system.lsb import *
from ansible.module_utils.facts.system.lsb import LSBFactCollector


class TestLSBFactCollector(unittest.TestCase):
    def test_lsb_release_bin(self):
        instance = LSBFactCollector()
        result = instance._lsb_release_bin(module.get_bin_path('lsb_release', True), module)
        self.assertEqual(result, lsb_facts)

    def test_lsb_release_file(self):
        instance = LSBFactCollector()
        result = instance._lsb_release_file('/etc/lsb-release')
        self.assertEqual(result, lsb_facts)

    def test_collect(self):
        instance = LSBFactCollector()
        result = instance.collect(module, collected_facts)
        self.assertEqual(result, facts_dict)

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

if __name__ == '__main__':
    unittest.main()