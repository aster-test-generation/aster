import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector


class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware(module)
        hardware_facts = hardware.populate()
        self.assertIn('mounts', hardware_facts)
        self.assertIn('processor', hardware_facts)
        self.assertIn('processor_count', hardware_facts)
        self.assertIn('processor_cores', hardware_facts)
        self.assertIn('devices', hardware_facts)
        self.assertIn('product_name', hardware_facts)
        self.assertIn('product_version', hardware_facts)
        self.assertIn('product_uuid', hardware_facts)
        self.assertIn('product_serial', hardware_facts)
        self.assertIn('system_vendor', hardware_facts)
        self.assertIn('memfree_mb', hardware_facts)
        self.assertIn('memtotal_mb', hardware_facts)
        self.assertIn('swapfree_mb', hardware_facts)
        self.assertIn('swaptotal_mb', hardware_facts)
        self.assertIn('uptime_seconds', hardware_facts)

    def test_get_mount_facts(self):
        hardware = OpenBSDHardware(module)
        mount_facts = hardware.get_mount_facts()
        self.assertIn('mounts', mount_facts)
        self.assertGreater(len(mount_facts['mounts']), 0)
        for mount in mount_facts['mounts']:
            self.assertIn('mount', mount)
            self.assertIn('device', mount)
            self.assertIn('fstype', mount)
            self.assertIn('options', mount)
            self.assertIn('size_total', mount)
            self.assertIn('size_available', mount)
            self.assertIn('use_percent', mount)
            self.assertIn('mount_type', mount)

    def test_get_memory_facts(self):
        hardware = OpenBSDHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('memtotal_mb', memory_facts)

    def test_get_uptime_facts(self):
        hardware = OpenBSDHardware(module)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIn('uptime_seconds', uptime_facts)

    def test_get_processor_facts(self):
        hardware = OpenBSDHardware(module)
        processor_facts = hardware.get_processor_facts()
        self.assertIn('processor', processor_facts)
        self.assertIn('processor_count', processor_facts)
        self.assertIn('processor_cores', processor_facts)

    def test_get_device_facts(self):
        hardware = OpenBSDHardware(module)
        device_facts = hardware.get_device_facts()
        self.assertIn('devices', device_facts)

    def test_get_dmi_facts(self):
        hardware = OpenBSDHardware(module)
        dmi_facts = hardware.get_dmi_facts()
        self.assertIn('product_name', dmi_facts)
        self.assertIn('product_version', dmi_facts)
        self.assertIn('product_uuid', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('system_vendor', dmi_facts)

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = OpenBSDHardwareCollector()
        hardware_facts = collector.collect()
        self.assertIn('mounts', hardware_facts.keys())
        self.assertIn('processor', hardware_facts)
        self.assertIn('processor_count', hardware_facts)
        self.assertIn('processor_cores', hardware_facts)
        self.assertIn('devices', hardware_facts)
        self.assertIn('product_name', hardware_facts)
        self.assertIn('product_version', hardware_facts)
        self.assertIn('product_uuid', hardware_facts)
        self.assertIn('product_serial', hardware_facts)
        self.assertIn('system_vendor', hardware_facts)
        self.assertIn('memfree_mb', hardware_facts)
        self.assertIn('memtotal_mb', hardware_facts)
        self.assertIn('swapfree_mb', hardware_facts)
        self.assertIn('swaptotal_mb', hardware_facts)
        self.assertIn('uptime_seconds', hardware_facts)

if __name__ == '__main__':
    unittest.main()