import unittest
from ansible.module_utils.facts.hardware.freebsd import *


class TestFreeBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        cpu_facts = FreeBSDHardware.get_cpu_facts(self)
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        memory_facts = FreeBSDHardware.get_memory_facts(self)
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_uptime_facts(self):
        uptime_facts = FreeBSDHardware.get_uptime_facts(self)
        self.assertIsInstance(uptime_facts, dict)
        self.assertIn('uptime_seconds', uptime_facts)

    def test_get_mount_facts(self):
        mount_facts = FreeBSDHardware.get_mount_facts(self)
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)
        self.assertIsInstance(mount_facts['mounts'], list)

    def test_get_device_facts(self):
        device_facts = FreeBSDHardware.get_device_facts(self)
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)
        self.assertIsInstance(device_facts['devices'], dict)

    def test_get_dmi_facts(self):
        dmi_facts = FreeBSDHardware.get_dmi_facts(self)
        self.assertIsInstance(dmi_facts, dict)
        self.assertIn('bios_date', dmi_facts)
        self.assertIn('bios_vendor', dmi_facts)
        self.assertIn('bios_version', dmi_facts)
        self.assertIn('board_asset_tag', dmi_facts)
        self.assertIn('board_name', dmi_facts)
        self.assertIn('board_serial', dmi_facts)
        self.assertIn('board_vendor', dmi_facts)
        self.assertIn('board_version', dmi_facts)
        self.assertIn('chassis_asset_tag', dmi_facts)
        self.assertIn('chassis_serial', dmi_facts)
        self.assertIn('chassis_vendor', dmi_facts)
        self.assertIn('chassis_version', dmi_facts)
        self.assertIn('form_factor', dmi_facts)
        self.assertIn('product_name', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('product_uuid', dmi_facts)
        self.assertIn('product_version', dmi_facts)
        self.assertIn('system_vendor', dmi_facts)

if __name__ == '__main__':
    unittest.main()