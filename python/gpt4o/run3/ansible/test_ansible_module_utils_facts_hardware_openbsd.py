import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector
from ansible.module_utils.facts import timeout


class TestOpenBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = OpenBSDHardware(self.module)
        self.hardware.sysctl = {
            'hw.usermem': '1048576000',
            'hw.ncpuonline': '4',
            'hw.model': 'Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz',
            'hw.disknames': 'sd0,sd1',
            'hw.product': 'TestProduct',
            'hw.version': '1.0',
            'hw.uuid': '1234-5678-90AB-CDEF',
            'hw.serialno': 'SN1234567890',
            'hw.vendor': 'TestVendor'
        }

    def test_populate(self):
        with patch.object(self.hardware, 'get_processor_facts', return_value={'processor': 'test'}), \
             patch.object(self.hardware, 'get_memory_facts', return_value={'memory': 'test'}), \
             patch.object(self.hardware, 'get_device_facts', return_value={'devices': 'test'}), \
             patch.object(self.hardware, 'get_dmi_facts', return_value={'dmi': 'test'}), \
             patch.object(self.hardware, 'get_uptime_facts', return_value={'uptime': 'test'}), \
             patch.object(self.hardware, 'get_mount_facts', return_value={'mounts': 'test'}):
            result = self.hardware.populate(), None, None
            self.assertIn('processor', result)
            self.assertIn('memory', result)
            self.assertIn('devices', result)
            self.assertIn('dmi', result)
            self.assertIn('uptime', result)
            self.assertIn('mounts', result)

    @timeout.timeout()
    def test_get_mount_facts(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='test / ffs rw 1 2\n'):
            with patch('ansible.module_utils.facts.utils.get_mount_size', return_value={'size': '100G'}):
                result = self.hardware.get_mount_facts()
                self.assertIn('mounts', result)
                self.assertEqual(result['mounts'][0]['mount'], '/')
                self.assertEqual(result['mounts'][0]['device'], 'UUID=ad77dcb6-d22d-45dc-85cc-69303f2ecd2f')
                self.assertEqual(result['mounts'][0]['fstype'], 'ffs')
                self.assertEqual(result['mounts'][0]['options'], 'rw')
                self.assertEqual(result['mounts'][0]['size'], '100G')

    def test_get_memory_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, ' procs    memory       page                    disks   faults       cpu\n r b w     avm     fre  flt  re  pi  po  fr  sr sd0 sd1   in   sy  cs us sy id\n 0 0 0  100000  200000  100   0   0   0   0   0   0   0  100  200  300  0  0 100\n', ''),
            (0, 'total: 100000k bytes allocated + 200000k reserved = 300000k used, 400000k available\n', '')
        ])
        result = self.hardware.get_memory_facts()
        self.assertEqual(result['memfree_mb'], 195)
        self.assertEqual(result['memtotal_mb'], 1000)
        self.assertEqual(result['swapfree_mb'], 390)
        self.assertEqual(result['swaptotal_mb'], 97)

    def test_get_uptime_facts(self):
        self.module.run_command = MagicMock(return_value=(0, '1609459200\n', ''))
        with patch('time.time', return_value=1609462800):
            result = self.hardware.get_uptime_facts()
            self.assertEqual(result['uptime_seconds'], 3600)

    def test_get_processor_facts(self):
        result = self.hardware.get_processor_facts()
        self.assertEqual(result['processor'], ['Intel(R) Core(TM) i7-8550U CPU @ 1.80GHz'] * 4)
        self.assertEqual(result['processor_count'], '4')
        self.assertEqual(result['processor_cores'], '4')

    def test_get_device_facts(self):
        result = self.hardware.get_device_facts()
        self.assertEqual(result['devices'], ['sd0', 'sd1'])

    def test_get_dmi_facts(self):
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result['product_name'], 'TestProduct')
        self.assertEqual(result['product_version'], '1.0')
        self.assertEqual(result['product_uuid'], '1234-5678-90AB-CDEF')
        self.assertEqual(result['product_serial'], 'SN1234567890')
        self.assertEqual(result['system_vendor'], 'TestVendor')

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._fact_class, OpenBSDHardware)

    def test_platform(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()