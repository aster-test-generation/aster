import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError

class TestHurdHardware(unittest.TestCase):
    def setUp(self):
        self.instance = HurdHardware(module=None)

    def test_populate(self):
        self.instance.get_uptime_facts = lambda: {'uptime': '100 days'}
        self.instance.get_memory_facts = lambda: {'memory': '8GB'}
        self.instance.get_mount_facts = lambda: {'mounts': '/dev/sda1'}
        result = self.instance.populate()
        self.assertEqual(result, {'uptime': '100 days', 'memory': '8GB', 'mounts': '/dev/sda1'})

    def test_populate_with_timeout_error(self):
        self.instance.get_uptime_facts = lambda: {'uptime': '100 days'}
        self.instance.get_memory_facts = lambda: {'memory': '8GB'}
        self.instance.get_mount_facts = lambda: (_ for _ in ()).throw(TimeoutError)
        result = self.instance.populate()
        self.assertEqual(result, {'uptime': '100 days', 'memory': '8GB'})

class TestHurdHardwareCollector(unittest.TestCase):
    def setUp(self):
        self.instance = HurdHardwareCollector()

    def test_fact_class(self):
        self.assertEqual(self.instance._fact_class, HurdHardware)

    def test_platform(self):
        self.assertEqual(self.instance._platform, 'GNU')

if __name__ == '__main__':
    unittest.main()