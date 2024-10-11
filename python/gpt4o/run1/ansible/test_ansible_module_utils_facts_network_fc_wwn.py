import unittest
from unittest.mock import patch, MagicMock
import sys
import glob
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FcWwnInitiatorFactCollector()

    def test_collect_linux(self):
        sys.platform = 'linux'
        with patch('glob.glob', return_value=['/sys/class/fc_host/host0/port_name']), \
             patch('ansible.module_utils.facts.utils.get_file_lines', return_value=['0x500143802426baf4']):
            result = self.collector.collect()
            self.assertEqual(result, {'fibre_channel_wwn': ['500143802426baf4']})

    def test_collect_sunos(self):
        sys.platform = 'sunos'
        module = MagicMock()
        module.get_bin_path.return_value = '/usr/sbin/fcinfo'
        module.run_command.return_value = (0, 'Port WWN: 10000000c9934d9e', '')
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_aix(self):
        sys.platform = 'aix'
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/lsdev', '/usr/sbin/lscfg']
        module.run_command.side_effect = [
            (0, 'fcs0 Available 01-08', ''),
            (0, 'Network Address.............10000000c9934d9e', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_hpux(self):
        sys.platform = 'hp-ux'
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/ioscan', '/opt/fcms/bin/fcmsutil']
        module.run_command.side_effect = [
            (0, '/dev/fcd0', ''),
            (0, 'N_Port Port World Wide Name = 10000000c9934d9e', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_unknown_platform(self):
        sys.platform = 'unknown'
        result = self.collector.collect()
        self.assertEqual(result, {'fibre_channel_wwn': []})

    def test_name(self):
        self.assertEqual(self.collector.name, 'fibre_channel_wwn')

    def test_fact_ids(self):
        self.assertEqual(self.collector._fact_ids, set())

class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FcWwnInitiatorFactCollector()

    @patch('ansible.module_utils.facts.network.fc_wwn.sys.platform', 'linux')
    @patch('ansible.module_utils.facts.network.fc_wwn.glob.glob')
    @patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines')
    def test_collect_linux(self, mock_get_file_lines, mock_glob):
        mock_glob.return_value = ['/sys/class/fc_host/host0/port_name']
        mock_get_file_lines.return_value = ['0x50060b0000c26642\n']
        result = self.collector.collect()
        self.assertEqual(result['fibre_channel_wwn'], ['50060b0000c26642'])

    @patch('ansible.module_utils.facts.network.fc_wwn.sys.platform', 'sunos')
    @patch('ansible.module_utils.facts.network.fc_wwn.BaseFactCollector.get_bin_path')
    def test_collect_sunos(self, mock_get_bin_path):
        module = MagicMock()
        module.get_bin_path.return_value = '/usr/sbin/fcinfo'
        module.run_command.return_value = (0, 'Port WWN: 21000024ff649e5d\n', '')
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['21000024ff649e5d'])

    @patch('ansible.module_utils.facts.network.fc_wwn.sys.platform', 'aix')
    @patch('ansible.module_utils.facts.network.fc_wwn.BaseFactCollector.get_bin_path')
    def test_collect_aix(self, mock_get_bin_path):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/lsdev', '/usr/sbin/lscfg']
        module.run_command.side_effect = [
            (0, 'fcs0 Available 01-08\n', ''),
            (0, 'Network Address.............10000000C9667E5D\n', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['10000000C9667E5D'])

    @patch('ansible.module_utils.facts.network.fc_wwn.sys.platform', 'hp-ux')
    @patch('ansible.module_utils.facts.network.fc_wwn.BaseFactCollector.get_bin_path')
    def test_collect_hpux(self, mock_get_bin_path):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/ioscan', '/opt/fcms/bin/fcmsutil']
        module.run_command.side_effect = [
            (0, '/dev/fcd0\n', ''),
            (0, 'N_Port Port World Wide Name = 50060b0000c26642\n', '')
        ]
        result = self.collector.collect(module=module)
        self.assertEqual(result['fibre_channel_wwn'], ['50060b0000c26642'])

    @patch('ansible.module_utils.facts.network.fc_wwn.sys.platform', 'unknown')
    def test_collect_unknown_platform(self):
        result = self.collector.collect()
        self.assertEqual(result['fibre_channel_wwn'], [])

if __name__ == '__main__':
    unittest.main()