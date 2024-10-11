import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_get_uptime_facts(self):
        instance = HurdHardware()
        result = instance.get_uptime_facts()
        self.assertEqual(result, {})

    def test_get_memory_facts(self):
        instance = HurdHardware()
        result = instance.get_memory_facts()
        self.assertEqual(result, {})

    def test_get_mount_facts(self):
        instance = HurdHardware()
        result = instance.get_mount_facts()
        self.assertEqual(result, {})

    def test_populate(self):
        instance = HurdHardware()
        result = instance.populate()
        self.assertEqual(result, {})

    def test_str_method(self):
        instance = HurdHardware()
        result = instance.__str__()
        self.assertEqual(result, 'HurdHardware')

    def test_repr_method(self):
        instance = HurdHardware()
        result = instance.__repr__()
        self.assertEqual(result, 'HurdHardware()')

class TestHurdHardwareCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = HurdHardwareCollector()
        result = instance._fact_class
        self.assertEqual(result, HurdHardware)

    def test_get_platform(self):
        instance = HurdHardwareCollector()
        result = instance._platform
        self.assertEqual(result, 'GNU')

if __name__ == '__main__':
    unittest.main()