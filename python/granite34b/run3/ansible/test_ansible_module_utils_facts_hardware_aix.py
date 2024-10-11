import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = AIXHardware(module=None)
        cpu_facts = instance.get_cpu_facts()
        self.assertEqual(cpu_facts['processor_count'], 4)
        self.assertEqual(cpu_facts['processor'], 'PowerPC')
        self.assertEqual(cpu_facts['processor_cores'], 4)

    def test_get_memory_facts(self):
        instance = AIXHardware(module=None)
        memory_facts = instance.get_memory_facts()
        self.assertEqual(memory_facts['memtotal_mb'], 2048)
        self.assertEqual(memory_facts['memfree_mb'], 1024)
        self.assertEqual(memory_facts['swaptotal_mb'], 1024)
        self.assertEqual(memory_facts['swapfree_mb'], 512)

    def test_get_dmi_facts(self):
        instance = AIXHardware(module=None)
        dmi_facts = instance.get_dmi_facts()
        self.assertEqual(dmi_facts['firmware_version'], '1.2.3')
        self.assertEqual(dmi_facts['product_serial'], '123456789')
        self.assertEqual(dmi_facts['lpar_info'], 'lpar1')
        self.assertEqual(dmi_facts['product_name'], 'AIX Server')

    def test_get_vgs_facts(self):
        instance = AIXHardware(module=None)
        vgs_facts = instance.get_vgs_facts()
        self.assertEqual(vgs_facts['vgs']['vg1'], [
            {'pv_name': '/dev/hd1', 'pv_state': 'active', 'total_pps': '1024', 'free_pps': '512', 'pp_size': '4096K'},
            {'pv_name': '/dev/hd2', 'pv_state': 'active', 'total_pps': '1024', 'free_pps': '512', 'pp_size': '4096K'}
        ])

    def test_get_mount_facts(self):
        instance = AIXHardware(module=None)
        mount_facts = instance.get_mount_facts()
        self.assertEqual(mount_facts['mounts'], [
            {'mount': '/', 'device': '/dev/hd1', 'fstype': 'jfs2', 'options': 'rw,log=/dev/hd3', 'time': '01/01/2023', 'size_total': 1024, 'size_available': 512},
            {'mount': '/home', 'device': '/dev/hd2', 'fstype': 'jfs2', 'options': 'rw,log=/dev/hd4', 'time': '01/01/2023', 'size_total': 512, 'size_available': 256}
        ])

    def test_get_device_facts(self):
        instance = AIXHardware(module=None)
        device_facts = instance.get_device_facts()
        self.assertEqual(device_facts['devices']['/dev/hd1'], {
            'state': 'active',
            'type': 'disk',
            'attributes': {
                'size': '1024G',
                'vendor': 'IBM',
                'model': '3333'
            }
        })


if __name__ == '__main__':
    unittest.main()