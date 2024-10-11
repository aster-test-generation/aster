import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = 'path/to/fsysopts'
        socket_path = 'path/to/socket'
        expected_facts = {
            'interfaces': ['interface1', 'interface2'],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0'
                },
                'ipv6': [
                    {'address': '2001:db8::1', 'prefix': '64'}
                ]
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {
                    'address': '10.0.0.1',
                    'netmask': '255.0.0.0'
                },
                'ipv6': [
                    {'address': '2001:db8::2', 'prefix': '64'}
                ]
            }
        }
        result = HurdPfinetNetwork.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, expected_facts)

    def test_populate(self):
        network_facts = {}
        expected_facts = {
            'interfaces': ['interface1', 'interface2'],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0'
                },
                'ipv6': [
                    {'address': '2001:db8::1', 'prefix': '64'}
                ]
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {
                    'address': '10.0.0.1',
                    'netmask': '255.0.0.0'
                },
                'ipv6': [
                    {'address': '2001:db8::2', 'prefix': '64'}
                ]
            }
        }
        result = HurdPfinetNetwork.populate(network_facts)
        self.assertEqual(result, expected_facts)

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        expected_facts = {
            'interfaces': ['interface1', 'interface2'],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0'
                },
                'ipv6': [
                    {'address': '2001:db8::1', 'prefix': '64'}
                ]
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {
                    'address': '10.0.0.1',
                    'netmask': '255.0.0.0'
                },
                'ipv6': [
                    {'address': '2001:db8::2', 'prefix': '64'}
                ]
            }
        }
        result = HurdNetworkCollector().populate()
        self.assertEqual(result, expected_facts)

if __name__ == '__main__':
    unittest.main()