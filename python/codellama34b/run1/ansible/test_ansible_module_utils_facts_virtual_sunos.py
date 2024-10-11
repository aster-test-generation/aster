import unittest
from ansible.module_utils.facts.virtual.sunos import *


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = SunOSVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsNotNone(result)

    def test_platform(self):
        instance = SunOSVirtual(module)
        result = instance.platform
        self.assertEqual(result, 'SunOS')

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = SunOSVirtualCollector()
        result = instance._fact_class
        self.assertEqual(result, SunOSVirtual)

    def test_platform(self):
        instance = SunOSVirtualCollector()
        result = instance._platform
        self.assertEqual(result, 'SunOS')

if __name__ == '__main__':
    unittest.main()