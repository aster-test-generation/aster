import unittest
from ansible.module_utils.facts.facts import Hardware, HardwareCollector
from ansible.module_utils.facts.facts import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        hardware = FreeBSDHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertEqual(cpu_facts['processor_count'], '1')
        self.assertEqual(cpu_facts['processor'], ['cpu0'])
        self.assertEqual(cpu_facts['processor_cores'], '1')

    def test_get_memory_facts(self):
        hardware = FreeBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertEqual(memory_facts['memtotal_mb'], 8192)
        self.assertEqual(memory_facts['memfree_mb'], 6144)
        self.assertEqual(memory_facts['swaptotal_mb'], 0)
        self.assertEqual(memory_facts['swapfree_mb'], 0)

    def test_get_uptime_facts(self):
        hardware = FreeBSDHardware()
        uptime_facts = hardware.get_uptime_facts()
        self.assertEqual(uptime_facts['uptime_seconds'], 12345)

    def test_get_mount_facts(self):
        hardware = FreeBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')
        self.assertEqual(mount_facts['mounts'][0]['device'], 'ada0s1a')
        self.assertEqual(mount_facts['mounts'][0]['fstype'], 'ufs')
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,noatime,relatime,-onedrive,-onedrivever,- Case sensitive,errors=remount-ro,utf8')
        self.assertEqual(mount_facts['mounts'][0]['size_total'], 1073741824)
        self.assertEqual(mount_facts['mounts'][0]['size_available'], 4294967296)

    def test_get_device_facts(self):
        hardware = FreeBSDHardware()
        device_facts = hardware.get_device_facts()
        self.assertEqual(device_facts['devices']['ada0'], ['ada0s1a', 'ada0s1b'])
        self.assertEqual(device_facts['devices']['ada1'], ['ada1s1a', 'ada1s1b'])

if __name__ == '__main__':
    unittest.main()