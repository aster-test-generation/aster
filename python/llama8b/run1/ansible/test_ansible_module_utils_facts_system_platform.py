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

    def test_get_file_content(self):
        collector = platform.PlatformFactCollector()
        content = collector._get_file_content("/var/lib/dbus/machine-id")
        self.assertIsNone(content)

    def test_get_file_content_with_content(self):
        collector = platform.PlatformFactCollector()
        content = collector._get_file_content("/etc/machine-id")
        self.assertIsNotNone(content)

    def test_get_bin_path(self):
        collector = platform.PlatformFactCollector()
        bin_path = collector._get_bin_path('getconf')
        self.assertIsNone(bin_path)

    def test_run_command(self):
        collector = platform.PlatformFactCollector()
        rc, out, err = collector._run_command(['ls', '-l'])
        self.assertEqual(rc, 0)

    def test_system(self):
        collector = platform.PlatformFactCollector()
        system = collector._system
        self.assertEqual(system, platform.system())

    def test_kernel(self):
        collector = platform.PlatformFactCollector()
        kernel = collector._kernel
        self.assertEqual(kernel, platform.release())

    def test_kernel_version(self):
        collector = platform.PlatformFactCollector()
        kernel_version = collector._kernel_version
        self.assertEqual(kernel_version, platform.version())

    def test_machine(self):
        collector = platform.PlatformFactCollector()
        machine = collector._machine
        self.assertEqual(machine, platform.machine())

    def test_python_version(self):
        collector = platform.PlatformFactCollector()
        python_version = collector._python_version
        self.assertEqual(python_version, platform.python_version())

    def test_fqdn(self):
        collector = platform.PlatformFactCollector()
        fqdn = collector._fqdn
        self.assertEqual(fqdn, socket.getfqdn())

    def test_hostname(self):
        collector = platform.PlatformFactCollector()
        hostname = collector._hostname
        self.assertEqual(hostname, platform.node().split('.')[0])

    def test_nodename(self):
        collector = platform.PlatformFactCollector()
        nodename = collector._nodename
        self.assertEqual(nodename, platform.node())

    def test_domain(self):
        collector = platform.PlatformFactCollector()
        domain = collector._domain
        self.assertEqual(domain, '.'.join(platform.node().split('.')[1:]))

    def test_userspace_bits(self):
        collector = platform.PlatformFactCollector()
        userspace_bits = collector._userspace_bits
        self.assertEqual(userspace_bits, platform.architecture()[0].replace('bit', ''))

    def test_architecture(self):
        collector = platform.PlatformFactCollector()
        architecture = collector._architecture
        self.assertEqual(architecture, platform.machine())

    def test_userspace_architecture(self):
        collector = platform.PlatformFactCollector()
        userspace_architecture = collector._userspace_architecture
        self.assertEqual(userspace_architecture, platform.machine())

    def test_machine_id(self):
        collector = platform.PlatformFactCollector()
        machine_id = collector._machine_id
        self.assertIsNone(machine_id)

    def test_system_aix(self):
        collector = platform.PlatformFactCollector()
        collector._system = 'AIX'
        getconf_bin = collector._get_bin_path('getconf')
        if getconf_bin:
            rc, out, err = collector._run_command([getconf_bin, 'MACHINE_ARCHITECTURE'])
            data = out.splitlines()
            self.assertEqual(data[0], collector._architecture)

    def test_system_openbsd(self):
        collector = platform.PlatformFactCollector()
        collector._system = 'OpenBSD'
        self.assertEqual(collector._architecture, platform.uname()[5])

if __name__ == '__main__':
    unittest.main()