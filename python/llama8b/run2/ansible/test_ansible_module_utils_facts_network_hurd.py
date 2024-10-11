import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = '/servers/socket/inet'
        network = HurdPfinetNetwork()
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_populate(self):
        network_facts = {}
        network = HurdPfinetNetwork()
        result = network.populate()
        self.assertEqual(result, network_facts)

    def test_assign_network_facts_with_no_fsysopts_path(self):
        network_facts = {}
        fsysopts_path = None
        socket_path = '/servers/socket/inet'
        network = HurdPfinetNetwork()
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_assign_network_facts_with_no_socket_path(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = None
        network = HurdPfinetNetwork()
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_assign_network_facts_with_invalid_socket_path(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = '/invalid/path'
        network = HurdPfinetNetwork()
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

class TestHurdNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = HurdNetworkCollector()
        self.assertEqual(collector._platform, 'GNU')
        self.assertEqual(collector._fact_class, HurdPfinetNetwork)

if __name__ == '__main__':
    unittest.main()