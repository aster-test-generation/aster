import unittest
from ansible.module_utils.facts.hardware.freebsd import *


class TestFreeBSDHardware(unittest.TestCase):
    def test_populate(self):
        instance = FreeBSDHardware(module)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware(module)
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._fact_class, FreeBSDHardware)

    def test_platform(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()