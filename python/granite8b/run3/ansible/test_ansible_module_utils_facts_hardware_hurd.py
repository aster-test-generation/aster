import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        instance = HurdHardware(module)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = HurdHardware(module)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = HurdHardware(module)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = HurdHardware(module)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_get_hardware_facts(self):
        instance = HurdHardwareCollector()
        result = instance.get_hardware_facts()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()