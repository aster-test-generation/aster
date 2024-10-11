import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_init(self):
        instance = AIXHardware()
        self.assertIsInstance(instance, AIXHardware)

    def test_platform(self):
        instance = AIXHardware()
        self.assertEqual(instance.platform, 'AIX')

    def test_populate(self):
        instance = AIXHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = AIXHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = AIXHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_dmi_facts(self):
        instance = AIXHardware()
        result = instance.get_dmi_facts()
        self.assertIsInstance(result, dict)

    def test_get_vgs_facts(self):
        instance = AIXHardware()
        result = instance.get_vgs_facts()
        self.assertIsInstance(result, dict)

    def test_get_mount_facts(self):
        instance = AIXHardware()
        result = instance.get_mount_facts()
        self.assertIsInstance(result, dict)

    def test_get_device_facts(self):
        instance = AIXHardware()
        result = instance.get_device_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__get_cpu_facts_helper(self):
        instance = AIXHardware()
        result = instance._AIXHardware__get_cpu_facts_helper()
        self.assertIsInstance(result, dict)

    def test_protected_method__get_memory_facts_helper(self):
        instance = AIXHardware()
        result = instance._get_memory_facts_helper()
        self.assertIsInstance(result, dict)

    def test_magic_method__str__(self):
        instance = AIXHardware()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        instance = AIXHardware()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestAIXHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = AIXHardwareCollector()
        self.assertIsInstance(instance, AIXHardwareCollector)

    def test_platform(self):
        instance = AIXHardwareCollector()
        self.assertEqual(instance._platform, 'AIX')

    def test_fact_class(self):
        instance = AIXHardwareCollector()
        self.assertEqual(instance._fact_class, AIXHardware)

if __name__ == '__main__':
    unittest.main()