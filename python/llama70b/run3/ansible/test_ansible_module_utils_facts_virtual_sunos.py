import unittest
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def test_init(self):
        instance = SunOSVirtual()
        self.assertIsInstance(instance, SunOSVirtual)

    def test_get_virtual_facts(self):
        instance = SunOSVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_platform(self):
        instance = SunOSVirtual()
        self.assertEqual(instance.platform, 'SunOS')

    def test__init__(self):
        instance = SunOSVirtual()
        self.assertIsInstance(instance, SunOSVirtual)

    def test__str__(self):
        instance = SunOSVirtual()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = SunOSVirtual()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = SunOSVirtualCollector()
        self.assertIsInstance(instance, SunOSVirtualCollector)

    def test_fact_class(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._fact_class, SunOSVirtual)

    def test_platform(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._platform, 'SunOS')

    def test__init__(self):
        instance = SunOSVirtualCollector()
        self.assertIsInstance(instance, SunOSVirtualCollector)

    def test__str__(self):
        instance = SunOSVirtualCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = SunOSVirtualCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()