import unittest
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test_init(self):
        instance = FreeBSDHardware()
        self.assertIsInstance(instance, FreeBSDHardware)

    def test_populate(self):
        instance = FreeBSDHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware()
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test__private_method(self):
        instance = FreeBSDHardware()
        result = instance._FreeBSDHardware__private_method()  # Note: this method does not exist in the target code
        self.fail("This method does not exist in the target code")

    def test_str_method(self):
        instance = FreeBSDHardware()
        result = instance.__str__()
        self.assertEqual(result, "FreeBSDHardware")

    def test_repr_method(self):
        instance = FreeBSDHardware()
        result = instance.__repr__()
        self.assertEqual(result, "FreeBSDHardware({})".format(instance.platform))

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = FreeBSDHardwareCollector()
        self.assertIsInstance(instance, FreeBSDHardwareCollector)

    def test_fact_class(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._fact_class, FreeBSDHardware)

    def test_platform(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()