import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector


class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware(None)
        hardware_facts = hardware.populate()
        self.assertIsInstance(hardware_facts, dict)

    def test_get_mount_facts(self):
        hardware = OpenBSDHardware(None)
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

    def test_get_memory_facts(self):
        hardware = OpenBSDHardware(None)
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts(self):
        hardware = OpenBSDHardware(None)
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_processor_facts(self):
        hardware = OpenBSDHardware(None)
        cpu_facts = hardware.get_processor_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_device_facts(self):
        hardware = OpenBSDHardware(None)
        device_facts = hardware.get_device_facts()
        self.assertIsInstance(device_facts, dict)

    def test_get_dmi_facts(self):
        hardware = OpenBSDHardware(None)
        dmi_facts = hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)

    def test_str_method(self):
        hardware = OpenBSDHardware(None)
        result = str(hardware)
        self.assertEqual(result, "OpenBSDHardware")

    def test_repr_method(self):
        hardware = OpenBSDHardware(None)
        result = repr(hardware)
        self.assertEqual(result, "OpenBSDHardware()")

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        collector = OpenBSDHardwareCollector()
        self.assertIsInstance(collector, OpenBSDHardwareCollector)

    def test_get_fact_class(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._fact_class, OpenBSDHardware)

    def test_get_platform(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()