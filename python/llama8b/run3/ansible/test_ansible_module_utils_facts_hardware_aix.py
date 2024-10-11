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
        cpu_facts = instance.get_cpu_facts()
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        instance = AIXHardware()
        memory_facts = instance.get_memory_facts()
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_dmi_facts(self):
        instance = AIXHardware()
        dmi_facts = instance.get_dmi_facts()
        self.assertIn('firmware_version', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('lpar_info', dmi_facts)
        self.assertIn('product_name', dmi_facts)

    def test_get_vgs_facts(self):
        instance = AIXHardware()
        vgs_facts = instance.get_vgs_facts()
        self.assertIn('vgs', vgs_facts)

    def test_get_mount_facts(self):
        instance = AIXHardware()
        mount_facts = instance.get_mount_facts()
        self.assertIn('mounts', mount_facts)

    def test_get_device_facts(self):
        instance = AIXHardware()
        device_facts = instance.get_device_facts()
        self.assertIn('devices', device_facts)

    def test___str__(self):
        instance = AIXHardware()
        result = instance.__str__()
        self.assertEqual(result, 'AIXHardware')

    def test___repr__(self):
        instance = AIXHardware()
        result = instance.__repr__()
        self.assertEqual(result, 'AIXHardware({})'.format(instance.method_one(0)))

class TestAIXHardwareCollector(unittest.TestCase):
    def test___init__(self):
        instance = AIXHardwareCollector()
        self.assertEqual(instance._platform, 'AIX')
        self.assertEqual(instance._fact_class, AIXHardware)

if __name__ == '__main__':
    unittest.main()