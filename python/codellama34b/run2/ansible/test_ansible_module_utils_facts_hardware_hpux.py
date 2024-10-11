
import unittest
from ansible.module_utils.facts.hardware.hpux import *

class TestHPUXHardware(unittest.TestCase):
    def test_populate(self):
        instance = HPUXHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_hw_facts(self):
        instance = HPUXHardware()
        result = instance.get_hw_facts()
        self.assertIsInstance(result, dict)

    def test_platform(self):
        instance = HPUXHardware()
        result = instance.platform
        self.assertEqual(result, 'HP-UX')

    def test_get_cpu_facts_with_collected_facts(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={})
        self.assertIsInstance(result, dict)

    def test_get_memory_facts_with_collected_facts(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts(collected_facts={})
        self.assertIsInstance(result, dict)

    def test_get_hw_facts_with_collected_facts(self):
        instance = HPUXHardware()
        result = instance.get_hw_facts(collected_facts={})
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_with_collected_facts_ansible_architecture_9000_800(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': '9000/800'})
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_with_collected_facts_ansible_architecture_9000_785(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': '9000/785'})
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_with_collected_facts_ansible_architecture_ia64(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_architecture': 'ia64'})
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_with_collected_facts_ansible_distribution_version_B_11_23(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_distribution_version': 'B.11.23'})
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_with_collected_facts_ansible_distribution_version_B_11_31(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts(collected_facts={'ansible_distribution_version': 'B.11.31'})
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()