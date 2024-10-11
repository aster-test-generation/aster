import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_populate(self):
        hardware = AIXHardware(module)
        result = hardware.populate()
        self.assertIsInstance(result, dict)
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)
        self.assertIn('memtotal_mb', result)
        self.assertIn('memfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swapfree_mb', result)
        self.assertIn('firmware_version', result)
        self.assertIn('product_serial', result)
        self.assertIn('lpar_info', result)
        self.assertIn('product_name', result)
        self.assertIn('vgs', result)
        self.assertIn('mounts', result)
        self.assertIn('devices', result)

    def test_get_cpu_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_cpu_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('processor', result)
        self.assertIn('processor_count', result)
        self.assertIn('processor_cores', result)

    def test_get_memory_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_memory_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('memtotal_mb', result)
        self.assertIn('memfree_mb', result)
        self.assertIn('swaptotal_mb', result)
        self.assertIn('swapfree_mb', result)

    def test_get_dmi_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_dmi_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('firmware_version', result)
        self.assertIn('product_serial', result)
        self.assertIn('lpar_info', result)
        self.assertIn('product_name', result)

    def test_get_vgs_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_vgs_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('vgs', result)

    def test_get_mount_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_mount_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('mounts', result)

    def test_get_device_facts(self):
        hardware = AIXHardware(module)
        result = hardware.get_device_facts()
        self.assertIsInstance(result, dict)
        self.assertIn('devices', result)


if __name__ == '__main__':
    unittest.main()