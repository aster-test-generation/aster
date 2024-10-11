import unittest
from ansible.module_utils.facts.hardware.freebsd import FreeBSDHardware, FreeBSDHardwareCollector


class TestFreeBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = FreeBSDHardware()
        collected_facts = {}
        result = hardware.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_cpu_facts(self):
        hardware = FreeBSDHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertIsInstance(cpu_facts, dict)
        self.assertIn('processor', cpu_facts)
        self.assertIn('processor_count', cpu_facts)
        self.assertIn('processor_cores', cpu_facts)

    def test_get_memory_facts(self):
        hardware = FreeBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)

    def test_get_uptime_facts(self):
        hardware = FreeBSDHardware()
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)
        self.assertIn('uptime_seconds', uptime_facts)

    def test_get_mount_facts(self):
        hardware = FreeBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)
        self.assertIn('mounts', mount_facts)

    def test_get_device_facts(self):
        hardware = FreeBSDHardware()
        device_facts = hardware.get_device_facts()
        self.assertIsInstance(device_facts, dict)
        self.assertIn('devices', device_facts)

    def test_get_dmi_facts(self):
        hardware = FreeBSDHardware()
        dmi_facts = hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)

    def test_str_method(self):
        hardware = FreeBSDHardware()
        result = str(hardware)
        self.assertEqual(result, 'FreeBSDHardware')

    def test_repr_method(self):
        hardware = FreeBSDHardware()
        result = repr(hardware)
        self.assertEqual(result, 'FreeBSDHardware({})')

    def test_eq_method(self):
        hardware1 = FreeBSDHardware()
        hardware2 = FreeBSDHardware()
        self.assertTrue(hardware1 == hardware2)

class TestFreeBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        collector = FreeBSDHardwareCollector()
        self.assertIsInstance(collector, FreeBSDHardwareCollector)

if __name__ == '__main__':
    unittest.main()