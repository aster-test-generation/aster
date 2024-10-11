import unittest
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector


class TestNetBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = NetBSDHardware()
        collected_facts = {}
        result = hardware.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        hardware = NetBSDHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts(self):
        hardware = NetBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_mount_facts(self):
        hardware = NetBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

    def test_get_dmi_facts(self):
        hardware = NetBSDHardware()
        dmi_facts = hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)

    def test_str_method(self):
        hardware = NetBSDHardware()
        result = str(hardware)
        self.assertEqual(result, "NetBSDHardware")

    def test_repr_method(self):
        hardware = NetBSDHardware()
        result = repr(hardware)
        self.assertEqual(result, "NetBSDHardware()")

    def test_eq_method(self):
        hardware1 = NetBSDHardware()
        hardware2 = NetBSDHardware()
        self.assertTrue(hardware1 == hardware2)

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_init_method(self):
        collector = NetBSDHardwareCollector()
        self.assertIsInstance(collector, NetBSDHardwareCollector)

    def test_fact_class_method(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._fact_class, NetBSDHardware)

    def test_platform_method(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()