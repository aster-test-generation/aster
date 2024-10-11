import time
import struct
import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError


class TestFreeBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = FreeBSDHardware(self.module)

    def test_populate(self):
        self.hardware.get_cpu_facts = MagicMock(return_value={'cpu': 'test_cpu'})
        self.hardware.get_memory_facts = MagicMock(return_value={'memory': 'test_memory'})
        self.hardware.get_uptime_facts = MagicMock(return_value={'uptime': 'test_uptime'})
        self.hardware.get_dmi_facts = MagicMock(return_value={'dmi': 'test_dmi'})
        self.hardware.get_device_facts = MagicMock(return_value={'device': 'test_device'})
        self.hardware.get_mount_facts = MagicMock(return_value={'mount': 'test_mount'})

        result = self.hardware.populate()
        self.assertEqual(result, {
            'cpu': 'test_cpu',
            'memory': 'test_memory',
            'uptime': 'test_uptime',
            'dmi': 'test_dmi',
            'device': 'test_device',
            'mount': 'test_mount'
        })

    def test_get_cpu_facts(self):
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command.return_value = (0, '4', '')

        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='CPU: Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz\nLogical CPUs per core: 2'):
            result = self.hardware.get_cpu_facts()
            self.assertEqual(result, {
                'processor': ['Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz'],
                'processor_count': '4',
                'processor_cores': '2'
            })

    def test_get_memory_facts(self):
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command.side_effect = [
            (0, 'vm.stats.vm.v_page_size: 4096\nvm.stats.vm.v_page_count: 1000000\nvm.stats.vm.v_free_count: 500000', ''),
            (0, 'Device 1 2 3 4\nswap 1024000 0 1024000 0', '')
        ]

        result = self.hardware.get_memory_facts()
        self.assertEqual(result, {
            'memtotal_mb': 3906,
            'memfree_mb': 1953,
            'swaptotal_mb': 1000,
            'swapfree_mb': 1000
        })

    def test_get_uptime_facts(self):
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command.return_value = (0, struct.pack('@L', int(time.time()) - 1000), '')

        result = self.hardware.get_uptime_facts()
        self.assertEqual(result, {'uptime_seconds': 1000})

    def test_get_mount_facts(self):
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='/dev/ada0p2 / ufs rw 1 1'):
            with patch('ansible.module_utils.facts.utils.get_mount_size', return_value={'size_total': 1000, 'size_available': 500}):
                result = self.hardware.get_mount_facts()
                self.assertEqual(result, {
                    'mounts': [{
                        'mount': '/',
                        'device': '/dev/ada0p2',
                        'fstype': 'ufs',
                        'options': 'rw',
                        'size_total': 1000,
                        'size_available': 500
                    }]
                })

    def test_get_device_facts(self):
        with patch('os.path.isdir', return_value=True):
            with patch('os.listdir', return_value=['ada0', 'ada0s1', 'ada0s2', 'cd0']):
                result = self.hardware.get_device_facts()
                self.assertEqual(result, {
                    'devices': {
                        'ada0': ['ada0s1', 'ada0s2'],
                        'cd0': []
                    }
                })

    def test_get_dmi_facts(self):
        self.module.get_bin_path.return_value = '/usr/sbin/dmidecode'
        self.module.run_command.return_value = (0, 'test_value', '')

        result = self.hardware.get_dmi_facts()
        self.assertEqual(result, {
            'bios_date': 'test_value',
            'bios_vendor': 'test_value',
            'bios_version': 'test_value',
            'board_asset_tag': 'test_value',
            'board_name': 'test_value',
            'board_serial': 'test_value',
            'board_vendor': 'test_value',
            'board_version': 'test_value',
            'chassis_asset_tag': 'test_value',
            'chassis_serial': 'test_value',
            'chassis_vendor': 'test_value',
            'chassis_version': 'test_value',
            'form_factor': 'test_value',
            'product_name': 'test_value',
            'product_serial': 'test_value',
            'product_uuid': 'test_value',
            'product_version': 'test_value',
            'system_vendor': 'test_value'
        })

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = FreeBSDHardwareCollector()
        self.assertEqual(collector._fact_class, FreeBSDHardware)

    def test_platform(self):
        collector = FreeBSDHardwareCollector()
        self.assertEqual(collector._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()