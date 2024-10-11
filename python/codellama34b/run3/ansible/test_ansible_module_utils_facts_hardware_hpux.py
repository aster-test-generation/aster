
import unittest
from ansible.module_utils.facts.hardware.hpux import *

class TestHPUXHardware(unittest.TestCase):
    def test_populate(self):
        instance = HPUXHardware()
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_get_cpu_facts(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_hw_facts(self):
        instance = HPUXHardware()
        result = instance.get_hw_facts()
        self.assertIsNotNone(result)

    def test_platform(self):
        instance = HPUXHardware()
        result = instance.platform
        self.assertEqual(result, 'HP-UX')

    def test_get_cpu_facts_with_collected_facts(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': '9000/800'})
        self.assertIsNotNone(result)

    def test_get_cpu_facts_with_collected_facts_2(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': '9000/785'})
        self.assertIsNotNone(result)

    def test_get_cpu_facts_with_collected_facts_3(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': 'ia64'})
        self.assertIsNotNone(result)

    def test_get_cpu_facts_with_collected_facts_4(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': 'ia64', 'ansible_distribution_version': 'B.11.23'})
        self.assertIsNotNone(result)

    def test_get_cpu_facts_with_collected_facts_5(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': 'ia64', 'ansible_distribution_version': 'B.11.31'})
        self.assertIsNotNone(result)

    def test_get_memory_facts_with_collected_facts(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts(collected_facts={'ansible_architecture': '9000/800'})
        self.assertIsNotNone(result)

    def test_get_memory_facts_with_collected_facts_2(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts(collected_facts={'ansible_architecture': '9000/785'})
        self.assertIsNotNone(result)

    def test_get_memory_facts_with_collected_facts_3(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts(collected_facts={'ansible_architecture': 'ia64'})
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()