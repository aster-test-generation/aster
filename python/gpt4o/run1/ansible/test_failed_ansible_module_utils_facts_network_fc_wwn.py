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
            self.assertEqual(result, {'fibre_channel_wwn': []})

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

if __name__ == '__main__':
    unittest.main()