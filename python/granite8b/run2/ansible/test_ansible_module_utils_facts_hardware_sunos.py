import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware


class TestSunOSHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        hardware = SunOSHardware(module)
        cpu_facts = hardware.get_cpu_facts()
        self.assertEqual(cpu_facts['processor_count'], 1)
        self.assertEqual(cpu_facts['processor_cores'], 1)
        self.assertEqual(cpu_facts['processor'][0], 'Intel(R) Xeon(R) CPU E5-2670 v2 @ 2.50GHz')

    def test_get_memory_facts(self):
        hardware = SunOSHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertEqual(memory_facts['memtotal_mb'], 16384)
        self.assertEqual(memory_facts['swapfree_mb'], 1023)
        self.assertEqual(memory_facts['swaptotal_mb'], 2047)
        self.assertEqual(memory_facts['swap_allocated_mb'], 0)
        self.assertEqual(memory_facts['swap_reserved_mb'], 0)

    def test_get_mount_facts(self):
        hardware = SunOSHardware(module)
        mount_facts = hardware.get_mount_facts()
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')
        self.assertEqual(mount_facts['mounts'][0]['device'], 'tmpfs')
        self.assertEqual(mount_facts['mounts'][0]['fstype'], 'tmpfs')
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,noexec,nosuid,nodev,size=1024000k,mode=755')
        self.assertEqual(mount_facts['mounts'][0]['time'], '16678')

    def test_get_dmi_facts(self):
        hardware = SunOSHardware(module)
        dmi_facts = hardware.get_dmi_facts()
        self.assertEqual(dmi_facts['system_vendor'], 'Oracle Corporation')
        self.assertEqual(dmi_facts['product_name'], 'VMware7,1 build-1125044')

    def test_get_device_facts(self):
        hardware = SunOSHardware(module)
        device_facts = hardware.get_device_facts()
        self.assertEqual(device_facts['devices']['sd0']['product'], 'VMware Virtual Scsi Disk')
        self.assertEqual(device_facts['devices']['sd0']['revision'], 'S241')
        self.assertEqual(device_facts['devices']['sd0']['vendor'], 'VMware, Inc.')
        self.assertEqual(device_facts['devices']['sd0']['size'], '10.00 GB')

    def test_get_uptime_facts(self):
        hardware = SunOSHardware(module)
        uptime_facts = hardware.get_uptime_facts()
        self.assertEqual(uptime_facts['uptime_seconds'], 16678)

if __name__ == '__main__':
    unittest.main()