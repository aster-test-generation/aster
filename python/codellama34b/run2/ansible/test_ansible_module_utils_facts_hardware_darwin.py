import unittest
from ansible.module_utils.facts.hardware.darwin import *


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware(module)
        hardware_facts = hardware.populate()
        self.assertIsNotNone(hardware_facts)

    def test_get_system_profile(self):
        hardware = DarwinHardware(module)
        system_profile = hardware.get_system_profile()
        self.assertIsNotNone(system_profile)

    def test_get_mac_facts(self):
        hardware = DarwinHardware(module)
        mac_facts = hardware.get_mac_facts()
        self.assertIsNotNone(mac_facts)

    def test_get_cpu_facts(self):
        hardware = DarwinHardware(module)
        cpu_facts = hardware.get_cpu_facts()
        self.assertIsNotNone(cpu_facts)

    def test_get_memory_facts(self):
        hardware = DarwinHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertIsNotNone(memory_facts)

    def test_get_uptime_facts(self):
        hardware = DarwinHardware(module)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsNotNone(uptime_facts)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = DarwinHardwareCollector()
        hardware_facts = collector.collect()
        self.assertIsNotNone(hardware_facts)

if __name__ == '__main__':
    unittest.main()