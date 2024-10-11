import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        darwin_hardware = DarwinHardware(module=None)
        collected_facts = {}
        result = darwin_hardware.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        darwin_hardware = DarwinHardware(module=None)
        result = darwin_hardware.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        result = darwin_hardware.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        result = darwin_hardware.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        result = darwin_hardware.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        result = darwin_hardware.get_uptime_facts()
        self.assertIsInstance(result, dict)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_populate(self):
        darwin_hardware_collector = DarwinHardwareCollector()
        collected_facts = {}
        result = darwin_hardware_collector.populate()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()