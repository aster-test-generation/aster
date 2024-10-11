import unittest
from ansible.module_utils.facts.hardware.hurd import HurdHardware, HurdHardwareCollector


class TestHurdHardware(unittest.TestCase):
    def test_populate(self):
        hardware_facts = {}
        uptime_facts = {'uptime_hours': 1, 'uptime_seconds': 3600}
        memory_facts = {'memfree_mb': 1024, 'memtotal_mb': 2048}
        mount_facts = {'/': {'device': '/', 'fstype': 'ext4', 'options': ['rw', 'relatime']}}
        hardware_facts.update(uptime_facts)
        hardware_facts.update(memory_facts)
        hardware_facts.update(mount_facts)
        instance = HurdHardware(module=None)
        result = instance.populate()
        self.assertEqual(result, hardware_facts)

class TestHurdHardwareCollector(unittest.TestCase):
    def test_populate(self):
        instance = HurdHardwareCollector()
        result = self.populate()
        self.assertIsInstance(result, dict)
        self.assertIn('ansible_facts', result)
        self.assertIsInstance(result['ansible_facts'], dict)

if __name__ == '__main__':
    unittest.main()