import unittest
from unittest.mock import patch, MagicMock
import sys
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FcWwnInitiatorFactCollector()

    def test_collect_linux(self):
        with patch('glob.glob', return_value=['/sys/class/fc_host/host0/port_name']), \
             patch('ansible.module_utils.facts.utils.get_file_lines', return_value=['0x50060e801049cfd1']):
            sys.platform = 'linux'
            result = self.collector.collect()
            self.assertEqual(result, {'fibre_channel_wwn': ['50060e801049cfd1']})

    def test_collect_sunos(self):
        module = MagicMock()
        module.get_bin_path.return_value = '/usr/sbin/fcinfo'
        module.run_command.return_value = (0, 'Port WWN: 10000000c9934d9e', '')
        sys.platform = 'sunos'
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_aix(self):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/lsdev', '/usr/sbin/lscfg']
        module.run_command.side_effect = [
            (0, 'fcs0 Available 01-08', ''),
            (0, 'Network Address.............10000000c9934d9e', '')
        ]
        sys.platform = 'aix'
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_hpux(self):
        module = MagicMock()
        module.get_bin_path.side_effect = ['/usr/sbin/ioscan', '/opt/fcms/bin/fcmsutil']
        module.run_command.side_effect = [
            (0, '/dev/fcd0', ''),
            (0, 'N_Port Port World Wide Name = 10000000c9934d9e', '')
        ]
        sys.platform = 'hp-ux'
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'fibre_channel_wwn': ['10000000c9934d9e']})

    def test_collect_no_platform(self):
        sys.platform = 'unknown'
        result = self.collector.collect()
        self.assertEqual(result, {'fibre_channel_wwn': []})

if __name__ == '__main__':
    unittest.main()