import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector


class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware(module=None)
        hardware.sysctl = {
            'hw.ncpuonline': '2',
            'hw.model': 'Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz',
            'hw.disknames': 'ada0,ada1',
            'hw.usermem': '8589934592',
            'kern.boottime': '1616097736'
        }
        hardware_facts = hardware.populate()
        self.assertEqual(hardware_facts['processor'], ['Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz', 'Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz'])
        self.assertEqual(hardware_facts['processor_count'], 2)
        self.assertEqual(hardware_facts['processor_cores'], 2)
        self.assertEqual(hardware_facts['devices'], ['ada0', 'ada1'])
        self.assertEqual(hardware_facts['memfree_mb'], 7856)
        self.assertEqual(hardware_facts['memtotal_mb'], 8192)
        self.assertEqual(hardware_facts['swapfree_mb'], 0)
        self.assertEqual(hardware_facts['swaptotal_mb'], 0)
        self.assertEqual(hardware_facts['uptime_seconds'], 1616097736)

class TestOpenBSDHardwareCollector(unittest.TestCase):
    def test_collect(self):
        collector = OpenBSDHardwareCollector()
        hardware_facts = collector.collect()
        self.assertEqual(hardware_facts['platform'], 'OpenBSD')
        self.assertEqual(hardware_facts['processor'], ['Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz', 'Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz'])
        self.assertEqual(hardware_facts['processor_count'], 2)
        self.assertEqual(hardware_facts['processor_cores'], 2)
        self.assertEqual(hardware_facts['devices'], ['ada0', 'ada1'])
        self.assertEqual(hardware_facts['memfree_mb'], 7856)
        self.assertEqual(hardware_facts['memtotal_mb'], 8192)
        self.assertEqual(hardware_facts['swapfree_mb'], 0)
        self.assertEqual(hardware_facts['swaptotal_mb'], 0)
        self.assertEqual(hardware_facts['uptime_seconds'], 1616097736)

if __name__ == '__main__':
    unittest.main()