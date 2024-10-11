import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_populate(self):
        hw = HPUXHardware(module)
        hw_facts = hw.populate()
        self.assertIn('processor_count', hw_facts)
        self.assertIn('processor_cores', hw_facts)
        self.assertIn('processor', hw_facts)
        self.assertIn('memtotal_mb', hw_facts)
        self.assertIn('memfree_mb', hw_facts)
        self.assertIn('swaptotal_mb', hw_facts)
        self.assertIn('swapfree_mb', hw_facts)

    def test_get_cpu_facts(self):
        hw = HPUXHardware(module)
        cpu_facts = hw.get_cpu_facts()
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)
        self.assertIn('processor', cpu_facts)

    def test_get_memory_facts(self):
        hw = HPUXHardware(module)
        memory_facts = hw.get_memory_facts()
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_hw_facts(self):
        hw = HPUXHardware(module)
        hw_facts = hw.get_hw_facts()
        self.assertIn('model', hw_facts)
        self.assertIn('firmware_version', hw_facts)
        self.assertIn('product_serial', hw_facts)

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_get_facts(self):
        hw_collector = HPUXHardwareCollector()
        hw_facts = hw_collector.get_facts()
        self.assertIn('ansible_processor', hw_facts)
        self.assertIn('ansible_memtotal_mb', hw_facts)
        self.assertIn('ansible_memfree_mb', hw_facts)
        self.assertIn('ansible_swaptotal_mb', hw_facts)
        self.assertIn('ansible_swapfree_mb', hw_facts)
        self.assertIn('ansible_model', hw_facts)
        self.assertIn('ansible_firmware_version', hw_facts)
        self.assertIn('ansible_product_serial', hw_facts)

if __name__ == '__main__':
    unittest.main()