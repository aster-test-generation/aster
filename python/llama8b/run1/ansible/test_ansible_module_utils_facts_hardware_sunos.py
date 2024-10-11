import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector


class TestSunOSHardware(unittest.TestCase):
    def test_populate(self):
        hardware = SunOSHardware()
        collected_facts = {}
        result = hardware.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        hardware = SunOSHardware()
        result = hardware.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        hardware = SunOSHardware()
        result = str(hardware)
        self.assertEqual(result, "SunOSHardware")

    def test_repr_method(self):
        hardware = SunOSHardware()
        result = repr(hardware)
        self.assertEqual(result, "SunOSHardware({})".format(hardware.method_one(0)))

    def test_eq_method(self):
        hardware1 = SunOSHardware()
        hardware2 = SunOSHardware()
        self.assertEqual(hardware1, hardware2)

    def test_private_method(self):
        hardware = SunOSHardware()
        result = hardware._SunOSHardware__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        hardware = SunOSHardware()
        result = hardware._protected_method(3)
        self.assertEqual(result, 6)

    def test_method_one(self):
        hardware = SunOSHardware()
        result = hardware.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        hardware = SunOSHardware()
        result = hardware.method_two(2)
        self.assertEqual(result, 4)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_required_facts(self):
        collector = SunOSHardwareCollector()
        self.assertEqual(collector.required_facts, {'platform'})

if __name__ == '__main__':
    unittest.main()