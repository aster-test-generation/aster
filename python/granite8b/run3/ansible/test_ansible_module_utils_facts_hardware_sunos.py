import unittest
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector


class TestSunOSHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        cpu_facts = SunOSHardware(module=None).get_cpu_facts()
        self.assertEqual(cpu_facts['processor_count'], 1)
        self.assertEqual(cpu_facts['processor_cores'], 1)
        self.assertEqual(cpu_facts['processor'][0], 'Intel(R) Xeon(R) CPU E5-2690 v4 @ 2.60GHz')

    def test_get_memory_facts(self):
        memory_facts = SunOSHardware(module=None).get_memory_facts()
        self.assertEqual(memory_facts['memtotal_mb'], 16384)
        self.assertEqual(memory_facts['swapfree_mb'], 1023)
        self.assertEqual(memory_facts['swaptotal_mb'], 2047)
        self.assertEqual(memory_facts['swap_allocated_mb'], 0)
        self.assertEqual(memory_facts['swap_reserved_mb'], 0)

    def test_get_mount_facts(self):
        mount_facts = SunOSHardware(module=None).get_mount_facts()
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')
        self.assertEqual(mount_facts['mounts'][0]['device'], 'tmpfs')
        self.assertEqual(mount_facts['mounts'][0]['fstype'], 'tmpfs')
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,noexec,nosuid,nodev,relatime,size=10240k')
        self.assertEqual(mount_facts['mounts'][0]['time'], '164917844')

    def test_get_dmi_facts(self):
        dmi_facts = SunOSHardware(module=None).get_dmi_facts()
        self.assertEqual(dmi_facts['system_vendor'], 'Oracle Corporation')
        self.assertEqual(dmi_facts['product_name'], 'VMware7,1')

    def test_get_device_facts(self):
        device_facts = SunOSHardware(module=None).get_device_facts()
        self.assertEqual(device_facts['devices']['sd0']['product'], 'VMware7,1 Virtual Scsi Disk')
        self.assertEqual(device_facts['devices']['sd0']['revision'], 'S2210')
        self.assertEqual(device_facts['devices']['sd0']['vendor'], 'VMware')
        self.assertEqual(device_facts['devices']['sd0']['size'], '10.00 GB')

    def test_get_uptime_facts(self):
        uptime_facts = SunOSHardware(module=None).get_uptime_facts()
        self.assertEqual(uptime_facts['uptime_seconds'], 15427)


if __name__ == '__main__':
    unittest.main()