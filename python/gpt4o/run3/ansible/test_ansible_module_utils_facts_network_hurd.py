import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.instance = HurdPfinetNetwork(self.module)

    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = '/bin/fsysopts'
        socket_path = '/servers/socket/inet'
        self.module.run_command.return_value = (0, '--interface=eth0 --address=192.168.1.1 --netmask=255.255.255.0 --address6=fe80::1/64', '')

        result = self.instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        expected = {
            'interfaces': ['eth0'],
            'eth0': {
                'active': True,
                'device': 'eth0',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0'
                },
                'ipv6': [{
                    'address': 'fe80::1',
                    'prefix': '64'
                }]
            }
        }
        self.assertEqual(result, {'interfaces': ['eth0'], 'eth0': {'active': True, 'device': 'eth0', 'ipv4': {'address': '192.168.1.1', 'netmask': '255.255.255.0'}, 'ipv6': [{'address': 'fe80::1', 'prefix': '64'}]}})

    @patch('os.path.exists')
    @patch('os.path.join')
    def test_populate(self, mock_join, mock_exists):
        self.module.get_bin_path.return_value = '/bin/fsysopts'
        mock_join.side_effect = lambda *args: '/'.join(args)
        mock_exists.side_effect = [False, True]
        self.instance.assign_network_facts = MagicMock(return_value={'interfaces': ['eth0']})

        result = self.instance.populate()
        expected = {'interfaces': ['eth0']}
        self.assertEqual(result, expected)

    @patch('os.path.exists')
    @patch('os.path.join')
    def test_populate_no_socket(self, mock_join, mock_exists):
        self.module.get_bin_path.return_value = '/bin/fsysopts'
        mock_join.side_effect = lambda *args: '/'.join(args)
        mock_exists.side_effect = [False, False]

        result = self.instance.populate()
        expected = {}
        self.assertEqual(result, expected)

    def test_populate_no_fsysopts(self):
        self.module.get_bin_path.return_value = None

        result = self.instance.populate()
        expected = {}
        self.assertEqual(result, expected)

class TestHurdNetworkCollector(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.instance = HurdNetworkCollector(self.module)

    def test_platform(self):
        self.assertEqual(self.instance._platform, 'GNU')

    def test_fact_class(self):
        self.assertEqual(self.instance._fact_class, HurdPfinetNetwork)

if __name__ == '__main__':
    unittest.main()