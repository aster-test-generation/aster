import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_populate(self):
        instance = AIXHardware()
        collected_facts = {}
        result = instance.populate(collected_facts)
        self.assertEqual(result, collected_facts)

    def test_get_cpu_facts(self):
        instance = AIXHardware()
        result = instance.get_cpu_facts()
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)

    def test_get_memory_facts(self):
        instance = AIXHardware()
        result = instance.get_memory_facts()
        self.assertIn('memtotal_mb', result)
        self.assertIn('memfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swapfree_mb', result)

    def test_get_dmi_facts(self):
        instance = AIXHardware()
        result = instance.get_dmi_facts()
        self.assertIn('firmware_version', result)
        self.assertIn('product_serial', result)
        self.assertIn('lpar_info', result)
        self.assertIn('product_name', result)

    def test_get_vgs_facts(self):
        instance = AIXHardware()
        result = instance.get_vgs_facts()
        self.assertIn('vgs', result)

    def test_get_mount_facts(self):
        instance = AIXHardware()
        result = instance.get_mount_facts()
        self.assertIn('mounts', result)

    def test_get_device_facts(self):
        instance = AIXHardware()
        result = instance.get_device_facts()
        self.assertIn('devices', result)

    def test_str_method(self):
        instance = AIXHardware()
        result = instance.__str__()
        self.assertEqual(result, 'AIXHardware')

    def test_repr_method(self):
        instance = AIXHardware()
        result = instance.__repr__()
        self.assertEqual(result, 'AIXHardware({})'.format(instance.method_one(0)))

    def test_private_method(self):
        instance = AIXHardware()
        with self.assertRaises(NotImplementedError):
            instance._AIXHardware__private_method(3)

    def test_protected_method(self):
        instance = AIXHardware()
        with self.assertRaises(NotImplementedError):
            instance._protected_method(3)

if __name__ == '__main__':
    unittest.main()