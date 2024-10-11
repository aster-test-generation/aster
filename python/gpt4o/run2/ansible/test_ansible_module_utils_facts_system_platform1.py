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
        self.assertEqual(result['machine_id'], '1234567890abcdef')

    @patch('platform.system', return_value='AIX')
    @patch('platform.machine', return_value='00F6264A4C00')
    @patch('platform.architecture', return_value=('64bit', ''))
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value=None)
    def test_collect_aix(self, mock_get_file_content, mock_architecture, mock_machine, mock_system):
        module = MagicMock()
        module.get_bin_path.side_effect = lambda x: '/usr/bin/' + x
        module.run_command.return_value = (0, 'ppc64\n', '')

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
        result = self.collector.collect(module, collected_facts)
        self.assertEqual(result['system'], 'OpenBSD')
        self.assertEqual(result['architecture'], 'amd64')

    @patch('platform.machine', return_value='i686')
    @patch('platform.architecture', return_value=('32bit', ''))
    def test_collect_solaris_i86(self, mock_architecture, mock_machine):
        module = MagicMock()
        collected_facts = {}
        result = self.collector.collect(module, collected_facts)
        self.assertEqual(result['architecture'], 'i386')
        self.assertEqual(result['userspace_architecture'], 'i386')

    @patch('platform.machine', return_value='sparc')
    @patch('platform.architecture', return_value=('64bit', ''))
    def test_collect_other_architecture(self, mock_architecture, mock_machine):
        module = MagicMock()
        collected_facts = {}
        result = self.collector.collect(module, collected_facts)
        self.assertEqual(result['architecture'], 'sparc')

if __name__ == '__main__':
    unittest.main()