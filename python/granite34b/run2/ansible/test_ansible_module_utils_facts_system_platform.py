import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PlatformFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('system', result)
        self.assertIn('kernel', result)
        self.assertIn('kernel_version', result)
        self.assertIn('machine', result)
        self.assertIn('python_version', result)
        self.assertIn('fqdn', result)
        self.assertIn('hostname', result)
        self.assertIn('nodename', result)
        self.assertIn('domain', result)
        self.assertIn('userspace_bits', result)
        self.assertIn('architecture', result)
        self.assertIn('userspace_architecture', result)
        self.assertEqual(result['system'], 'Linux')
        self.assertEqual(result['kernel'], platform.release())
        self.assertEqual(result['kernel_version'], platform.version())
        self.assertEqual(result['machine'], platform.machine())
        self.assertEqual(result['python_version'], platform.python_version())
        self.assertEqual(result['fqdn'], socket.getfqdn())
        self.assertEqual(result['hostname'], platform.node().split('.')[0])
        self.assertEqual(result['nodename'], platform.node())
        self.assertEqual(result['domain'], '.'.join(result['fqdn'].split('.')[1:]))
        arch_bits = platform.architecture()[0]
        self.assertEqual(result['userspace_bits'], arch_bits.replace('bit', ''))
        if result['machine'] == 'x86_64':
            self.assertEqual(result['architecture'], result['machine'])
            if result['userspace_bits'] == '64':
                self.assertEqual(result['userspace_architecture'], 'x86_64')
            elif result['userspace_bits'] == '32':
                self.assertEqual(result['userspace_architecture'], 'i386')
        elif solaris_i86_re.search(result['machine']):
            self.assertEqual(result['architecture'], 'i386')
            if result['userspace_bits'] == '64':
                self.assertEqual(result['userspace_architecture'], 'x86_64')
            elif result['userspace_bits'] == '32':
                self.assertEqual(result['userspace_architecture'], 'i386')
        else:
            self.assertEqual(result['architecture'], result['machine'])
        if result['system'] == 'AIX':
            getconf_bin = module.get_bin_path('getconf')
            if getconf_bin:
                rc, out, err = module.run_command([getconf_bin, 'MACHINE_ARCHITECTURE'])
                data = out.splitlines()
                self.assertEqual(result['architecture'], data[0])
            else:
                bootinfo_bin = module.get_bin_path('bootinfo')
                rc, out, err = module.run_command([bootinfo_bin, '-p'])
                data = out.splitlines()
                self.assertEqual(result['architecture'], data[0])
        elif result['system'] == 'OpenBSD':
            self.assertEqual(result['architecture'], platform.uname()[5])
        machine_id = get_file_content("/var/lib/dbus/machine-id") or get_file_content("/etc/machine-id")
        if machine_id:
            machine_id = machine_id.splitlines()[0]
            self.assertEqual(result["machine_id"], machine_id)

if __name__ == '__main__':
    unittest.main()