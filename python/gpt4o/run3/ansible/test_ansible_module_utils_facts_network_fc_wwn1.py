import unittest
from unittest.mock import patch, MagicMock
import sys
import glob
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector

class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FcWwnInitiatorFactCollector()

    @patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines')
    @patch('glob.glob')
    @patch('sys.platform', 'linux')
    def test_collect_linux(self, mock_glob, mock_get_file_lines):
        mock_glob.return_value = ['/sys/class/fc_host/host0/port_name']
        mock_get_file_lines.return_value = ['0x500143802426baf4\n']
        result = self.collector.collect()
        self.assertEqual(result['fibre_channel_wwn'], ['500143802426baf4'])

    @patch('ansible.module_utils.facts.network.fc_wwn.FcWwnInitiatorFactCollector._FcWwnInitiatorFactCollector__run_command')
    @patch('sys.platform', 'sunos')
    def test_collect_sunos(self, mock_run_command):
        module = MagicMock()
        module.get_bin_path.return_value = '/usr/sbin/fcinfo'
        mock_run_command.return_value = (0, 'Port WWN: 10000000c9934d9a\n', '')
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['10000000c9934d9a'])

    @patch('ansible.module_utils.facts.network.fc_wwn.FcWwnInitiatorFactCollector._FcWwnInitiatorFactCollector__run_command')
    @patch('sys.platform', 'aix')
    def test_collect_aix(self, mock_run_command):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/lsdev', '/usr/sbin/lscfg']
        mock_run_command.side_effect = [
            (0, 'fcs0 Available 01-08\n', ''),
            (0, 'Network Address.............10000000c9934d9a\n', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['10000000c9934d9a'])

    @patch('ansible.module_utils.facts.network.fc_wwn.FcWwnInitiatorFactCollector._FcWwnInitiatorFactCollector__run_command')
    @patch('sys.platform', 'hp-ux')
    def test_collect_hpux(self, mock_run_command):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/ioscan', '/opt/fcms/bin/fcmsutil']
        mock_run_command.side_effect = [
            (0, '/dev/fcd0\n', ''),
            (0, 'N_Port Port World Wide Name = 10000000c9934d9a\n', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['10000000c9934d9a'])

    def test_collect_unsupported_platform(self):
        with patch('sys.platform', 'unsupported_os'):
            result = self.collector.collect()
            self.assertEqual(result['fibre_channel_wwn'], [])

    @patch('ansible.module_utils.facts.network.fc_wwn.FcWwnInitiatorFactCollector._FcWwnInitiatorFactCollector__run_command')
    def test_private_run_command(self, mock_run_command):
        module = MagicMock()
        mock_run_command.return_value = (0, 'output', 'error')
        result = self.collector._FcWwnInitiatorFactCollector__run_command(module, 'cmd')
        self.assertEqual(result, (0, 'output', 'error'))

if __name__ == '__main__':
    unittest.main()