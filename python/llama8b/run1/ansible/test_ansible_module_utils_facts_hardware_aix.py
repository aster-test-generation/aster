import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware, AIXHardwareCollector


class TestAIXHardware(unittest.TestCase):
    def test_populate(self):
        aix_hardware = AIXHardware()
        collected_facts = {}
        hardware_facts = aix_hardware.populate(collected_facts)
        self.assertIsInstance(hardware_facts, dict)

    def test_get_cpu_facts(self):
        aix_hardware = AIXHardware()
        cpu_facts = aix_hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        aix_hardware = AIXHardware()
        memory_facts = aix_hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_dmi_facts(self):
        aix_hardware = AIXHardware()
        dmi_facts = aix_hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)
        self.assertIn('firmware_version', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('lpar_info', dmi_facts)
        self.assertIn('product_name', dmi_facts)

    def test_get_vgs_facts(self):
        aix_hardware = AIXHardware()
        vgs_facts = aix_hardware.get_vgs_facts()
        self.assertIsInstance(vgs_facts, dict)
        self.assertIn('vgs', vgs_facts)

    def test_get_mount_facts(self):
        aix_hardware = AIXHardware()
        mount_facts = aix_hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)

    def test_get_device_facts(self):
        aix_hardware = AIXHardware()
        device_facts = aix_hardware.get_device_facts()
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)

    def test_str_method(self):
        aix_hardware = AIXHardware()
        result = str(aix_hardware)
        self.assertEqual(result, 'AIXHardware')

    def test_repr_method(self):
        aix_hardware = AIXHardware()
        result = repr(aix_hardware)
        self.assertEqual(result, 'AIXHardware({})'.format(aix_hardware.method_one(0)))

class TestAIXHardwareCollector(unittest.TestCase):
    def test_init(self):
        aix_hardware_collector = AIXHardwareCollector()
        self.assertIsInstance(aix_hardware_collector, AIXHardwareCollector)

    def test_get_platform(self):
        aix_hardware_collector = AIXHardwareCollector()
        result = aix_hardware_collector._platform
        self.assertEqual(result, 'AIX')

    def test_get_fact_class(self):
        aix_hardware_collector = AIXHardwareCollector()
        result = aix_hardware_collector._fact_class
        self.assertEqual(result, AIXHardware)

if __name__ == '__main__':
    unittest.main()