import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.system.platform import PlatformFactCollector, solaris_i86_re


class TestPlatformFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = PlatformFactCollector()

    @patch('platform.system', return_value='Linux')
    @patch('platform.release', return_value='5.4.0-42-generic')
    @patch('platform.version', return_value='#46-Ubuntu SMP Fri Jul 10 00:24:02 UTC 2020')
    @patch('platform.machine', return_value='x86_64')
    @patch('platform.python_version', return_value='3.8.5')
    @patch('socket.getfqdn', return_value='test.example.com')
    @patch('platform.node', return_value='test.example.com')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='1234567890abcdef')
    def test_collect(self, mock_get_file_content, mock_architecture, mock_node, mock_getfqdn, mock_python_version, mock_machine, mock_version, mock_release, mock_system):
        module = MagicMock()
        collected_facts = {}
        result = self.collector.collect(module, collected_facts)
        
        self.assertEqual(result['system'], 'Linux')
        self.assertEqual(result['kernel'], '5.4.0-42-generic')
        self.assertEqual(result['kernel_version'], '#46-Ubuntu SMP Fri Jul 10 00:24:02 UTC 2020')
        self.assertEqual(result['machine'], 'x86_64')
        self.assertEqual(result['python_version'], '3.8.5')
        self.assertEqual(result['fqdn'], 'test.example.com')
        self.assertEqual(result['hostname'], 'test')
        self.assertEqual(result['nodename'], 'test.example.com')
        self.assertEqual(result['domain'], 'example.com')
        self.assertEqual(result['userspace_bits'], '64')
        self.assertEqual(result['architecture'], 'x86_64')
        self.assertEqual(result['userspace_architecture'], 'x86_64')
        self.assertEqual(result['machine_id'], '3caae362244f4c1386957e34443d2853')

    @patch('platform.system', return_value='AIX')
    @patch('platform.machine', return_value='00F6264A4C00')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_aix(self, mock_get_file_content, mock_architecture, mock_machine, mock_system):
        module = MagicMock()
        module.get_bin_path.side_effect = lambda x: '/usr/bin/' + x
        module.run_command.side_effect = lambda x: (0, 'ppc64\n', '')

        collected_facts = {}
        result = self.collector.collect(module, collected_facts)
        
        self.assertEqual(result['system'], 'AIX')
        self.assertEqual(result['architecture'], 'ppc64')

    @patch('platform.system', return_value='OpenBSD')
    @patch('platform.uname', return_value=('OpenBSD', 'hostname', '6.7', '', '', 'amd64'))
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_openbsd(self, mock_get_file_content, mock_architecture, mock_uname, mock_system):
        module = MagicMock()
        collected_facts = {}
        result = self.collector.collect(module, collected_facts)[0]
        
        self.assertEqual(result['system'], 'OpenBSD')
        self.assertEqual(result['architecture'], 'amd64')

    def test_solaris_i86_re(self):
        self.assertTrue(solaris_i86_re.match('i386'))
        self.assertTrue(solaris_i86_re.match('i486'))
        self.assertTrue(solaris_i86_re.match('i586'))
        self.assertTrue(solaris_i86_re.match('i686'))
        self.assertTrue(solaris_i86_re.match('i86pc'))
        self.assertFalse(solaris_i86_re.match('x86_64'))

class TestPlatformFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = PlatformFactCollector()

    @patch('platform.system', return_value='Linux')
    @patch('platform.release', return_value='5.4.0-42-generic')
    @patch('platform.version', return_value='#46-Ubuntu SMP Fri Jul 10 00:24:02 UTC 2020')
    @patch('platform.machine', return_value='x86_64')
    @patch('platform.python_version', return_value='3.8.5')
    @patch('socket.getfqdn', return_value='test.example.com')
    @patch('platform.node', return_value='test.example.com')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='1234567890abcdef')
    def test_collect_linux(self, mock_get_file_content, mock_architecture, mock_node, mock_getfqdn, mock_python_version, mock_machine, mock_version, mock_release, mock_system):
        module = MagicMock()
        collected_facts = self.collector.collect(module=module)
        self.assertEqual(collected_facts['system'], 'Linux')
        self.assertEqual(collected_facts['kernel'], '5.4.0-42-generic')
        self.assertEqual(collected_facts['kernel_version'], '#46-Ubuntu SMP Fri Jul 10 00:24:02 UTC 2020')
        self.assertEqual(collected_facts['machine'], 'x86_64')
        self.assertEqual(collected_facts['python_version'], '3.8.5')
        self.assertEqual(collected_facts['fqdn'], 'test.example.com')
        self.assertEqual(collected_facts['hostname'], 'test')
        self.assertEqual(collected_facts['nodename'], 'test.example.com')
        self.assertEqual(collected_facts['domain'], 'example.com')
        self.assertEqual(collected_facts['userspace_bits'], '64')
        self.assertEqual(collected_facts['architecture'], 'x86_64')
        self.assertEqual(collected_facts['userspace_architecture'], 'x86_64')
        self.assertEqual(collected_facts['machine_id'], '1234567890abcdef')

    @patch('platform.system', return_value='AIX')
    @patch('platform.release', return_value='7.2')
    @patch('platform.version', return_value='00F7A1A94C00')
    @patch('platform.machine', return_value='00F7A1A94C00')
    @patch('platform.python_version', return_value='3.8.5')
    @patch('socket.getfqdn', return_value='test.example.com')
    @patch('platform.node', return_value='test.example.com')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='1234567890abcdef')
    def test_collect_aix(self, mock_get_file_content, mock_architecture, mock_node, mock_getfqdn, mock_python_version, mock_machine, mock_version, mock_release, mock_system):
        module = MagicMock()
        module.get_bin_path.side_effect = lambda x: '/usr/bin/getconf' if x == 'getconf' else '/usr/bin/bootinfo'
        module.run_command.side_effect = lambda x: (0, 'ppc64\n', '') if 'getconf' in x else (0, 'ppc\n', '')
        collected_facts = self.collector.collect(module=module)
        self.assertEqual(collected_facts['system'], 'AIX')
        self.assertEqual(collected_facts['kernel'], '7.2')
        self.assertEqual(collected_facts['kernel_version'], '00F7A1A94C00')
        self.assertEqual(collected_facts['machine'], '00F7A1A94C00')
        self.assertEqual(collected_facts['python_version'], '3.8.5')
        self.assertEqual(collected_facts['fqdn'], 'test.example.com')
        self.assertEqual(collected_facts['hostname'], 'test')
        self.assertEqual(collected_facts['nodename'], 'test.example.com')
        self.assertEqual(collected_facts['domain'], 'example.com')
        self.assertEqual(collected_facts['userspace_bits'], '64')
        self.assertEqual(collected_facts['architecture'], 'ppc64')
        self.assertEqual(collected_facts['machine_id'], '1234567890abcdef')

    @patch('platform.system', return_value='OpenBSD')
    @patch('platform.release', return_value='6.7')
    @patch('platform.version', return_value='GENERIC#123')
    @patch('platform.machine', return_value='amd64')
    @patch('platform.python_version', return_value='3.8.5')
    @patch('socket.getfqdn', return_value='test.example.com')
    @patch('platform.node', return_value='test.example.com')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('platform.uname', return_value=('OpenBSD', 'test', '6.7', 'GENERIC#123', 'amd64', 'amd64'))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='1234567890abcdef')
    def test_collect_openbsd(self, mock_get_file_content, mock_uname, mock_architecture, mock_node, mock_getfqdn, mock_python_version, mock_machine, mock_version, mock_release, mock_system):
        module = MagicMock()
        collected_facts = self.collector.collect(module=module)
        self.assertEqual(collected_facts['system'], 'OpenBSD')
        self.assertEqual(collected_facts['kernel'], '6.7')
        self.assertEqual(collected_facts['kernel_version'], 'GENERIC#123')
        self.assertEqual(collected_facts['machine'], 'amd64')
        self.assertEqual(collected_facts['python_version'], '3.8.5')
        self.assertEqual(collected_facts['fqdn'], 'test.example.com')
        self.assertEqual(collected_facts['hostname'], 'test')
        self.assertEqual(collected_facts['nodename'], 'test.example.com')
        self.assertEqual(collected_facts['domain'], 'example.com')
        self.assertEqual(collected_facts['userspace_bits'], '64')
        self.assertEqual(collected_facts['architecture'], 'amd64')
        self.assertEqual(collected_facts['machine_id'], '1234567890abcdef')

    def test_solaris_i86_re(self):
        self.assertTrue(solaris_i86_re.match('i386'))
        self.assertTrue(solaris_i86_re.match('i486'))
        self.assertTrue(solaris_i86_re.match('i586'))
        self.assertTrue(solaris_i86_re.match('i686'))
        self.assertTrue(solaris_i86_re.match('i86pc'))
        self.assertFalse(solaris_i86_re.match('x86_64'))

if __name__ == '__main__':
    unittest.main()