import struct
import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.darwin_hardware = DarwinHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '199506',
            'hw.model': 'MacBookPro15,1',
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'machdep.cpu.core_count': 8,
            'hw.physicalcpu': 8,
            'hw.logicalcpu': 16,
            'hw.memsize': 17179869184
        }
        self.module.run_command = MagicMock(return_value=(0, 'Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000\n', ''))
        facts = self.darwin_hardware.populate().encode()
        self.assertIn('model', facts)
        self.assertIn('processor', facts)
        self.assertIn('memtotal_mb', facts)
        self.assertIn('uptime_seconds', facts)

    def test_get_system_profile(self):
        self.module.run_command = MagicMock(return_value=(0, 'Processor Name: Intel Core i9\nProcessor Speed: 2.4 GHz\n', ''))
        result = self.darwin_hardware.get_system_profile()
        self.assertEqual(result['Processor Name'], 'Intel Core i9')

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_get_mac_facts(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '199506',
            'hw.model': 'MacBookPro15,1'
        }
        self.darwin_hardware.sysctl = mock_get_sysctl.return_value
        result, _, _ = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result['model'], 'MacBookPro15,1')

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_get_cpu_facts(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'machdep.cpu.core_count': 8,
            'hw.physicalcpu': 8,
            'hw.logicalcpu': 16
        }
        self.darwin_hardware.sysctl = mock_get_sysctl.return_value
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result['processor'], 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz')

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    @patch('ansible.module_utils.common.process.get_bin_path')
    def test_get_memory_facts(self, mock_get_bin_path, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'hw.memsize': 17179869184
        }
        mock_get_bin_path.return_value = '/usr/bin/vm_stat'
        self.module.run_command = MagicMock(return_value=(0, 'Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000\n', ''))
        self.darwin_hardware.sysctl = mock_get_sysctl.return_value
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 16384)

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_get_uptime_facts(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'kern.boottime': 1609459200
        }
        self.module.get_bin_path = MagicMock(return_value='/usr/sbin/sysctl')
        self.module.run_command = MagicMock(return_value=(0, struct.pack('@L', 1609459200), ''))
        result = self.darwin_hardware.get_uptime_facts()
        self.assertIn('uptime_seconds', result)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._fact_class, DarwinHardware)

    def test_platform(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._platform, 'Darwin')

class TestDarwinHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.darwin_hardware = DarwinHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '200000',
            'hw.memsize': '17179869184',
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz',
            'machdep.cpu.core_count': '6',
            'hw.physicalcpu': '6',
            'hw.logicalcpu': '12',
            'hw.ncpu': '12'
        }
        self.darwin_hardware.get_mac_facts = MagicMock(return_value={'model': 'MacBookPro15,1'})
        self.darwin_hardware.get_cpu_facts = MagicMock(return_value={'processor': 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz'})
        self.darwin_hardware.get_memory_facts = MagicMock(return_value={'memtotal_mb': 16384})
        self.darwin_hardware.get_uptime_facts = MagicMock(return_value={'uptime_seconds': 3600})

        result = self.darwin_hardware.populate()
        self.assertIn('model', result)
        self.assertIn('processor', result)
        self.assertIn('memtotal_mb', result)
        self.assertIn('uptime_seconds', result)

    def test_get_system_profile(self):
        self.module.run_command.return_value = (0, "Processor Name: Intel Core i7\nProcessor Speed: 2.6 GHz", "")
        result = self.darwin_hardware.get_system_profile()
        self.assertIn('Processor Name', result)
        self.assertEqual(result['Processor Name'], 'Intel Core i7')

    def test_get_mac_facts(self):
        self.darwin_hardware.sysctl = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '200000'
        }
        self.module.run_command.return_value = (0, "hw.model: MacBookPro15,1", "")
        result = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result['model'], 'MacBookPro15,1')
        self.assertEqual(result['osversion'], '20.3.0')
        self.assertEqual(result['osrevision'], '200000')

    def test_get_cpu_facts(self):
        self.darwin_hardware.sysctl = {
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz',
            'machdep.cpu.core_count': '6',
            'hw.physicalcpu': '6',
            'hw.logicalcpu': '12'
        }
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result['processor'], 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz')
        self.assertEqual(result['processor_cores'], '6')
        self.assertEqual(result['processor_vcpus'], '12')

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_memory_facts(self, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/bin/vm_stat'
        self.darwin_hardware.sysctl = {
            'hw.memsize': '17179869184'
        }
        self.module.run_command.return_value = (0, "Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000", "")
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 16384)
        self.assertEqual(result['memfree_mb'], 16384 - (1000 + 2000 + 3000) * 4096 // 1024 // 1024)

    @patch('ansible.module_utils.facts.hardware.darwin.struct')
    @patch('ansible.module_utils.facts.hardware.darwin.time')
    def test_get_uptime_facts(self, mock_time, mock_struct):
        mock_time.time.return_value = 1610000000
        mock_struct.calcsize.return_value = 8
        mock_struct.unpack.return_value = (1600000000,)
        self.module.run_command.return_value = (0, b'\x00\x00\x00\x00\x5f\x5e\x10\x00', "")
        result = self.darwin_hardware.get_uptime_facts()
        self.assertEqual(result['uptime_seconds'], 10000000)

if __name__ == '__main__':
    unittest.main()