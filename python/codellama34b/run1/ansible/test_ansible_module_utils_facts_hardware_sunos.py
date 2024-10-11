import unittest
from ansible.module_utils.facts.hardware.sunos import *



class TestSunOSHardware(unittest.TestCase):
    def test_populate(self):
        instance = SunOSHardware(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_get_cpu_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_cpu_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_mount_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_mount_facts()
        self.assertIsNotNone(result)

    def test_get_dmi_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_dmi_facts()
        self.assertIsNotNone(result)

    def test_get_device_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_device_facts()
        self.assertIsNotNone(result)

    def test_get_uptime_facts(self):
        instance = SunOSHardware(module)
        result = instance.get_uptime_facts()
        self.assertIsNotNone(result)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = SunOSHardwareCollector()
        self.assertEqual(instance._fact_class, SunOSHardware)

    def test_platform(self):
        instance = SunOSHardwareCollector()
        self.assertEqual(instance._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()