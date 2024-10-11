import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_init(self):
        instance = HPUXHardware()
        self.assertIsInstance(instance, HPUXHardware)

    def test_populate(self):
        instance = HPUXHardware()
        collected_facts = {}
        collected_facts['ansible_architecture'] = '9000/800'
        result = instance.populate(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        instance = HPUXHardware()
        collected_facts = {}
        collected_facts['ansible_architecture'] = '9000/800'
        result = instance.get_cpu_facts(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_memory_facts(self):
        instance = HPUXHardware()
        collected_facts = {}
        result = instance.get_memory_facts(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_hw_facts(self):
        instance = HPUXHardware()
        collected_facts = {}
        result = instance.get_hw_facts(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = HPUXHardware()
        result = instance.__str__()
        self.assertEqual(result, 'HPUXHardware')

    def test_repr_method(self):
        instance = HPUXHardware()
        result = instance.__repr__()
        self.assertEqual(result, 'HPUXHardware()')

    def test_eq_method(self):
        instance1 = HPUXHardware()
        instance2 = HPUXHardware()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = HPUXHardware()
        with self.assertRaises(NotImplementedError):
            instance._HPUXHardware__private_method(1)

    def test_protected_method(self):
        instance = HPUXHardware()
        with self.assertRaises(NotImplementedError):
            instance._get_cpu_facts(1)

if __name__ == '__main__':
    unittest.main()