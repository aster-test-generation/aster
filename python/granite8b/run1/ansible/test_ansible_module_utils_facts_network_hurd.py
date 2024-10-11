import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = 'fsysopts_path'
        socket_path = 'socket_path'
        network = HurdPfinetNetwork(module=None)
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        expected = {
            'interfaces': [],
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {},
                'ipv6': [],
            },
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {
                    'address': 'address',
                    'netmask': 'netmask',
                },
                'ipv6': [
                    {
                        'address': 'address',
                        'prefix': 'prefix',
                    },
                ],
            },
        }
        self.assertEqual(result, expected)

    def test_populate(self):
        network = HurdPfinetNetwork(module=None)
        result = network.populate()
        expected = {
            'interfaces': [],
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {},
                'ipv6': [],
            },
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {
                    'address': 'address',
                    'netmask': 'netmask',
                },
                'ipv6': [
                    {
                        'address': 'address',
                        'prefix': 'prefix',
                    },
                ],
            },
        }
        self.assertEqual(result, expected)

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        collector = HurdNetworkCollector()
        result = collector.populate()
        expected = {
            'interfaces': [],
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {},
                'ipv6': [],
            },
            'interface': {
                'active': True,
                'device': 'interface',
                'ipv4': {
                    'address': 'address',
                    'netmask': 'netmask',
                },
                'ipv6': [
                    {
                        'address': 'address',
                        'prefix': 'prefix',
                    },
                ],
            },
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()