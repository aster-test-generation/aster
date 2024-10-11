import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        hardware = HurdHardware(module)
        hardware_facts = hardware.populate()
        self.assertIsInstance(hardware_facts, dict)
        self.assertIn('uptime', hardware_facts)
        self.assertIn('memory', hardware_facts)
        self.assertIn('mounts', hardware_facts)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_get_facts(self):
        collector = HurdHardwareCollector()
        hardware_facts = collector.get_facts()
        self.assertIsInstance(hardware_facts, dict)
        self.assertIn('uptime', hardware_facts)
        self.assertIn('memory', hardware_facts)
        self.assertIn('mounts', hardware_facts)

if __name__ == '__main__':
    unittest.main()