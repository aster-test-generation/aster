import unittest
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def test_init(self):
        instance = HPUXHardware(module='hpux')
        self.assertEqual(instance.platform, 'HP-UX')

    def test_populate(self):
        instance = HPUXHardware(module='hpux')
        collected_facts = {'ansible_architecture': '9000/800'}
        result = instance.populate(collected_facts=collected_facts)
        self.assertIn('processor_count', result)

    def test_get_cpu_facts(self):
        instance = HPUXHardware(module='hpux')
        collected_facts = {'ansible_architecture': '9000/800'}
        result = instance.get_cpu_facts(collected_facts=collected_facts)
        self.assertIn('processor_count', result)

    def test_get_memory_facts(self):
        instance = HPUXHardware(module='hpux')
        collected_facts = {'ansible_architecture': '9000/800'}
        result = instance.get_memory_facts(collected_facts=collected_facts)
        self.assertIn('memfree_mb', result)

    def test_get_hw_facts(self):
        instance = HPUXHardware(module='hpux')
        collected_facts = {'ansible_architecture': 'ia64'}
        result = instance.get_hw_facts(collected_facts=collected_facts)
        self.assertIn('model', result)

    def test_str_method(self):
        instance = HPUXHardware(module='hpux')
        result = str(instance)
        self.assertEqual(result, 'HPUXHardware')

    def test_repr_method(self):
        instance = HPUXHardware(module='hpux')
        result = repr(instance)
        self.assertEqual(result, 'HPUXHardware()')

    def test_eq_method(self):
        instance1 = HPUXHardware(module='hpux')
        instance2 = HPUXHardware(module='hpux')
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = HPUXHardware(module='hpux')
        with self.assertRaises(NotImplementedError):
            instance._HPUXHardware__private_method(3)

    def test_protected_method(self):
        instance = HPUXHardware(module='hpux')
        with self.assertRaises(NotImplementedError):
            instance._get_cpu_facts(3)

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_init(self):
        instance = HPUXHardwareCollector()
        self.assertEqual(instance._fact_class, HPUXHardware)
        self.assertEqual(instance._platform, 'HP-UX')

    def test_required_facts(self):
        instance = HPUXHardwareCollector()
        self.assertEqual(instance.required_facts, {'platform', 'distribution'})

if __name__ == '__main__':
    unittest.main()