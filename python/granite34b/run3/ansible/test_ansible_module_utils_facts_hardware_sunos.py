import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector


class TestSunOSHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        hardware = SunOSHardware(module=None)
        cpu_facts = hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        hardware = SunOSHardware(module=None)
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swap_allocated_mb', memory_facts)
        self.assertIn('swap_reserved_mb', memory_facts)

    def test_get_mount_facts(self):
        hardware = SunOSHardware(module=None)
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)

    def test_get_dmi_facts(self):
        hardware = SunOSHardware(module=None)
        dmi_facts = hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)
        self.assertIn('system_vendor', dmi_facts)
        self.assertIn('product_name', dmi_facts)

    def test_get_device_facts(self):
        hardware = SunOSHardware(module=None)
        device_facts = hardware.get_device_facts()
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)

    def test_get_uptime_facts(self):
        hardware = SunOSHardware(module=None)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)
        self.assertIn('uptime_seconds', uptime_facts)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_populate(self):
        collector = SunOSHardwareCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('ansible_processor', result)
        self.assertIn('ansible_processor_count', result)
        self.assertIn('ansible_processor_cores', result)
        self.assertIn('memtotal_mb', result)
        self.assertIn('swapfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swap_allocated_mb', result)
        self.assertIn('swap_reserved_mb', result)
        self.assertIn('mounts', result)
        self.assertIn('system_vendor', result)
        self.assertIn('product_name', result)
        self.assertIn('devices', result)
        self.assertIn('uptime_seconds', result)

if __name__ == '__main__':
    unittest.main()