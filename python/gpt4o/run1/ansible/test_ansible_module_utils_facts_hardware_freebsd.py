import time
import struct
import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError


class TestFreeBSDHardware(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.hardware = FreeBSDHardware(self.module)

    def test_populate(self):
        with patch.object(self.hardware, 'get_cpu_facts', return_value={'cpu': 'test'}), \
             patch.object(self.hardware, 'get_memory_facts', return_value={'memory': 'test'}), \
             patch.object(self.hardware, 'get_uptime_facts', return_value={'uptime': 'test'}), \
             patch.object(self.hardware, 'get_dmi_facts', return_value={'dmi': 'test'}), \
             patch.object(self.hardware, 'get_device_facts', return_value={'device': 'test'}), \
             patch.object(self.hardware, 'get_mount_facts', return_value={'mount': 'test'}):
            result = self.hardware.populate()
            self.assertEqual(result, {'cpu': 'test', 'memory': 'test', 'uptime': 'test', 'dmi': 'test', 'device': 'test', 'mount': 'test'})

    def test_get_cpu_facts(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='CPU: test\nLogical CPUs per core: 2'):
            self.module.get_bin_path.return_value = '/sbin/sysctl'
            self.module.run_command.return_value = (0, '4', '')
            result = self.hardware.get_cpu_facts()
            self.assertEqual(result, {'processor': [], 'processor_count': '4'})

    def test_get_memory_facts(self):
        self.module.get_bin_path.side_effect = ['/sbin/sysctl', '/sbin/swapinfo']
        self.module.run_command.side_effect = [
            (0, 'vm.stats.vm.v_page_size 4096\nvm.stats.vm.v_page_count 1000000\nvm.stats.vm.v_free_count 500000', ''),
            (0, 'Device 1 2 3 4\n', '')
        ]
        result = self.hardware.get_memory_facts()
        self.assertEqual(result, {'memtotal_mb': 3906, 'memfree_mb': 1953})

    def test_get_uptime_facts(self):
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command.return_value = (0, struct.pack('@L', int(time.time()) - 1000), '')
        result = self.hardware.get_uptime_facts()
        self.assertEqual(result, {'uptime_seconds': 1000})

    def test_get_mount_facts(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='test /mnt ufs rw 0 0\n'):
            with patch('ansible.module_utils.facts.utils.get_mount_size', return_value={'size_total': 1000, 'size_available': 500}):
                result = self.hardware.get_mount_facts()
                self.assertEqual(result, {'mounts': [{'mount': '/', 'device': 'UUID=ad77dcb6-d22d-45dc-85c1-2b3e4f5a6b7c', 'fstype': 'ext4', 'options': 'rw', 'size_total': 100000, 'size_available': 50000}]})

    def test_get_device_facts(self):
        with patch('os.path.isdir', return_value=True), \
             patch('os.listdir', return_value=['ada0', 'ada0s1']):
            result = self.hardware.get_device_facts()
            self.assertEqual(result, {'devices': {'ada0': ['ada0s1']}})

    def test_get_dmi_facts(self):
        self.module.get_bin_path.return_value = '/sbin/dmidecode'
        self.module.run_command.return_value = (0, 'test', '')
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result, {'bios_date': 'test', 'bios_vendor': 'test', 'bios_version': 'test', 'board_asset_tag': 'test', 'board_name': 'test', 'board_serial': 'test', 'board_vendor': 'test', 'board_version': 'test', 'chassis_asset_tag': 'test', 'chassis_serial': 'test', 'chassis_vendor': 'test', 'chassis_version': 'test', 'form_factor': 'test', 'product_name': 'test', 'product_serial': 'test', 'product_uuid': 'test', 'product_version': 'test', 'system_vendor': 'test'})

    def test_get_mount_facts_timeout(self):
        with patch.object(self.hardware, 'get_mount_facts', side_effect=TimeoutError):
            result = self.hardware.populate(), None, None
            self.assertNotIn('mount', result)

class TestFreeBSDHardwareCollector(unittest.TestCase):

    def test_fact_class(self):
        collector = FreeBSDHardwareCollector()
        self.assertEqual(collector._fact_class, FreeBSDHardware)

    def test_platform(self):
        collector = FreeBSDHardwareCollector()
        self.assertEqual(collector._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()