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
        self.assertEqual(facts['kernel'], '5.14.0-427.22.1.el9_4.x86_64')

    def test_collect_kernel_version(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['kernel_version'], '#1 SMP PREEMPT_DYNAMIC Mon Jun 10 09:23:36 EDT 2024')

    def test_collect_machine(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['machine'], 'x86_64')

    def test_collect_python_version(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python_version'], '3.11.7')

    def test_collect_fqdn(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['fqdn'], 'asterpy2.sl.cloud9.ibm.com')

    def test_collect_hostname(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['hostname'], 'asterpy2')

    def test_collect_nodename(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['nodename'], 'asterpy2.sl.cloud9.ibm.com')

    def test_collect_domain(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['domain'], 'sl.cloud9.ibm.com')

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
        self.assertEqual(facts['machine_id'], '3caae362244f4c1386957e34443d2853')

if __name__ == '__main__':
    unittest.main()