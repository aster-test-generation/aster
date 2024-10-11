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
        self.assertEqual(memory_facts['swapfree_mb'], 512)

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
        self.assertEqual(mount_facts['mounts'][0]['options'], 'rw,noexec,relatime,size=1024m')

    def test_get_dmi_facts(self):
        hardware = NetBSDHardware()
        dmi_facts = hardware.get_dmi_facts()
        self.assertIn('product_name', dmi_facts)
        self.assertEqual(dmi_facts['product_name'], 'NetBSD')
        self.assertIn('product_version', dmi_facts)
        self.assertEqual(dmi_facts['product_version'], '10.0')
        self.assertIn('product_uuid', dmi_facts)
        self.assertEqual(dmi_facts['product_uuid'], 'UUID: 00000000-0000-0000-0000-000000000000')
        self.assertIn('product_serial', dmi_facts)
        self.assertEqual(dmi_facts['product_serial'], 'Serial: 0000000000000000000000000000000000000000000000000000000000000000')
        self.assertIn('system_vendor', dmi_facts)
        self.assertEqual(dmi_facts['system_vendor'], 'Vendor: NetBSD')


if __name__ == '__main__':
    unittest.main()