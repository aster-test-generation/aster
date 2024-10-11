import time
import struct
import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.darwin_hardware = DarwinHardware(self.module)
        self.darwin_hardware.sysctl = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '199506',
            'hw.model': 'MacBookPro15,1',
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'machdep.cpu.core_count': 8,
            'hw.physicalcpu': 8,
            'hw.logicalcpu': 16,
            'hw.memsize': 17179869184
        }

    def test_populate(self):
        with patch.object(self.darwin_hardware, 'get_mac_facts', return_value={'model': 'MacBookPro15,1'}), \
             patch.object(self.darwin_hardware, 'get_cpu_facts', return_value={'processor': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz'}), \
             patch.object(self.darwin_hardware, 'get_memory_facts', return_value={'memtotal_mb': 16384}), \
             patch.object(self.darwin_hardware, 'get_uptime_facts', return_value={'uptime_seconds': 3600}):
            result = self.darwin_hardware.populate(), None, None
            self.assertEqual(result, {
                'model': 'MacBookPro15,1',
                'processor': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
                'memtotal_mb': 16384,
                'uptime_seconds': 3600
            })

    def test_get_system_profile(self):
        self.module.run_command.return_value = (0, "Processor Name: Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz\nProcessor Speed: 2.40 GHz", "")
        result = self.darwin_hardware.get_system_profile()
        self.assertEqual(result, {
            'Processor Name': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'Processor Speed': '2.40 GHz'
        })

    def test_get_mac_facts(self):
        self.module.run_command.return_value = (0, "hw.model: MacBookPro15,1", "")
        result = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result, {
            'model': 'MacBookPro15,1',
            'product_name': 'MacBookPro15,1',
            'osversion': '20.3.0',
            'osrevision': '199506'
        })

    def test_get_cpu_facts(self):
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result, {
            'processor': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'processor_cores': 8,
            'processor_vcpus': 16
        })

    def test_get_memory_facts(self):
        self.module.run_command.return_value = (0, "Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000", "")
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result, {
            'memtotal_mb': 16384,
            'memfree_mb': 16368
        })

    def test_get_uptime_facts(self):
        self.module.run_command.return_value = (0, struct.pack('@L', int(time.time()) - 3600), "")
        result = self.darwin_hardware.get_uptime_facts()
        self.assertEqual(result, {
            'uptime_seconds': 3600
        })

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
            'kern.osrevision': '199506',
            'hw.model': 'MacBookPro15,1',
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'machdep.cpu.core_count': 8,
            'hw.physicalcpu': 8,
            'hw.logicalcpu': 16,
            'hw.memsize': 17179869184
        }
        self.darwin_hardware.get_mac_facts = MagicMock(return_value={'model': 'MacBookPro15,1'})
        self.darwin_hardware.get_cpu_facts = MagicMock(return_value={'processor': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz'})
        self.darwin_hardware.get_memory_facts = MagicMock(return_value={'memtotal_mb': 16384})
        self.darwin_hardware.get_uptime_facts = MagicMock(return_value={'uptime_seconds': 123456})

        result = self.darwin_hardware.populate()
        self.assertIn('model', result)
        self.assertIn('processor', result)
        self.assertIn('memtotal_mb', result)
        self.assertIn('uptime_seconds', result)

    def test_get_system_profile(self):
        self.module.run_command.return_value = (0, "Processor Name: Intel\nProcessor Speed: 2.4 GHz", "")
        result = self.darwin_hardware.get_system_profile()
        self.assertIn('Processor Name', result)
        self.assertEqual(result['Processor Name'], 'Intel')

    def test_get_mac_facts(self):
        self.darwin_hardware.sysctl = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '199506',
            'hw.model': 'MacBookPro15,1'
        }
        self.module.run_command.return_value = (0, "hw.model: MacBookPro15,1", "")
        result = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result['model'], 'MacBookPro15,1')
        self.assertEqual(result['osversion'], '20.3.0')
        self.assertEqual(result['osrevision'], '199506')

    def test_get_cpu_facts(self):
        self.darwin_hardware.sysctl = {
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz',
            'machdep.cpu.core_count': 8,
            'hw.physicalcpu': 8,
            'hw.logicalcpu': 16
        }
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result['processor'], 'Intel(R) Core(TM) i9-9980HK CPU @ 2.40GHz')
        self.assertEqual(result['processor_cores'], 8)
        self.assertEqual(result['processor_vcpus'], 16)

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_memory_facts(self, mock_get_bin_path):
        self.darwin_hardware.sysctl = {'hw.memsize': 17179869184}
        mock_get_bin_path.return_value = '/usr/bin/vm_stat'
        self.module.run_command.return_value = (0, "Pages wired down: 1000\nPages active: 2000\nPages inactive: 3000", "")
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 16384)
        self.assertEqual(result['memfree_mb'], 16368)

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_uptime_facts(self, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/sbin/sysctl'
        self.module.run_command.return_value = (0, struct.pack('@L', int(time.time()) - 123456), "")
        result = self.darwin_hardware.get_uptime_facts()
        self.assertEqual(result['uptime_seconds'], 123456)

class TestDarwinHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.darwin_hardware = DarwinHardware(self.module)

    @patch('ansible.module_utils.facts.hardware.darwin.get_sysctl')
    def test_populate(self, mock_get_sysctl):
        mock_get_sysctl.return_value = {
            'kern.osversion': '20.3.0',
            'kern.osrevision': '199506',
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz',
            'machdep.cpu.core_count': 6,
            'hw.physicalcpu': 6,
            'hw.logicalcpu': 12,
            'hw.memsize': 17179869184
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
            'kern.osrevision': '199506'
        }
        self.module.run_command.return_value = (0, "hw.model: MacBookPro15,1", "")
        result = self.darwin_hardware.get_mac_facts()
        self.assertEqual(result['model'], 'MacBookPro15,1')
        self.assertEqual(result['osversion'], '20.3.0')
        self.assertEqual(result['osrevision'], '199506')

    def test_get_cpu_facts_with_sysctl(self):
        self.darwin_hardware.sysctl = {
            'machdep.cpu.brand_string': 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz',
            'machdep.cpu.core_count': 6,
            'hw.physicalcpu': 6,
            'hw.logicalcpu': 12
        }
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result['processor'], 'Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz')
        self.assertEqual(result['processor_cores'], 6)
        self.assertEqual(result['processor_vcpus'], 12)

    def test_get_cpu_facts_without_sysctl(self):
        self.darwin_hardware.sysctl = {
            'hw.physicalcpu': 6
        }
        self.darwin_hardware.get_system_profile = MagicMock(return_value={
            'Processor Name': 'Intel Core i7',
            'Processor Speed': '2.6 GHz'
        })
        result = self.darwin_hardware.get_cpu_facts()
        self.assertEqual(result['processor'], 'Intel Core i7 @ 2.6 GHz')
        self.assertEqual(result['processor_cores'], 6)

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_memory_facts(self, mock_get_bin_path):
        self.darwin_hardware.sysctl = {
            'hw.memsize': 17179869184
        }
        mock_get_bin_path.return_value = '/usr/bin/vm_stat'
        self.module.run_command.return_value = (0, "Pages wired down: 10000\nPages active: 20000\nPages inactive: 30000", "")
        result = self.darwin_hardware.get_memory_facts()
        self.assertEqual(result['memtotal_mb'], 16384)
        self.assertEqual(result['memfree_mb'], 15360)

    @patch('ansible.module_utils.facts.hardware.darwin.get_bin_path')
    def test_get_uptime_facts(self, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/sbin/sysctl'
        self.module.run_command.return_value = (0, struct.pack('@L', int(time.time()) - 3600), "")
        result = self.darwin_hardware.get_uptime_facts()
        self.assertEqual(result['uptime_seconds'], 3600)

if __name__ == '__main__':
    unittest.main()