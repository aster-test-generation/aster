import unittest
from ansible.module_utils.facts.hardware.netbsd import NetBSDHardware, NetBSDHardwareCollector


class TestNetBSDHardware(unittest.TestCase):
    def test_init(self):
        hardware = NetBSDHardware()
        self.assertEqual(hardware.platform, 'NetBSD')

    def test_populate(self):
        hardware = NetBSDHardware()
        collected_facts = {'cpu_facts': {'processor': ['foo']}, 'memory_facts': {'MemTotal_mb': 1024}}
        result = hardware.populate(collected_facts)
        self.assertEqual(result, collected_facts)

    def test_get_cpu_facts(self):
        hardware = NetBSDHardware()
        cpu_facts = hardware.get_cpu_facts()
        self.assertEqual(cpu_facts, {'processor': ['foo'], 'processor_count': 1, 'processor_cores': 1})

    def test_get_memory_facts(self):
        hardware = NetBSDHardware()
        memory_facts = hardware.get_memory_facts()
        self.assertEqual(memory_facts, {'MemTotal_mb': 1024, 'MemFree_mb': 1024, 'SwapTotal_mb': 1024, 'SwapFree_mb': 1024})

    def test_get_mount_facts(self):
        hardware = NetBSDHardware()
        mount_facts = hardware.get_mount_facts()
        self.assertEqual(mount_facts, {'mounts': [{'mount': '/mnt', 'device': '/dev/sda1', 'fstype': 'ext4', 'options': 'defaults'}]})

    def test_get_dmi_facts(self):
        hardware = NetBSDHardware()
        dmi_facts = hardware.get_dmi_facts()
        self.assertEqual(dmi_facts, {'product_name': 'foo', 'product_version': 'bar', 'product_uuid': 'baz', 'product_serial': 'qux', 'system_vendor': 'quux'})

    def test_str(self):
        hardware = NetBSDHardware()
        self.assertEqual(str(hardware), 'NetBSDHardware')

    def test_repr(self):
        hardware = NetBSDHardware()
        self.assertEqual(repr(hardware), 'NetBSDHardware({})')

class TestNetBSDHardwareCollector(unittest.TestCase):
    def test_init(self):
        collector = NetBSDHardwareCollector()
        self.assertEqual(collector._fact_class, NetBSDHardware)
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()