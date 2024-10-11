import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector


class TestSunOSHardware(unittest.TestCase):
    def test_init(self):
        instance = SunOSHardware(None)
        self.assertIsInstance(instance, SunOSHardware)

    def test_populate(self):
        instance = SunOSHardware(None)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = SunOSHardware(None)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__get_best_parsable_locale(self):
        instance = SunOSHardware(None)
        result = instance._SunOSHardware__get_best_parsable_locale(None)
        self.assertIsInstance(result, str)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = SunOSHardwareCollector(None)
        self.assertIsInstance(instance, SunOSHardwareCollector)

    def test_fact_class(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance._fact_class, SunOSHardware)

    def test_platform(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance._platform, 'SunOS')

    def test_required_facts(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance.required_facts, set(['platform']))

if __name__ == '__main__':
    unittest.main()