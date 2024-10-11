import unittest
from ansible.module_utils.facts.facts import Hardware, HardwareCollector
from ansible.module_utils.facts.facts import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        cpu_facts = FreeBSDHardware().get_cpu_facts()
        self.assertEqual(cpu_facts['processor_count'], '1')
        self.assertEqual(cpu_facts['processor'], ['cpu0'])
        self.assertEqual(cpu_facts['processor_cores'], '1')

    def test_get_memory_facts(self):
        memory_facts = FreeBSDHardware().get_memory_facts()
        self.assertEqual(memory_facts['memtotal_mb'], 1024)
        self.assertEqual(memory_facts['memfree_mb'], 768)
        self.assertEqual(memory_facts['swaptotal_mb'], 0)
        self.assertEqual(memory_facts['swapfree_mb'], 0)

    def test_get_uptime_facts(self):
        uptime_facts = FreeBSDHardware().get_uptime_facts()
        self.assertEqual(uptime_facts['uptime_seconds'], 1000)

    def test_get_mount_facts(self):
        mount_facts = FreeBSDHardware().get_mount_facts()
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')
        self.assertEqual(mount_facts['mounts'][0]['device'], 'ada0s1a')
        self.assertEqual(mount_facts['mounts'][0]['fstype'], 'ufs')
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,relatime,noacl')
        self.assertEqual(mount_facts['mounts'][0]['size_total'], 1000000000)
        self.assertEqual(mount_facts['mounts'][0]['size_available'], 750000000)

    def test_get_device_facts(self):
        device_facts = FreeBSDHardware().get_device_facts()
        self.assertEqual(device_facts['devices']['ada0'], ['ada0s1a'])

    def test_get_dmi_facts(self):
        dmi_facts = FreeBSDHardware().get_dmi_facts()
        self.assertEqual(dmi_facts['bios_date'], '04/01/2014')
        self.assertEqual(dmi_facts['bios_vendor'], 'http://www.openbsd.org')
        self.assertEqual(dmi_facts['bios_version'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['board_asset_tag'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['board_name'], 'Generic Board')
        self.assertEqual(dmi_facts['board_serial'], 'TEST00000000000')
        self.assertEqual(dmi_facts['board_vendor'], 'http://www.openbsd.org')
        self.assertEqual(dmi_facts['board_version'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['chassis_asset_tag'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['chassis_serial'], 'TEST00000000000')
        self.assertEqual(dmi_facts['chassis_vendor'], 'http://www.openbsd.org')
        self.assertEqual(dmi_facts['chassis_version'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['form_factor'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['product_name'], 'Generic Board')
        self.assertEqual(dmi_facts['product_serial'], 'TEST00000000000')
        self.assertEqual(dmi_facts['product_uuid'], 'TEST00000000000')
        self.assertEqual(dmi_facts['product_version'], 'OpenBSD 5.9')
        self.assertEqual(dmi_facts['system_vendor'], 'http://www.openbsd.org')


if __name__ == '__main__':
    unittest.main()