import unittest
from ansible.module_utils.facts.hardware.freebsd import *


class TestFreeBSDHardware(unittest.TestCase):
    def test_populate(self):
        instance = FreeBSDHardware(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_get_cpu_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_cpu_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_uptime_facts()
        self.assertIsNotNone(result)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_mount_facts()
        self.assertIsNotNone(result)

    def test_get_device_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_device_facts()
        self.assertIsNotNone(result)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_dmi_facts()
        self.assertIsNotNone(result)

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = FreeBSDHardwareCollector()
        result = instance._fact_class
        self.assertEqual(result, FreeBSDHardware)

    def test_platform(self):
        instance = FreeBSDHardwareCollector()
        result = instance._platform
        self.assertEqual(result, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()