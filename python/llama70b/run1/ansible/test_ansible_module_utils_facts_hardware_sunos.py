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

    def test__str__(self):
        instance = SunOSHardware(None)
        result = instance.__str__()
        self.assertEqual(result, "SunOSHardware")

    def test__repr__(self):
        instance = SunOSHardware(None)
        result = instance.__repr__()
        self.assertEqual(result, "SunOSHardware({})".format(instance.platform))

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = SunOSHardwareCollector(None)
        self.assertIsInstance(instance, SunOSHardwareCollector)

    def test__fact_class(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance._fact_class, SunOSHardware)

    def test__platform(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance._platform, 'SunOS')

    def test_required_facts(self):
        instance = SunOSHardwareCollector(None)
        self.assertEqual(instance.required_facts, set(['platform']))

if __name__ == '__main__':
    unittest.main()