import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hardware = AIXHardware(self.module)

    def test_populate(self):
        self.hardware.get_cpu_facts = MagicMock(return_value={'cpu': 'facts'})
        self.hardware.get_memory_facts = MagicMock(return_value={'memory': 'facts'})
        self.hardware.get_dmi_facts = MagicMock(return_value={'dmi': 'facts'})
        self.hardware.get_vgs_facts = MagicMock(return_value={'vgs': 'facts'})
        self.hardware.get_mount_facts = MagicMock(return_value={'mount': 'facts'})
        self.hardware.get_device_facts = MagicMock(return_value={'device': 'facts'})
        
        result = self.hardware.populate()
        self.assertEqual(result, {
            'cpu': 'facts',
            'memory': 'facts',
            'dmi': 'facts',
            'vgs': 'facts',
            'mount': 'facts',
            'device': 'facts'
        })

    def test_get_cpu_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "proc0 Available\nproc1 Available", ""),
            (0, "type PowerPC_POWER8", ""),
            (0, "smt_threads 8", "")
        ])
        result = self.hardware.get_cpu_facts()
        self.assertEqual(result, {
            'processor': 'PowerPC_POWER8',
            'processor_count': 2,
            'processor_cores': 8
        })

    def test_get_memory_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "memory pages 1000\nfree pages 500", ""),
            (0, "Total Paging Space   Percent Used\n4096MB               50%", "")
        ])
        result = self.hardware.get_memory_facts()
        self.assertEqual(result, {
            'memtotal_mb': 4,
            'memfree_mb': 2,
            'swaptotal_mb': 4096,
            'swapfree_mb': 2048
        })

    def test_get_dmi_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "fwversion IBM,FW860.30", ""),
            (0, "Machine Serial Number: 123456\nLPAR Info: lpar1\nSystem Model: model1", "")
        ])
        self.module.get_bin_path = MagicMock(return_value="/usr/sbin/lsconf")
        result = self.hardware.get_dmi_facts()
        self.assertEqual(result, {
            'firmware_version': 'FW860.30',
            'product_serial': '123456',
            'lpar_info': 'lpar1',
            'product_name': 'model1'
        })

    def test_get_vgs_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "rootvg:\nFREE DISTRIBUTION\nhdisk0 active 100 50", ""),
            (0, "PP SIZE: 128 megabyte(s)", "")
        ])
        self.module.get_bin_path = MagicMock(return_value="/usr/sbin/lsvg")
        result = self.hardware.get_vgs_facts()
        self.assertEqual(result, {
            'vgs': {
                'rootvg': [{
                    'pv_name': 'hdisk0',
                    'pv_state': 'active',
                    'total_pps': '100',
                    'free_pps': '50',
                    'pp_size': '128 megabyte(s)'
                }]
            }
        })

    def test_get_mount_facts(self):
        self.module.run_command = MagicMock(return_value=(0, "/dev/hd4 / jfs2 rw,log=/dev/hd8 0 0", ""))
        self.module.get_bin_path = MagicMock(return_value="/usr/sbin/mount")
        result = self.hardware.get_mount_facts()
        self.assertEqual(result, {
            'mounts': [{
                'mount': '/',
                'device': '/dev/hd4',
                'fstype': 'jfs2',
                'options': 'rw,log=/dev/hd8',
                'time': '0 0'
            }]
        })

    def test_get_device_facts(self):
        self.module.run_command = MagicMock(side_effect=[
            (0, "hdisk0 Available Other SCSI Disk Drive", ""),
            (0, "size 100GB", "")
        ])
        self.module.get_bin_path = MagicMock(return_value="/usr/sbin/lsdev")
        result = self.hardware.get_device_facts()
        self.assertEqual(result, {
            'devices': {
                'hdisk0': {
                    'state': 'Available',
                    'type': 'Other SCSI Disk Drive',
                    'attributes': {
                        'size': '100GB'
                    }
                }
            }
        })

class TestAIXHardwareCollector(unittest.TestCase):
    def test_platform(self):
        collector = AIXHardwareCollector()
        self.assertEqual(collector._platform, 'AIX')

    def test_fact_class(self):
        collector = AIXHardwareCollector()
        self.assertEqual(collector._fact_class, AIXHardware)

if __name__ == '__main__':
    unittest.main()