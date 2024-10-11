import unittest
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = SunOSVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test___init__(self):
        instance = SunOSVirtual()
        self.assertIsInstance(instance, SunOSVirtual)

    def test_platform(self):
        instance = SunOSVirtual()
        self.assertEqual(instance.platform, 'SunOS')

    def test___str__(self):
        instance = SunOSVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'SunOSVirtual')

    def test___repr__(self):
        instance = SunOSVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'SunOSVirtual()')

class TestSunOSVirtualCollector(unittest.TestCase):
    def test___init__(self):
        instance = SunOSVirtualCollector()
        self.assertIsInstance(instance, SunOSVirtualCollector)

    def test_fact_class(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._fact_class, SunOSVirtual)

    def test_platform(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._platform, 'SunOS')

    def test___str__(self):
        instance = SunOSVirtualCollector()
        result = instance.__str__()
        self.assertEqual(result, 'SunOSVirtualCollector')

    def test___repr__(self):
        instance = SunOSVirtualCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'SunOSVirtualCollector()')

if __name__ == '__main__':
    unittest.main()