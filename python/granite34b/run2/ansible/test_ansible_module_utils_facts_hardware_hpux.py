import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = HPUXHardware(module=None)
        cpu_facts = instance.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts(self):
        instance = HPUXHardware(module=None)
        memory_facts = instance.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_hw_facts(self):
        instance = HPUXHardware(module=None)
        hw_facts = instance.get_hw_facts()
        self.assertIsInstance(hw_facts, dict)

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_populate(self):
        instance = HPUXHardwareCollector()
        hardware_facts = instance.populate()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()