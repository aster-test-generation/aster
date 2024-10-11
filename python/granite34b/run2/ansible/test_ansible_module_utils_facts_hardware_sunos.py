import unittest
from ansible.module_utils.facts.hardware.sunos import *


class TestSunOSHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)

    def test_get_memory_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('memtotal_mb', result)
        self.assertIn('swapfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swap_allocated_mb', result)
        self.assertIn('swap_reserved_mb', result)

    def test_get_mount_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('mounts', result)

    def test_get_dmi_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('system_vendor', result)
        self.assertIn('product_name', result)

    def test_get_device_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('devices', result)

    def test_get_uptime_facts(self):
        instance = SunOSHardware(module=None)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('uptime_seconds', result)

if __name__ == '__main__':
    unittest.main()