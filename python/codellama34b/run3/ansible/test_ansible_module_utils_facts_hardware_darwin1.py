import unittest
from ansible.module_utils.facts.hardware.darwin import *

class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware(None)
        hardware.sysctl = {}
        hardware.module = None
        result = hardware.populate()
        self.assertEqual(result, {})

    def test_get_system_profile(self):
        hardware = DarwinHardware(None)
        hardware.module = None
        result = hardware.get_system_profile()
        self.assertEqual(result, {})

    def test_get_mac_facts(self):
        hardware = DarwinHardware(None)
        hardware.sysctl = {}
        hardware.module = None
        result = hardware.get_mac_facts()
        self.assertEqual(result, {'osversion': '', 'osrevision': ''})

    def test_get_cpu_facts(self):
        hardware = DarwinHardware(None)
        hardware.sysctl = {}
        hardware.module = None
        result = hardware.get_cpu_facts()
        self.assertEqual(result, {'processor_cores': '', 'processor_vcpus': '', 'processor': ''})

    def test_get_memory_facts(self):
        hardware = DarwinHardware(None)
        hardware.sysctl = {}
        hardware.module = None
        result = hardware.get_memory_facts()
        self.assertEqual(result, {'memfree_mb': 0, 'memtotal_mb': 0})

    def test_get_uptime_facts(self):
        hardware = DarwinHardware(None)
        hardware.sysctl = {}
        hardware.module = None
        result = hardware.get_uptime_facts()
        self.assertEqual(result, {'uptime_seconds': 0})

class TestDarwinHardwareCollector(unittest.TestCase):
    def test__fact_class(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._fact_class, DarwinHardware)

    def test__platform(self):
        collector = DarwinHardwareCollector()
        self.assertEqual(collector._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()