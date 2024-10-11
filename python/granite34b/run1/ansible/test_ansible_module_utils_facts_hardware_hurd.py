import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        hardware = HurdHardware(module=None)
        hardware_facts = hardware.populate()
        self.assertIsInstance(hardware_facts, dict)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_populate(self):
        collector = HurdHardwareCollector()
        hardware_facts = collector.populate()
        self.assertIsInstance(hardware_facts, dict)

if __name__ == '__main__':
    unittest.main()