import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        hardware = HurdHardware(module=None)
        hardware_facts = hardware.populate()
        self.assertIsInstance(hardware_facts, dict)

    def test_get_uptime_facts(self):
        hardware = HurdHardware(module=None)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_memory_facts(self):
        hardware = HurdHardware(module=None)
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_mount_facts(self):
        hardware = HurdHardware(module)
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_populate(self):
        collector = HurdHardwareCollector()
        hardware_facts = collector.populate()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()