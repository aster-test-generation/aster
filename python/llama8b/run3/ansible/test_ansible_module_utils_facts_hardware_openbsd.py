import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector


class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware()
        collected_facts = {}
        hardware_facts = hardware.populate(collected_facts)
        self.assertIsInstance(hardware_facts, dict)

    def test_get_mount_facts(self):
        hardware = OpenBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertIsInstance(mount_facts, dict)

    def test_get_memory_facts(self):
        hardware = OpenBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertIsInstance(memory_facts, dict)

    def test_get_uptime_facts(self):
        hardware = OpenBSDHardware()
        uptime_facts = hardware.get_uptime_facts()
        self.assertIsInstance(uptime_facts, dict)

    def test_get_processor_facts(self):
        hardware = OpenBSDHardware()
        processor_facts = hardware.get_processor_facts()
        self.assertIsInstance(processor_facts, dict)

    def test_get_device_facts(self):
        hardware = OpenBSDHardware()
        device_facts = hardware.get_device_facts()
        self.assertIsInstance(device_facts, dict)

    def test_get_dmi_facts(self):
        hardware = OpenBSDHardware()
        dmi_facts = hardware.get_dmi_facts()
        self.assertIsInstance(dmi_facts, dict)

    def test__init__(self):
        hardware = OpenBSDHardware()
        self.assertIsInstance(hardware, OpenBSDHardware)

    def test__str__(self):
        hardware = OpenBSDHardware()
        result = str(hardware)
        self.assertEqual(result, "OpenBSDHardware")

    def test__repr__(self):
        hardware = OpenBSDHardware()
        result = repr(hardware)
        self.assertEqual(result, "OpenBSDHardware()")

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test__init__(self):
        collector = OpenBSDHardwareCollector()
        self.assertIsInstance(collector, OpenBSDHardwareCollector)

    def test__fact_class(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._fact_class, OpenBSDHardware)

    def test__platform(self):
        collector = OpenBSDHardwareCollector()
        self.assertEqual(collector._platform, 'OpenBSD')

class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        instance = OpenBSDHardware(None)
        collected_facts = instance.populate()
        self.assertIn('processor', collected_facts)
        self.assertIn('memory_facts', collected_facts)
        self.assertIn('device_facts', collected_facts)
        self.assertIn('dmi_facts', collected_facts)
        self.assertIn('uptime_facts', collected_facts)
        self.assertIn('mount_facts', collected_facts)

    def test_get_mount_facts(self):
        instance = OpenBSDHardware(None)
        mount_facts = instance.get_mount_facts()
        self.assertIn('mounts', mount_facts)

    def test_get_memory_facts(self):
        instance = OpenBSDHardware(None)
        memory_facts = instance.get_memory_facts()
        self.assertIn('memfree_mb', memory_facts)
        self.assertIn('memtotal_mb', memory_facts)
        self.assertIn('swapfree_mb', memory_facts)
        self.assertIn('swaptotal_mb', memory_facts)

    def test_get_uptime_facts(self):
        instance = OpenBSDHardware(None)
        uptime_facts = instance.get_uptime_facts()
        self.assertIn('uptime_seconds', uptime_facts)

    def test_get_processor_facts(self):
        instance = OpenBSDHardware(None)
        processor_facts = instance.get_processor_facts()
        self.assertIn('processor', processor_facts)
        self.assertIn('processor_count', processor_facts)
        self.assertIn('processor_cores', processor_facts)

    def test_get_device_facts(self):
        instance = OpenBSDHardware(None)
        device_facts = instance.get_device_facts()
        self.assertIn('devices', device_facts)

    def test_get_dmi_facts(self):
        instance = OpenBSDHardware(None)
        dmi_facts = instance.get_dmi_facts()
        self.assertIn('product_name', dmi_facts)
        self.assertIn('product_version', dmi_facts)
        self.assertIn('product_uuid', dmi_facts)
        self.assertIn('product_serial', dmi_facts)
        self.assertIn('system_vendor', dmi_facts)

    def test_str_method(self):
        instance = OpenBSDHardware(None)
        result = instance.__str__()
        self.assertEqual(result, 'OpenBSDHardware')

    def test_repr_method(self):
        instance = OpenBSDHardware(None)
        result = instance.__repr__()
        self.assertEqual(result, 'OpenBSDHardware(None)')

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = OpenBSDHardwareCollector()
        collected_facts = collector.collect()
        self.assertIn('processor', collected_facts)
        self.assertIn('memory_facts', collected_facts)
        self.assertIn('device_facts', collected_facts)
        self.assertIn('dmi_facts', collected_facts)
        self.assertIn('uptime_facts', collected_facts)
        self.assertIn('mount_facts', collected_facts)

if __name__ == '__main__':
    unittest.main()