import unittest
from ansible.module_utils.facts.hardware.darwin import *


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware(module)
        hardware.sysctl = get_sysctl(self.module, ['hw', 'machdep', 'kern'])
        result = hardware.populate()
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        hardware = DarwinHardware(module)
        result = hardware.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        hardware = DarwinHardware(module)
        result = hardware.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        hardware = DarwinHardware(module)
        result = hardware.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        hardware = DarwinHardware(module)
        result = hardware.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        hardware = DarwinHardware(module)
        result = hardware.get_uptime_facts()
        self.assertIsInstance(result, dict)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = DarwinHardwareCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)

    def test_get_fact_class(self):
        collector = DarwinHardwareCollector()
        result = collector.get_fact_classes()
        self.assertEqual(result, DarwinHardware)

    def test_get_platform(self):
        collector = DarwinHardwareCollector()
        result = collector.get_hardware()
        self.assertEqual(result, 'Darwin')

if __name__ == '__main__':
    unittest.main()