import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.sunos import SunOSHardware, SunOSHardwareCollector
from ansible.module_utils.facts import timeout


class TestSunOSHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = SunOSHardware(self.module)

    def test_populate(self):
        self.hardware.get_cpu_facts = MagicMock(return_value={'cpu': 'facts'})
        self.hardware.get_memory_facts = MagicMock(return_value={'memory': 'facts'})
        self.hardware.get_dmi_facts = MagicMock(return_value={'dmi': 'facts'})
        self.hardware.get_device_facts = MagicMock(return_value={'device': 'facts'})
        self.hardware.get_uptime_facts = MagicMock(return_value={'uptime': 'facts'})
        self.hardware.get_mount_facts = MagicMock(return_value={'mount': 'facts'})

        result = self.hardware.populate()
        self.assertIn('cpu', result)
        self.assertIn('memory', result)
        self.assertIn('dmi', result)
        self.assertIn('device', result)
        self.assertIn('uptime', result)
        self.assertIn('mount', result)

    def test_get_cpu_facts(self):
        self.module.run_command = MagicMock(return_value=(0, "module: \nbrand Intel\nclock_MHz 2400\nimplementation x86\nchip_id 0", ""))
        result = self.hardware.get_cpu_facts()
        self.assertIn('processor', result)

    def test_get_memory_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "Memory size: 8192 Megabytes", ""),
            (0, "total: 1024k allocated + 2048k reserved = 3072k used, 4096k available", "")
        ])
        result = self.hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 8192)
        self.assertEqual(result['swapfree_mb'], 4)
        self.assertEqual(result['swaptotal_mb'], 7)
        self.assertEqual(result['swap_allocated_mb'], 1)
        self.assertEqual(result['swap_reserved_mb'], 2)

    @patch('ansible.module_utils.facts.hardware.sunos.get_file_content', return_value="device\tmount\tfstype\toptions\ttime\n")
    @patch('ansible.module_utils.facts.hardware.sunos.get_mount_size', return_value={'size': '100G'})
    def test_get_mount_facts(self, mock_get_file_content, mock_get_mount_size):
        result = self.hardware.get_mount_facts()
        self.assertIn('mounts', result)

    def test_get_dmi_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "i86pc", ""),
            (0, "System Configuration: Oracle Corporation Sun Fire X4170 M2", "")
        ])
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result['system_vendor'], 'Oracle Corporation')
        self.assertEqual(result['product_name'], 'Sun Fire X4170 M2')

    def test_get_device_facts(self):
        self.module.run_command = MagicMock(return_value=(0, "sderr:::Product\tproduct\nsderr:::Size\t1024", ""))
        result = self.hardware.get_device_facts()
        self.assertIn('devices', result)

    def test_get_uptime_facts(self):
        self.module.run_command = MagicMock(return_value=(0, "unix:0:system_misc:boot_time\t1609459200", ""))
        with patch('time.time', return_value=1609462800):
            result = self.hardware.get_uptime_facts()
            self.assertEqual(result['uptime_seconds'], 3600)

class TestSunOSHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = SunOSHardwareCollector()
        self.assertEqual(collector._fact_class, SunOSHardware)

    def test_platform(self):
        collector = SunOSHardwareCollector()
        self.assertEqual(collector._platform, 'SunOS')

    def test_required_facts(self):
        collector = SunOSHardwareCollector()
        self.assertIn('platform', collector.required_facts)

if __name__ == '__main__':
    unittest.main()