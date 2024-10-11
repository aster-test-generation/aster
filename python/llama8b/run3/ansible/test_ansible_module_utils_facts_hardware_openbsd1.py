import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector

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