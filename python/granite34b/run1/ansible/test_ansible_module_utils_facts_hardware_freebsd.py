import unittest
from ansible.module_utils.facts.hardware.freebsd import *


class TestFreeBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = FreeBSDHardware(module=None)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware(module=None)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('memtotal_mb', result)
        self.assertIn('memfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swapfree_mb', result)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware(module=None)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('uptime_seconds', result)

    def test_get_mount_facts(self):
        instance = Hardware(module=None)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('mounts', result)
        for mount in result['mounts']:
            self.assertIn('mount', mount)
            self.assertIn('device', mount)
            self.assertIn('fstype', mount)
            self.assertIn('options', mount)
            self.assertIn('size_total', mount)
            self.assertIn('size_available', mount)

    def test_get_device_facts(self):
        instance = FreeBSDHardware(module=None)
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('devices', result)
        for device, slices in result['devices'].items():
            self.assertIsInstance(device, str)
            self.assertIsInstance(slices, list)
            for slice in slices:
                self.assertIsInstance(slice, str)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware(module=None)
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('bios_date', result)
        self.assertIn('bios_vendor', result)
        self.assertIn('bios_version', result)
        self.assertIn('board_asset_tag', result)
        self.assertIn('board_name', result)
        self.assertIn('board_serial', result)
        self.assertIn('board_vendor', result)
        self.assertIn('board_version', result)
        self.assertIn('chassis_asset_tag', result)
        self.assertIn('chassis_serial', result)
        self.assertIn('chassis_vendor', result)
        self.assertIn('chassis_version', result)
        self.assertIn('form_factor', result)
        self.assertIn('product_name', result)
        self.assertIn('product_serial', result)
        self.assertIn('product_uuid', result)
        self.assertIn('product_version', result)
        self.assertIn('system_vendor', result)

if __name__ == '__main__':
    unittest.main()