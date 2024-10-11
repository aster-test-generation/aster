import unittest
from ansible.module_utils.facts.facts import Hardware, HardwareCollector
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector


class TestNetBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = NetBSDHardware()
        hardware_facts = hardware.populate()
        self.assertIn('processor', hardware_facts)
        self.assertIn('processor_count', hardware_facts)
        self.assertIn('processor_cores', hardware_facts)
        self.assertIn('memory_mb', hardware_facts)
        self.assertIn('swapfree_mb', hardware_facts)
        self.assertIn('mounts', hardware_facts)
        self.assertIn('dmi', hardware_facts)
        self.assertIn('product_name', hardware_facts['dmi'])
        self.assertIn('product_version', hardware_facts['dmi'])
        self.assertIn('product_uuid', hardware_facts['dmi'])
        self.assertIn('product_serial', hardware_facts['dmi'])
        self.assertIn('system_vendor', hardware_facts['dmi'])

    def test_get_cpu_facts(self):
        hardware = NetBSDHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertIn('processor', cpu_facts)
        self.assertEqual(len(cpu_facts['processor']), 1)
        self.assertIn('processor_count', cpu_facts)
        self.assertEqual(cpu_facts['processor_count'], 1)
        self.assertIn('processor_cores', cpu_facts)
        self.assertEqual(cpu_facts['processor_cores'], 'NA')

    def test_get_memory_facts(self):
        hardware = NetBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIn('memory_mb', memory_facts)
        self.assertEqual(memory_facts['memory_mb'], 1024)
        self.assertIn('swapfree_mb', memory_facts)
        self.assertEqual(memory_facts['swapfree_mb'], 1024)

    def test_get_mount_facts(self):
        hardware = NetBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertIn('mounts', mount_facts)
        self.assertEqual(len(mount_facts['mounts']), 1)
        self.assertIn('mount', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')
        self.assertIn('device', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['device'], 'tmpfs')
        self.assertIn('fstype', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['fstype'], 'tmpfs')
        self.assertIn('options', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,relatime,size=1024m')
        self.assertIn('size_total', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['size_total'], 1024)
        self.assertIn('size_available', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['size_available'], 1024)
        self.assertIn('used', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['used'], 0)
        self.assertIn('free', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['free'], 1024)
        self.assertIn('free_percent', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['free_percent'], 100)
        self.assertIn('mount', mount_facts['mounts'][0])
        self.assertEqual(mount_facts['mounts'][0]['mount'], '/')

if __name__ == '__main__':
    unittest.main()