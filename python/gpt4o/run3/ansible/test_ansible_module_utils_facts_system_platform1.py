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
    @patch('platform.machine', return_value='00F6264A4C00')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_aix(self, mock_get_file_content, mock_architecture, mock_machine, mock_system):
        module = MagicMock()
        module.get_bin_path.side_effect = lambda x: '/usr/bin/getconf' if x == 'getconf' else '/usr/bin/bootinfo'
        module.run_command.side_effect = [
            (0, 'ppc64\n', ''),  # getconf MACHINE_ARCHITECTURE
            (0, 'ppc\n', '')     # bootinfo -p
        ]
        
        collected_facts = self.collector.collect(module=module)
        
        self.assertEqual(collected_facts['system'], 'AIX')
        self.assertEqual(collected_facts['architecture'], 'ppc64')

    @patch('platform.system', return_value='OpenBSD')
    @patch('platform.uname', return_value=('OpenBSD', 'hostname', 'release', 'version', 'machine', 'amd64'))
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_openbsd(self, mock_get_file_content, mock_architecture, mock_uname, mock_system):
        module = MagicMock()
        
        collected_facts = self.collector.collect(module=module)
        
        self.assertEqual(collected_facts['system'], 'OpenBSD')
        self.assertEqual(collected_facts['architecture'], 'amd64')

    @patch('platform.machine', return_value='i686')
    @patch('platform.architecture', return_value=('32bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_solaris_i86(self, mock_get_file_content, mock_architecture, mock_machine):
        module = MagicMock()
        
        collected_facts = self.collector.collect(module=module)
        
        self.assertTrue(solaris_i86_re.search(collected_facts['machine']))
        self.assertEqual(collected_facts['architecture'], 'i386')
        self.assertEqual(collected_facts['userspace_architecture'], 'i386')

if __name__ == '__main__':
    unittest.main()