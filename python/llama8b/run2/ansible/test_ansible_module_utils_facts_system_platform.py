import unittest
from ansible.module_utils.facts.system import platform


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertIn('system', facts)
        self.assertIn('kernel', facts)
        self.assertIn('kernel_version', facts)
        self.assertIn('machine', facts)
        self.assertIn('python_version', facts)
        self.assertIn('fqdn', facts)
        self.assertIn('hostname', facts)
        self.assertIn('nodename', facts)
        self.assertIn('domain', facts)
        self.assertIn('userspace_bits', facts)
        self.assertIn('architecture', facts)
        self.assertIn('userspace_architecture', facts)
        self.assertIn('machine_id', facts)

    def test_collect_system(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['system'], platform.system())

    def test_collect_kernel(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['kernel'], platform.release())

    def test_collect_kernel_version(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['kernel_version'], platform.version())

    def test_collect_machine(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['machine'], platform.machine())

    def test_collect_python_version(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python_version'], platform.python_version())

    def test_collect_fqdn(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['fqdn'], socket.getfqdn())

    def test_collect_hostname(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['hostname'], platform.node().split('.')[0])

    def test_collect_nodename(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['nodename'], platform.node())

    def test_collect_domain(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['domain'], '.'.join(platform.node().split('.')[1:]))

    def test_collect_userspace_bits(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['userspace_bits'], platform.architecture()[0].replace('bit', ''))

    def test_collect_architecture(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['architecture'], platform.machine())

    def test_collect_userspace_architecture(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['userspace_architecture'], platform.architecture()[0].replace('bit', ''))

    def test_collect_machine_id(self):
        collector = platform.PlatformFactCollector()
        facts = collector.collect()
        self.assertIn('machine_id', facts)

    def test_getconf_bin(self):
        collector = platform.PlatformFactCollector()
        collector._getconf_bin = 'getconf'
        self.assertEqual(collector._getconf_bin, 'getconf')

    def test_bootinfo_bin(self):
        collector = platform.PlatformFactCollector()
        collector._bootinfo_bin = 'bootinfo'
        self.assertEqual(collector._bootinfo_bin, 'bootinfo')

    def test_solaris_i86_re(self):
        collector = platform.PlatformFactCollector()
        self.assertEqual(collector._solaris_i86_re.pattern, r'i([3456]86|86pc)')

    def test_system_aix(self):
        collector = platform.PlatformFactCollector()
        collector._system = 'AIX'
        self.assertEqual(collector._get_architecture(), platform.machine())

    def test_system_openbsd(self):
        collector = platform.PlatformFactCollector()
        collector._system = 'OpenBSD'
        self.assertEqual(collector._get_architecture(), platform.uname()[5])

    def test_system_other(self):
        collector = platform.PlatformFactCollector()
        collector._system = 'other'
        self.assertEqual(collector._get_architecture(), platform.machine())

if __name__ == '__main__':
    unittest.main()