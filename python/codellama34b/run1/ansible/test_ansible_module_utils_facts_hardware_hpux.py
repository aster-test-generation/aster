import unittest
from ansible.module_utils.facts.hardware.hpux import *


class TestHPUXHardware(unittest.TestCase):
    def test_populate(self):
        instance = HPUXHardware(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_get_cpu_facts(self):
        instance = HPUXHardware(module)
        result = instance.get_cpu_facts()
        self.assertIsNotNone(result)

    def test_get_memory_facts(self):
        instance = HPUXHardware(module)
        result = instance.get_memory_facts()
        self.assertIsNotNone(result)

    def test_get_hw_facts(self):
        instance = HPUXHardware(module)
        result = instance.get_hw_facts()
        self.assertIsNotNone(result)

    def test_platform(self):
        instance = HPUXHardware(module)
        result = instance.platform
        self.assertEqual(result, 'HP-UX')

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = HPUXHardwareCollector()
        result = instance._fact_class
        self.assertEqual(result, HPUXHardware)

    def test_platform(self):
        instance = HPUXHardwareCollector()
        result = instance._platform
        self.assertEqual(result, 'HP-UX')

    def test_required_facts(self):
        instance = HPUXHardwareCollector()
        result = instance.required_facts
        self.assertEqual(result, set(['platform', 'distribution']))

if __name__ == '__main__':
    unittest.main()