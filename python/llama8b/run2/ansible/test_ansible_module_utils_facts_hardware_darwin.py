import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware(None)
        collected_facts = {}
        result = hardware.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        hardware = DarwinHardware(None)
        result = hardware.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        hardware = DarwinHardware(None)
        result = hardware.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        hardware = DarwinHardware(None)
        result = hardware.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        hardware = DarwinHardware(None)
        result = hardware.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        hardware = DarwinHardware(None)
        result = hardware.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_get_system_profile_private(self):
        hardware = DarwinHardware(None)
        result = hardware._DarwinHardware__get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts_private(self):
        hardware = DarwinHardware(None)
        result = hardware._DarwinHardware__get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_private(self):
        hardware = DarwinHardware(None)
        result = hardware._DarwinHardware__get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts_private(self):
        hardware = DarwinHardware(None)
        result = hardware._DarwinHardware__get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts_private(self):
        hardware = DarwinHardware(None)
        result = hardware._DarwinHardware__get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        hardware = DarwinHardware(None)
        result = str(hardware)
        self.assertEqual(result, "DarwinHardware")

    def test_repr_method(self):
        hardware = DarwinHardware(None)
        result = repr(hardware)
        self.assertEqual(result, "DarwinHardware(None)")

    def test_eq_method(self):
        hardware1 = DarwinHardware(None)
        hardware2 = DarwinHardware(None)
        self.assertTrue(hardware1 == hardware2)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_init(self):
        collector = DarwinHardwareCollector()
        self.assertIsInstance(collector, DarwinHardwareCollector)

if __name__ == '__main__':
    unittest.main()