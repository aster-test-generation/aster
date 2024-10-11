import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector
from ansible.module_utils.facts import timeout


class TestOpenBSDHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = OpenBSDHardware(self.module)
        self.hardware.sysctl = {
            'hw.usermem': '1048576',
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
            result = self.hardware.populate(3)
            self.assertIn('processor', result)
            self.assertIn('memory', result)
            self.assertIn('devices', result)
            self.assertIn('dmi', result)
            self.assertIn('uptime', result)
            self.assertIn('mounts', result)

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

if __name__ == '__main__':
    unittest.main()