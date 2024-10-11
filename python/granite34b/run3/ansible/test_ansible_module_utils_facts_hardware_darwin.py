import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_get_system_profile(self):
        darwin_hardware = DarwinHardware(module=None)
        system_profile = darwin_hardware.get_system_profile()
        self.assertIsInstance(system_profile, dict)

    def test_get_mac_facts(self):
        darwin_hardware = DarwinHardware(None)
        mac_facts = darwin_hardware.get_mac_facts()
        self.assertIsInstance(mac_facts, dict)
        self.assertIn('model', mac_facts)
        self.assertIn('product_name', mac_facts)
        self.assertIn('osversion', mac_facts)
        self.assertIn('osrevision', mac_facts)

    def test_get_cpu_facts(self):
        darwin_hardware = DarwinHardware(None)
        cpu_facts = darwin_hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)
        self.assertIn('processor_vcpus', cpu_facts)

    def test_get_memory_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        memory_facts = darwin_hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)

    def test_get_uptime_facts(self):
        darwin_hardware = DarwinHardware(module=None)
        uptime_facts = darwin_hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)
        self.assertIn('uptime_seconds', uptime_facts)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_populate(self):
        darwin_hardware_collector = DarwinHardwareCollector()
        collected_facts = darwin_hardware_collector.populate()
        self.assertIsInstance(collected_facts, dict)

if __name__ == '__main__':
    unittest.main()