import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_get_cpu_facts(self):
        instance = AIXHardware(module=None)
        cpu_facts = instance.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        instance = AIXHardware(module=None)
        memory_facts = instance.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_dmi_facts(self):
        instance = AIXHardware(module=None)
        dmi_facts = instance.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)
        self.assertIn('firmware_version', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('lpar_info', dmi_facts)
        self.assertIn('product_name', dmi_facts)

    def test_get_vgs_facts(self):
        instance = AIXHardware(module=None)
        vgs_facts = instance.get_vgs_facts()
        self.assertIsInstance(vgs_facts, dict)
        self.assertIn('vgs', vgs_facts)

    def test_get_mount_facts(self):
        instance = AIXHardware(module=None)
        mount_facts = instance.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)

    def test_get_device_facts(self):
        instance = AIXHardware(module=None)
        device_facts = instance.get_device_facts()
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)

class TestAIXHardwareCollector(unittest.TestCase):
    def test_populate(self):
        instance = AIXHardwareCollector()
        hardware_facts = instance.collect()
        self.assertIsInstance(hardware_facts, dict)
        self.assertIn('cpu', hardware_facts)
        self.assertIn('memory', hardware_facts)
        self.assertIn('dmi', hardware_facts)
        self.assertIn('vgs', hardware_facts)
        self.assertIn('mounts', hardware_facts)
        self.assertIn('devices', hardware_facts)

if __name__ == '__main__':
    unittest.main()