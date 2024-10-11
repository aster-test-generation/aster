import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_init(self):
        instance = HurdHardware()
        self.assertIsInstance(instance, HurdHardware)

    def test_platform(self):
        instance = HurdHardware()
        self.assertEqual(instance.platform, 'GNU')

    def test_populate(self):
        instance = HurdHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = HurdHardware()
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = HurdHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = HurdHardware()
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = HurdHardware()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HurdHardware()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HurdHardware()
        instance2 = HurdHardware()
        self.assertTrue(instance1 == instance2)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = HurdHardwareCollector()
        self.assertIsInstance(instance, HurdHardwareCollector)

    def test_fact_class(self):
        instance = HurdHardwareCollector()
        self.assertEqual(instance._fact_class, HurdHardware)

    def test_platform(self):
        instance = HurdHardwareCollector()
        self.assertEqual(instance._platform, 'GNU')

    def test_str_method(self):
        instance = HurdHardwareCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HurdHardwareCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HurdHardwareCollector()
        instance2 = HurdHardwareCollector()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()