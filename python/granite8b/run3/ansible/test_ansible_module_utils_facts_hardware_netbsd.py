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

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = NetBSDHardwareCollector()
        hardware_facts = collector.collect()
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

if __name__ == '__main__':
    unittest.main()