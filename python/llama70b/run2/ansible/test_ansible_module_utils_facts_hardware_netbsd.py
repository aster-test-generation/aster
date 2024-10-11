import unittest
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector


class TestNetBSDHardware(unittest.TestCase):
    def test_init(self):
        instance = NetBSDHardware(module=None)
        self.assertIsInstance(instance, NetBSDHardware)

    def test_populate(self):
        instance = NetBSDHardware(module=None)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = NetBSDHardware(module=None)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = NetBSDHardware(module=None)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = NetBSDHardware(module=None)
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = NetBSDHardware(module=None)
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__init__(self):
        instance = NetBSDHardware(module=None)
        result = instance._NetBSDHardware__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = NetBSDHardware(module=None)
        result = instance.__str__()
        self.assertEqual(result, "NetBSDHardware")

    def test_repr_method(self):
        instance = NetBSDHardware(module=None)
        result = instance.__repr__()
        self.assertEqual(result, "NetBSDHardware()")

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = NetBSDHardwareCollector(module=None)
        self.assertIsInstance(instance, NetBSDHardwareCollector)

    def test_fact_class(self):
        instance = NetBSDHardwareCollector(module=None)
        self.assertEqual(instance._fact_class, NetBSDHardware)

    def test_platform(self):
        instance = NetBSDHardwareCollector(module=None)
        self.assertEqual(instance._platform, 'NetBSD')

    def test_private_method__init__(self):
        instance = NetBSDHardwareCollector(module=None)
        result = instance._NetBSDHardwareCollector__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = NetBSDHardwareCollector(module=None)
        result = instance.__str__()
        self.assertEqual(result, "NetBSDHardwareCollector")

    def test_repr_method(self):
        instance = NetBSDHardwareCollector(module=None)
        result = instance.__repr__()
        self.assertEqual(result, "NetBSDHardwareCollector()")

if __name__ == '__main__':
    unittest.main()