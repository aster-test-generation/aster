import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector

class TestDarwinHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.darwin_hardware = DarwinHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {'kern.osversion': '20.3.0', 'kern.osrevision': '200000', 'hw.memsize': '17179869184'}
        self.darwin_hardware.get_mac_facts = MagicMock(return_value={'model': 'MacBookPro', 'osversion': '20.3.0', 'osrevision': '200000'})
        self.darwin_hardware.get_cpu_facts = MagicMock(return_value={'processor': 'Intel', 'processor_cores': 4, 'processor_vcpus': 8})
        self.darwin_hardware.get_memory_facts = MagicMock(return_value={'memtotal_mb': 16384, 'memfree_mb': 8192})
        self.darwin_hardware.get_uptime_facts = MagicMock(return_value={'uptime_seconds': 3600})

        result = self.darwin_hardware.populate()
        self.assertEqual(result, {
            'model': 'MacBookPro',
            'osversion': '20.3.0',
            'osrevision': '200000',
            'processor': 'Intel',
            'processor_cores': 4,
            'processor_vcpus': 8,
            'memtotal_mb': 16384,
            'memfree_mb': 8192,
            'uptime_seconds': 3600
        })

    def test_get_system_profile(self):
        self.module.run_command = MagicMock(return_value=(0, "Processor Name: Intel\nProcessor Speed: 2.3 GHz", ""))
        result = self.darwin_hardware.get_system_profile()
        self.assertEqual(result, {'Processor Name': 'Intel', 'Processor Speed': '2.3 GHz'})

    def test_get_mac_facts(self):
        self.module.run_command = MagicMock(return_value=(0, "hw.model: MacBookPro", ""))
        self.darwin_hardware.sysctl = {'kern.osversion': '20.3.0', 'kern.osrevision': '200000'}
        result = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result, {'model': 'MacBookPro', 'product_name': 'MacBookPro', 'osversion': '20.3.0', 'osrevision': '200000'})

    def test_get_cpu_facts_with_sysctl(self):
        self.darwin_hardware.sysctl = {
            'machdep.cpu.brand_string': 'Intel',
            'machdep.cpu.core_count': 4,
            'hw.logicalcpu': 8
        }
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result, {'processor': 'Intel', 'processor_cores': 4, 'processor_vcpus': 8})

    @patch.object(DarwinHardware, 'get_system_profile')
    def test_get_cpu_facts_without_sysctl(self, mock_get_system_profile):
        self.darwin_hardware.sysctl = {'hw.physicalcpu': 4}
        mock_get_system_profile.return_value = {'Processor Name': 'Intel', 'Processor Speed': '2.3 GHz'}
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result, {'processor': 'Intel @ 2.3 GHz', 'processor_cores': 4, 'processor_vcpus': ''})

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_memory_facts(self, mock_get_bin_path):
        self.darwin_hardware.sysctl = {'hw.memsize': '17179869184'}
        mock_get_bin_path.return_value = '/usr/bin/vm_stat'
        self.module.run_command = MagicMock(return_value=(0, "Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000", ""))
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result, {'memtotal_mb': 16384, 'memfree_mb': 16361})

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    @patch('struct.unpack')
    @patch('time.time')
    def test_get_uptime_facts(self, mock_time, mock_unpack, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/sbin/sysctl'
        self.module.run_command = MagicMock(return_value=(0, b'\x00\x00\x00\x00\x00\x00\x00\x00', ""))
        mock_unpack.return_value = (1609459200,)
        mock_time.return_value = 1609462800
        result = self.darwin_hardware.get_uptime_facts()
        self.assertEqual(result, {'uptime_seconds': 3600})

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._fact_class, DarwinHardware)

    def test_platform(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()