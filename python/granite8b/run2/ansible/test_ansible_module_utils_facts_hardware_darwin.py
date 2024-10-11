import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        hardware = DarwinHardware(module)
        hardware_facts = hardware.populate()
        self.assertIn('model', hardware_facts)
        self.assertIn('osversion', hardware_facts)
        self.assertIn('osrevision', hardware_facts)
        self.assertIn('processor', hardware_facts)
        self.assertIn('processor_cores', hardware_facts)
        self.assertIn('processor_vcpus', hardware_facts)
        self.assertIn('memtotal_mb', hardware_facts)
        self.assertIn('memfree_mb', hardware_facts)
        self.assertIn('uptime_seconds', hardware_facts)

    def test_get_system_profile(self):
        hardware = DarwinHardware(module)
        system_profile = hardware.get_system_profile()
        self.assertIn('Processor Name', system_profile)
        self.assertIn('Processor Speed', system_profile)

    def test_get_mac_facts(self):
        hardware = DarwinHardware(module)
        mac_facts = hardware.get_mac_facts()
        self.assertIn('model', mac_facts)
        self.assertIn('product_name', mac_facts)
        self.assertIn('osversion', mac_facts)
        self.assertIn('osrevision', mac_facts)

    def test_get_cpu_facts(self):
        hardware = DarwinHardware(module)
        cpu_facts = hardware.get_cpu_facts()
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)
        self.assertIn('processor_vcpus', cpu_facts)

    def test_get_memory_facts(self):
        hardware = DarwinHardware(module)
        memory_facts = hardware.get_memory_facts()
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)

    def test_get_uptime_facts(self):
        hardware = DarwinHardware(module)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIn('uptime_seconds', uptime_facts)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_get_hardware(self):
        collector = DarwinHardwareCollector()
        hardware = collector.get_hardware()
        self.assertIsInstance(hardware, DarwinHardware)

if __name__ == '__main__':
    unittest.main()