import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def setUp(self):
        self.instance = LinuxNetwork()
        self.instance.module = MagicMock()

    def test_init(self):
        instance = LinuxNetwork()
        self.assertIsInstance(instance, LinuxNetwork)

    @patch('ansible.module_utils.facts.network.linux.re.findall')
    @patch('ansible.module_utils.facts.network.linux.re.search')
    def test_get_ethtool_data(self, mock_search, mock_findall):
        mock_findall.side_effect = [['SOF_TIMESTAMPING_TX_SOFTWARE'], ['HWTSTAMP_FILTER_NONE']]
        mock_search.return_value = MagicMock(groups=MagicMock(return_value=['1']))
        self.instance.module.get_bin_path.return_value = '/usr/sbin/ethtool'
        self.instance.module.run_command.side_effect = [
            (0, 'rx-checksumming: on\ntx-checksumming: off', ''),
            (0, 'SOF_TIMESTAMPING_TX_SOFTWARE\nHWTSTAMP_FILTER_NONE\nPTP Hardware Clock: 1', '')
        ]

        result = self.instance.get_ethtool_data('eth0')
        expected = {
            'features': {
                'rx_checksumming': 'on',
                'tx_checksumming': 'off'
            },
            'timestamping': ['tx_software'],
            'hw_timestamp_filters': ['none'],
            'phc_index': 1
        }
        self.assertEqual(result, expected)

    def test_get_ethtool_data_no_ethtool(self):
        self.instance.module.get_bin_path.return_value = None
        result = self.instance.get_ethtool_data('eth0')
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.network.linux.re.findall')
    @patch('ansible.module_utils.facts.network.linux.re.search')
    def test_get_ethtool_data_command_failure(self, mock_search, mock_findall):
        self.instance.module.get_bin_path.return_value = '/usr/sbin/ethtool'
        self.instance.module.run_command.side_effect = [
            (1, '', 'error'),
            (1, '', 'error')
        ]

        result = self.instance.get_ethtool_data('eth0')
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()