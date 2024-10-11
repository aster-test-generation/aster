import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector

class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        dh = DarwinHardware(None)
        collected_facts = {}
        result = dh.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        dh = DarwinHardware(None)
        result = dh.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        dh = DarwinHardware(None)
        result = dh.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        dh = DarwinHardware(None)
        result = dh.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        dh = DarwinHardware(None)
        result = dh.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        dh = DarwinHardware(None)
        result = dh.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test__init__(self):
        dh = DarwinHardware(None)
        self.assertIsInstance(dh, DarwinHardware)

    def test__str__(self):
        dh = DarwinHardware(None)
        result = str(dh)
        self.assertEqual(result, 'DarwinHardware')

    def test__repr__(self):
        dh = DarwinHardware(None)
        result = repr(dh)
        self.assertEqual(result, 'DarwinHardware(None)')

    def test__eq__(self):
        dh1 = DarwinHardware(None)
        dh2 = DarwinHardware(None)
        self.assertEqual(dh1, dh2)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test__init__(self):
        dhc = DarwinHardwareCollector()
        self.assertIsInstance(dhc, DarwinHardwareCollector)

    def test_get_fact_class(self):
        dhc = DarwinHardwareCollector()
        result = dhc._fact_class
        self.assertEqual(result, DarwinHardware)

    def test_get_platform(self):
        dhc = DarwinHardwareCollector()
        result = dhc._platform
        self.assertEqual(result, 'Darwin')

if __name__ == '__main__':
    unittest.main()