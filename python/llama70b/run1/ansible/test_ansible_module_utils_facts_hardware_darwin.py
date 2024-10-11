import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardware()
        self.assertIsInstance(instance, DarwinHardware)

    def test_populate(self):
        instance = DarwinHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        instance = DarwinHardware()
        result = instance.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        instance = DarwinHardware()
        result = instance.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = DarwinHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = DarwinHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = DarwinHardware()
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__init__(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = DarwinHardware()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = DarwinHardware()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardwareCollector()
        self.assertIsInstance(instance, DarwinHardwareCollector)

    def test_fact_class(self):
        instance = DarwinHardwareCollector()
        self.assertEqual(instance._fact_class, DarwinHardware)

    def test_platform(self):
        instance = DarwinHardwareCollector()
        self.assertEqual(instance._platform, 'Darwin')

    def test_private_method__init__(self):
        instance = DarwinHardwareCollector()
        result = instance._DarwinHardwareCollector__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = DarwinHardwareCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = DarwinHardwareCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestDarwinHardware(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardware(None)
        self.assertIsInstance(instance, DarwinHardware)

    def test_populate(self):
        instance = DarwinHardware(None)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_system_profile(self):
        instance = DarwinHardware(None)
        result = instance.get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts(self):
        instance = DarwinHardware(None)
        result = instance.get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = DarwinHardware(None)
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = DarwinHardware(None)
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts(self):
        instance = DarwinHardware(None)
        result = instance.get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__init__(self):
        instance = DarwinHardware(None)
        result = instance._DarwinHardware__init__(None)
        self.assertIsNone(result)

    def test_protected_method_get_mac_facts(self):
        instance = DarwinHardware(None)
        result = instance._get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_magic_method_str(self):
        instance = DarwinHardware(None)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_magic_method_repr(self):
        instance = DarwinHardware(None)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardwareCollector()
        self.assertIsInstance(instance, DarwinHardwareCollector)

    def test_fact_class(self):
        instance = DarwinHardwareCollector()
        self.assertEqual(instance._fact_class, DarwinHardware)

    def test_platform(self):
        instance = DarwinHardwareCollector()
        self.assertEqual(instance._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()