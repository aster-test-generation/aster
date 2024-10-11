import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_init(self):
        instance = HPUXHardware()
        self.assertIsInstance(instance, HPUXHardware)

    def test_populate(self):
        instance = HPUXHardware()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = HPUXHardware()
        result = instance.get_cpu_facts()
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = HPUXHardware()
        result = instance.get_memory_facts()
        self.assertIsInstance(result, dict)

    def test_get_hw_facts(self):
        instance = HPUXHardware()
        result = instance.get_hw_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__module(self):
        instance = HPUXHardware()
        result = instance._HPUXHardware__module
        self.assertIsInstance(result, object)

    def test_str_method(self):
        instance = HPUXHardware()
        result = instance.__str__()
        self.assertEqual(result, "HPUXHardware")

    def test_repr_method(self):
        instance = HPUXHardware()
        result = instance.__repr__()
        self.assertEqual(result, "HPUXHardware({})".format(instance.platform))

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = HPUXHardwareCollector()
        self.assertIsInstance(instance, HPUXHardwareCollector)

    def test_fact_class(self):
        instance = HPUXHardwareCollector()
        self.assertEqual(instance._fact_class, HPUXHardware)

    def test_platform(self):
        instance = HPUXHardwareCollector()
        self.assertEqual(instance._platform, 'HP-UX')

    def test_required_facts(self):
        instance = HPUXHardwareCollector()
        self.assertEqual(instance.required_facts, set(['platform', 'distribution']))

    def test_private_method__collect(self):
        instance = HPUXHardwareCollector()
        result = instance._collect()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()