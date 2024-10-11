import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        # Test getting CPU facts
        instance = AIXHardware(module=None)
        result = instance.get_cpu_facts()
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)

    def test_get_memory_facts(self):
        # Test getting memory facts
        instance = AIXHardware(module=None)
        result = instance.get_memory_facts()
        self.assertIn('memtotal_mb', result)
        self.assertIn('memfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swapfree_mb', result)

    def test_get_dmi_facts(self):
        # Test getting DMI facts
        instance = AIXHardware(module=None)
        result = instance.get_dmi_facts()
        self.assertIn('firmware_version', result)
        self.assertIn('product_serial', result)
        self.assertIn('lpar_info', result)
        self.assertIn('product_name', result)

    def test_get_vgs_facts(self):
        # Test getting VG facts
        instance = AIXHardware(module=None)
        result = instance.get_vgs_facts()
        self.assertIn('vgs', result)

    def test_get_mount_facts(self):
        # Test getting mount facts
        instance = AIXHardware(module=None)
        result = instance.get_mount_facts()
        self.assertIn('mounts', result)

    def test_get_device_facts(self):
        # Test getting device facts
        instance = AIXHardware(module=None)
        result = instance.get_device_facts()
        self.assertIn('devices', result)

class TestAIXHardwareCollector(unittest.TestCase):
    def test_populate(self):
        # Test populating hardware facts
        instance = AIXHardwareCollector()
        result = self.collector.populate()
        self.assertIn('cpu', result)
        self.assertIn('memory', result)
        self.assertIn('dmi', result)
        self.assertIn('vgs', result)
        self.assertIn('mounts', result)
        self.assertIn('devices', result)

if __name__ == '__main__':
    unittest.main()