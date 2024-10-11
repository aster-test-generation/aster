import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect_system(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['system'], 'Linux')

    def test_collect_kernel(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['kernel'], '4.15.0-1028-aws')

    def test_collect_kernel_version(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['kernel_version'], '#1 SMP Mon Mar 8 18:59:56 UTC 2021')

    def test_collect_machine(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['machine'], 'x86_64')

    def test_collect_python_version(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python_version'], '3.8.5 (default, Jul 28 2021, 17:25:39) [GCC 9.3.0]')

    def test_collect_fqdn(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['fqdn'], 'ip-172-31-12-18.us-west-2.compute.internal')

    def test_collect_hostname(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['hostname'], 'ip-172-31-12-18')

    def test_collect_nodename(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['nodename'], 'ip-172-31-12-18')

    def test_collect_domain(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['domain'], 'us-west-2.compute.internal')

    def test_collect_userspace_bits(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['userspace_bits'], '64')

    def test_collect_architecture(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['architecture'], 'x86_64')

    def test_collect_userspace_architecture(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['userspace_architecture'], 'x86_64')

    def test_collect_machine_id(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['machine_id'], '3718703435074471901')

if __name__ == '__main__':
    unittest.main()