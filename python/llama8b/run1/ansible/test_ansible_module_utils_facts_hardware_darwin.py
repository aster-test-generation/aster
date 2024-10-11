import unittest
from ansible.module_utils.facts.hardware.darwin import DarwinHardware, DarwinHardwareCollector


class TestDarwinHardware(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardware()
        self.assertEqual(instance.platform, 'Darwin')

    def test_populate(self):
        instance = DarwinHardware()
        collected_facts = {}
        result = instance.populate(collected_facts)
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

    def test_get_system_profile_private(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__get_system_profile()
        self.assertIsInstance(result, dict)

    def test_get_mac_facts_private(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__get_mac_facts()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts_private(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts_private(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_uptime_facts_private(self):
        instance = DarwinHardware()
        result = instance._DarwinHardware__get_uptime_facts()
        self.assertIsInstance(result, dict)

    def test_str(self):
        instance = DarwinHardware()
        result = str(instance)
        self.assertEqual(result, 'DarwinHardware')

    def test_repr(self):
        instance = DarwinHardware()
        result = repr(instance)
        self.assertEqual(result, 'DarwinHardware({})'.format(instance.method_one(0)))

    def test_eq(self):
        instance1 = DarwinHardware()
        instance2 = DarwinHardware()
        self.assertEqual(instance1, instance2)

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardwareCollector()
        self.assertEqual(instance._fact_class, DarwinHardware)
        self.assertEqual(instance._platform, 'Darwin')

class TestDarwinHardware(unittest.TestCase):
    def test_populate(self):
        instance = DarwinHardware(None)
        collected_facts = instance.populate()
        self.assertIsInstance(collected_facts, dict)

    def test_get_system_profile(self):
        instance = DarwinHardware(None)
        system_profile = instance.get_system_profile()
        self.assertIsInstance(system_profile, dict)

    def test_get_mac_facts(self):
        instance = DarwinHardware(None)
        mac_facts = instance.get_mac_facts()
        self.assertIsInstance(mac_facts, dict)

    def test_get_cpu_facts(self):
        instance = DarwinHardware(None)
        cpu_facts = instance.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts(self):
        instance = DarwinHardware(None)
        memory_facts = instance.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts(self):
        instance = DarwinHardware(None)
        uptime_facts = instance.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_system_profile_private(self):
        instance = DarwinHardware(None)
        system_profile = instance._DarwinHardware__get_system_profile()
        self.assertIsInstance(system_profile, dict)

    def test_get_mac_facts_private(self):
        instance = DarwinHardware(None)
        mac_facts = instance._DarwinHardware__get_mac_facts()
        self.assertIsInstance(mac_facts, dict)

    def test_get_cpu_facts_private(self):
        instance = DarwinHardware(None)
        cpu_facts = instance._DarwinHardware__get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)

    def test_get_memory_facts_private(self):
        instance = DarwinHardware(None)
        memory_facts = instance._DarwinHardware__get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts_private(self):
        instance = DarwinHardware(None)
        uptime_facts = instance._DarwinHardware__get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_str_method(self):
        instance = DarwinHardware(None)
        result = instance.__str__()
        self.assertEqual(result, 'DarwinHardware')

    def test_repr_method(self):
        instance = DarwinHardware(None)
        result = instance.__repr__()
        self.assertEqual(result, 'DarwinHardware(None)')

class TestDarwinHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = DarwinHardwareCollector()
        self.assertIsInstance(instance, DarwinHardwareCollector)

if __name__ == '__main__':
    unittest.main()