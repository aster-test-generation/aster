import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        hardware = HurdHardware(module)
        collected_facts = {}
        hardware_facts = hardware.populate(collected_facts)
        self.assertIsInstance(hardware_facts, dict)

    def test_get_uptime_facts(self):
        hardware = HurdHardware(module)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_memory_facts(self):
        hardware = HurdHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_mount_facts(self):
        hardware = HurdHardware(module)
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_get_hardware_facts(self):
        collector = HurdHardwareCollector()
        hardware_facts = collector.get_hardware_facts()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()