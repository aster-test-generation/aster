import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_get_uptime_facts(self):
        hardware = HurdHardware()
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_memory_facts(self):
        hardware = HurdHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_mount_facts(self):
        hardware = HurdHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

    def test_populate(self):
        hardware = HurdHardware()
        collected_facts = {}
        hardware_facts = hardware.populate(collected_facts)
        self.assertIsInstance(hardware_facts, dict)

    def test_str_method(self):
        hardware = HurdHardware()
        result = str(hardware)
        self.assertEqual(result, 'GNU')

    def test_repr_method(self):
        hardware = HurdHardware()
        result = repr(hardware)
        self.assertEqual(result, 'GNU')

class TestHurdHardwareCollector(unittest.TestCase):
    def test_init(self):
        collector = HurdHardwareCollector()
        self.assertIsInstance(collector, HurdHardwareCollector)

    def test_get_fact_class(self):
        collector = HurdHardwareCollector()
        fact_class = collector._fact_class
        self.assertEqual(fact_class, HurdHardware)

    def test_get_platform(self):
        collector = HurdHardwareCollector()
        platform = collector._platform
        self.assertEqual(platform, 'GNU')

if __name__ == '__main__':
    unittest.main()