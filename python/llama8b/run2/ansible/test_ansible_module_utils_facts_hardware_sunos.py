import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector


class TestSunOSHardware(unittest.TestCase):
    def test_populate(self):
        instance = SunOSHardware()
        collected_facts = {}
        result = instance.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = SunOSHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = SunOSHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = SunOSHardware()
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = SunOSHardware()
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        instance = SunOSHardware()
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = SunOSHardware()
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = SunOSHardware()
        result = instance.__str__()
        self.assertEqual(result, "SunOSHardware")

    def test_repr_method(self):
        instance = SunOSHardware()
        result = instance.__repr__()
        self.assertEqual(result, "SunOSHardware()")

    def test_eq_method(self):
        instance1 = SunOSHardware()
        instance2 = SunOSHardware()
        self.assertTrue(instance1 == instance2)

    def test_init_method(self):
        instance = SunOSHardware()
        self.assertIsInstance(instance, SunOSHardware)

if __name__ == '__main__':
    unittest.main()