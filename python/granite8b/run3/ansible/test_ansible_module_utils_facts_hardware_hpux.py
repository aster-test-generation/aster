import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_populate(self):
        hardware = HPUXHardware(module)
        hardware_facts = hardware.populate()
        self.assertIn('processor_count', hardware_facts)
        self.assertIn('processor_cores', hardware_facts)
        self.assertIn('processor', hardware_facts)
        self.assertIn('memtotal_mb', hardware_facts)
        self.assertIn('memfree_mb', hardware_facts)
        self.assertIn('swaptotal_mb', hardware_facts)
        self.assertIn('swapfree_mb', hardware_facts)

    def test_get_cpu_facts(self):
        hardware = HPUXHardware(module)
        cpu_facts = hardware.get_cpu_facts()
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)
        self.assertIn('processor', cpu_facts)

    def test_get_memory_facts(self):
        hardware = HPUXHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_hw_facts(self):
        hardware = HPUXHardware(module)
        hw_facts = hardware.get_hw_facts()
        self.assertIn('model', hw_facts)
        self.assertIn('firmware_version', hw_facts)
        self.assertIn('product_serial', hw_facts)

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = HPUXHardwareCollector()
        hardware_facts = collector.collect()
        self.assertIn('ansible_processor', hardware_facts)
        self.assertIn('ansible_memtotal_mb', hardware_facts)
        self.assertIn('ansible_memfree_mb', hardware_facts)
        self.assertIn('ansible_swaptotal_mb', hardware_facts)
        self.assertIn('ansible_swapfree_mb', hardware_facts)
        self.assertIn('ansible_model', hardware_facts)
        self.assertIn('ansible_firmware_version', hardware_facts)
        self.assertIn('ansible_product_serial', hardware_facts)

if __name__ == '__main__':
    unittest.main()