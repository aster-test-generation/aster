import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = HPUXHardware(module=None)
        collected_facts = {'ansible_architecture': '9000/800'}
        cpu_facts = instance.get_cpu_facts(collected_facts=collected_facts)
        self.assertEqual(cpu_facts['processor_count'], 1)

    def test_get_memory_facts(self):
        instance = HPUXHardware(module=None)
        collected_facts = {'ansible_architecture': '9000/800'}
        memory_facts = instance.get_memory_facts(collected_facts=collected_facts)
        self.assertEqual(memory_facts['memfree_mb'], 1)
        self.assertEqual(memory_facts['memtotal_mb'], 1)
        self.assertEqual(memory_facts['swaptotal_mb'], 1)
        self.assertEqual(memory_facts['swapfree_mb'], 1)

    def test_get_hw_facts(self):
        instance = HPUXHardware(module=None)
        collected_facts = {'ansible_architecture': '9000/800'}
        hw_facts = instance.get_hw_facts(collected_facts=collected_facts)
        self.assertEqual(hw_facts['model'], 'model')

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_populate(self):
        instance = HPUXHardwareCollector()
        collected_facts = {'platform': 'HP-UX', 'distribution': 'distribution'}
        hardware_facts = instance.populate()
        self.assertEqual(hardware_facts['platform'], 'HP-UX')
        self.assertEqual(hardware_facts['distribution'], 'distribution')

if __name__ == '__main__':
    unittest.main()