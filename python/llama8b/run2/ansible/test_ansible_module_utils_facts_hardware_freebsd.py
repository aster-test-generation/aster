import unittest
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test__init__(self):
        instance = FreeBSDHardware(module='test')
        self.assertIsInstance(instance, FreeBSDHardware)

    def test_get_cpu_facts(self):
        instance = FreeBSDHardware(module='test')
        cpu_facts = instance.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)

    def test_get_memory_facts(self):
        instance = FreeBSDHardware(module='test')
        memory_facts = instance.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)

    def test_get_uptime_facts(self):
        instance = FreeBSDHardware(module='test')
        uptime_facts = instance.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)
        self.assertIn('uptime_seconds', uptime_facts)

    def test_get_mount_facts(self):
        instance = FreeBSDHardware(module='test')
        mount_facts = instance.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)

    def test_get_device_facts(self):
        instance = FreeBSDHardware(module='test')
        device_facts = instance.get_device_facts()
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)

    def test_get_dmi_facts(self):
        instance = FreeBSDHardware(module='test')
        dmi_facts = instance.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)
        self.assertIn('bios_date', dmi_facts)
        self.assertIn('bios_vendor', dmi_facts)

    def test_populate(self):
        instance = FreeBSDHardware(module='test')
        collected_facts = {}
        hardware_facts = instance.populate(collected_facts)
        self.assertIsInstance(hardware_facts, dict)
        self.assertIn('cpu_facts', hardware_facts)
        self.assertIn('memory_facts', hardware_facts)
        self.assertIn('uptime_facts', hardware_facts)
        self.assertIn('mount_facts', hardware_facts)
        self.assertIn('device_facts', hardware_facts)
        self.assertIn('dmi_facts', hardware_facts)

    def test_str_method(self):
        instance = FreeBSDHardware(module='test')
        result = instance.__str__()
        self.assertEqual(result, 'FreeBSD')

    def test_repr_method(self):
        instance = FreeBSDHardware(module='test')
        result = instance.__repr__()
        self.assertEqual(result, 'FreeBSDHardware()')

    def test_eq_method(self):
        instance1 = FreeBSDHardware(module='test')
        instance2 = FreeBSDHardware(module='test')
        self.assertEqual(instance1, instance2)

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test__init__(self):
        instance = FreeBSDHardwareCollector()
        self.assertIsInstance(instance, FreeBSDHardwareCollector)

    def test_get_fact_class(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._fact_class, FreeBSDHardware)

    def test_get_platform(self):
        instance = FreeBSDHardwareCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()