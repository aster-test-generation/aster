import unittest
from ansible.module_utils.facts.hardware.sunos import (
    SunOSHardware,
    SunOSHardwareCollector,
)


class TestSunOSHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = SunOSHardware()
        cpu_facts = instance.get_cpu_facts()
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        instance = SunOSHardware()
        memory_facts = instance.get_memory_facts()
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swap_allocated_mb', memory_facts)
        self.assertIn('swap_reserved_mb', memory_facts)

    def test_get_mount_facts(self):
        instance = SunOSHardware()
        mount_facts = instance.get_mount_facts()
        self.assertIn('mounts', mount_facts)

    def test_get_dmi_facts(self):
        instance = SunOSHardware()
        dmi_facts = instance.get_dmi_facts()
        self.assertIn('system_vendor', dmi_facts)
        self.assertIn('product_name', dmi_facts)

    def test_get_device_facts(self):
        instance = SunOSHardware()
        device_facts = instance.get_device_facts()
        self.assertIn('devices', device_facts)

    def test_get_uptime_facts(self):
        instance = SunOSHardware()
        uptime_facts = instance.get_uptime_facts()
        self.assertIn('uptime_seconds', uptime_facts)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_populate(self):
        instance = SunOSHardwareCollector()
        hardware_facts = instance.populate()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()