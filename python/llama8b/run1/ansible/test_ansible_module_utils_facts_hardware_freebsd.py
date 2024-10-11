import unittest
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test_init(self):
        instance = FreeBSDHardware()
        self.assertIsInstance(instance, FreeBSDHardware)

    def test_populate(self):
        instance = FreeBSDHardware()
        collected_facts = instance.populate()
        self.assertIsInstance(collected_facts, dict)

    def test_get_cpu_facts(self):
        instance = FreeBSDHardware()
        cpu_facts = instance.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware()
        memory_facts = instance.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware()
        uptime_facts = instance.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware()
        mount_facts = instance.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

    def test_get_device_facts(self):
        instance = FreeBSDHardware()
        device_facts = instance.get_device_facts()
        self.assertIsInstance(device_facts, dict)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware()
        dmi_facts = instance.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)

    def test_str_method(self):
        instance = FreeBSDHardware()
        result = instance.__str__()
        self.assertEqual(result, "FreeBSDHardware")

    def test_repr_method(self):
        instance = FreeBSDHardware()
        result = instance.__repr__()
        self.assertEqual(result, "FreeBSDHardware()")

    def test_eq_method(self):
        instance1 = FreeBSDHardware()
        instance2 = FreeBSDHardware()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = FreeBSDHardware()
        result = instance._FreeBSDHardware__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = FreeBSDHardware()
        result = instance._get_cpu_facts()
        self.assertIsInstance(result, dict)

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = FreeBSDHardwareCollector()
        self.assertIsInstance(instance, FreeBSDHardwareCollector)

    def test_get_fact_class(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._fact_class, FreeBSDHardware)

    def test_get_platform(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()