import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware()
        hardware_facts = hardware.populate()
        self.assertIsInstance(hardware_facts, dict)

    def test_get_system_profile(self):
        hardware = DarwinHardware()
        system_profile = hardware.get_system_profile()
        self.assertIsInstance(system_profile, dict)

    def test_get_mac_facts(self):
        hardware = DarwinHardware()
        mac_facts = hardware.get_mac_facts()
        self.assertIsInstance(mac_facts, dict)

    def test_get_cpu_facts(self):
        hardware = DarwinHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts(self):
        hardware = DarwinHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts(self):
        hardware = DarwinHardware()
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_populate(self):
        collector = DarwinHardwareCollector()
        hardware_facts = collector.populate()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()