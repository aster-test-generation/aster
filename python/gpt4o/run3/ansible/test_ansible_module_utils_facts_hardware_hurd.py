import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector
from ansible.module_utils.facts.timeout import TimeoutError


class TestHurdHardware(unittest.TestCase):
    def setUp(self):
        self.instance = HurdHardware(module=None)

    def test_populate(self):
        self.instance.get_uptime_facts = lambda: {'uptime': '100 days'}
        self.instance.get_memory_facts = lambda: {'memory': '8GB'}
        self.instance.get_mount_facts = lambda: {'mounts': '/'}
        result = self.instance.populate()
        self.assertEqual(result, {'uptime': '100 days', 'memory': '8GB', 'mounts': '/'})

    def test_populate_with_timeout_error(self):
        self.instance.get_uptime_facts = lambda: {'uptime': '100 days'}
        self.instance.get_memory_facts = lambda: {'memory': '8GB'}
        self.instance.get_mount_facts = lambda: (_ for _ in ()).throw(TimeoutError)
        result = self.instance.populate()
        self.assertEqual(result, {'uptime': '100 days', 'memory': '8GB'})

    def test_get_uptime_facts(self):
        self.instance.get_uptime_facts = lambda: {'uptime': '100 days'}
        result = self.instance.get_uptime_facts()
        self.assertEqual(result, {'uptime': '100 days'})

    def test_get_memory_facts(self):
        self.instance.get_memory_facts = lambda: {'memory': '8GB'}
        result = self.instance.get_memory_facts()
        self.assertEqual(result, {'memory': '8GB'})

    def test_get_mount_facts(self):
        self.instance.get_mount_facts = lambda: {'mounts': '/'}
        result = self.instance.get_mount_facts()
        self.assertEqual(result, {'mounts': '/'})

class TestHurdHardwareCollector(unittest.TestCase):
    def setUp(self):
        self.instance = HurdHardwareCollector(mod=None)

    def test_fact_class(self):
        self.assertEqual(self.instance._fact_class, HurdHardware)

    def test_platform(self):
        self.assertEqual(self.instance._platform, 'GNU')

if __name__ == '__main__':
    unittest.main()