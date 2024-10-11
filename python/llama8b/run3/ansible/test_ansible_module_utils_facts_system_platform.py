import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PlatformFactCollector()
        platform_facts = collector.collect()
        self.assertIn('system', platform_facts)
        self.assertIn('kernel', platform_facts)
        self.assertIn('kernel_version', platform_facts)
        self.assertIn('machine', platform_facts)
        self.assertIn('python_version', platform_facts)
        self.assertIn('fqdn', platform_facts)
        self.assertIn('hostname', platform_facts)
        self.assertIn('nodename', platform_facts)
        self.assertIn('domain', platform_facts)
        self.assertIn('userspace_bits', platform_facts)
        self.assertIn('architecture', platform_facts)
        self.assertIn('userspace_architecture', platform_facts)
        self.assertIn('machine_id', platform_facts)

    def test_get_system(self):
        collector = PlatformFactCollector()
        system = collector._get_system()
        self.assertIsInstance(system, str)

    def test_get_kernel(self):
        collector = PlatformFactCollector()
        kernel = collector._get_kernel()
        self.assertIsInstance(kernel, str)

    def test_get_kernel_version(self):
        collector = PlatformFactCollector()
        kernel_version = collector._get_kernel_version()
        self.assertIsInstance(kernel_version, str)

    def test_get_machine(self):
        collector = PlatformFactCollector()
        machine = collector._get_machine()
        self.assertIsInstance(machine, str)

    def test_get_python_version(self):
        collector = PlatformFactCollector()
        python_version = collector._get_python_version()
        self.assertIsInstance(python_version, str)

    def test_get_fqdn(self):
        collector = PlatformFactCollector()
        fqdn = collector._get_fqdn()
        self.assertIsInstance(fqdn, str)

    def test_get_hostname(self):
        collector = PlatformFactCollector()
        hostname = collector._get_hostname()
        self.assertIsInstance(hostname, str)

    def test_get_nodename(self):
        collector = PlatformFactCollector()
        nodename = collector._get_nodename()
        self.assertIsInstance(nodename, str)

    def test_get_domain(self):
        collector = PlatformFactCollector()
        domain = collector._get_domain()
        self.assertIsInstance(domain, str)

    def test_get_userspace_bits(self):
        collector = PlatformFactCollector()
        userspace_bits = collector._get_userspace_bits()
        self.assertIsInstance(userspace_bits, str)

    def test_get_architecture(self):
        collector = PlatformFactCollector()
        architecture = collector._get_architecture()
        self.assertIsInstance(architecture, str)

    def test_get_userspace_architecture(self):
        collector = PlatformFactCollector()
        userspace_architecture = collector._get_userspace_architecture()
        self.assertIsInstance(userspace_architecture, str)

    def test_get_machine_id(self):
        collector = PlatformFactCollector()
        machine_id = collector._get_machine_id()
        self.assertIsInstance(machine_id, str)

    def test_get_file_content(self):
        collector = PlatformFactCollector()
        file_content = collector._get_file_content("/var/lib/dbus/machine-id")
        self.assertIsInstance(file_content, str)

    def test_get_bin_path(self):
        collector = PlatformFactCollector()
        bin_path = collector._get_bin_path('getconf')
        self.assertIsInstance(bin_path, str)

    def test_run_command(self):
        collector = PlatformFactCollector()
        rc, out, err = collector._run_command(['ls', '-l'])
        self.assertIsInstance(rc, int)
        self.assertIsInstance(out, str)
        self.assertIsInstance(err, str)

    def test__init__(self):
        collector = PlatformFactCollector()
        self.assertIsInstance(collector, PlatformFactCollector)

    def test__str__(self):
        collector = PlatformFactCollector()
        result = str(collector)
        self.assertIsInstance(result, str)

    def test__repr__(self):
        collector = PlatformFactCollector()
        result = repr(collector)
        self.assertIsInstance(result, str)

    def test__eq__(self):
        collector1 = PlatformFactCollector()
        collector2 = PlatformFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()