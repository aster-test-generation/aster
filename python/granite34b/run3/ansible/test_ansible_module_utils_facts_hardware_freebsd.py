import unittest
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware


class TestFreeBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = FreeBSDHardware(module=None)
        cpu_facts = instance.get_cpu_facts()
        self.assertTrue('processor' in cpu_facts)
        self.assertTrue('processor_count' in cpu_facts)
        self.assertTrue('processor_cores' in cpu_facts)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware(module=None)
        memory_facts = instance.get_memory_facts()
        self.assertTrue('memtotal_mb' in memory_facts)
        self.assertTrue('memfree_mb' in memory_facts)
        self.assertTrue('swaptotal_mb' in memory_facts)
        self.assertTrue('swapfree_mb' in memory_facts)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware(module=None)
        uptime_facts = instance.get_uptime_facts()
        self.assertTrue('uptime_seconds' in uptime_facts)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware(module=None)
        mount_facts = instance.get_mount_facts()
        self.assertTrue('mounts' in mount_facts)

    def test_get_device_facts(self):
        instance = FreeBSDHardware(module=None)
        device_facts = instance.get_device_facts()
        self.assertTrue('devices' in device_facts)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware(module=None)
        dmi_facts = instance.get_dmi_facts()
        self.assertTrue('bios_date' in dmi_facts)
        self.assertTrue('bios_vendor' in dmi_facts)
        self.assertTrue('bios_version' in dmi_facts)
        self.assertTrue('board_asset_tag' in dmi_facts)
        self.assertTrue('board_name' in dmi_facts)
        self.assertTrue('board_serial' in dmi_facts)
        self.assertTrue('board_vendor' in dmi_facts)
        self.assertTrue('board_version' in dmi_facts)
        self.assertTrue('chassis_asset_tag' in dmi_facts)
        self.assertTrue('chassis_serial' in dmi_facts)
        self.assertTrue('chassis_vendor' in dmi_facts)
        self.assertTrue('chassis_version' in dmi_facts)
        self.assertTrue('form_factor' in dmi_facts)
        self.assertTrue('product_name' in dmi_facts)
        self.assertTrue('product_serial' in dmi_facts)
        self.assertTrue('product_uuid' in dmi_facts)
        self.assertTrue('product_version' in dmi_facts)
        self.assertTrue('system_vendor' in dmi_facts)

if __name__ == '__main__':
    unittest.main()